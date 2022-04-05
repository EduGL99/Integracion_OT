package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowExecutionTemplateTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<BlockTO> blocks;
    @javax.validation.constraints.NotNull
    private java.util.List<ConnectorTO> connectors;

    public FlowExecutionTemplateTO() {
    }

    public FlowExecutionTemplateTO(String id, String name, String description, java.util.List<BlockTO> blocks, java.util.List<ConnectorTO> connectors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.blocks = blocks;
        this.connectors = connectors;
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
        if (blocks != null) {
            joiner.add("blocks: " + GraphQLRequestSerializer.getEntry(blocks));
        }
        if (connectors != null) {
            joiner.add("connectors: " + GraphQLRequestSerializer.getEntry(connectors));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.util.List<BlockTO> blocks;
        private java.util.List<ConnectorTO> connectors;

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

        public Builder setBlocks(java.util.List<BlockTO> blocks) {
            this.blocks = blocks;
            return this;
        }

        public Builder setConnectors(java.util.List<ConnectorTO> connectors) {
            this.connectors = connectors;
            return this;
        }


        public FlowExecutionTemplateTO build() {
            return new FlowExecutionTemplateTO(id, name, description, blocks, connectors);
        }

    }
}
