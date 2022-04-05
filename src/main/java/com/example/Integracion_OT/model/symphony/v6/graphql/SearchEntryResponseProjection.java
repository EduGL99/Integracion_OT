package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SearchEntry
 */

public class SearchEntryResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SearchEntryResponseProjection() {
    }

    public SearchEntryResponseProjection all$() {
        return all$(3);
    }

    public SearchEntryResponseProjection all$(int maxDepth) {
        this.entityId();
        this.entityType();
        this.name();
        this.type();
        this.externalId();
        this.typename();
        return this;
    }

    public SearchEntryResponseProjection entityId() {
        return entityId(null);
    }

    public SearchEntryResponseProjection entityId(String alias) {
        fields.add(new GraphQLResponseField("entityId").alias(alias));
        return this;
    }

    public SearchEntryResponseProjection entityType() {
        return entityType(null);
    }

    public SearchEntryResponseProjection entityType(String alias) {
        fields.add(new GraphQLResponseField("entityType").alias(alias));
        return this;
    }

    public SearchEntryResponseProjection name() {
        return name(null);
    }

    public SearchEntryResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public SearchEntryResponseProjection type() {
        return type(null);
    }

    public SearchEntryResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public SearchEntryResponseProjection externalId() {
        return externalId(null);
    }

    public SearchEntryResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public SearchEntryResponseProjection typename() {
        return typename(null);
    }

    public SearchEntryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
