package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for DocumentCategoryConnection
 */

public class DocumentCategoryConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DocumentCategoryConnectionResponseProjection() {
    }

    public DocumentCategoryConnectionResponseProjection all$() {
        return all$(3);
    }

    public DocumentCategoryConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("DocumentCategoryConnectionResponseProjection.DocumentCategoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("DocumentCategoryConnectionResponseProjection.DocumentCategoryEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("DocumentCategoryConnectionResponseProjection.DocumentCategoryEdgeResponseProjection.edges", 0) + 1);
            this.edges(new DocumentCategoryEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DocumentCategoryConnectionResponseProjection.DocumentCategoryEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DocumentCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("DocumentCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("DocumentCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DocumentCategoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public DocumentCategoryConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public DocumentCategoryConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public DocumentCategoryConnectionResponseProjection edges(DocumentCategoryEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public DocumentCategoryConnectionResponseProjection edges(String alias, DocumentCategoryEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public DocumentCategoryConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public DocumentCategoryConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public DocumentCategoryConnectionResponseProjection typename() {
        return typename(null);
    }

    public DocumentCategoryConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
