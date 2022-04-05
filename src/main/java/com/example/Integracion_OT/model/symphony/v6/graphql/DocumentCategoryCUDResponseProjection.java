package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for DocumentCategoryCUD
 */

public class DocumentCategoryCUDResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DocumentCategoryCUDResponseProjection() {
    }

    public DocumentCategoryCUDResponseProjection all$() {
        return all$(3);
    }

    public DocumentCategoryCUDResponseProjection all$(int maxDepth) {
        this.locationTypeID();
        if (projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.read", 0) <= maxDepth) {
            projectionDepthOnFields.put("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.read", projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.read", 0) + 1);
            this.read(new DocumentCategoryPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.read", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.create", 0) <= maxDepth) {
            projectionDepthOnFields.put("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.create", projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.create", 0) + 1);
            this.create(new DocumentCategoryPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.create", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.update", 0) <= maxDepth) {
            projectionDepthOnFields.put("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.update", projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.update", 0) + 1);
            this.update(new DocumentCategoryPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.update", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.delete", 0) <= maxDepth) {
            projectionDepthOnFields.put("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.delete", projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.delete", 0) + 1);
            this.delete(new DocumentCategoryPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DocumentCategoryCUDResponseProjection.DocumentCategoryPermissionRuleResponseProjection.delete", 0)));
        }
        this.typename();
        return this;
    }

    public DocumentCategoryCUDResponseProjection locationTypeID() {
        return locationTypeID(null);
    }

    public DocumentCategoryCUDResponseProjection locationTypeID(String alias) {
        fields.add(new GraphQLResponseField("locationTypeID").alias(alias));
        return this;
    }

    public DocumentCategoryCUDResponseProjection read(DocumentCategoryPermissionRuleResponseProjection subProjection) {
        return read(null, subProjection);
    }

    public DocumentCategoryCUDResponseProjection read(String alias, DocumentCategoryPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("read").alias(alias).projection(subProjection));
        return this;
    }

    public DocumentCategoryCUDResponseProjection create(DocumentCategoryPermissionRuleResponseProjection subProjection) {
        return create(null, subProjection);
    }

    public DocumentCategoryCUDResponseProjection create(String alias, DocumentCategoryPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("create").alias(alias).projection(subProjection));
        return this;
    }

    public DocumentCategoryCUDResponseProjection update(DocumentCategoryPermissionRuleResponseProjection subProjection) {
        return update(null, subProjection);
    }

    public DocumentCategoryCUDResponseProjection update(String alias, DocumentCategoryPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("update").alias(alias).projection(subProjection));
        return this;
    }

    public DocumentCategoryCUDResponseProjection delete(DocumentCategoryPermissionRuleResponseProjection subProjection) {
        return delete(null, subProjection);
    }

    public DocumentCategoryCUDResponseProjection delete(String alias, DocumentCategoryPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("delete").alias(alias).projection(subProjection));
        return this;
    }

    public DocumentCategoryCUDResponseProjection typename() {
        return typename(null);
    }

    public DocumentCategoryCUDResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
