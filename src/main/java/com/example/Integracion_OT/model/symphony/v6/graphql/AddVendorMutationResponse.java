package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class AddVendorMutationResponse extends GraphQLResult<Map<String, VendorTO>> {

    private static final String OPERATION_NAME = "addVendor";

    public AddVendorMutationResponse() {
    }

    public VendorTO addVendor() {
        Map<String, VendorTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
