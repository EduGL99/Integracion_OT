package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Comment
 */

public class CommentResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CommentResponseProjection() {
    }

    public CommentResponseProjection all$() {
        return all$(3);
    }

    public CommentResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommentResponseProjection.UserResponseProjection.author", projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserResponseProjection.author", 0) + 1);
            this.author(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserResponseProjection.author", 0)));
        }
        this.text();
        this.createTime();
        this.typename();
        return this;
    }

    public CommentResponseProjection id() {
        return id(null);
    }

    public CommentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CommentResponseProjection author(UserResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public CommentResponseProjection author(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection text() {
        return text(null);
    }

    public CommentResponseProjection text(String alias) {
        fields.add(new GraphQLResponseField("text").alias(alias));
        return this;
    }

    public CommentResponseProjection createTime() {
        return createTime(null);
    }

    public CommentResponseProjection createTime(String alias) {
        fields.add(new GraphQLResponseField("createTime").alias(alias));
        return this;
    }

    public CommentResponseProjection typename() {
        return typename(null);
    }

    public CommentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
