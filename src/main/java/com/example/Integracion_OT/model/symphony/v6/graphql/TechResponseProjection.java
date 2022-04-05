package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Tech
 */

public class TechResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public TechResponseProjection() {
    }

    public TechResponseProjection all$() {
        return all$(3);
    }

    public TechResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("TechResponseProjection.DomainResponseProjection.domainFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("TechResponseProjection.DomainResponseProjection.domainFk", projectionDepthOnFields.getOrDefault("TechResponseProjection.DomainResponseProjection.domainFk", 0) + 1);
            this.domainFk(new DomainResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TechResponseProjection.DomainResponseProjection.domainFk", 0)));
        }
        this.typename();
        return this;
    }

    public TechResponseProjection id() {
        return id(null);
    }

    public TechResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TechResponseProjection name() {
        return name(null);
    }

    public TechResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public TechResponseProjection domainFk(DomainResponseProjection subProjection) {
        return domainFk(null, subProjection);
    }

    public TechResponseProjection domainFk(String alias, DomainResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("domainFk").alias(alias).projection(subProjection));
        return this;
    }

    public TechResponseProjection typename() {
        return typename(null);
    }

    public TechResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
