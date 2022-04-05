package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FlowInstance
 */

public class FlowInstanceResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FlowInstanceResponseProjection() {
    }

    public FlowInstanceResponseProjection all$() {
        return all$(3);
    }

    public FlowInstanceResponseProjection all$(int maxDepth) {
        this.id();
        this.bssCode();
        this.serviceInstanceCode();
        this.status();
        if (projectionDepthOnFields.getOrDefault("FlowInstanceResponseProjection.FlowExecutionTemplateResponseProjection.template", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowInstanceResponseProjection.FlowExecutionTemplateResponseProjection.template", projectionDepthOnFields.getOrDefault("FlowInstanceResponseProjection.FlowExecutionTemplateResponseProjection.template", 0) + 1);
            this.template(new FlowExecutionTemplateResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowInstanceResponseProjection.FlowExecutionTemplateResponseProjection.template", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FlowInstanceResponseProjection.BlockInstanceResponseProjection.blocks", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowInstanceResponseProjection.BlockInstanceResponseProjection.blocks", projectionDepthOnFields.getOrDefault("FlowInstanceResponseProjection.BlockInstanceResponseProjection.blocks", 0) + 1);
            this.blocks(new BlockInstanceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowInstanceResponseProjection.BlockInstanceResponseProjection.blocks", 0)));
        }
        this.startDate();
        this.endDate();
        this.typename();
        return this;
    }

    public FlowInstanceResponseProjection id() {
        return id(null);
    }

    public FlowInstanceResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FlowInstanceResponseProjection bssCode() {
        return bssCode(null);
    }

    public FlowInstanceResponseProjection bssCode(String alias) {
        fields.add(new GraphQLResponseField("bssCode").alias(alias));
        return this;
    }

    public FlowInstanceResponseProjection serviceInstanceCode() {
        return serviceInstanceCode(null);
    }

    public FlowInstanceResponseProjection serviceInstanceCode(String alias) {
        fields.add(new GraphQLResponseField("serviceInstanceCode").alias(alias));
        return this;
    }

    public FlowInstanceResponseProjection status() {
        return status(null);
    }

    public FlowInstanceResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public FlowInstanceResponseProjection template(FlowExecutionTemplateResponseProjection subProjection) {
        return template(null, subProjection);
    }

    public FlowInstanceResponseProjection template(String alias, FlowExecutionTemplateResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("template").alias(alias).projection(subProjection));
        return this;
    }

    public FlowInstanceResponseProjection blocks(BlockInstanceResponseProjection subProjection) {
        return blocks(null, subProjection);
    }

    public FlowInstanceResponseProjection blocks(String alias, BlockInstanceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("blocks").alias(alias).projection(subProjection));
        return this;
    }

    public FlowInstanceResponseProjection startDate() {
        return startDate(null);
    }

    public FlowInstanceResponseProjection startDate(String alias) {
        fields.add(new GraphQLResponseField("startDate").alias(alias));
        return this;
    }

    public FlowInstanceResponseProjection endDate() {
        return endDate(null);
    }

    public FlowInstanceResponseProjection endDate(String alias) {
        fields.add(new GraphQLResponseField("endDate").alias(alias));
        return this;
    }

    public FlowInstanceResponseProjection typename() {
        return typename(null);
    }

    public FlowInstanceResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
