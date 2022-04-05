package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Property
 */

public class PropertyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PropertyResponseProjection() {
    }

    public PropertyResponseProjection all$() {
        return all$(3);
    }

    public PropertyResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("PropertyResponseProjection.PropertyTypeResponseProjection.propertyType", 0) <= maxDepth) {
            projectionDepthOnFields.put("PropertyResponseProjection.PropertyTypeResponseProjection.propertyType", projectionDepthOnFields.getOrDefault("PropertyResponseProjection.PropertyTypeResponseProjection.propertyType", 0) + 1);
            this.propertyType(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PropertyResponseProjection.PropertyTypeResponseProjection.propertyType", 0)));
        }
        this.stringValue();
        this.intValue();
        this.booleanValue();
        this.floatValue();
        this.latitudeValue();
        this.longitudeValue();
        this.rangeFromValue();
        this.rangeToValue();
        if (projectionDepthOnFields.getOrDefault("PropertyResponseProjection.NamedNodeResponseProjection.nodeValue", 0) <= maxDepth) {
            projectionDepthOnFields.put("PropertyResponseProjection.NamedNodeResponseProjection.nodeValue", projectionDepthOnFields.getOrDefault("PropertyResponseProjection.NamedNodeResponseProjection.nodeValue", 0) + 1);
            this.nodeValue(new NamedNodeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PropertyResponseProjection.NamedNodeResponseProjection.nodeValue", 0)));
        }
        this.rawValue();
        this.typename();
        return this;
    }

    public PropertyResponseProjection id() {
        return id(null);
    }

    public PropertyResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PropertyResponseProjection propertyType(PropertyTypeResponseProjection subProjection) {
        return propertyType(null, subProjection);
    }

    public PropertyResponseProjection propertyType(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyType").alias(alias).projection(subProjection));
        return this;
    }

    public PropertyResponseProjection stringValue() {
        return stringValue(null);
    }

    public PropertyResponseProjection stringValue(String alias) {
        fields.add(new GraphQLResponseField("stringValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection intValue() {
        return intValue(null);
    }

    public PropertyResponseProjection intValue(String alias) {
        fields.add(new GraphQLResponseField("intValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection booleanValue() {
        return booleanValue(null);
    }

    public PropertyResponseProjection booleanValue(String alias) {
        fields.add(new GraphQLResponseField("booleanValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection floatValue() {
        return floatValue(null);
    }

    public PropertyResponseProjection floatValue(String alias) {
        fields.add(new GraphQLResponseField("floatValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection latitudeValue() {
        return latitudeValue(null);
    }

    public PropertyResponseProjection latitudeValue(String alias) {
        fields.add(new GraphQLResponseField("latitudeValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection longitudeValue() {
        return longitudeValue(null);
    }

    public PropertyResponseProjection longitudeValue(String alias) {
        fields.add(new GraphQLResponseField("longitudeValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection rangeFromValue() {
        return rangeFromValue(null);
    }

    public PropertyResponseProjection rangeFromValue(String alias) {
        fields.add(new GraphQLResponseField("rangeFromValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection rangeToValue() {
        return rangeToValue(null);
    }

    public PropertyResponseProjection rangeToValue(String alias) {
        fields.add(new GraphQLResponseField("rangeToValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection nodeValue(NamedNodeResponseProjection subProjection) {
        return nodeValue(null, subProjection);
    }

    public PropertyResponseProjection nodeValue(String alias, NamedNodeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("nodeValue").alias(alias).projection(subProjection));
        return this;
    }

    public PropertyResponseProjection rawValue() {
        return rawValue(null);
    }

    public PropertyResponseProjection rawValue(String alias) {
        fields.add(new GraphQLResponseField("rawValue").alias(alias));
        return this;
    }

    public PropertyResponseProjection typename() {
        return typename(null);
    }

    public PropertyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
