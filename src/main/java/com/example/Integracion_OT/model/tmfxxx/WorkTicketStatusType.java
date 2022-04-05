package com.example.Integracion_OT.model.tmfxxx;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WorkTicketStatusType {
    ACKNOWLEDGED("acknowledged"),
    REJECTED("rejected"),
    PENDING("pending"),
    HELD("held"),
    INPROGRESS("inProgress"),
    CANCELLED("cancelled"),
    CLOSED("closed"),
    RESOLVED("resolved");

    private final String value;

    WorkTicketStatusType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static WorkTicketStatusType fromValue(String text) {
        for (WorkTicketStatusType b : WorkTicketStatusType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
