package com.example.Integracion_OT.configuration.graphql;

import com.example.Integracion_OT.model.symphony.FragmentNode;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

public interface CustomGraphQLOperationRequest extends GraphQLOperationRequest {

    FragmentNode getInlineFragment();
}
