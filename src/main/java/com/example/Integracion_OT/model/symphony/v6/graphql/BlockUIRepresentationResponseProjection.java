package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for BlockUIRepresentation
 */

public class BlockUIRepresentationResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public BlockUIRepresentationResponseProjection() {
    }

    public BlockUIRepresentationResponseProjection all$() {
        return all$(3);
    }

    public BlockUIRepresentationResponseProjection all$(int maxDepth) {
        this.name();
        this.xPosition();
        this.yPosition();
        this.typename();
        return this;
    }

    public BlockUIRepresentationResponseProjection name() {
        return name(null);
    }

    public BlockUIRepresentationResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public BlockUIRepresentationResponseProjection xPosition() {
        return xPosition(null);
    }

    public BlockUIRepresentationResponseProjection xPosition(String alias) {
        fields.add(new GraphQLResponseField("xPosition").alias(alias));
        return this;
    }

    public BlockUIRepresentationResponseProjection yPosition() {
        return yPosition(null);
    }

    public BlockUIRepresentationResponseProjection yPosition(String alias) {
        fields.add(new GraphQLResponseField("yPosition").alias(alias));
        return this;
    }

    public BlockUIRepresentationResponseProjection typename() {
        return typename(null);
    }

    public BlockUIRepresentationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
