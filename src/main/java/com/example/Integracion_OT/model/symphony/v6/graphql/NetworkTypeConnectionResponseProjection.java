package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for NetworkTypeConnection
 */

public class NetworkTypeConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public NetworkTypeConnectionResponseProjection() {
    }

    public NetworkTypeConnectionResponseProjection all$() {
        return all$(3);
    }

    public NetworkTypeConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("NetworkTypeConnectionResponseProjection.NetworkTypeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("NetworkTypeConnectionResponseProjection.NetworkTypeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("NetworkTypeConnectionResponseProjection.NetworkTypeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new NetworkTypeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NetworkTypeConnectionResponseProjection.NetworkTypeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("NetworkTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("NetworkTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("NetworkTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("NetworkTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public NetworkTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public NetworkTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public NetworkTypeConnectionResponseProjection edges(NetworkTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public NetworkTypeConnectionResponseProjection edges(String alias, NetworkTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public NetworkTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public NetworkTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public NetworkTypeConnectionResponseProjection typename() {
        return typename(null);
    }

    public NetworkTypeConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
