package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CUD
 */

public class CUDResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CUDResponseProjection() {
    }

    public CUDResponseProjection all$() {
        return all$(3);
    }

    public CUDResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CUDResponseProjection.BasicPermissionRuleResponseProjection.create", 0) <= maxDepth) {
            projectionDepthOnFields.put("CUDResponseProjection.BasicPermissionRuleResponseProjection.create", projectionDepthOnFields.getOrDefault("CUDResponseProjection.BasicPermissionRuleResponseProjection.create", 0) + 1);
            this.create(new BasicPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CUDResponseProjection.BasicPermissionRuleResponseProjection.create", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CUDResponseProjection.BasicPermissionRuleResponseProjection.update", 0) <= maxDepth) {
            projectionDepthOnFields.put("CUDResponseProjection.BasicPermissionRuleResponseProjection.update", projectionDepthOnFields.getOrDefault("CUDResponseProjection.BasicPermissionRuleResponseProjection.update", 0) + 1);
            this.update(new BasicPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CUDResponseProjection.BasicPermissionRuleResponseProjection.update", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CUDResponseProjection.BasicPermissionRuleResponseProjection.delete", 0) <= maxDepth) {
            projectionDepthOnFields.put("CUDResponseProjection.BasicPermissionRuleResponseProjection.delete", projectionDepthOnFields.getOrDefault("CUDResponseProjection.BasicPermissionRuleResponseProjection.delete", 0) + 1);
            this.delete(new BasicPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CUDResponseProjection.BasicPermissionRuleResponseProjection.delete", 0)));
        }
        this.typename();
        return this;
    }

    public CUDResponseProjection create(BasicPermissionRuleResponseProjection subProjection) {
        return create(null, subProjection);
    }

    public CUDResponseProjection create(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("create").alias(alias).projection(subProjection));
        return this;
    }

    public CUDResponseProjection update(BasicPermissionRuleResponseProjection subProjection) {
        return update(null, subProjection);
    }

    public CUDResponseProjection update(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("update").alias(alias).projection(subProjection));
        return this;
    }

    public CUDResponseProjection delete(BasicPermissionRuleResponseProjection subProjection) {
        return delete(null, subProjection);
    }

    public CUDResponseProjection delete(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("delete").alias(alias).projection(subProjection));
        return this;
    }

    public CUDResponseProjection typename() {
        return typename(null);
    }

    public CUDResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
