package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for LatestPythonPackageResult
 */

public class LatestPythonPackageResultResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LatestPythonPackageResultResponseProjection() {
    }

    public LatestPythonPackageResultResponseProjection all$() {
        return all$(3);
    }

    public LatestPythonPackageResultResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LatestPythonPackageResultResponseProjection.PythonPackageResponseProjection.lastPythonPackage", 0) <= maxDepth) {
            projectionDepthOnFields.put("LatestPythonPackageResultResponseProjection.PythonPackageResponseProjection.lastPythonPackage", projectionDepthOnFields.getOrDefault("LatestPythonPackageResultResponseProjection.PythonPackageResponseProjection.lastPythonPackage", 0) + 1);
            this.lastPythonPackage(new PythonPackageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LatestPythonPackageResultResponseProjection.PythonPackageResponseProjection.lastPythonPackage", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LatestPythonPackageResultResponseProjection.PythonPackageResponseProjection.lastBreakingPythonPackage", 0) <= maxDepth) {
            projectionDepthOnFields.put("LatestPythonPackageResultResponseProjection.PythonPackageResponseProjection.lastBreakingPythonPackage", projectionDepthOnFields.getOrDefault("LatestPythonPackageResultResponseProjection.PythonPackageResponseProjection.lastBreakingPythonPackage", 0) + 1);
            this.lastBreakingPythonPackage(new PythonPackageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LatestPythonPackageResultResponseProjection.PythonPackageResponseProjection.lastBreakingPythonPackage", 0)));
        }
        this.typename();
        return this;
    }

    public LatestPythonPackageResultResponseProjection lastPythonPackage(PythonPackageResponseProjection subProjection) {
        return lastPythonPackage(null, subProjection);
    }

    public LatestPythonPackageResultResponseProjection lastPythonPackage(String alias, PythonPackageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lastPythonPackage").alias(alias).projection(subProjection));
        return this;
    }

    public LatestPythonPackageResultResponseProjection lastBreakingPythonPackage(PythonPackageResponseProjection subProjection) {
        return lastBreakingPythonPackage(null, subProjection);
    }

    public LatestPythonPackageResultResponseProjection lastBreakingPythonPackage(String alias, PythonPackageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lastBreakingPythonPackage").alias(alias).projection(subProjection));
        return this;
    }

    public LatestPythonPackageResultResponseProjection typename() {
        return typename(null);
    }

    public LatestPythonPackageResultResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
