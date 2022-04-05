package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ProjectTypeEdge
 */

public class ProjectTypeEdgeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ProjectTypeEdgeResponseProjection() {
    }

    public ProjectTypeEdgeResponseProjection all$() {
        return all$(3);
    }

    public ProjectTypeEdgeResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProjectTypeEdgeResponseProjection.ProjectTypeResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectTypeEdgeResponseProjection.ProjectTypeResponseProjection.node", projectionDepthOnFields.getOrDefault("ProjectTypeEdgeResponseProjection.ProjectTypeResponseProjection.node", 0) + 1);
            this.node(new ProjectTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectTypeEdgeResponseProjection.ProjectTypeResponseProjection.node", 0)));
        }
        this.cursor();
        this.typename();
        return this;
    }

    public ProjectTypeEdgeResponseProjection node(ProjectTypeResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ProjectTypeEdgeResponseProjection node(String alias, ProjectTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectTypeEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ProjectTypeEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ProjectTypeEdgeResponseProjection typename() {
        return typename(null);
    }

    public ProjectTypeEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
