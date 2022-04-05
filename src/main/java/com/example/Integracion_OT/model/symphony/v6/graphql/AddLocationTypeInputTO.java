package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddLocationTypeInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String mapType;
    private Integer mapZoomLevel;
    private Boolean isSite;
    @javax.validation.constraints.NotNull
    private java.util.List<DocumentCategoryInputTO> documentCategories;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeInputTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyTemplateCategoryInputTO> surveyTemplateCategories;

    public AddLocationTypeInputTO() {
    }

    public AddLocationTypeInputTO(String name, String mapType, Integer mapZoomLevel, Boolean isSite, java.util.List<DocumentCategoryInputTO> documentCategories, java.util.List<PropertyTypeInputTO> properties, java.util.List<SurveyTemplateCategoryInputTO> surveyTemplateCategories) {
        this.name = name;
        this.mapType = mapType;
        this.mapZoomLevel = mapZoomLevel;
        this.isSite = isSite;
        this.documentCategories = documentCategories;
        this.properties = properties;
        this.surveyTemplateCategories = surveyTemplateCategories;
    }

    public static Builder builder() {
        return new Builder();
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

    public java.util.List<SurveyTemplateCategoryInputTO> getSurveyTemplateCategories() {
        return surveyTemplateCategories;
    }

    public void setSurveyTemplateCategories(java.util.List<SurveyTemplateCategoryInputTO> surveyTemplateCategories) {
        this.surveyTemplateCategories = surveyTemplateCategories;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        if (surveyTemplateCategories != null) {
            joiner.add("surveyTemplateCategories: " + GraphQLRequestSerializer.getEntry(surveyTemplateCategories));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String mapType;
        private Integer mapZoomLevel;
        private Boolean isSite;
        private java.util.List<DocumentCategoryInputTO> documentCategories;
        private java.util.List<PropertyTypeInputTO> properties;
        private java.util.List<SurveyTemplateCategoryInputTO> surveyTemplateCategories;

        public Builder() {
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

        public Builder setSurveyTemplateCategories(java.util.List<SurveyTemplateCategoryInputTO> surveyTemplateCategories) {
            this.surveyTemplateCategories = surveyTemplateCategories;
            return this;
        }


        public AddLocationTypeInputTO build() {
            return new AddLocationTypeInputTO(name, mapType, mapZoomLevel, isSite, documentCategories, properties, surveyTemplateCategories);
        }

    }
}
