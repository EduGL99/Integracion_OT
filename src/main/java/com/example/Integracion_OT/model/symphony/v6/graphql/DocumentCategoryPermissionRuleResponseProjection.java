package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for DocumentCategoryPermissionRule
 */

public class DocumentCategoryPermissionRuleResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DocumentCategoryPermissionRuleResponseProjection() {
    }

    public DocumentCategoryPermissionRuleResponseProjection all$() {
        return all$(3);
    }

    public DocumentCategoryPermissionRuleResponseProjection all$(int maxDepth) {
        this.isAllowed();
        this.documentCategoryIds();
        this.typename();
        return this;
    }

    public DocumentCategoryPermissionRuleResponseProjection isAllowed() {
        return isAllowed(null);
    }

    public DocumentCategoryPermissionRuleResponseProjection isAllowed(String alias) {
        fields.add(new GraphQLResponseField("isAllowed").alias(alias));
        return this;
    }

    public DocumentCategoryPermissionRuleResponseProjection documentCategoryIds() {
        return documentCategoryIds(null);
    }

    public DocumentCategoryPermissionRuleResponseProjection documentCategoryIds(String alias) {
        fields.add(new GraphQLResponseField("documentCategoryIds").alias(alias));
        return this;
    }

    public DocumentCategoryPermissionRuleResponseProjection typename() {
        return typename(null);
    }

    public DocumentCategoryPermissionRuleResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
