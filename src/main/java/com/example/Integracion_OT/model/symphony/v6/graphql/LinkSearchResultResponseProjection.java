package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LinkSearchResult
 */

public class LinkSearchResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LinkSearchResultResponseProjection() {
    }

    public LinkSearchResultResponseProjection all$() {
        return all$(3);
    }

    public LinkSearchResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LinkSearchResultResponseProjection.LinkResponseProjection.links", 0) <= maxDepth) {
            projectionDepthOnFields.put("LinkSearchResultResponseProjection.LinkResponseProjection.links", projectionDepthOnFields.getOrDefault("LinkSearchResultResponseProjection.LinkResponseProjection.links", 0) + 1);
            this.links(new LinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LinkSearchResultResponseProjection.LinkResponseProjection.links", 0)));
        }
        this.count();
        this.typename();
        return this;
    }

    public LinkSearchResultResponseProjection links(LinkResponseProjection subProjection) {
        return links(null, subProjection);
    }

    public LinkSearchResultResponseProjection links(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("links").alias(alias).projection(subProjection));
        return this;
    }

    public LinkSearchResultResponseProjection count() {
        return count(null);
    }

    public LinkSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }

    public LinkSearchResultResponseProjection typename() {
        return typename(null);
    }

    public LinkSearchResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
