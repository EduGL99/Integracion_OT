package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentPortDefinition
 */

public class EquipmentPortDefinitionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentPortDefinitionResponseProjection() {
    }

    public EquipmentPortDefinitionResponseProjection all$() {
        return all$(3);
    }

    public EquipmentPortDefinitionResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.index();
        this.visibleLabel();
        if (projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionResponseProjection.EquipmentPortTypeResponseProjection.portType", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortDefinitionResponseProjection.EquipmentPortTypeResponseProjection.portType", projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionResponseProjection.EquipmentPortTypeResponseProjection.portType", 0) + 1);
            this.portType(new EquipmentPortTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionResponseProjection.EquipmentPortTypeResponseProjection.portType", 0)));
        }
        this.bandwidth();
        if (projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionResponseProjection.EquipmentPortDefinitionResponseProjection.connectedPorts", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentPortDefinitionResponseProjection.EquipmentPortDefinitionResponseProjection.connectedPorts", projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionResponseProjection.EquipmentPortDefinitionResponseProjection.connectedPorts", 0) + 1);
            this.connectedPorts(new EquipmentPortDefinitionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentPortDefinitionResponseProjection.EquipmentPortDefinitionResponseProjection.connectedPorts", 0)));
        }
        this.typename();
        return this;
    }

    public EquipmentPortDefinitionResponseProjection id() {
        return id(null);
    }

    public EquipmentPortDefinitionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection name() {
        return name(null);
    }

    public EquipmentPortDefinitionResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection index() {
        return index(null);
    }

    public EquipmentPortDefinitionResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection visibleLabel() {
        return visibleLabel(null);
    }

    public EquipmentPortDefinitionResponseProjection visibleLabel(String alias) {
        fields.add(new GraphQLResponseField("visibleLabel").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection portType(EquipmentPortTypeResponseProjection subProjection) {
        return portType(null, subProjection);
    }

    public EquipmentPortDefinitionResponseProjection portType(String alias, EquipmentPortTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("portType").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection bandwidth() {
        return bandwidth(null);
    }

    public EquipmentPortDefinitionResponseProjection bandwidth(String alias) {
        fields.add(new GraphQLResponseField("bandwidth").alias(alias));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection connectedPorts(EquipmentPortDefinitionResponseProjection subProjection) {
        return connectedPorts(null, subProjection);
    }

    public EquipmentPortDefinitionResponseProjection connectedPorts(String alias, EquipmentPortDefinitionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("connectedPorts").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentPortDefinitionResponseProjection typename() {
        return typename(null);
    }

    public EquipmentPortDefinitionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
