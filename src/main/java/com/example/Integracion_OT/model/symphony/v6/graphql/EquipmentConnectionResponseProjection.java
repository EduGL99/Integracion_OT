package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentConnection
 */

public class EquipmentConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentConnectionResponseProjection() {
    }

    public EquipmentConnectionResponseProjection all$() {
        return all$(3);
    }

    public EquipmentConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("EquipmentConnectionResponseProjection.EquipmentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentConnectionResponseProjection.EquipmentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("EquipmentConnectionResponseProjection.EquipmentEdgeResponseProjection.edges", 0) + 1);
            this.edges(new EquipmentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentConnectionResponseProjection.EquipmentEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("EquipmentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public EquipmentConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public EquipmentConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EquipmentConnectionResponseProjection edges(EquipmentEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EquipmentConnectionResponseProjection edges(String alias, EquipmentEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EquipmentConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentConnectionResponseProjection typename() {
        return typename(null);
    }

    public EquipmentConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
