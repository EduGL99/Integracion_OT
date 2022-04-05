package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentPortTypeEdge
 */

public class EquipmentPortTypeEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentPortTypeEdgeResponseProjection() {
    }

    public EquipmentPortTypeEdgeResponseProjection all$() {
        return all$(3);
    }

    public EquipmentPortTypeEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EquipmentPortTypeEdgeResponseProjection.EquipmentPortTypeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortTypeEdgeResponseProjection.EquipmentPortTypeResponseProjection.node", projectionDepthOnFields.getOrDefault("EquipmentPortTypeEdgeResponseProjection.EquipmentPortTypeResponseProjection.node", 0) + 1);
            this.node(new EquipmentPortTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortTypeEdgeResponseProjection.EquipmentPortTypeResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public EquipmentPortTypeEdgeResponseProjection node(EquipmentPortTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public EquipmentPortTypeEdgeResponseProjection node(String alias, EquipmentPortTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public EquipmentPortTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public EquipmentPortTypeEdgeResponseProjection typename() {
        return typename(null);
    }

    public EquipmentPortTypeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
