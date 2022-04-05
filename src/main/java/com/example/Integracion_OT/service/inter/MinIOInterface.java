package com.example.Integracion_OT.service.inter;

public interface MinIOInterface {

    String getfileURL(String fileKey, String fileName);

    void uploadFilebyReference(String fileLocation);

    void uploadFilebyValue(String contentFile);
}
