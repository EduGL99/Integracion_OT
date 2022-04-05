package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for AlarmFilter
 */

public class AlarmFilterResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AlarmFilterResponseProjection() {
    }

    public AlarmFilterResponseProjection all$() {
        return all$(3);
    }

    public AlarmFilterResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.networkResource();
        this.enable();
        this.beginTime();
        this.endTime();
        this.reason();
        this.user();
        this.creationTime();
        if (projectionDepthOnFields.getOrDefault("AlarmFilterResponseProjection.AlarmStatusResponseProjection.alarmStatus", 0) <= maxDepth) {
            projectionDepthOnFields.put("AlarmFilterResponseProjection.AlarmStatusResponseProjection.alarmStatus", projectionDepthOnFields.getOrDefault("AlarmFilterResponseProjection.AlarmStatusResponseProjection.alarmStatus", 0) + 1);
            this.alarmStatus(new AlarmStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AlarmFilterResponseProjection.AlarmStatusResponseProjection.alarmStatus", 0)));
        }
        this.typename();
        return this;
    }

    public AlarmFilterResponseProjection id() {
        return id(null);
    }

    public AlarmFilterResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public AlarmFilterResponseProjection name() {
        return name(null);
    }

    public AlarmFilterResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public AlarmFilterResponseProjection networkResource() {
        return networkResource(null);
    }

    public AlarmFilterResponseProjection networkResource(String alias) {
        fields.add(new GraphQLResponseField("networkResource").alias(alias));
        return this;
    }

    public AlarmFilterResponseProjection enable() {
        return enable(null);
    }

    public AlarmFilterResponseProjection enable(String alias) {
        fields.add(new GraphQLResponseField("enable").alias(alias));
        return this;
    }

    public AlarmFilterResponseProjection beginTime() {
        return beginTime(null);
    }

    public AlarmFilterResponseProjection beginTime(String alias) {
        fields.add(new GraphQLResponseField("beginTime").alias(alias));
        return this;
    }

    public AlarmFilterResponseProjection endTime() {
        return endTime(null);
    }

    public AlarmFilterResponseProjection endTime(String alias) {
        fields.add(new GraphQLResponseField("endTime").alias(alias));
        return this;
    }

    public AlarmFilterResponseProjection reason() {
        return reason(null);
    }

    public AlarmFilterResponseProjection reason(String alias) {
        fields.add(new GraphQLResponseField("reason").alias(alias));
        return this;
    }

    public AlarmFilterResponseProjection user() {
        return user(null);
    }

    public AlarmFilterResponseProjection user(String alias) {
        fields.add(new GraphQLResponseField("user").alias(alias));
        return this;
    }

    public AlarmFilterResponseProjection creationTime() {
        return creationTime(null);
    }

    public AlarmFilterResponseProjection creationTime(String alias) {
        fields.add(new GraphQLResponseField("creationTime").alias(alias));
        return this;
    }

    public AlarmFilterResponseProjection alarmStatus(AlarmStatusResponseProjection subProjection) {
        return alarmStatus(null, subProjection);
    }

    public AlarmFilterResponseProjection alarmStatus(String alias, AlarmStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("alarmStatus").alias(alias).projection(subProjection));
        return this;
    }

    public AlarmFilterResponseProjection typename() {
        return typename(null);
    }

    public AlarmFilterResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
