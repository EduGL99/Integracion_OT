package com.example.Integracion_OT.configuration.minio;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.errors.*;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Profile(value = "minio")
@Configuration
@Slf4j
public class ConnectionMinIO {

    @Autowired
    MinIOProperties minIOProperties;

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public MinioClient connect() {
        MinioClient.Builder client = MinioClient.builder();
        client.endpoint(minIOProperties.getUrl())
                .credentials(minIOProperties.getAccessKey(), minIOProperties.getSecretKey());
        if (minIOProperties.isUnsafeSSL()) {
            client.httpClient(getUnsafeOkHttpClient());
        }
        validateBucket(client.build());
        return client.build();
    }

    private void validateBucket(MinioClient client) {
        try {
            boolean isExist;
            String bucket = minIOProperties.getBucket();
            isExist = client.bucketExists(BucketExistsArgs.builder().bucket(bucket).build());
            if (isExist) {
                log.debug("*** Bucket " + bucket + " already exists.");
            } else {
                client.makeBucket(MakeBucketArgs.builder().bucket(bucket).build());
            }
        } catch (ErrorResponseException | InsufficientDataException | InternalException |
                InvalidKeyException | InvalidResponseException | IOException | NoSuchAlgorithmException |
                ServerException | XmlParserException e) {
            log.info("*** Error to validate bucket in min.io, please check. Cause: " + e.getCause() + " -- Message: "
                    + e.getMessage());
        }
    }

    private OkHttpClient getUnsafeOkHttpClient() {
        try {
            final TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory, (X509TrustManager) trustAllCerts[0]);
            builder.hostnameVerifier((hostname, session) -> true);

            return builder.build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
