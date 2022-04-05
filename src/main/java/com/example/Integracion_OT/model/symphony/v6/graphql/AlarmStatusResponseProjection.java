package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AlarmStatus
 */

public class AlarmStatusResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AlarmStatusResponseProjection() {
    }

    public AlarmStatusResponseProjection all$() {
        return all$(3);
    }

    public AlarmStatusResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("AlarmStatusResponseProjection.AlarmFilterResponseProjection.AlarmFilter", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlarmStatusResponseProjection.AlarmFilterResponseProjection.AlarmFilter", projectionDepthOnFields.getOrDefault("AlarmStatusResponseProjection.AlarmFilterResponseProjection.AlarmFilter", 0) + 1);
            this.AlarmFilter(new AlarmFilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlarmStatusResponseProjection.AlarmFilterResponseProjection.AlarmFilter", 0)));
        }
        this.typename();
        return this;
    }

    public AlarmStatusResponseProjection id() {
        return id(null);
    }

    public AlarmStatusResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public AlarmStatusResponseProjection name() {
        return name(null);
    }

    public AlarmStatusResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public AlarmStatusResponseProjection AlarmFilter(AlarmFilterResponseProjection subProjection) {
        return AlarmFilter(null, subProjection);
    }

    public AlarmStatusResponseProjection AlarmFilter(String alias, AlarmFilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("AlarmFilter").alias(alias).projection(subProjection));
        return this;
    }

    public AlarmStatusResponseProjection typename() {
        return typename(null);
    }

    public AlarmStatusResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
