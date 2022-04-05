package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivityFilterInputTO implements java.io.Serializable {

    private int limit;
    @javax.validation.constraints.NotNull
    private OrderDirectionTO orderDirection;
    @javax.validation.constraints.NotNull
    private ActivityFieldTO activityType;

    public ActivityFilterInputTO() {
    }

    public ActivityFilterInputTO(int limit, OrderDirectionTO orderDirection, ActivityFieldTO activityType) {
        this.limit = limit;
        this.orderDirection = orderDirection;
        this.activityType = activityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public OrderDirectionTO getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(OrderDirectionTO orderDirection) {
        this.orderDirection = orderDirection;
    }

    public ActivityFieldTO getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityFieldTO activityType) {
        this.activityType = activityType;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        if (orderDirection != null) {
            joiner.add("orderDirection: " + GraphQLRequestSerializer.getEntry(orderDirection));
        }
        if (activityType != null) {
            joiner.add("activityType: " + GraphQLRequestSerializer.getEntry(activityType));
        }
        return joiner.toString();
    }

    public static class Builder {

        private int limit;
        private OrderDirectionTO orderDirection;
        private ActivityFieldTO activityType;

        public Builder() {
        }

        public Builder setLimit(int limit) {
            this.limit = limit;
            return this;
        }

        public Builder setOrderDirection(OrderDirectionTO orderDirection) {
            this.orderDirection = orderDirection;
            return this;
        }

        public Builder setActivityType(ActivityFieldTO activityType) {
            this.activityType = activityType;
            return this;
        }


        public ActivityFilterInputTO build() {
            return new ActivityFilterInputTO(limit, orderDirection, activityType);
        }

    }
}
