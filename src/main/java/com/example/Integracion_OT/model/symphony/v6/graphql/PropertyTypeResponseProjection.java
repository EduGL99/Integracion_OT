package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for PropertyType
 */

public class PropertyTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PropertyTypeResponseProjection() {
    }

    public PropertyTypeResponseProjection all$() {
        return all$(3);
    }

    public PropertyTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.externalId();
        this.name();
        this.type();
        this.nodeType();
        this.index();
        this.category();
        this.rawValue();
        this.stringValue();
        this.intValue();
        this.booleanValue();
        this.floatValue();
        this.latitudeValue();
        this.longitudeValue();
        this.rangeFromValue();
        this.rangeToValue();
        this.isEditable();
        this.isInstanceProperty();
        this.isMandatory();
        this.isDeleted();
        this.isListable();
        this.typename();
        return this;
    }

    public PropertyTypeResponseProjection id() {
        return id(null);
    }

    public PropertyTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection externalId() {
        return externalId(null);
    }

    public PropertyTypeResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection name() {
        return name(null);
    }

    public PropertyTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection type() {
        return type(null);
    }

    public PropertyTypeResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection nodeType() {
        return nodeType(null);
    }

    public PropertyTypeResponseProjection nodeType(String alias) {
        fields.add(new GraphQLResponseField("nodeType").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection index() {
        return index(null);
    }

    public PropertyTypeResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection category() {
        return category(null);
    }

    public PropertyTypeResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection rawValue() {
        return rawValue(null);
    }

    public PropertyTypeResponseProjection rawValue(String alias) {
        fields.add(new GraphQLResponseField("rawValue").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection stringValue() {
        return stringValue(null);
    }

    public PropertyTypeResponseProjection stringValue(String alias) {
        fields.add(new GraphQLResponseField("stringValue").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection intValue() {
        return intValue(null);
    }

    public PropertyTypeResponseProjection intValue(String alias) {
        fields.add(new GraphQLResponseField("intValue").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection booleanValue() {
        return booleanValue(null);
    }

    public PropertyTypeResponseProjection booleanValue(String alias) {
        fields.add(new GraphQLResponseField("booleanValue").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection floatValue() {
        return floatValue(null);
    }

    public PropertyTypeResponseProjection floatValue(String alias) {
        fields.add(new GraphQLResponseField("floatValue").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection latitudeValue() {
        return latitudeValue(null);
    }

    public PropertyTypeResponseProjection latitudeValue(String alias) {
        fields.add(new GraphQLResponseField("latitudeValue").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection longitudeValue() {
        return longitudeValue(null);
    }

    public PropertyTypeResponseProjection longitudeValue(String alias) {
        fields.add(new GraphQLResponseField("longitudeValue").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection rangeFromValue() {
        return rangeFromValue(null);
    }

    public PropertyTypeResponseProjection rangeFromValue(String alias) {
        fields.add(new GraphQLResponseField("rangeFromValue").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection rangeToValue() {
        return rangeToValue(null);
    }

    public PropertyTypeResponseProjection rangeToValue(String alias) {
        fields.add(new GraphQLResponseField("rangeToValue").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection isEditable() {
        return isEditable(null);
    }

    public PropertyTypeResponseProjection isEditable(String alias) {
        fields.add(new GraphQLResponseField("isEditable").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection isInstanceProperty() {
        return isInstanceProperty(null);
    }

    public PropertyTypeResponseProjection isInstanceProperty(String alias) {
        fields.add(new GraphQLResponseField("isInstanceProperty").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection isMandatory() {
        return isMandatory(null);
    }

    public PropertyTypeResponseProjection isMandatory(String alias) {
        fields.add(new GraphQLResponseField("isMandatory").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection isDeleted() {
        return isDeleted(null);
    }

    public PropertyTypeResponseProjection isDeleted(String alias) {
        fields.add(new GraphQLResponseField("isDeleted").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection isListable() {
        return isListable(null);
    }

    public PropertyTypeResponseProjection isListable(String alias) {
        fields.add(new GraphQLResponseField("isListable").alias(alias));
        return this;
    }

    public PropertyTypeResponseProjection typename() {
        return typename(null);
    }

    public PropertyTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
