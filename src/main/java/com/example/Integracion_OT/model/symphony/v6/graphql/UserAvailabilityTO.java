package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAvailabilityTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private UserTO user;
    @javax.validation.constraints.NotNull
    private String slotStartDate;
    @javax.validation.constraints.NotNull
    private String slotEndDate;

    public UserAvailabilityTO() {
    }

    public UserAvailabilityTO(UserTO user, String slotStartDate, String slotEndDate) {
        this.user = user;
        this.slotStartDate = slotStartDate;
        this.slotEndDate = slotEndDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public UserTO getUser() {
        return user;
    }

    public void setUser(UserTO user) {
        this.user = user;
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
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        if (slotStartDate != null) {
            joiner.add("slotStartDate: " + GraphQLRequestSerializer.getEntry(slotStartDate));
        }
        if (slotEndDate != null) {
            joiner.add("slotEndDate: " + GraphQLRequestSerializer.getEntry(slotEndDate));
        }
        return joiner.toString();
    }

    public static class Builder {

        private UserTO user;
        private String slotStartDate;
        private String slotEndDate;

        public Builder() {
        }

        public Builder setUser(UserTO user) {
            this.user = user;
            return this;
        }

        public Builder setSlotStartDate(String slotStartDate) {
            this.slotStartDate = slotStartDate;
            return this;
        }

        public Builder setSlotEndDate(String slotEndDate) {
            this.slotEndDate = slotEndDate;
            return this;
        }


        public UserAvailabilityTO build() {
            return new UserAvailabilityTO(user, slotStartDate, slotEndDate);
        }

    }
}
