package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddCommentMutationResponse extends GraphQLResult<Map<String, CommentTO>> {

    private static final String OPERATION_NAME = "addComment";

    public AddCommentMutationResponse() {
    }

    public CommentTO addComment() {
        Map<String, CommentTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
