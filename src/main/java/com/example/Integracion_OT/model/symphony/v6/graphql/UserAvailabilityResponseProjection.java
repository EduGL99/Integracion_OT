package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for UserAvailability
 */

public class UserAvailabilityResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public UserAvailabilityResponseProjection() {
    }

    public UserAvailabilityResponseProjection all$() {
        return all$(3);
    }

    public UserAvailabilityResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UserAvailabilityResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserAvailabilityResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("UserAvailabilityResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserAvailabilityResponseProjection.UserResponseProjection.user", 0)));
        }
        this.slotStartDate();
        this.slotEndDate();
        this.typename();
        return this;
    }

    public UserAvailabilityResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public UserAvailabilityResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public UserAvailabilityResponseProjection slotStartDate() {
        return slotStartDate(null);
    }

    public UserAvailabilityResponseProjection slotStartDate(String alias) {
        fields.add(new GraphQLResponseField("slotStartDate").alias(alias));
        return this;
    }

    public UserAvailabilityResponseProjection slotEndDate() {
        return slotEndDate(null);
    }

    public UserAvailabilityResponseProjection slotEndDate(String alias) {
        fields.add(new GraphQLResponseField("slotEndDate").alias(alias));
        return this;
    }

    public UserAvailabilityResponseProjection typename() {
        return typename(null);
    }

    public UserAvailabilityResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
