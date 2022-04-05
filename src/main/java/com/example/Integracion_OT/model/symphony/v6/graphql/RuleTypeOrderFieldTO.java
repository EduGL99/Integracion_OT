package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Properties by which ruleTypes connections can be ordered.
 */

public enum RuleTypeOrderFieldTO {

    /**
     * Order ruleTypes by name.
     */
    NAME("NAME"),
    /**
     * Order ruleTypes by creation time.
     */
    CREATED_AT("CREATED_AT"),
    /**
     * Order ruleTypes by update time.
     */
    UPDATED_AT("UPDATED_AT");

    private final String graphqlName;

    RuleTypeOrderFieldTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
