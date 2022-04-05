package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TriggerBlockInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cid;
    @javax.validation.constraints.NotNull
    private TriggerTypeIdTO triggerType;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableExpressionInputTO> params;
    private BlockUIRepresentationInputTO uiRepresentation;

    public TriggerBlockInputTO() {
    }

    public TriggerBlockInputTO(String cid, TriggerTypeIdTO triggerType, java.util.List<VariableExpressionInputTO> params, BlockUIRepresentationInputTO uiRepresentation) {
        this.cid = cid;
        this.triggerType = triggerType;
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

    public TriggerTypeIdTO getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerTypeIdTO triggerType) {
        this.triggerType = triggerType;
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
        if (triggerType != null) {
            joiner.add("triggerType: " + GraphQLRequestSerializer.getEntry(triggerType));
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
        private TriggerTypeIdTO triggerType;
        private java.util.List<VariableExpressionInputTO> params;
        private BlockUIRepresentationInputTO uiRepresentation;

        public Builder() {
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }

        public Builder setTriggerType(TriggerTypeIdTO triggerType) {
            this.triggerType = triggerType;
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


        public TriggerBlockInputTO build() {
            return new TriggerBlockInputTO(cid, triggerType, params, uiRepresentation);
        }

    }
}
