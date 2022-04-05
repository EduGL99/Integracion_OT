package com.example.Integracion_OT.configuration.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

public class CustomGraphQLRequest extends GraphQLRequest {

    private final CustomGraphQLOperationRequest request;

    public CustomGraphQLRequest(CustomGraphQLOperationRequest request) {
        super(request);
        this.request = request;
    }

    public CustomGraphQLRequest(String operationName, CustomGraphQLOperationRequest request) {
        super(operationName, request);
        this.request = request;
    }

    public CustomGraphQLRequest(CustomGraphQLOperationRequest request, GraphQLResponseProjection responseProjection) {
        super(request, responseProjection);
        this.request = request;
    }

    @Override
    public CustomGraphQLOperationRequest getRequest() {
        return request;
    }

    /**
     * Serializes GraphQL request to be used as HTTP JSON body
     * according to https://graphql.org/learn/serving-over-http specifications
     *
     * @return the serialized request
     */
    @Override
    public String toHttpJsonBody() {
        return CustomGraphQLRequestSerializer.toHttpJsonBody(this);
    }

    /**
     * Serializes GraphQL request as raw query string
     *
     * @return the serialized request
     */
    @Override
    public String toQueryString() {
        return CustomGraphQLRequestSerializer.toQueryString(this);
    }
}
