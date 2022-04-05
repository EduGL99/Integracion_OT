package com.example.Integracion_OT.service.impl;

import com.example.Integracion_OT.configuration.minio.ConnectionMinIO;
import com.example.Integracion_OT.configuration.minio.MinIOProperties;
import com.example.Integracion_OT.service.inter.MinIOInterface;
import io.minio.GetPresignedObjectUrlArgs;
import io.minio.errors.*;
import io.minio.http.Method;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Profile(value = "minio")
@Service
@Slf4j
public class MinIOService implements MinIOInterface {

    @Autowired
    MinIOProperties minIOProperties;

    @Autowired
    ConnectionMinIO connectionMinIO;

    @Override
    public String getfileURL(String fileKey, String fileName) {
        String urlObject = null;
        Map<String, String> reqParams = new HashMap<>();
        //reqParams.put("response-content-type", "text/plain");
        reqParams.put("response-content-disposition", "attachment; filename=" + fileName);
        try {
            urlObject = connectionMinIO.connect().getPresignedObjectUrl(GetPresignedObjectUrlArgs.builder()
                    .bucket(minIOProperties.getBucket())
                    .object(minIOProperties.getSubdir() + fileKey)
                    .method(Method.GET)
                    .expiry(7, TimeUnit.DAYS)
                    .extraQueryParams(reqParams)
                    .build());
        } catch (ErrorResponseException | InsufficientDataException | InternalException | InvalidKeyException |
                InvalidResponseException | IOException | NoSuchAlgorithmException | XmlParserException |
                ServerException e) {
            log.info("*** Error to get URL of file " + fileKey + ". cause: " + e.getCause() + " -- Message: "
                    + e.getMessage());
        }
        return urlObject;
    }

    @Override
    public void uploadFilebyReference(String fileLocation) {
        // TODO - make business logic for upload file by reference
    }

    @Override
    public void uploadFilebyValue(String contentFile) {
        // TODO - make business logic for upload file by value
    }
}
