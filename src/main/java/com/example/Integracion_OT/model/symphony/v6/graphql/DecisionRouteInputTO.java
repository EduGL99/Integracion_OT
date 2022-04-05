package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DecisionRouteInputTO implements java.io.Serializable {

    private String cid;
    @javax.validation.constraints.NotNull
    private VariableExpressionInputTO condition;

    public DecisionRouteInputTO() {
    }

    public DecisionRouteInputTO(String cid, VariableExpressionInputTO condition) {
        this.cid = cid;
        this.condition = condition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public VariableExpressionInputTO getCondition() {
        return condition;
    }

    public void setCondition(VariableExpressionInputTO condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cid != null) {
            joiner.add("cid: " + GraphQLRequestSerializer.getEntry(cid));
        }
        if (condition != null) {
            joiner.add("condition: " + GraphQLRequestSerializer.getEntry(condition));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String cid;
        private VariableExpressionInputTO condition;

        public Builder() {
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }

        public Builder setCondition(VariableExpressionInputTO condition) {
            this.condition = condition;
            return this;
        }


        public DecisionRouteInputTO build() {
            return new DecisionRouteInputTO(cid, condition);
        }

    }
}
