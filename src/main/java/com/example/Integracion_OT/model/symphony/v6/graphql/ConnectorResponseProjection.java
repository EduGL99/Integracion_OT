package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Connector
 */

public class ConnectorResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ConnectorResponseProjection() {
    }

    public ConnectorResponseProjection all$() {
        return all$(3);
    }

    public ConnectorResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ConnectorResponseProjection.ExitPointResponseProjection.source", 0) <= maxDepth) {
            projectionDepthOnFields.put("ConnectorResponseProjection.ExitPointResponseProjection.source", projectionDepthOnFields.getOrDefault("ConnectorResponseProjection.ExitPointResponseProjection.source", 0) + 1);
            this.source(new ExitPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ConnectorResponseProjection.ExitPointResponseProjection.source", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ConnectorResponseProjection.EntryPointResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields.put("ConnectorResponseProjection.EntryPointResponseProjection.target", projectionDepthOnFields.getOrDefault("ConnectorResponseProjection.EntryPointResponseProjection.target", 0) + 1);
            this.target(new EntryPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ConnectorResponseProjection.EntryPointResponseProjection.target", 0)));
        }
        this.typename();
        return this;
    }

    public ConnectorResponseProjection source(ExitPointResponseProjection subProjection) {
        return source(null, subProjection);
    }

    public ConnectorResponseProjection source(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("source").alias(alias).projection(subProjection));
        return this;
    }

    public ConnectorResponseProjection target(EntryPointResponseProjection subProjection) {
        return target(null, subProjection);
    }

    public ConnectorResponseProjection target(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("target").alias(alias).projection(subProjection));
        return this;
    }

    public ConnectorResponseProjection typename() {
        return typename(null);
    }

    public ConnectorResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
