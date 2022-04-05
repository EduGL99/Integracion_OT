package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StartFlowInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String flowID;
    @javax.validation.constraints.NotNull
    private String bssCode;
    @javax.validation.constraints.NotNull
    private String startDate;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableValueInputTO> params;

    public StartFlowInputTO() {
    }

    public StartFlowInputTO(String flowID, String bssCode, String startDate, java.util.List<VariableValueInputTO> params) {
        this.flowID = flowID;
        this.bssCode = bssCode;
        this.startDate = startDate;
        this.params = params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFlowID() {
        return flowID;
    }

    public void setFlowID(String flowID) {
        this.flowID = flowID;
    }

    public String getBssCode() {
        return bssCode;
    }

    public void setBssCode(String bssCode) {
        this.bssCode = bssCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public java.util.List<VariableValueInputTO> getParams() {
        return params;
    }

    public void setParams(java.util.List<VariableValueInputTO> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (flowID != null) {
            joiner.add("flowID: " + GraphQLRequestSerializer.getEntry(flowID));
        }
        if (bssCode != null) {
            joiner.add("bssCode: " + GraphQLRequestSerializer.getEntry(bssCode));
        }
        if (startDate != null) {
            joiner.add("startDate: " + GraphQLRequestSerializer.getEntry(startDate));
        }
        if (params != null) {
            joiner.add("params: " + GraphQLRequestSerializer.getEntry(params));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String flowID;
        private String bssCode;
        private String startDate;
        private java.util.List<VariableValueInputTO> params;

        public Builder() {
        }

        public Builder setFlowID(String flowID) {
            this.flowID = flowID;
            return this;
        }

        public Builder setBssCode(String bssCode) {
            this.bssCode = bssCode;
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setParams(java.util.List<VariableValueInputTO> params) {
            this.params = params;
            return this;
        }


        public StartFlowInputTO build() {
            return new StartFlowInputTO(flowID, bssCode, startDate, params);
        }

    }
}
