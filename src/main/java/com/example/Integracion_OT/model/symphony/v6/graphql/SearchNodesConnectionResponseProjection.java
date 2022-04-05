package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SearchNodesConnection
 */

public class SearchNodesConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SearchNodesConnectionResponseProjection() {
    }

    public SearchNodesConnectionResponseProjection all$() {
        return all$(3);
    }

    public SearchNodesConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("SearchNodesConnectionResponseProjection.SearchNodeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchNodesConnectionResponseProjection.SearchNodeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("SearchNodesConnectionResponseProjection.SearchNodeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new SearchNodeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchNodesConnectionResponseProjection.SearchNodeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SearchNodesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("SearchNodesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("SearchNodesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SearchNodesConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public SearchNodesConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public SearchNodesConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public SearchNodesConnectionResponseProjection edges(SearchNodeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public SearchNodesConnectionResponseProjection edges(String alias, SearchNodeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public SearchNodesConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public SearchNodesConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public SearchNodesConnectionResponseProjection typename() {
        return typename(null);
    }

    public SearchNodesConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
