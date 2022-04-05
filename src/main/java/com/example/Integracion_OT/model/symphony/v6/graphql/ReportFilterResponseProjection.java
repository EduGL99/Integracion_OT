package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for ReportFilter
 */

public class ReportFilterResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ReportFilterResponseProjection() {
    }

    public ReportFilterResponseProjection all$() {
        return all$(3);
    }

    public ReportFilterResponseProjection all$(int maxDepth) {
        this.id();
        this.name();
        this.entity();
        if (projectionDepthOnFields.getOrDefault("ReportFilterResponseProjection.GeneralFilterResponseProjection.filters", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReportFilterResponseProjection.GeneralFilterResponseProjection.filters", projectionDepthOnFields.getOrDefault("ReportFilterResponseProjection.GeneralFilterResponseProjection.filters", 0) + 1);
            this.filters(new GeneralFilterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReportFilterResponseProjection.GeneralFilterResponseProjection.filters", 0)));
        }
        this.typename();
        return this;
    }

    public ReportFilterResponseProjection id() {
        return id(null);
    }

    public ReportFilterResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReportFilterResponseProjection name() {
        return name(null);
    }

    public ReportFilterResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ReportFilterResponseProjection entity() {
        return entity(null);
    }

    public ReportFilterResponseProjection entity(String alias) {
        fields.add(new GraphQLResponseField("entity").alias(alias));
        return this;
    }

    public ReportFilterResponseProjection filters(GeneralFilterResponseProjection subProjection) {
        return filters(null, subProjection);
    }

    public ReportFilterResponseProjection filters(String alias, GeneralFilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filters").alias(alias).projection(subProjection));
        return this;
    }

    public ReportFilterResponseProjection typename() {
        return typename(null);
    }

    public ReportFilterResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
