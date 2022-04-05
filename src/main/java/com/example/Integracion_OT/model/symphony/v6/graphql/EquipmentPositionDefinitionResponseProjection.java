package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentPositionDefinition
 */

public class EquipmentPositionDefinitionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentPositionDefinitionResponseProjection() {
    }

    public EquipmentPositionDefinitionResponseProjection all$() {
        return all$(3);
    }

    public EquipmentPositionDefinitionResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.index();
        this.visibleLabel();
        this.typename();
        return this;
    }

    public EquipmentPositionDefinitionResponseProjection id() {
        return id(null);
    }

    public EquipmentPositionDefinitionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentPositionDefinitionResponseProjection name() {
        return name(null);
    }

    public EquipmentPositionDefinitionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EquipmentPositionDefinitionResponseProjection index() {
        return index(null);
    }

    public EquipmentPositionDefinitionResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public EquipmentPositionDefinitionResponseProjection visibleLabel() {
        return visibleLabel(null);
    }

    public EquipmentPositionDefinitionResponseProjection visibleLabel(String alias) {
        fields.add(new GraphQLResponseField("visibleLabel").alias(alias));
        return this;
    }

    public EquipmentPositionDefinitionResponseProjection typename() {
        return typename(null);
    }

    public EquipmentPositionDefinitionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
