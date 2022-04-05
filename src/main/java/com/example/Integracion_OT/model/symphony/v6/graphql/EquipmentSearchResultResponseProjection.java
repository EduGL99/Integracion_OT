package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EquipmentSearchResult
 */

public class EquipmentSearchResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentSearchResultResponseProjection() {
    }

    public EquipmentSearchResultResponseProjection all$() {
        return all$(3);
    }

    public EquipmentSearchResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EquipmentSearchResultResponseProjection.EquipmentResponseProjection.equipment", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentSearchResultResponseProjection.EquipmentResponseProjection.equipment", projectionDepthOnFields.getOrDefault("EquipmentSearchResultResponseProjection.EquipmentResponseProjection.equipment", 0) + 1);
            this.equipment(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentSearchResultResponseProjection.EquipmentResponseProjection.equipment", 0)));
        }
        this.count();
        this.typename();
        return this;
    }

    public EquipmentSearchResultResponseProjection equipment(EquipmentResponseProjection subProjection) {
        return equipment(null, subProjection);
    }

    public EquipmentSearchResultResponseProjection equipment(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipment").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentSearchResultResponseProjection count() {
        return count(null);
    }

    public EquipmentSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }

    public EquipmentSearchResultResponseProjection typename() {
        return typename(null);
    }

    public EquipmentSearchResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
