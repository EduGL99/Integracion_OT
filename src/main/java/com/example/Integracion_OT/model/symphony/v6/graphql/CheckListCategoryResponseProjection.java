package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CheckListCategory
 */

public class CheckListCategoryResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CheckListCategoryResponseProjection() {
    }

    public CheckListCategoryResponseProjection all$() {
        return all$(3);
    }

    public CheckListCategoryResponseProjection all$(int maxDepth) {
        this.id();
        this.title();
        this.description();
        if (projectionDepthOnFields.getOrDefault("CheckListCategoryResponseProjection.CheckListItemResponseProjection.checkList", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckListCategoryResponseProjection.CheckListItemResponseProjection.checkList", projectionDepthOnFields.getOrDefault("CheckListCategoryResponseProjection.CheckListItemResponseProjection.checkList", 0) + 1);
            this.checkList(new CheckListItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckListCategoryResponseProjection.CheckListItemResponseProjection.checkList", 0)));
        }
        this.typename();
        return this;
    }

    public CheckListCategoryResponseProjection id() {
        return id(null);
    }

    public CheckListCategoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CheckListCategoryResponseProjection title() {
        return title(null);
    }

    public CheckListCategoryResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public CheckListCategoryResponseProjection description() {
        return description(null);
    }

    public CheckListCategoryResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public CheckListCategoryResponseProjection checkList(CheckListItemResponseProjection subProjection) {
        return checkList(null, subProjection);
    }

    public CheckListCategoryResponseProjection checkList(String alias, CheckListItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkList").alias(alias).projection(subProjection));
        return this;
    }

    public CheckListCategoryResponseProjection typename() {
        return typename(null);
    }

    public CheckListCategoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
