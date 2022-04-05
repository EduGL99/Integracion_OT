package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentPortType
 */

public class EquipmentPortTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentPortTypeResponseProjection() {
    }

    public EquipmentPortTypeResponseProjection all$() {
        return all$(3);
    }

    public EquipmentPortTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("EquipmentPortTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", projectionDepthOnFields.getOrDefault("EquipmentPortTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) + 1);
            this.propertyTypes(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentPortTypeResponseProjection.PropertyTypeResponseProjection.linkPropertyTypes", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortTypeResponseProjection.PropertyTypeResponseProjection.linkPropertyTypes", projectionDepthOnFields.getOrDefault("EquipmentPortTypeResponseProjection.PropertyTypeResponseProjection.linkPropertyTypes", 0) + 1);
            this.linkPropertyTypes(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortTypeResponseProjection.PropertyTypeResponseProjection.linkPropertyTypes", 0)));
        }
        this.numberOfPortDefinitions();
        this.typename();
        return this;
    }

    public EquipmentPortTypeResponseProjection id() {
        return id(null);
    }

    public EquipmentPortTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentPortTypeResponseProjection name() {
        return name(null);
    }

    public EquipmentPortTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EquipmentPortTypeResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public EquipmentPortTypeResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortTypeResponseProjection linkPropertyTypes(PropertyTypeResponseProjection subProjection) {
        return linkPropertyTypes(null, subProjection);
    }

    public EquipmentPortTypeResponseProjection linkPropertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("linkPropertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortTypeResponseProjection numberOfPortDefinitions() {
        return numberOfPortDefinitions(null);
    }

    public EquipmentPortTypeResponseProjection numberOfPortDefinitions(String alias) {
        fields.add(new GraphQLResponseField("numberOfPortDefinitions").alias(alias));
        return this;
    }

    public EquipmentPortTypeResponseProjection typename() {
        return typename(null);
    }

    public EquipmentPortTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
