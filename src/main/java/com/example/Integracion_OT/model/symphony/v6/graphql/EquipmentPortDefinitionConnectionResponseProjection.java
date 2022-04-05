package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentPortDefinitionConnection
 */

public class EquipmentPortDefinitionConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentPortDefinitionConnectionResponseProjection() {
    }

    public EquipmentPortDefinitionConnectionResponseProjection all$() {
        return all$(3);
    }

    public EquipmentPortDefinitionConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionConnectionResponseProjection.EquipmentPortDefinitionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortDefinitionConnectionResponseProjection.EquipmentPortDefinitionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionConnectionResponseProjection.EquipmentPortDefinitionEdgeResponseProjection.edges", 0) + 1);
            this.edges(new EquipmentPortDefinitionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionConnectionResponseProjection.EquipmentPortDefinitionEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortDefinitionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public EquipmentPortDefinitionConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public EquipmentPortDefinitionConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionConnectionResponseProjection edges(EquipmentPortDefinitionEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public EquipmentPortDefinitionConnectionResponseProjection edges(String alias, EquipmentPortDefinitionEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortDefinitionConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public EquipmentPortDefinitionConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortDefinitionConnectionResponseProjection typename() {
        return typename(null);
    }

    public EquipmentPortDefinitionConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
