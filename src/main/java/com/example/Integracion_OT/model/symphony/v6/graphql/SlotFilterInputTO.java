package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlotFilterInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String slotStartDate;
    @javax.validation.constraints.NotNull
    private String slotEndDate;

    public SlotFilterInputTO() {
    }

    public SlotFilterInputTO(String slotStartDate, String slotEndDate) {
        this.slotStartDate = slotStartDate;
        this.slotEndDate = slotEndDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getSlotStartDate() {
        return slotStartDate;
    }

    public void setSlotStartDate(String slotStartDate) {
        this.slotStartDate = slotStartDate;
    }

    public String getSlotEndDate() {
        return slotEndDate;
    }

    public void setSlotEndDate(String slotEndDate) {
        this.slotEndDate = slotEndDate;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (slotStartDate != null) {
            joiner.add("slotStartDate: " + GraphQLRequestSerializer.getEntry(slotStartDate));
        }
        if (slotEndDate != null) {
            joiner.add("slotEndDate: " + GraphQLRequestSerializer.getEntry(slotEndDate));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String slotStartDate;
        private String slotEndDate;

        public Builder() {
        }

        public Builder setSlotStartDate(String slotStartDate) {
            this.slotStartDate = slotStartDate;
            return this;
        }

        public Builder setSlotEndDate(String slotEndDate) {
            this.slotEndDate = slotEndDate;
            return this;
        }


        public SlotFilterInputTO build() {
            return new SlotFilterInputTO(slotStartDate, slotEndDate);
        }

    }
}
