package com.example.Integracion_OT.configuration.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomGraphQLRequests extends GraphQLRequests {

    private final List<CustomGraphQLRequest> requests = new ArrayList<>();

    public CustomGraphQLRequests(CustomGraphQLRequest... requests) {
        super(requests);
        this.requests.addAll(Arrays.asList(requests));
    }

    public void addRequest(CustomGraphQLRequest request) {
        this.requests.add(request);
    }

    public List<CustomGraphQLRequest> getCustomRequests() {
        return new ArrayList<>(requests);
    }

    @Override
    public String toHttpJsonBody() {
        return CustomGraphQLRequestSerializer.toHttpJsonBody(this);
    }
}
