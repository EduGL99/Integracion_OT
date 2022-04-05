package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for GeneralFilter
 */

public class GeneralFilterResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public GeneralFilterResponseProjection() {
    }

    public GeneralFilterResponseProjection all$() {
        return all$(3);
    }

    public GeneralFilterResponseProjection all$(int maxDepth) {
        this.filterType();
        this.key();
        this.operator();
        this.stringValue();
        this.idSet();
        this.stringSet();
        this.boolValue();
        if (projectionDepthOnFields.getOrDefault("GeneralFilterResponseProjection.PropertyTypeResponseProjection.propertyValue", 0) <= maxDepth) {
            projectionDepthOnFields.put("GeneralFilterResponseProjection.PropertyTypeResponseProjection.propertyValue", projectionDepthOnFields.getOrDefault("GeneralFilterResponseProjection.PropertyTypeResponseProjection.propertyValue", 0) + 1);
            this.propertyValue(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GeneralFilterResponseProjection.PropertyTypeResponseProjection.propertyValue", 0)));
        }
        this.typename();
        return this;
    }

    public GeneralFilterResponseProjection filterType() {
        return filterType(null);
    }

    public GeneralFilterResponseProjection filterType(String alias) {
        fields.add(new GraphQLResponseField("filterType").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection key() {
        return key(null);
    }

    public GeneralFilterResponseProjection key(String alias) {
        fields.add(new GraphQLResponseField("key").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection operator() {
        return operator(null);
    }

    public GeneralFilterResponseProjection operator(String alias) {
        fields.add(new GraphQLResponseField("operator").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection stringValue() {
        return stringValue(null);
    }

    public GeneralFilterResponseProjection stringValue(String alias) {
        fields.add(new GraphQLResponseField("stringValue").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection idSet() {
        return idSet(null);
    }

    public GeneralFilterResponseProjection idSet(String alias) {
        fields.add(new GraphQLResponseField("idSet").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection stringSet() {
        return stringSet(null);
    }

    public GeneralFilterResponseProjection stringSet(String alias) {
        fields.add(new GraphQLResponseField("stringSet").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection boolValue() {
        return boolValue(null);
    }

    public GeneralFilterResponseProjection boolValue(String alias) {
        fields.add(new GraphQLResponseField("boolValue").alias(alias));
        return this;
    }

    public GeneralFilterResponseProjection propertyValue(PropertyTypeResponseProjection subProjection) {
        return propertyValue(null, subProjection);
    }

    public GeneralFilterResponseProjection propertyValue(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyValue").alias(alias).projection(subProjection));
        return this;
    }

    public GeneralFilterResponseProjection typename() {
        return typename(null);
    }

    public GeneralFilterResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
