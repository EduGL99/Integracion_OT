package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Flow
 */

public class FlowResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FlowResponseProjection() {
    }

    public FlowResponseProjection all$() {
        return all$(3);
    }

    public FlowResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("FlowResponseProjection.VariableDefinitionResponseProjection.endParamDefinitions", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowResponseProjection.VariableDefinitionResponseProjection.endParamDefinitions", projectionDepthOnFields.getOrDefault("FlowResponseProjection.VariableDefinitionResponseProjection.endParamDefinitions", 0) + 1);
            this.endParamDefinitions(new VariableDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowResponseProjection.VariableDefinitionResponseProjection.endParamDefinitions", 0)));
        }
        this.status();
        this.newInstancesPolicy();
        if (projectionDepthOnFields.getOrDefault("FlowResponseProjection.BlockResponseProjection.blocks", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowResponseProjection.BlockResponseProjection.blocks", projectionDepthOnFields.getOrDefault("FlowResponseProjection.BlockResponseProjection.blocks", 0) + 1);
            this.blocks(new BlockResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowResponseProjection.BlockResponseProjection.blocks", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FlowResponseProjection.ConnectorResponseProjection.connectors", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowResponseProjection.ConnectorResponseProjection.connectors", projectionDepthOnFields.getOrDefault("FlowResponseProjection.ConnectorResponseProjection.connectors", 0) + 1);
            this.connectors(new ConnectorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowResponseProjection.ConnectorResponseProjection.connectors", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FlowResponseProjection.FlowDraftResponseProjection.draft", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowResponseProjection.FlowDraftResponseProjection.draft", projectionDepthOnFields.getOrDefault("FlowResponseProjection.FlowDraftResponseProjection.draft", 0) + 1);
            this.draft(new FlowDraftResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowResponseProjection.FlowDraftResponseProjection.draft", 0)));
        }
        this.typename();
        return this;
    }

    public FlowResponseProjection id() {
        return id(null);
    }

    public FlowResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FlowResponseProjection name() {
        return name(null);
    }

    public FlowResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FlowResponseProjection description() {
        return description(null);
    }

    public FlowResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public FlowResponseProjection endParamDefinitions(VariableDefinitionResponseProjection subProjection) {
        return endParamDefinitions(null, subProjection);
    }

    public FlowResponseProjection endParamDefinitions(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("endParamDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public FlowResponseProjection status() {
        return status(null);
    }

    public FlowResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public FlowResponseProjection newInstancesPolicy() {
        return newInstancesPolicy(null);
    }

    public FlowResponseProjection newInstancesPolicy(String alias) {
        fields.add(new GraphQLResponseField("newInstancesPolicy").alias(alias));
        return this;
    }

    public FlowResponseProjection blocks(BlockResponseProjection subProjection) {
        return blocks(null, subProjection);
    }

    public FlowResponseProjection blocks(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("blocks").alias(alias).projection(subProjection));
        return this;
    }

    public FlowResponseProjection connectors(ConnectorResponseProjection subProjection) {
        return connectors(null, subProjection);
    }

    public FlowResponseProjection connectors(String alias, ConnectorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("connectors").alias(alias).projection(subProjection));
        return this;
    }

    public FlowResponseProjection draft(FlowDraftResponseProjection subProjection) {
        return draft(null, subProjection);
    }

    public FlowResponseProjection draft(String alias, FlowDraftResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("draft").alias(alias).projection(subProjection));
        return this;
    }

    public FlowResponseProjection typename() {
        return typename(null);
    }

    public FlowResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
