package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FlowDraft
 */

public class FlowDraftResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FlowDraftResponseProjection() {
    }

    public FlowDraftResponseProjection all$() {
        return all$(3);
    }

    public FlowDraftResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("FlowDraftResponseProjection.VariableDefinitionResponseProjection.endParamDefinitions", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowDraftResponseProjection.VariableDefinitionResponseProjection.endParamDefinitions", projectionDepthOnFields.getOrDefault("FlowDraftResponseProjection.VariableDefinitionResponseProjection.endParamDefinitions", 0) + 1);
            this.endParamDefinitions(new VariableDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowDraftResponseProjection.VariableDefinitionResponseProjection.endParamDefinitions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FlowDraftResponseProjection.BlockResponseProjection.blocks", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowDraftResponseProjection.BlockResponseProjection.blocks", projectionDepthOnFields.getOrDefault("FlowDraftResponseProjection.BlockResponseProjection.blocks", 0) + 1);
            this.blocks(new BlockResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowDraftResponseProjection.BlockResponseProjection.blocks", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FlowDraftResponseProjection.ConnectorResponseProjection.connectors", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowDraftResponseProjection.ConnectorResponseProjection.connectors", projectionDepthOnFields.getOrDefault("FlowDraftResponseProjection.ConnectorResponseProjection.connectors", 0) + 1);
            this.connectors(new ConnectorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowDraftResponseProjection.ConnectorResponseProjection.connectors", 0)));
        }
        this.sameAsFlow();
        this.typename();
        return this;
    }

    public FlowDraftResponseProjection id() {
        return id(null);
    }

    public FlowDraftResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FlowDraftResponseProjection name() {
        return name(null);
    }

    public FlowDraftResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FlowDraftResponseProjection description() {
        return description(null);
    }

    public FlowDraftResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public FlowDraftResponseProjection endParamDefinitions(VariableDefinitionResponseProjection subProjection) {
        return endParamDefinitions(null, subProjection);
    }

    public FlowDraftResponseProjection endParamDefinitions(String alias, VariableDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("endParamDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public FlowDraftResponseProjection blocks(BlockResponseProjection subProjection) {
        return blocks(null, subProjection);
    }

    public FlowDraftResponseProjection blocks(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("blocks").alias(alias).projection(subProjection));
        return this;
    }

    public FlowDraftResponseProjection connectors(ConnectorResponseProjection subProjection) {
        return connectors(null, subProjection);
    }

    public FlowDraftResponseProjection connectors(String alias, ConnectorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("connectors").alias(alias).projection(subProjection));
        return this;
    }

    public FlowDraftResponseProjection sameAsFlow() {
        return sameAsFlow(null);
    }

    public FlowDraftResponseProjection sameAsFlow(String alias) {
        fields.add(new GraphQLResponseField("sameAsFlow").alias(alias));
        return this;
    }

    public FlowDraftResponseProjection typename() {
        return typename(null);
    }

    public FlowDraftResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
