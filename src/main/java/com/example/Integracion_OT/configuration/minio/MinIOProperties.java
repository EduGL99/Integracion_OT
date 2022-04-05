package com.example.Integracion_OT.configuration.minio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile(value = "minio")
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "minio")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MinIOProperties {

    private String url;
    private boolean unsafeSSL;
    private String accessKey;
    private String secretKey;
    private String bucket;
    private String subdir;
}