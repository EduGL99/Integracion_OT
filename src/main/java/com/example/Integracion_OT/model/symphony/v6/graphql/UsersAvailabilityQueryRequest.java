package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class UsersAvailabilityQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "usersAvailability";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public UsersAvailabilityQueryRequest() {
    }

    public UsersAvailabilityQueryRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setFilterBy(List<UserFilterInputTO> filterBy) {
        this.input.put("filterBy", filterBy);
    }

    public void setSlotFilterBy(SlotFilterInputTO slotFilterBy) {
        this.input.put("slotFilterBy", slotFilterBy);
    }

    public void setDuration(double duration) {
        this.input.put("duration", duration);
    }

    public void setRegularHours(RegularHoursInputTO regularHours) {
        this.input.put("regularHours", regularHours);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String $alias;
        private List<UserFilterInputTO> filterBy;
        private SlotFilterInputTO slotFilterBy;
        private double duration;
        private RegularHoursInputTO regularHours;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setFilterBy(List<UserFilterInputTO> filterBy) {
            this.filterBy = filterBy;
            return this;
        }

        public Builder setSlotFilterBy(SlotFilterInputTO slotFilterBy) {
            this.slotFilterBy = slotFilterBy;
            return this;
        }

        public Builder setDuration(double duration) {
            this.duration = duration;
            return this;
        }

        public Builder setRegularHours(RegularHoursInputTO regularHours) {
            this.regularHours = regularHours;
            return this;
        }


        public UsersAvailabilityQueryRequest build() {
            UsersAvailabilityQueryRequest obj = new UsersAvailabilityQueryRequest($alias);
            obj.setFilterBy(filterBy);
            obj.setSlotFilterBy(slotFilterBy);
            obj.setDuration(duration);
            obj.setRegularHours(regularHours);
            return obj;
        }

    }
}
