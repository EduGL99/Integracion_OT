package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Appointment
 */

public class AppointmentResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public AppointmentResponseProjection() {
    }

    public AppointmentResponseProjection all$() {
        return all$(3);
    }

    public AppointmentResponseProjection all$(int maxDepth) {
        this.id();
        this.creationDate();
        if (projectionDepthOnFields.getOrDefault("AppointmentResponseProjection.UserResponseProjection.assignee", 0) <= maxDepth) {
            projectionDepthOnFields.put("AppointmentResponseProjection.UserResponseProjection.assignee", projectionDepthOnFields.getOrDefault("AppointmentResponseProjection.UserResponseProjection.assignee", 0) + 1);
            this.assignee(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AppointmentResponseProjection.UserResponseProjection.assignee", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AppointmentResponseProjection.WorkOrderResponseProjection.workOrder", 0) <= maxDepth) {
            projectionDepthOnFields.put("AppointmentResponseProjection.WorkOrderResponseProjection.workOrder", projectionDepthOnFields.getOrDefault("AppointmentResponseProjection.WorkOrderResponseProjection.workOrder", 0) + 1);
            this.workOrder(new WorkOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AppointmentResponseProjection.WorkOrderResponseProjection.workOrder", 0)));
        }
        this.start();
        this.end();
        this.duration();
        this.status();
        this.typename();
        return this;
    }

    public AppointmentResponseProjection id() {
        return id(null);
    }

    public AppointmentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public AppointmentResponseProjection creationDate() {
        return creationDate(null);
    }

    public AppointmentResponseProjection creationDate(String alias) {
        fields.add(new GraphQLResponseField("creationDate").alias(alias));
        return this;
    }

    public AppointmentResponseProjection assignee(UserResponseProjection subProjection) {
        return assignee(null, subProjection);
    }

    public AppointmentResponseProjection assignee(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignee").alias(alias).projection(subProjection));
        return this;
    }

    public AppointmentResponseProjection workOrder(WorkOrderResponseProjection subProjection) {
        return workOrder(null, subProjection);
    }

    public AppointmentResponseProjection workOrder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrder").alias(alias).projection(subProjection));
        return this;
    }

    public AppointmentResponseProjection start() {
        return start(null);
    }

    public AppointmentResponseProjection start(String alias) {
        fields.add(new GraphQLResponseField("start").alias(alias));
        return this;
    }

    public AppointmentResponseProjection end() {
        return end(null);
    }

    public AppointmentResponseProjection end(String alias) {
        fields.add(new GraphQLResponseField("end").alias(alias));
        return this;
    }

    public AppointmentResponseProjection duration() {
        return duration(null);
    }

    public AppointmentResponseProjection duration(String alias) {
        fields.add(new GraphQLResponseField("duration").alias(alias));
        return this;
    }

    public AppointmentResponseProjection status() {
        return status(null);
    }

    public AppointmentResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public AppointmentResponseProjection typename() {
        return typename(null);
    }

    public AppointmentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
