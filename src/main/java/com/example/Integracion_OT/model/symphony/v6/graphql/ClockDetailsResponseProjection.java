package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ClockDetails
 */

public class ClockDetailsResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ClockDetailsResponseProjection() {
    }

    public ClockDetailsResponseProjection all$() {
        return all$(3);
    }

    public ClockDetailsResponseProjection all$(int maxDepth) {
        this.clockOutReason();
        this.distanceMeters();
        this.comment();
        this.typename();
        return this;
    }

    public ClockDetailsResponseProjection clockOutReason() {
        return clockOutReason(null);
    }

    public ClockDetailsResponseProjection clockOutReason(String alias) {
        fields.add(new GraphQLResponseField("clockOutReason").alias(alias));
        return this;
    }

    public ClockDetailsResponseProjection distanceMeters() {
        return distanceMeters(null);
    }

    public ClockDetailsResponseProjection distanceMeters(String alias) {
        fields.add(new GraphQLResponseField("distanceMeters").alias(alias));
        return this;
    }

    public ClockDetailsResponseProjection comment() {
        return comment(null);
    }

    public ClockDetailsResponseProjection comment(String alias) {
        fields.add(new GraphQLResponseField("comment").alias(alias));
        return this;
    }

    public ClockDetailsResponseProjection typename() {
        return typename(null);
    }

    public ClockDetailsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
