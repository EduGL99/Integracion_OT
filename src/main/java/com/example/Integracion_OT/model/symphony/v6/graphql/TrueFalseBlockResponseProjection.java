package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for TrueFalseBlock
 */

public class TrueFalseBlockResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public TrueFalseBlockResponseProjection() {
    }

    public TrueFalseBlockResponseProjection all$() {
        return all$(3);
    }

    public TrueFalseBlockResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("TrueFalseBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("TrueFalseBlockResponseProjection.EntryPointResponseProjection.entryPoint", projectionDepthOnFields.getOrDefault("TrueFalseBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0) + 1);
            this.entryPoint(new EntryPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TrueFalseBlockResponseProjection.EntryPointResponseProjection.entryPoint", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TrueFalseBlockResponseProjection.ExitPointResponseProjection.trueExitPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("TrueFalseBlockResponseProjection.ExitPointResponseProjection.trueExitPoint", projectionDepthOnFields.getOrDefault("TrueFalseBlockResponseProjection.ExitPointResponseProjection.trueExitPoint", 0) + 1);
            this.trueExitPoint(new ExitPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TrueFalseBlockResponseProjection.ExitPointResponseProjection.trueExitPoint", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("TrueFalseBlockResponseProjection.ExitPointResponseProjection.falseExitPoint", 0) <= maxDepth) {
            projectionDepthOnFields.put("TrueFalseBlockResponseProjection.ExitPointResponseProjection.falseExitPoint", projectionDepthOnFields.getOrDefault("TrueFalseBlockResponseProjection.ExitPointResponseProjection.falseExitPoint", 0) + 1);
            this.falseExitPoint(new ExitPointResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TrueFalseBlockResponseProjection.ExitPointResponseProjection.falseExitPoint", 0)));
        }
        this.typename();
        return this;
    }

    public TrueFalseBlockResponseProjection entryPoint(EntryPointResponseProjection subProjection) {
        return entryPoint(null, subProjection);
    }

    public TrueFalseBlockResponseProjection entryPoint(String alias, EntryPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("entryPoint").alias(alias).projection(subProjection));
        return this;
    }

    public TrueFalseBlockResponseProjection trueExitPoint(ExitPointResponseProjection subProjection) {
        return trueExitPoint(null, subProjection);
    }

    public TrueFalseBlockResponseProjection trueExitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("trueExitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public TrueFalseBlockResponseProjection falseExitPoint(ExitPointResponseProjection subProjection) {
        return falseExitPoint(null, subProjection);
    }

    public TrueFalseBlockResponseProjection falseExitPoint(String alias, ExitPointResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("falseExitPoint").alias(alias).projection(subProjection));
        return this;
    }

    public TrueFalseBlockResponseProjection typename() {
        return typename(null);
    }

    public TrueFalseBlockResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
