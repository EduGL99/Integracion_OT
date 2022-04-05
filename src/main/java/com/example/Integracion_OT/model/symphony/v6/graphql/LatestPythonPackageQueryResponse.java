package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class LatestPythonPackageQueryResponse extends GraphQLResult<Map<String, LatestPythonPackageResultTO>> {

    private static final String OPERATION_NAME = "latestPythonPackage";

    public LatestPythonPackageQueryResponse() {
    }

    public LatestPythonPackageResultTO latestPythonPackage() {
        Map<String, LatestPythonPackageResultTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
