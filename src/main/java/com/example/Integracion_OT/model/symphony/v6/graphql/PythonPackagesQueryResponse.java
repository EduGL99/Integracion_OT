package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;


public class PythonPackagesQueryResponse extends GraphQLResult<Map<String, java.util.List<PythonPackageTO>>> {

    private static final String OPERATION_NAME = "pythonPackages";

    public PythonPackagesQueryResponse() {
    }

    public java.util.List<PythonPackageTO> pythonPackages() {
        Map<String, java.util.List<PythonPackageTO>> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
