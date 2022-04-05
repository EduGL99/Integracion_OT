package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ClockActivity
 */

public class ClockActivityResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ClockActivityResponseProjection() {
    }

    public ClockActivityResponseProjection all$() {
        return all$(3);
    }

    public ClockActivityResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ClockActivityResponseProjection.UserResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClockActivityResponseProjection.UserResponseProjection.author", projectionDepthOnFields.getOrDefault("ClockActivityResponseProjection.UserResponseProjection.author", 0) + 1);
            this.author(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClockActivityResponseProjection.UserResponseProjection.author", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ClockActivityResponseProjection.ClockDetailsResponseProjection.details", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClockActivityResponseProjection.ClockDetailsResponseProjection.details", projectionDepthOnFields.getOrDefault("ClockActivityResponseProjection.ClockDetailsResponseProjection.details", 0) + 1);
            this.details(new ClockDetailsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClockActivityResponseProjection.ClockDetailsResponseProjection.details", 0)));
        }
        this.time();
        this.typename();
        return this;
    }

    public ClockActivityResponseProjection author(UserResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public ClockActivityResponseProjection author(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public ClockActivityResponseProjection details(ClockDetailsResponseProjection subProjection) {
        return details(null, subProjection);
    }

    public ClockActivityResponseProjection details(String alias, ClockDetailsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("details").alias(alias).projection(subProjection));
        return this;
    }

    public ClockActivityResponseProjection time() {
        return time(null);
    }

    public ClockActivityResponseProjection time(String alias) {
        fields.add(new GraphQLResponseField("time").alias(alias));
        return this;
    }

    public ClockActivityResponseProjection typename() {
        return typename(null);
    }

    public ClockActivityResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
