package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ProjectConnection
 */

public class ProjectConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProjectConnectionResponseProjection() {
    }

    public ProjectConnectionResponseProjection all$() {
        return all$(3);
    }

    public ProjectConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ProjectEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.ProjectEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ProjectConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ProjectConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ProjectConnectionResponseProjection edges(ProjectEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ProjectConnectionResponseProjection edges(String alias, ProjectEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ProjectConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectConnectionResponseProjection typename() {
        return typename(null);
    }

    public ProjectConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
