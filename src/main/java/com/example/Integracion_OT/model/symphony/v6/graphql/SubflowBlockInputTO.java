package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubflowBlockInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cid;
    @javax.validation.constraints.NotNull
    private String flowId;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableExpressionInputTO> params;
    private BlockUIRepresentationInputTO uiRepresentation;

    public SubflowBlockInputTO() {
    }

    public SubflowBlockInputTO(String cid, String flowId, java.util.List<VariableExpressionInputTO> params, BlockUIRepresentationInputTO uiRepresentation) {
        this.cid = cid;
        this.flowId = flowId;
        this.params = params;
        this.uiRepresentation = uiRepresentation;
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

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public java.util.List<VariableExpressionInputTO> getParams() {
        return params;
    }

    public void setParams(java.util.List<VariableExpressionInputTO> params) {
        this.params = params;
    }

    public BlockUIRepresentationInputTO getUiRepresentation() {
        return uiRepresentation;
    }

    public void setUiRepresentation(BlockUIRepresentationInputTO uiRepresentation) {
        this.uiRepresentation = uiRepresentation;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cid != null) {
            joiner.add("cid: " + GraphQLRequestSerializer.getEntry(cid));
        }
        if (flowId != null) {
            joiner.add("flowId: " + GraphQLRequestSerializer.getEntry(flowId));
        }
        if (params != null) {
            joiner.add("params: " + GraphQLRequestSerializer.getEntry(params));
        }
        if (uiRepresentation != null) {
            joiner.add("uiRepresentation: " + GraphQLRequestSerializer.getEntry(uiRepresentation));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String cid;
        private String flowId;
        private java.util.List<VariableExpressionInputTO> params;
        private BlockUIRepresentationInputTO uiRepresentation;

        public Builder() {
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }

        public Builder setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        public Builder setParams(java.util.List<VariableExpressionInputTO> params) {
            this.params = params;
            return this;
        }

        public Builder setUiRepresentation(BlockUIRepresentationInputTO uiRepresentation) {
            this.uiRepresentation = uiRepresentation;
            return this;
        }


        public SubflowBlockInputTO build() {
            return new SubflowBlockInputTO(cid, flowId, params, uiRepresentation);
        }

    }
}
