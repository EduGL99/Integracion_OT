package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditLocationTypeInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String mapType;
    private Integer mapZoomLevel;
    private Boolean isSite;
    @javax.validation.constraints.NotNull
    private java.util.List<DocumentCategoryInputTO> documentCategories;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeInputTO> properties;

    public EditLocationTypeInputTO() {
    }

    public EditLocationTypeInputTO(String id, String name, String mapType, Integer mapZoomLevel, Boolean isSite, java.util.List<DocumentCategoryInputTO> documentCategories, java.util.List<PropertyTypeInputTO> properties) {
        this.id = id;
        this.name = name;
        this.mapType = mapType;
        this.mapZoomLevel = mapZoomLevel;
        this.isSite = isSite;
        this.documentCategories = documentCategories;
        this.properties = properties;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    public Integer getMapZoomLevel() {
        return mapZoomLevel;
    }

    public void setMapZoomLevel(Integer mapZoomLevel) {
        this.mapZoomLevel = mapZoomLevel;
    }

    public Boolean getIsSite() {
        return isSite;
    }

    public void setIsSite(Boolean isSite) {
        this.isSite = isSite;
    }

    public java.util.List<DocumentCategoryInputTO> getDocumentCategories() {
        return documentCategories;
    }

    public void setDocumentCategories(java.util.List<DocumentCategoryInputTO> documentCategories) {
        this.documentCategories = documentCategories;
    }

    public java.util.List<PropertyTypeInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTypeInputTO> properties) {
        this.properties = properties;
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
        if (mapType != null) {
            joiner.add("mapType: " + GraphQLRequestSerializer.getEntry(mapType));
        }
        if (mapZoomLevel != null) {
            joiner.add("mapZoomLevel: " + GraphQLRequestSerializer.getEntry(mapZoomLevel));
        }
        if (isSite != null) {
            joiner.add("isSite: " + GraphQLRequestSerializer.getEntry(isSite));
        }
        if (documentCategories != null) {
            joiner.add("documentCategories: " + GraphQLRequestSerializer.getEntry(documentCategories));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String mapType;
        private Integer mapZoomLevel;
        private Boolean isSite;
        private java.util.List<DocumentCategoryInputTO> documentCategories;
        private java.util.List<PropertyTypeInputTO> properties;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMapType(String mapType) {
            this.mapType = mapType;
            return this;
        }

        public Builder setMapZoomLevel(Integer mapZoomLevel) {
            this.mapZoomLevel = mapZoomLevel;
            return this;
        }

        public Builder setIsSite(Boolean isSite) {
            this.isSite = isSite;
            return this;
        }

        public Builder setDocumentCategories(java.util.List<DocumentCategoryInputTO> documentCategories) {
            this.documentCategories = documentCategories;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTypeInputTO> properties) {
            this.properties = properties;
            return this;
        }


        public EditLocationTypeInputTO build() {
            return new EditLocationTypeInputTO(id, name, mapType, mapZoomLevel, isSite, documentCategories, properties);
        }

    }
}
