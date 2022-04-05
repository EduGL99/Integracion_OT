package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ProjectEdge
 */

public class ProjectEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProjectEdgeResponseProjection() {
    }

    public ProjectEdgeResponseProjection all$() {
        return all$(3);
    }

    public ProjectEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectEdgeResponseProjection.ProjectResponseProjection.node", projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0) + 1);
            this.node(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectEdgeResponseProjection.ProjectResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public ProjectEdgeResponseProjection node(ProjectResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ProjectEdgeResponseProjection node(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ProjectEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ProjectEdgeResponseProjection typename() {
        return typename(null);
    }

    public ProjectEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
