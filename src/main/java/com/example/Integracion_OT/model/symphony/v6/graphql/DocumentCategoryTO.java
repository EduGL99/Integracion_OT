package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentCategoryTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private String name;
    private Integer index;
    @javax.validation.constraints.NotNull
    private java.util.List<FileTO> files;
    @javax.validation.constraints.NotNull
    private java.util.List<HyperlinkTO> hyperlinks;
    private int numberOfDocuments;
    @javax.validation.constraints.NotNull
    private java.util.List<FileTO> filesByEntity;
    @javax.validation.constraints.NotNull
    private java.util.List<HyperlinkTO> hyperlinksByEntity;

    public DocumentCategoryTO() {
    }

    public DocumentCategoryTO(String id, String name, Integer index, java.util.List<FileTO> files, java.util.List<HyperlinkTO> hyperlinks, int numberOfDocuments, java.util.List<FileTO> filesByEntity, java.util.List<HyperlinkTO> hyperlinksByEntity) {
        this.id = id;
        this.name = name;
        this.index = index;
        this.files = files;
        this.hyperlinks = hyperlinks;
        this.numberOfDocuments = numberOfDocuments;
        this.filesByEntity = filesByEntity;
        this.hyperlinksByEntity = hyperlinksByEntity;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public java.util.List<FileTO> getFiles() {
        return files;
    }

    public void setFiles(java.util.List<FileTO> files) {
        this.files = files;
    }

    public java.util.List<HyperlinkTO> getHyperlinks() {
        return hyperlinks;
    }

    public void setHyperlinks(java.util.List<HyperlinkTO> hyperlinks) {
        this.hyperlinks = hyperlinks;
    }

    public int getNumberOfDocuments() {
        return numberOfDocuments;
    }

    public void setNumberOfDocuments(int numberOfDocuments) {
        this.numberOfDocuments = numberOfDocuments;
    }

    public java.util.List<FileTO> getFilesByEntity() {
        return filesByEntity;
    }

    public void setFilesByEntity(java.util.List<FileTO> filesByEntity) {
        this.filesByEntity = filesByEntity;
    }

    public java.util.List<HyperlinkTO> getHyperlinksByEntity() {
        return hyperlinksByEntity;
    }

    public void setHyperlinksByEntity(java.util.List<HyperlinkTO> hyperlinksByEntity) {
        this.hyperlinksByEntity = hyperlinksByEntity;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (files != null) {
            joiner.add("files: " + GraphQLRequestSerializer.getEntry(files));
        }
        if (hyperlinks != null) {
            joiner.add("hyperlinks: " + GraphQLRequestSerializer.getEntry(hyperlinks));
        }
        joiner.add("numberOfDocuments: " + GraphQLRequestSerializer.getEntry(numberOfDocuments));
        if (filesByEntity != null) {
            joiner.add("filesByEntity: " + GraphQLRequestSerializer.getEntry(filesByEntity));
        }
        if (hyperlinksByEntity != null) {
            joiner.add("hyperlinksByEntity: " + GraphQLRequestSerializer.getEntry(hyperlinksByEntity));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private Integer index;
        private java.util.List<FileTO> files;
        private java.util.List<HyperlinkTO> hyperlinks;
        private int numberOfDocuments;
        private java.util.List<FileTO> filesByEntity;
        private java.util.List<HyperlinkTO> hyperlinksByEntity;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Builder setFiles(java.util.List<FileTO> files) {
            this.files = files;
            return this;
        }

        public Builder setHyperlinks(java.util.List<HyperlinkTO> hyperlinks) {
            this.hyperlinks = hyperlinks;
            return this;
        }

        public Builder setNumberOfDocuments(int numberOfDocuments) {
            this.numberOfDocuments = numberOfDocuments;
            return this;
        }

        public Builder setFilesByEntity(java.util.List<FileTO> filesByEntity) {
            this.filesByEntity = filesByEntity;
            return this;
        }

        public Builder setHyperlinksByEntity(java.util.List<HyperlinkTO> hyperlinksByEntity) {
            this.hyperlinksByEntity = hyperlinksByEntity;
            return this;
        }


        public DocumentCategoryTO build() {
            return new DocumentCategoryTO(id, name, index, files, hyperlinks, numberOfDocuments, filesByEntity, hyperlinksByEntity);
        }

    }
}
