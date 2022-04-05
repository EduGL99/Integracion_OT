package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentType
 */

public class EquipmentTypeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentTypeResponseProjection() {
    }

    public EquipmentTypeResponseProjection all$() {
        return all$(3);
    }

    public EquipmentTypeResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.category();
        if (projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.EquipmentPositionDefinitionResponseProjection.positionDefinitions", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentTypeResponseProjection.EquipmentPositionDefinitionResponseProjection.positionDefinitions", projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.EquipmentPositionDefinitionResponseProjection.positionDefinitions", 0) + 1);
            this.positionDefinitions(new EquipmentPositionDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.EquipmentPositionDefinitionResponseProjection.positionDefinitions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.EquipmentPortDefinitionResponseProjection.portDefinitions", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentTypeResponseProjection.EquipmentPortDefinitionResponseProjection.portDefinitions", projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.EquipmentPortDefinitionResponseProjection.portDefinitions", 0) + 1);
            this.portDefinitions(new EquipmentPortDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.EquipmentPortDefinitionResponseProjection.portDefinitions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0) + 1);
            this.propertyTypes(new PropertyTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.PropertyTypeResponseProjection.propertyTypes", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.EquipmentResponseProjection.equipments", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentTypeResponseProjection.EquipmentResponseProjection.equipments", projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.EquipmentResponseProjection.equipments", 0) + 1);
            this.equipments(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentTypeResponseProjection.EquipmentResponseProjection.equipments", 0)));
        }
        this.numberOfEquipment();
        this.typename();
        return this;
    }

    public EquipmentTypeResponseProjection id() {
        return id(null);
    }

    public EquipmentTypeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentTypeResponseProjection name() {
        return name(null);
    }

    public EquipmentTypeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EquipmentTypeResponseProjection category() {
        return category(null);
    }

    public EquipmentTypeResponseProjection category(String alias) {
        fields.add(new GraphQLResponseField("category").alias(alias));
        return this;
    }

    public EquipmentTypeResponseProjection positionDefinitions(EquipmentPositionDefinitionResponseProjection subProjection) {
        return positionDefinitions(null, subProjection);
    }

    public EquipmentTypeResponseProjection positionDefinitions(String alias, EquipmentPositionDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("positionDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeResponseProjection portDefinitions(EquipmentPortDefinitionResponseProjection subProjection) {
        return portDefinitions(null, subProjection);
    }

    public EquipmentTypeResponseProjection portDefinitions(String alias, EquipmentPortDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("portDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeResponseProjection propertyTypes(PropertyTypeResponseProjection subProjection) {
        return propertyTypes(null, subProjection);
    }

    public EquipmentTypeResponseProjection propertyTypes(String alias, PropertyTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("propertyTypes").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeResponseProjection equipments(EquipmentResponseProjection subProjection) {
        return equipments(null, subProjection);
    }

    public EquipmentTypeResponseProjection equipments(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipments").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeResponseProjection numberOfEquipment() {
        return numberOfEquipment(null);
    }

    public EquipmentTypeResponseProjection numberOfEquipment(String alias) {
        fields.add(new GraphQLResponseField("numberOfEquipment").alias(alias));
        return this;
    }

    public EquipmentTypeResponseProjection typename() {
        return typename(null);
    }

    public EquipmentTypeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
