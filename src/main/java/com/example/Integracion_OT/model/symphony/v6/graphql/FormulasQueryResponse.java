package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult;

import java.util.Map;

/**
 * A list of formulas.
 */

public class FormulasQueryResponse extends GraphQLResult<Map<String, FormulaConnectionTO>> {

    private static final String OPERATION_NAME = "formulas";

    public FormulasQueryResponse() {
    }

    /**
     * A list of formulas.
     */
    public FormulaConnectionTO formulas() {
        Map<String, FormulaConnectionTO> data = getData();
        return data != null ? data.get(OPERATION_NAME) : null;
    }

}
