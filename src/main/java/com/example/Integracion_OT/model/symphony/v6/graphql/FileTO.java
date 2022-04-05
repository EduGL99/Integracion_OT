package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String fileName;
    private Integer sizeInBytes;
    private String modified;
    private String uploaded;
    private FileTypeTO fileType;
    private String mimeType;
    private String storeKey;
    private String category;
    private String annotation;
    private WorkOrderTO workorder;
    private DocumentCategoryTO documentCategory;

    public FileTO() {
    }

    public FileTO(String id, String fileName, Integer sizeInBytes, String modified, String uploaded, FileTypeTO fileType, String mimeType, String storeKey, String category, String annotation, WorkOrderTO workorder, DocumentCategoryTO documentCategory) {
        this.id = id;
        this.fileName = fileName;
        this.sizeInBytes = sizeInBytes;
        this.modified = modified;
        this.uploaded = uploaded;
        this.fileType = fileType;
        this.mimeType = mimeType;
        this.storeKey = storeKey;
        this.category = category;
        this.annotation = annotation;
        this.workorder = workorder;
        this.documentCategory = documentCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
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

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public WorkOrderTO getWorkorder() {
        return workorder;
    }

    public void setWorkorder(WorkOrderTO workorder) {
        this.workorder = workorder;
    }

    public DocumentCategoryTO getDocumentCategory() {
        return documentCategory;
    }

    public void setDocumentCategory(DocumentCategoryTO documentCategory) {
        this.documentCategory = documentCategory;
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
        if (modified != null) {
            joiner.add("modified: " + GraphQLRequestSerializer.getEntry(modified));
        }
        if (uploaded != null) {
            joiner.add("uploaded: " + GraphQLRequestSerializer.getEntry(uploaded));
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
        if (category != null) {
            joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
        }
        if (annotation != null) {
            joiner.add("annotation: " + GraphQLRequestSerializer.getEntry(annotation));
        }
        if (workorder != null) {
            joiner.add("workorder: " + GraphQLRequestSerializer.getEntry(workorder));
        }
        if (documentCategory != null) {
            joiner.add("documentCategory: " + GraphQLRequestSerializer.getEntry(documentCategory));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String fileName;
        private Integer sizeInBytes;
        private String modified;
        private String uploaded;
        private FileTypeTO fileType;
        private String mimeType;
        private String storeKey;
        private String category;
        private String annotation;
        private WorkOrderTO workorder;
        private DocumentCategoryTO documentCategory;

        public Builder() {
        }

        /**
         * The id of the object.
         */
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

        public Builder setModified(String modified) {
            this.modified = modified;
            return this;
        }

        public Builder setUploaded(String uploaded) {
            this.uploaded = uploaded;
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

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setAnnotation(String annotation) {
            this.annotation = annotation;
            return this;
        }

        public Builder setWorkorder(WorkOrderTO workorder) {
            this.workorder = workorder;
            return this;
        }

        public Builder setDocumentCategory(DocumentCategoryTO documentCategory) {
            this.documentCategory = documentCategory;
            return this;
        }


        public FileTO build() {
            return new FileTO(id, fileName, sizeInBytes, modified, uploaded, fileType, mimeType, storeKey, category, annotation, workorder, documentCategory);
        }

    }
}
