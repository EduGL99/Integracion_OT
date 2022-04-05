package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for PortSearchResult
 */

public class PortSearchResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PortSearchResultResponseProjection() {
    }

    public PortSearchResultResponseProjection all$() {
        return all$(3);
    }

    public PortSearchResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PortSearchResultResponseProjection.EquipmentPortResponseProjection.ports", 0) <= maxDepth) {
            projectionDepthOnFields.put("PortSearchResultResponseProjection.EquipmentPortResponseProjection.ports", projectionDepthOnFields.getOrDefault("PortSearchResultResponseProjection.EquipmentPortResponseProjection.ports", 0) + 1);
            this.ports(new EquipmentPortResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PortSearchResultResponseProjection.EquipmentPortResponseProjection.ports", 0)));
        }
        this.count();
        this.typename();
        return this;
    }

    public PortSearchResultResponseProjection ports(EquipmentPortResponseProjection subProjection) {
        return ports(null, subProjection);
    }

    public PortSearchResultResponseProjection ports(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ports").alias(alias).projection(subProjection));
        return this;
    }

    public PortSearchResultResponseProjection count() {
        return count(null);
    }

    public PortSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }

    public PortSearchResultResponseProjection typename() {
        return typename(null);
    }

    public PortSearchResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
