package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for EndToEndPath
 */

public class EndToEndPathResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EndToEndPathResponseProjection() {
    }

    public EndToEndPathResponseProjection all$() {
        return all$(3);
    }

    public EndToEndPathResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("EndToEndPathResponseProjection.LinkResponseProjection.links", 0) <= maxDepth) {
            projectionDepthOnFields.put("EndToEndPathResponseProjection.LinkResponseProjection.links", projectionDepthOnFields.getOrDefault("EndToEndPathResponseProjection.LinkResponseProjection.links", 0) + 1);
            this.links(new LinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EndToEndPathResponseProjection.LinkResponseProjection.links", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EndToEndPathResponseProjection.EquipmentPortResponseProjection.ports", 0) <= maxDepth) {
            projectionDepthOnFields.put("EndToEndPathResponseProjection.EquipmentPortResponseProjection.ports", projectionDepthOnFields.getOrDefault("EndToEndPathResponseProjection.EquipmentPortResponseProjection.ports", 0) + 1);
            this.ports(new EquipmentPortResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EndToEndPathResponseProjection.EquipmentPortResponseProjection.ports", 0)));
        }
        this.typename();
        return this;
    }

    public EndToEndPathResponseProjection links(LinkResponseProjection subProjection) {
        return links(null, subProjection);
    }

    public EndToEndPathResponseProjection links(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("links").alias(alias).projection(subProjection));
        return this;
    }

    public EndToEndPathResponseProjection ports(EquipmentPortResponseProjection subProjection) {
        return ports(null, subProjection);
    }

    public EndToEndPathResponseProjection ports(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ports").alias(alias).projection(subProjection));
        return this;
    }

    public EndToEndPathResponseProjection typename() {
        return typename(null);
    }

    public EndToEndPathResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
