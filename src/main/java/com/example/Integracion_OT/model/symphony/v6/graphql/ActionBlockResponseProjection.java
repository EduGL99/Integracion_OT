package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ActionBlock
 */

public class ActionBlockResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ActionBlockResponseProjection() {
    }

    public ActionBlockResponseProjection all$() {
        return all$(3);
    }

    public ActionBlockResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.ActionTypeResponseProjection.actionType", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionBlockResponseProjection.ActionTypeResponseProjection.actionType", projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.ActionTypeResponseProjection.actionType", 0) + 1);
            this.actionType(new ActionTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.ActionTypeResponseProjection.actionType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.VariableExpressionResponseProjection.params", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionBlockResponseProjection.VariableExpressionResponseProjection.params", projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.VariableExpressionResponseProjection.params", 0) + 1);
            this.params(new VariableExpressionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.VariableExpressionResponseProjection.params", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionBlockResponseProjection.EntryPointResponseProjection.entryPoint", projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) + 1);
            this.entryPoint(new EntryPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionBlockResponseProjection.ExitPointResponseProjection.exitPoint", projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0) + 1);
            this.exitPoint(new ExitPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.ExitPointResponseProjection.exitPoint", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.WorkOrderTypeResponseProjection.workOrderType", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionBlockResponseProjection.WorkOrderTypeResponseProjection.workOrderType", projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.WorkOrderTypeResponseProjection.workOrderType", 0) + 1);
            this.workOrderType(new WorkOrderTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.WorkOrderTypeResponseProjection.workOrderType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.WorkerTypeResponseProjection.workerType", 0) <= maxDepth) {
            projectionDepthOnFields.put("ActionBlockResponseProjection.WorkerTypeResponseProjection.workerType", projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.WorkerTypeResponseProjection.workerType", 0) + 1);
            this.workerType(new WorkerTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ActionBlockResponseProjection.WorkerTypeResponseProjection.workerType", 0)));
        }
        this.typename();
        return this;
    }

    public ActionBlockResponseProjection actionType(ActionTypeResponseProjection subProjection) {
        return actionType(null, subProjection);
    }

    public ActionBlockResponseProjection actionType(String alias, ActionTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actionType").alias(alias).projection(subProjection));
        return this;
    }

    public ActionBlockResponseProjection params(VariableExpressionResponseProjection subProjection) {
        return params(null, subProjection);
    }

    public ActionBlockResponseProjection params(String alias, VariableExpressionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("params").alias(alias).projection(subProjection));
        return this;
    }

    public ActionBlockResponseProjection entryPoint(EntryPointResponseProjection subProjection) {
        return entryPoint(null, subProjection);
    }

    public ActionBlockResponseProjection entryPoint(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("entryPoint").alias(alias).projection(subProjection));
        return this;
    }

    public ActionBlockResponseProjection exitPoint(ExitPointResponseProjection subProjection) {
        return exitPoint(null, subProjection);
    }

    public ActionBlockResponseProjection exitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("exitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public ActionBlockResponseProjection workOrderType(WorkOrderTypeResponseProjection subProjection) {
        return workOrderType(null, subProjection);
    }

    public ActionBlockResponseProjection workOrderType(String alias, WorkOrderTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrderType").alias(alias).projection(subProjection));
        return this;
    }

    public ActionBlockResponseProjection workerType(WorkerTypeResponseProjection subProjection) {
        return workerType(null, subProjection);
    }

    public ActionBlockResponseProjection workerType(String alias, WorkerTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workerType").alias(alias).projection(subProjection));
        return this;
    }

    public ActionBlockResponseProjection typename() {
        return typename(null);
    }

    public ActionBlockResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
