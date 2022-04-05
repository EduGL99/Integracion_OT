package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentPortTypeConnection
 */

public class EquipmentPortTypeConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentPortTypeConnectionResponseProjection() {
    }

    public EquipmentPortTypeConnectionResponseProjection all$() {
        return all$(3);
    }

    public EquipmentPortTypeConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("EquipmentPortTypeConnectionResponseProjection.EquipmentPortTypeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortTypeConnectionResponseProjection.EquipmentPortTypeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("EquipmentPortTypeConnectionResponseProjection.EquipmentPortTypeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new EquipmentPortTypeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortTypeConnectionResponseProjection.EquipmentPortTypeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentPortTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("EquipmentPortTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public EquipmentPortTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public EquipmentPortTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EquipmentPortTypeConnectionResponseProjection edges(EquipmentPortTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EquipmentPortTypeConnectionResponseProjection edges(String alias, EquipmentPortTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EquipmentPortTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortTypeConnectionResponseProjection typename() {
        return typename(null);
    }

    public EquipmentPortTypeConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
