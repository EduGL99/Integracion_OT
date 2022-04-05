package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CheckListItemDefinition
 */

public class CheckListItemDefinitionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CheckListItemDefinitionResponseProjection() {
    }

    public CheckListItemDefinitionResponseProjection all$() {
        return all$(3);
    }

    public CheckListItemDefinitionResponseProjection all$(int maxDepth) {
        this.id();
        this.title();
        this.type();
        this.index();
        this.isMandatory();
        this.enumValues();
        this.enumSelectionMode();
        this.helpText();
        this.typename();
        return this;
    }

    public CheckListItemDefinitionResponseProjection id() {
        return id(null);
    }

    public CheckListItemDefinitionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CheckListItemDefinitionResponseProjection title() {
        return title(null);
    }

    public CheckListItemDefinitionResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public CheckListItemDefinitionResponseProjection type() {
        return type(null);
    }

    public CheckListItemDefinitionResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public CheckListItemDefinitionResponseProjection index() {
        return index(null);
    }

    public CheckListItemDefinitionResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public CheckListItemDefinitionResponseProjection isMandatory() {
        return isMandatory(null);
    }

    public CheckListItemDefinitionResponseProjection isMandatory(String alias) {
        fields.add(new GraphQLResponseField("isMandatory").alias(alias));
        return this;
    }

    public CheckListItemDefinitionResponseProjection enumValues() {
        return enumValues(null);
    }

    public CheckListItemDefinitionResponseProjection enumValues(String alias) {
        fields.add(new GraphQLResponseField("enumValues").alias(alias));
        return this;
    }

    public CheckListItemDefinitionResponseProjection enumSelectionMode() {
        return enumSelectionMode(null);
    }

    public CheckListItemDefinitionResponseProjection enumSelectionMode(String alias) {
        fields.add(new GraphQLResponseField("enumSelectionMode").alias(alias));
        return this;
    }

    public CheckListItemDefinitionResponseProjection helpText() {
        return helpText(null);
    }

    public CheckListItemDefinitionResponseProjection helpText(String alias) {
        fields.add(new GraphQLResponseField("helpText").alias(alias));
        return this;
    }

    public CheckListItemDefinitionResponseProjection typename() {
        return typename(null);
    }

    public CheckListItemDefinitionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
