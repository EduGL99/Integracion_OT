package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentPosition
 */

public class EquipmentPositionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentPositionResponseProjection() {
    }

    public EquipmentPositionResponseProjection all$() {
        return all$(3);
    }

    public EquipmentPositionResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("EquipmentPositionResponseProjection.EquipmentPositionDefinitionResponseProjection.definition", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPositionResponseProjection.EquipmentPositionDefinitionResponseProjection.definition", projectionDepthOnFields.getOrDefault("EquipmentPositionResponseProjection.EquipmentPositionDefinitionResponseProjection.definition", 0) + 1);
            this.definition(new EquipmentPositionDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPositionResponseProjection.EquipmentPositionDefinitionResponseProjection.definition", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentPositionResponseProjection.EquipmentResponseProjection.parentEquipment", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPositionResponseProjection.EquipmentResponseProjection.parentEquipment", projectionDepthOnFields.getOrDefault("EquipmentPositionResponseProjection.EquipmentResponseProjection.parentEquipment", 0) + 1);
            this.parentEquipment(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPositionResponseProjection.EquipmentResponseProjection.parentEquipment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentPositionResponseProjection.EquipmentResponseProjection.attachedEquipment", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPositionResponseProjection.EquipmentResponseProjection.attachedEquipment", projectionDepthOnFields.getOrDefault("EquipmentPositionResponseProjection.EquipmentResponseProjection.attachedEquipment", 0) + 1);
            this.attachedEquipment(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPositionResponseProjection.EquipmentResponseProjection.attachedEquipment", 0)));
        }
        this.typename();
        return this;
    }

    public EquipmentPositionResponseProjection id() {
        return id(null);
    }

    public EquipmentPositionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentPositionResponseProjection definition(EquipmentPositionDefinitionResponseProjection subProjection) {
        return definition(null, subProjection);
    }

    public EquipmentPositionResponseProjection definition(String alias, EquipmentPositionDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("definition").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPositionResponseProjection parentEquipment(EquipmentResponseProjection subProjection) {
        return parentEquipment(null, subProjection);
    }

    public EquipmentPositionResponseProjection parentEquipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentEquipment").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPositionResponseProjection attachedEquipment(EquipmentResponseProjection subProjection) {
        return attachedEquipment(null, subProjection);
    }

    public EquipmentPositionResponseProjection attachedEquipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("attachedEquipment").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPositionResponseProjection typename() {
        return typename(null);
    }

    public EquipmentPositionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
