package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ProjectTypeConnection
 */

public class ProjectTypeConnectionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProjectTypeConnectionResponseProjection() {
    }

    public ProjectTypeConnectionResponseProjection all$() {
        return all$(3);
    }

    public ProjectTypeConnectionResponseProjection all$(int maxDepth) {
        this.totalCount();
        if (projectionDepthOnFields.getOrDefault("ProjectTypeConnectionResponseProjection.ProjectTypeEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectTypeConnectionResponseProjection.ProjectTypeEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ProjectTypeConnectionResponseProjection.ProjectTypeEdgeResponseProjection.edges", 0) + 1);
            this.edges(new ProjectTypeEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectTypeConnectionResponseProjection.ProjectTypeEdgeResponseProjection.edges", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ProjectTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1);
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectTypeConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)));
        }
        this.typename();
        return this;
    }

    public ProjectTypeConnectionResponseProjection totalCount() {
        return totalCount(null);
    }

    public ProjectTypeConnectionResponseProjection totalCount(String alias) {
        fields.add(new GraphQLResponseField("totalCount").alias(alias));
        return this;
    }

    public ProjectTypeConnectionResponseProjection edges(ProjectTypeEdgeResponseProjection subProjection) {
        return edges(null, subProjection);
    }

    public ProjectTypeConnectionResponseProjection edges(String alias, ProjectTypeEdgeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTypeConnectionResponseProjection pageInfo(PageInfoResponseProjection subProjection) {
        return pageInfo(null, subProjection);
    }

    public ProjectTypeConnectionResponseProjection pageInfo(String alias, PageInfoResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTypeConnectionResponseProjection typename() {
        return typename(null);
    }

    public ProjectTypeConnectionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
