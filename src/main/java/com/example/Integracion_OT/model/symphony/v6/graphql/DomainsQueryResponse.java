package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of domains.
 */

public class DomainsQueryResponse extends GraphQLResult<Map<String, DomainConnectionTO>> {

    private static final String OPERATION_NAME = "domains";

    public DomainsQueryResponse() {
    }

    /**
     * A list of domains.
     */
    public DomainConnectionTO domains() {
        Map<String, DomainConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
