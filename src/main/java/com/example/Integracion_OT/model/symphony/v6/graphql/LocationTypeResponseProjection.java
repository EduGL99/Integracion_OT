package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LocationType
 */

public class LocationTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LocationTypeResponseProjection() {
    }

    public LocationTypeResponseProjection all$() {
        return all$(3);
    }

    public LocationTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.mapType();
        this.isSite();
        this.index();
        this.mapZoomLevel();
        if (projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) + 1);
            this.propertyTypes(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.DocumentCategoryResponseProjection.documentCategories", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationTypeResponseProjection.DocumentCategoryResponseProjection.documentCategories", projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.DocumentCategoryResponseProjection.documentCategories", 0) + 1);
            this.documentCategories(new DocumentCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.DocumentCategoryResponseProjection.documentCategories", 0)));
        }
        this.numberOfLocations();
        if (projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.LocationConnectionResponseProjection.locations", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationTypeResponseProjection.LocationConnectionResponseProjection.locations", projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.LocationConnectionResponseProjection.locations", 0) + 1);
            this.locations(new LocationConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.LocationConnectionResponseProjection.locations", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.SurveyTemplateCategoryResponseProjection.surveyTemplateCategories", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationTypeResponseProjection.SurveyTemplateCategoryResponseProjection.surveyTemplateCategories", projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.SurveyTemplateCategoryResponseProjection.surveyTemplateCategories", 0) + 1);
            this.surveyTemplateCategories(new SurveyTemplateCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationTypeResponseProjection.SurveyTemplateCategoryResponseProjection.surveyTemplateCategories", 0)));
        }
        this.typename();
        return this;
    }

    public LocationTypeResponseProjection id() {
        return id(null);
    }

    public LocationTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection name() {
        return name(null);
    }

    public LocationTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection mapType() {
        return mapType(null);
    }

    public LocationTypeResponseProjection mapType(String alias) {
        fields.add(new GraphQLResponseField("mapType").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection isSite() {
        return isSite(null);
    }

    public LocationTypeResponseProjection isSite(String alias) {
        fields.add(new GraphQLResponseField("isSite").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection index() {
        return index(null);
    }

    public LocationTypeResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection mapZoomLevel() {
        return mapZoomLevel(null);
    }

    public LocationTypeResponseProjection mapZoomLevel(String alias) {
        fields.add(new GraphQLResponseField("mapZoomLevel").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public LocationTypeResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public LocationTypeResponseProjection documentCategories(DocumentCategoryResponseProjection subProjection) {
        return documentCategories(null, subProjection);
    }

    public LocationTypeResponseProjection documentCategories(String alias, DocumentCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("documentCategories").alias(alias).projection(subProjection));
        return this;
    }

    public LocationTypeResponseProjection numberOfLocations() {
        return numberOfLocations(null);
    }

    public LocationTypeResponseProjection numberOfLocations(String alias) {
        fields.add(new GraphQLResponseField("numberOfLocations").alias(alias));
        return this;
    }

    public LocationTypeResponseProjection locations(LocationConnectionResponseProjection subProjection) {
        return locations((String) null, subProjection);
    }

    public LocationTypeResponseProjection locations(String alias, LocationConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locations").alias(alias).projection(subProjection));
        return this;
    }

    public LocationTypeResponseProjection locations(LocationTypeLocationsParametrizedInput input, LocationConnectionResponseProjection subProjection) {
        return locations(null, input, subProjection);
    }

    public LocationTypeResponseProjection locations(String alias, LocationTypeLocationsParametrizedInput input, LocationConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locations").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public LocationTypeResponseProjection surveyTemplateCategories(SurveyTemplateCategoryResponseProjection subProjection) {
        return surveyTemplateCategories(null, subProjection);
    }

    public LocationTypeResponseProjection surveyTemplateCategories(String alias, SurveyTemplateCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("surveyTemplateCategories").alias(alias).projection(subProjection));
        return this;
    }

    public LocationTypeResponseProjection typename() {
        return typename(null);
    }

    public LocationTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
