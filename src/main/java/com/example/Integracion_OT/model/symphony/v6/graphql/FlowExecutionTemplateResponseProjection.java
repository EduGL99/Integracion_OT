package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for FlowExecutionTemplate
 */

public class FlowExecutionTemplateResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public FlowExecutionTemplateResponseProjection() {
    }

    public FlowExecutionTemplateResponseProjection all$() {
        return all$(3);
    }

    public FlowExecutionTemplateResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("FlowExecutionTemplateResponseProjection.BlockResponseProjection.blocks", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowExecutionTemplateResponseProjection.BlockResponseProjection.blocks", projectionDepthOnFields.getOrDefault("FlowExecutionTemplateResponseProjection.BlockResponseProjection.blocks", 0) + 1);
            this.blocks(new BlockResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowExecutionTemplateResponseProjection.BlockResponseProjection.blocks", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("FlowExecutionTemplateResponseProjection.ConnectorResponseProjection.connectors", 0) <= maxDepth) {
            projectionDepthOnFields.put("FlowExecutionTemplateResponseProjection.ConnectorResponseProjection.connectors", projectionDepthOnFields.getOrDefault("FlowExecutionTemplateResponseProjection.ConnectorResponseProjection.connectors", 0) + 1);
            this.connectors(new ConnectorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("FlowExecutionTemplateResponseProjection.ConnectorResponseProjection.connectors", 0)));
        }
        this.typename();
        return this;
    }

    public FlowExecutionTemplateResponseProjection id() {
        return id(null);
    }

    public FlowExecutionTemplateResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public FlowExecutionTemplateResponseProjection name() {
        return name(null);
    }

    public FlowExecutionTemplateResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public FlowExecutionTemplateResponseProjection description() {
        return description(null);
    }

    public FlowExecutionTemplateResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public FlowExecutionTemplateResponseProjection blocks(BlockResponseProjection subProjection) {
        return blocks(null, subProjection);
    }

    public FlowExecutionTemplateResponseProjection blocks(String alias, BlockResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("blocks").alias(alias).projection(subProjection));
        return this;
    }

    public FlowExecutionTemplateResponseProjection connectors(ConnectorResponseProjection subProjection) {
        return connectors(null, subProjection);
    }

    public FlowExecutionTemplateResponseProjection connectors(String alias, ConnectorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("connectors").alias(alias).projection(subProjection));
        return this;
    }

    public FlowExecutionTemplateResponseProjection typename() {
        return typename(null);
    }

    public FlowExecutionTemplateResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
