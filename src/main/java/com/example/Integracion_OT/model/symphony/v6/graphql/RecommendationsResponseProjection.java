package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Recommendations
 */

public class RecommendationsResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public RecommendationsResponseProjection() {
    }

    public RecommendationsResponseProjection all$() {
        return all$(3);
    }

    public RecommendationsResponseProjection all$(int maxDepth) {
        this.id();
        this.externalID();
        this.resource();
        this.alarmType();
        this.shortDescription();
        this.longDescription();
        this.command();
        this.priority();
        this.status();
        this.runbook();
        this.used();
        if (projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.RecommendationsSourcesResponseProjection.recommendationsSources", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsResponseProjection.RecommendationsSourcesResponseProjection.recommendationsSources", projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.RecommendationsSourcesResponseProjection.recommendationsSources", 0) + 1);
            this.recommendationsSources(new RecommendationsSourcesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.RecommendationsSourcesResponseProjection.recommendationsSources", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.RecommendationsCategoryResponseProjection.recommendationsCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsResponseProjection.RecommendationsCategoryResponseProjection.recommendationsCategory", projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.RecommendationsCategoryResponseProjection.recommendationsCategory", 0) + 1);
            this.recommendationsCategory(new RecommendationsCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.RecommendationsCategoryResponseProjection.recommendationsCategory", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.UserResponseProjection.userApprobed", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsResponseProjection.UserResponseProjection.userApprobed", projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.UserResponseProjection.userApprobed", 0) + 1);
            this.userApprobed(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.UserResponseProjection.userApprobed", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.UserResponseProjection.userCreate", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsResponseProjection.UserResponseProjection.userCreate", projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.UserResponseProjection.userCreate", 0) + 1);
            this.userCreate(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.UserResponseProjection.userCreate", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.VendorResponseProjection.vendor", 0) <= maxDepth) {
            projectionDepthOnFields.put("RecommendationsResponseProjection.VendorResponseProjection.vendor", projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.VendorResponseProjection.vendor", 0) + 1);
            this.vendor(new VendorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RecommendationsResponseProjection.VendorResponseProjection.vendor", 0)));
        }
        this.typename();
        return this;
    }

    public RecommendationsResponseProjection id() {
        return id(null);
    }

    public RecommendationsResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RecommendationsResponseProjection externalID() {
        return externalID(null);
    }

    public RecommendationsResponseProjection externalID(String alias) {
        fields.add(new GraphQLResponseField("externalID").alias(alias));
        return this;
    }

    public RecommendationsResponseProjection resource() {
        return resource(null);
    }

    public RecommendationsResponseProjection resource(String alias) {
        fields.add(new GraphQLResponseField("resource").alias(alias));
        return this;
    }

    public RecommendationsResponseProjection alarmType() {
        return alarmType(null);
    }

    public RecommendationsResponseProjection alarmType(String alias) {
        fields.add(new GraphQLResponseField("alarmType").alias(alias));
        return this;
    }

    public RecommendationsResponseProjection shortDescription() {
        return shortDescription(null);
    }

    public RecommendationsResponseProjection shortDescription(String alias) {
        fields.add(new GraphQLResponseField("shortDescription").alias(alias));
        return this;
    }

    public RecommendationsResponseProjection longDescription() {
        return longDescription(null);
    }

    public RecommendationsResponseProjection longDescription(String alias) {
        fields.add(new GraphQLResponseField("longDescription").alias(alias));
        return this;
    }

    public RecommendationsResponseProjection command() {
        return command(null);
    }

    public RecommendationsResponseProjection command(String alias) {
        fields.add(new GraphQLResponseField("command").alias(alias));
        return this;
    }

    public RecommendationsResponseProjection priority() {
        return priority(null);
    }

    public RecommendationsResponseProjection priority(String alias) {
        fields.add(new GraphQLResponseField("priority").alias(alias));
        return this;
    }

    public RecommendationsResponseProjection status() {
        return status(null);
    }

    public RecommendationsResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public RecommendationsResponseProjection runbook() {
        return runbook(null);
    }

    public RecommendationsResponseProjection runbook(String alias) {
        fields.add(new GraphQLResponseField("runbook").alias(alias));
        return this;
    }

    public RecommendationsResponseProjection used() {
        return used(null);
    }

    public RecommendationsResponseProjection used(String alias) {
        fields.add(new GraphQLResponseField("used").alias(alias));
        return this;
    }

    public RecommendationsResponseProjection recommendationsSources(RecommendationsSourcesResponseProjection subProjection) {
        return recommendationsSources(null, subProjection);
    }

    public RecommendationsResponseProjection recommendationsSources(String alias, RecommendationsSourcesResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("recommendationsSources").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsResponseProjection recommendationsCategory(RecommendationsCategoryResponseProjection subProjection) {
        return recommendationsCategory(null, subProjection);
    }

    public RecommendationsResponseProjection recommendationsCategory(String alias, RecommendationsCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("recommendationsCategory").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsResponseProjection userApprobed(UserResponseProjection subProjection) {
        return userApprobed(null, subProjection);
    }

    public RecommendationsResponseProjection userApprobed(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userApprobed").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsResponseProjection userCreate(UserResponseProjection subProjection) {
        return userCreate(null, subProjection);
    }

    public RecommendationsResponseProjection userCreate(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userCreate").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsResponseProjection vendor(VendorResponseProjection subProjection) {
        return vendor(null, subProjection);
    }

    public RecommendationsResponseProjection vendor(String alias, VendorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("vendor").alias(alias).projection(subProjection));
        return this;
    }

    public RecommendationsResponseProjection typename() {
        return typename(null);
    }

    public RecommendationsResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
