package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of vendors.
 */

public class VendorsQueryResponse extends GraphQLResult<Map<String, VendorConnectionTO>> {

    private static final String OPERATION_NAME = "vendors";

    public VendorsQueryResponse() {
    }

    /**
     * A list of vendors.
     */
    public VendorConnectionTO vendors() {
        Map<String, VendorConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
