package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StartBlockInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cid;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableDefinitionInputTO> paramDefinitions;
    private BlockUIRepresentationInputTO uiRepresentation;

    public StartBlockInputTO() {
    }

    public StartBlockInputTO(String cid, java.util.List<VariableDefinitionInputTO> paramDefinitions, BlockUIRepresentationInputTO uiRepresentation) {
        this.cid = cid;
        this.paramDefinitions = paramDefinitions;
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

    public java.util.List<VariableDefinitionInputTO> getParamDefinitions() {
        return paramDefinitions;
    }

    public void setParamDefinitions(java.util.List<VariableDefinitionInputTO> paramDefinitions) {
        this.paramDefinitions = paramDefinitions;
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
        if (paramDefinitions != null) {
            joiner.add("paramDefinitions: " + GraphQLRequestSerializer.getEntry(paramDefinitions));
        }
        if (uiRepresentation != null) {
            joiner.add("uiRepresentation: " + GraphQLRequestSerializer.getEntry(uiRepresentation));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String cid;
        private java.util.List<VariableDefinitionInputTO> paramDefinitions;
        private BlockUIRepresentationInputTO uiRepresentation;

        public Builder() {
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }

        public Builder setParamDefinitions(java.util.List<VariableDefinitionInputTO> paramDefinitions) {
            this.paramDefinitions = paramDefinitions;
            return this;
        }

        public Builder setUiRepresentation(BlockUIRepresentationInputTO uiRepresentation) {
            this.uiRepresentation = uiRepresentation;
            return this;
        }


        public StartBlockInputTO build() {
            return new StartBlockInputTO(cid, paramDefinitions, uiRepresentation);
        }

    }
}
