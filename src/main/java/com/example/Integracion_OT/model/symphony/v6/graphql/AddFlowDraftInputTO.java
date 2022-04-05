package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddFlowDraftInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    private String flowID;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableDefinitionInputTO> endParamDefinitions;

    public AddFlowDraftInputTO() {
    }

    public AddFlowDraftInputTO(String name, String description, String flowID, java.util.List<VariableDefinitionInputTO> endParamDefinitions) {
        this.name = name;
        this.description = description;
        this.flowID = flowID;
        this.endParamDefinitions = endParamDefinitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlowID() {
        return flowID;
    }

    public void setFlowID(String flowID) {
        this.flowID = flowID;
    }

    public java.util.List<VariableDefinitionInputTO> getEndParamDefinitions() {
        return endParamDefinitions;
    }

    public void setEndParamDefinitions(java.util.List<VariableDefinitionInputTO> endParamDefinitions) {
        this.endParamDefinitions = endParamDefinitions;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (flowID != null) {
            joiner.add("flowID: " + GraphQLRequestSerializer.getEntry(flowID));
        }
        if (endParamDefinitions != null) {
            joiner.add("endParamDefinitions: " + GraphQLRequestSerializer.getEntry(endParamDefinitions));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String description;
        private String flowID;
        private java.util.List<VariableDefinitionInputTO> endParamDefinitions;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setFlowID(String flowID) {
            this.flowID = flowID;
            return this;
        }

        public Builder setEndParamDefinitions(java.util.List<VariableDefinitionInputTO> endParamDefinitions) {
            this.endParamDefinitions = endParamDefinitions;
            return this;
        }


        public AddFlowDraftInputTO build() {
            return new AddFlowDraftInputTO(name, description, flowID, endParamDefinitions);
        }

    }
}
