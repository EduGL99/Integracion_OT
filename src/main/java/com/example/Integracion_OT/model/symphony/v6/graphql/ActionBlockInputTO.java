package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionBlockInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cid;
    @javax.validation.constraints.NotNull
    private ActionTypeIdTO actionType;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableExpressionInputTO> params;
    private BlockUIRepresentationInputTO uiRepresentation;

    public ActionBlockInputTO() {
    }

    public ActionBlockInputTO(String cid, ActionTypeIdTO actionType, java.util.List<VariableExpressionInputTO> params, BlockUIRepresentationInputTO uiRepresentation) {
        this.cid = cid;
        this.actionType = actionType;
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

    public ActionTypeIdTO getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeIdTO actionType) {
        this.actionType = actionType;
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
        if (actionType != null) {
            joiner.add("actionType: " + GraphQLRequestSerializer.getEntry(actionType));
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
        private ActionTypeIdTO actionType;
        private java.util.List<VariableExpressionInputTO> params;
        private BlockUIRepresentationInputTO uiRepresentation;

        public Builder() {
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }

        public Builder setActionType(ActionTypeIdTO actionType) {
            this.actionType = actionType;
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


        public ActionBlockInputTO build() {
            return new ActionBlockInputTO(cid, actionType, params, uiRepresentation);
        }

    }
}
