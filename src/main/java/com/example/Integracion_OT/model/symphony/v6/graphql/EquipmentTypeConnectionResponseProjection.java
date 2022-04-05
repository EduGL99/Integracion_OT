package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentTypeConnection
 */

public class EquipmentTypeConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentTypeConnectionResponseProjection() {
    }

    public EquipmentTypeConnectionResponseProjection all$() {
        return all$(3);
    }

    public EquipmentTypeConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("EquipmentTypeConnectionResponseProjection.EquipmentTypeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentTypeConnectionResponseProjection.EquipmentTypeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("EquipmentTypeConnectionResponseProjection.EquipmentTypeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new EquipmentTypeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentTypeConnectionResponseProjection.EquipmentTypeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("EquipmentTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public EquipmentTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public EquipmentTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EquipmentTypeConnectionResponseProjection edges(EquipmentTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EquipmentTypeConnectionResponseProjection edges(String alias, EquipmentTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EquipmentTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentTypeConnectionResponseProjection typename() {
        return typename(null);
    }

    public EquipmentTypeConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
