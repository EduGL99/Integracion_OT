package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableDefinitionTO> endParamDefinitions;
    @javax.validation.constraints.NotNull
    private FlowStatusTO status;
    @javax.validation.constraints.NotNull
    private FlowNewInstancesPolicyTO newInstancesPolicy;
    @javax.validation.constraints.NotNull
    private java.util.List<BlockTO> blocks;
    @javax.validation.constraints.NotNull
    private java.util.List<ConnectorTO> connectors;
    private FlowDraftTO draft;

    public FlowTO() {
    }

    public FlowTO(String id, String name, String description, java.util.List<VariableDefinitionTO> endParamDefinitions, FlowStatusTO status, FlowNewInstancesPolicyTO newInstancesPolicy, java.util.List<BlockTO> blocks, java.util.List<ConnectorTO> connectors, FlowDraftTO draft) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.endParamDefinitions = endParamDefinitions;
        this.status = status;
        this.newInstancesPolicy = newInstancesPolicy;
        this.blocks = blocks;
        this.connectors = connectors;
        this.draft = draft;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
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

    public java.util.List<VariableDefinitionTO> getEndParamDefinitions() {
        return endParamDefinitions;
    }

    public void setEndParamDefinitions(java.util.List<VariableDefinitionTO> endParamDefinitions) {
        this.endParamDefinitions = endParamDefinitions;
    }

    public FlowStatusTO getStatus() {
        return status;
    }

    public void setStatus(FlowStatusTO status) {
        this.status = status;
    }

    public FlowNewInstancesPolicyTO getNewInstancesPolicy() {
        return newInstancesPolicy;
    }

    public void setNewInstancesPolicy(FlowNewInstancesPolicyTO newInstancesPolicy) {
        this.newInstancesPolicy = newInstancesPolicy;
    }

    public java.util.List<BlockTO> getBlocks() {
        return blocks;
    }

    public void setBlocks(java.util.List<BlockTO> blocks) {
        this.blocks = blocks;
    }

    public java.util.List<ConnectorTO> getConnectors() {
        return connectors;
    }

    public void setConnectors(java.util.List<ConnectorTO> connectors) {
        this.connectors = connectors;
    }

    public FlowDraftTO getDraft() {
        return draft;
    }

    public void setDraft(FlowDraftTO draft) {
        this.draft = draft;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (endParamDefinitions != null) {
            joiner.add("endParamDefinitions: " + GraphQLRequestSerializer.getEntry(endParamDefinitions));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (newInstancesPolicy != null) {
            joiner.add("newInstancesPolicy: " + GraphQLRequestSerializer.getEntry(newInstancesPolicy));
        }
        if (blocks != null) {
            joiner.add("blocks: " + GraphQLRequestSerializer.getEntry(blocks));
        }
        if (connectors != null) {
            joiner.add("connectors: " + GraphQLRequestSerializer.getEntry(connectors));
        }
        if (draft != null) {
            joiner.add("draft: " + GraphQLRequestSerializer.getEntry(draft));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.util.List<VariableDefinitionTO> endParamDefinitions;
        private FlowStatusTO status;
        private FlowNewInstancesPolicyTO newInstancesPolicy;
        private java.util.List<BlockTO> blocks;
        private java.util.List<ConnectorTO> connectors;
        private FlowDraftTO draft;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setEndParamDefinitions(java.util.List<VariableDefinitionTO> endParamDefinitions) {
            this.endParamDefinitions = endParamDefinitions;
            return this;
        }

        public Builder setStatus(FlowStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setNewInstancesPolicy(FlowNewInstancesPolicyTO newInstancesPolicy) {
            this.newInstancesPolicy = newInstancesPolicy;
            return this;
        }

        public Builder setBlocks(java.util.List<BlockTO> blocks) {
            this.blocks = blocks;
            return this;
        }

        public Builder setConnectors(java.util.List<ConnectorTO> connectors) {
            this.connectors = connectors;
            return this;
        }

        public Builder setDraft(FlowDraftTO draft) {
            this.draft = draft;
            return this;
        }


        public FlowTO build() {
            return new FlowTO(id, name, description, endParamDefinitions, status, newInstancesPolicy, blocks, connectors, draft);
        }

    }
}
