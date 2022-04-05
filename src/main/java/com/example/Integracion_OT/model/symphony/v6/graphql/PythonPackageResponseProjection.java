package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for PythonPackage
 */

public class PythonPackageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public PythonPackageResponseProjection() {
    }

    public PythonPackageResponseProjection all$() {
        return all$(3);
    }

    public PythonPackageResponseProjection all$(int maxDepth) {
        this.version();
        this.whlFileKey();
        this.uploadTime();
        this.hasBreakingChange();
        this.typename();
        return this;
    }

    public PythonPackageResponseProjection version() {
        return version(null);
    }

    public PythonPackageResponseProjection version(String alias) {
        fields.add(new GraphQLResponseField("version").alias(alias));
        return this;
    }

    public PythonPackageResponseProjection whlFileKey() {
        return whlFileKey(null);
    }

    public PythonPackageResponseProjection whlFileKey(String alias) {
        fields.add(new GraphQLResponseField("whlFileKey").alias(alias));
        return this;
    }

    public PythonPackageResponseProjection uploadTime() {
        return uploadTime(null);
    }

    public PythonPackageResponseProjection uploadTime(String alias) {
        fields.add(new GraphQLResponseField("uploadTime").alias(alias));
        return this;
    }

    public PythonPackageResponseProjection hasBreakingChange() {
        return hasBreakingChange(null);
    }

    public PythonPackageResponseProjection hasBreakingChange(String alias) {
        fields.add(new GraphQLResponseField("hasBreakingChange").alias(alias));
        return this;
    }

    public PythonPackageResponseProjection typename() {
        return typename(null);
    }

    public PythonPackageResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
