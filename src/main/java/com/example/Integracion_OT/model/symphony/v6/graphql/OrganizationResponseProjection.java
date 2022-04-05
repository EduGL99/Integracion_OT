package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Organization
 */

public class OrganizationResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public OrganizationResponseProjection() {
    }

    public OrganizationResponseProjection all$() {
        return all$(3);
    }

    public OrganizationResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.description();
        this.typename();
        return this;
    }

    public OrganizationResponseProjection id() {
        return id(null);
    }

    public OrganizationResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public OrganizationResponseProjection name() {
        return name(null);
    }

    public OrganizationResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public OrganizationResponseProjection description() {
        return description(null);
    }

    public OrganizationResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public OrganizationResponseProjection typename() {
        return typename(null);
    }

    public OrganizationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
