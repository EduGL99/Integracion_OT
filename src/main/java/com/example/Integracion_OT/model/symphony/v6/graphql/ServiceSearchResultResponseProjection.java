package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ServiceSearchResult
 */

public class ServiceSearchResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ServiceSearchResultResponseProjection() {
    }

    public ServiceSearchResultResponseProjection all$() {
        return all$(3);
    }

    public ServiceSearchResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ServiceSearchResultResponseProjection.ServiceResponseProjection.services", 0) <= maxDepth) {
            projectionDepthOnFields.put("ServiceSearchResultResponseProjection.ServiceResponseProjection.services", projectionDepthOnFields.getOrDefault("ServiceSearchResultResponseProjection.ServiceResponseProjection.services", 0) + 1);
            this.services(new ServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ServiceSearchResultResponseProjection.ServiceResponseProjection.services", 0)));
        }
        this.count();
        this.typename();
        return this;
    }

    public ServiceSearchResultResponseProjection services(ServiceResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public ServiceSearchResultResponseProjection services(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }

    public ServiceSearchResultResponseProjection count() {
        return count(null);
    }

    public ServiceSearchResultResponseProjection count(String alias) {
        fields.add(new GraphQLResponseField("count").alias(alias));
        return this;
    }

    public ServiceSearchResultResponseProjection typename() {
        return typename(null);
    }

    public ServiceSearchResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
