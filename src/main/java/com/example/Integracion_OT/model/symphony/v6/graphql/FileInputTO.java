package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileInputTO implements java.io.Serializable {

    private String id;
    @javax.validation.constraints.NotNull
    private String fileName;
    private Integer sizeInBytes;
    private Integer modificationTime;
    private Integer uploadTime;
    private FileTypeTO fileType;
    private String mimeType;
    @javax.validation.constraints.NotNull
    private String storeKey;
    private String annotation;

    public FileInputTO() {
    }

    public FileInputTO(String id, String fileName, Integer sizeInBytes, Integer modificationTime, Integer uploadTime, FileTypeTO fileType, String mimeType, String storeKey, String annotation) {
        this.id = id;
        this.fileName = fileName;
        this.sizeInBytes = sizeInBytes;
        this.modificationTime = modificationTime;
        this.uploadTime = uploadTime;
        this.fileType = fileType;
        this.mimeType = mimeType;
        this.storeKey = storeKey;
        this.annotation = annotation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Integer sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public Integer getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Integer modificationTime) {
        this.modificationTime = modificationTime;
    }

    public Integer getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Integer uploadTime) {
        this.uploadTime = uploadTime;
    }

    public FileTypeTO getFileType() {
        return fileType;
    }

    public void setFileType(FileTypeTO fileType) {
        this.fileType = fileType;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getStoreKey() {
        return storeKey;
    }

    public void setStoreKey(String storeKey) {
        this.storeKey = storeKey;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (fileName != null) {
            joiner.add("fileName: " + GraphQLRequestSerializer.getEntry(fileName));
        }
        if (sizeInBytes != null) {
            joiner.add("sizeInBytes: " + GraphQLRequestSerializer.getEntry(sizeInBytes));
        }
        if (modificationTime != null) {
            joiner.add("modificationTime: " + GraphQLRequestSerializer.getEntry(modificationTime));
        }
        if (uploadTime != null) {
            joiner.add("uploadTime: " + GraphQLRequestSerializer.getEntry(uploadTime));
        }
        if (fileType != null) {
            joiner.add("fileType: " + GraphQLRequestSerializer.getEntry(fileType));
        }
        if (mimeType != null) {
            joiner.add("mimeType: " + GraphQLRequestSerializer.getEntry(mimeType));
        }
        if (storeKey != null) {
            joiner.add("storeKey: " + GraphQLRequestSerializer.getEntry(storeKey));
        }
        if (annotation != null) {
            joiner.add("annotation: " + GraphQLRequestSerializer.getEntry(annotation));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String fileName;
        private Integer sizeInBytes;
        private Integer modificationTime;
        private Integer uploadTime;
        private FileTypeTO fileType;
        private String mimeType;
        private String storeKey;
        private String annotation;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setSizeInBytes(Integer sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            return this;
        }

        public Builder setModificationTime(Integer modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }

        public Builder setUploadTime(Integer uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }

        public Builder setFileType(FileTypeTO fileType) {
            this.fileType = fileType;
            return this;
        }

        public Builder setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder setStoreKey(String storeKey) {
            this.storeKey = storeKey;
            return this;
        }

        public Builder setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }


        public FileInputTO build() {
            return new FileInputTO(id, fileName, sizeInBytes, modificationTime, uploadTime, fileType, mimeType, storeKey, annotation);
        }

    }
}
