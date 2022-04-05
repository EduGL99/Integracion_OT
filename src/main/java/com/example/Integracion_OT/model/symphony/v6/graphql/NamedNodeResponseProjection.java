package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for NamedNode
 */

public class NamedNodeResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public NamedNodeResponseProjection() {
    }

    public NamedNodeResponseProjection all$() {
        return all$(3);
    }

    public NamedNodeResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.typename();
        return this;
    }

    public NamedNodeResponseProjection id() {
        return id(null);
    }

    public NamedNodeResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public NamedNodeResponseProjection name() {
        return name(null);
    }

    public NamedNodeResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public NamedNodeResponseProjection onProject(ProjectResponseProjection subProjection) {
        return onProject(null, subProjection);
    }

    public NamedNodeResponseProjection onProject(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Project").alias(alias).projection(subProjection));
        return this;
    }

    public NamedNodeResponseProjection onWorkOrder(WorkOrderResponseProjection subProjection) {
        return onWorkOrder(null, subProjection);
    }

    public NamedNodeResponseProjection onWorkOrder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on WorkOrder").alias(alias).projection(subProjection));
        return this;
    }

    public NamedNodeResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public NamedNodeResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public NamedNodeResponseProjection onEquipment(EquipmentResponseProjection subProjection) {
        return onEquipment(null, subProjection);
    }

    public NamedNodeResponseProjection onEquipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Equipment").alias(alias).projection(subProjection));
        return this;
    }

    public NamedNodeResponseProjection onService(ServiceResponseProjection subProjection) {
        return onService(null, subProjection);
    }

    public NamedNodeResponseProjection onService(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Service").alias(alias).projection(subProjection));
        return this;
    }

    public NamedNodeResponseProjection onLocation(LocationResponseProjection subProjection) {
        return onLocation(null, subProjection);
    }

    public NamedNodeResponseProjection onLocation(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Location").alias(alias).projection(subProjection));
        return this;
    }

    public NamedNodeResponseProjection typename() {
        return typename(null);
    }

    public NamedNodeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
