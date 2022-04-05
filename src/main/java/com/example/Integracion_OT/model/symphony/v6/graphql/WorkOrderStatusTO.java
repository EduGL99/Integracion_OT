package com.example.Integracion_OT.model.symphony.v6.graphql;

/**
 * Work Order status
 */

public enum WorkOrderStatusTO {

    PLANNED("PLANNED"),
    IN_PROGRESS("IN_PROGRESS"),
    @Deprecated
    PENDING("PENDING"),
    SUBMITTED("SUBMITTED"),
    CLOSED("CLOSED"),
    @Deprecated
    DONE("DONE"),
    BLOCKED("BLOCKED"),
    CANCELED("CANCELED"),
    SUSPENDED("SUSPENDED");

    private final String graphqlName;

    WorkOrderStatusTO(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
