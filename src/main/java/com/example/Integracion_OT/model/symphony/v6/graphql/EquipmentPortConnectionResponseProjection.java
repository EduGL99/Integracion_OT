package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentPortConnection
 */

public class EquipmentPortConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentPortConnectionResponseProjection() {
    }

    public EquipmentPortConnectionResponseProjection all$() {
        return all$(3);
    }

    public EquipmentPortConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("EquipmentPortConnectionResponseProjection.EquipmentPortEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortConnectionResponseProjection.EquipmentPortEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("EquipmentPortConnectionResponseProjection.EquipmentPortEdgeResponseProjection.edges", 0) + 1);
            this.edges(new EquipmentPortEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortConnectionResponseProjection.EquipmentPortEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentPortConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("EquipmentPortConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public EquipmentPortConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public EquipmentPortConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EquipmentPortConnectionResponseProjection edges(EquipmentPortEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EquipmentPortConnectionResponseProjection edges(String alias, EquipmentPortEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EquipmentPortConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortConnectionResponseProjection typename() {
        return typename(null);
    }

    public EquipmentPortConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
