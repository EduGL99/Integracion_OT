package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CheckListCategoryDefinition
 */

public class CheckListCategoryDefinitionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CheckListCategoryDefinitionResponseProjection() {
    }

    public CheckListCategoryDefinitionResponseProjection all$() {
        return all$(3);
    }

    public CheckListCategoryDefinitionResponseProjection all$(int maxDepth) {
        this.id();
        this.title();
        this.description();
        if (projectionDepthOnFields.getOrDefault("CheckListCategoryDefinitionResponseProjection.CheckListItemDefinitionResponseProjection.checklistItemDefinitions", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckListCategoryDefinitionResponseProjection.CheckListItemDefinitionResponseProjection.checklistItemDefinitions", projectionDepthOnFields.getOrDefault("CheckListCategoryDefinitionResponseProjection.CheckListItemDefinitionResponseProjection.checklistItemDefinitions", 0) + 1);
            this.checklistItemDefinitions(new CheckListItemDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckListCategoryDefinitionResponseProjection.CheckListItemDefinitionResponseProjection.checklistItemDefinitions", 0)));
        }
        this.typename();
        return this;
    }

    public CheckListCategoryDefinitionResponseProjection id() {
        return id(null);
    }

    public CheckListCategoryDefinitionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CheckListCategoryDefinitionResponseProjection title() {
        return title(null);
    }

    public CheckListCategoryDefinitionResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public CheckListCategoryDefinitionResponseProjection description() {
        return description(null);
    }

    public CheckListCategoryDefinitionResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public CheckListCategoryDefinitionResponseProjection checklistItemDefinitions(CheckListItemDefinitionResponseProjection subProjection) {
        return checklistItemDefinitions(null, subProjection);
    }

    public CheckListCategoryDefinitionResponseProjection checklistItemDefinitions(String alias, CheckListItemDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checklistItemDefinitions").alias(alias).projection(subProjection));
        return this;
    }

    public CheckListCategoryDefinitionResponseProjection typename() {
        return typename(null);
    }

    public CheckListCategoryDefinitionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
