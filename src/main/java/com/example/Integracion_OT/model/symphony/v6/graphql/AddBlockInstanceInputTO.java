package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddBlockInstanceInputTO implements java.io.Serializable {

    private BlockInstanceStatusTO status;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableValueInputTO> inputs;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableValueInputTO> outputs;
    @javax.validation.constraints.NotNull
    private String blockId;
    @javax.validation.constraints.NotNull
    private String startDate;

    public AddBlockInstanceInputTO() {
    }

    public AddBlockInstanceInputTO(BlockInstanceStatusTO status, java.util.List<VariableValueInputTO> inputs, java.util.List<VariableValueInputTO> outputs, String blockId, String startDate) {
        this.status = status;
        this.inputs = inputs;
        this.outputs = outputs;
        this.blockId = blockId;
        this.startDate = startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public BlockInstanceStatusTO getStatus() {
        return status;
    }

    public void setStatus(BlockInstanceStatusTO status) {
        this.status = status;
    }

    public java.util.List<VariableValueInputTO> getInputs() {
        return inputs;
    }

    public void setInputs(java.util.List<VariableValueInputTO> inputs) {
        this.inputs = inputs;
    }

    public java.util.List<VariableValueInputTO> getOutputs() {
        return outputs;
    }

    public void setOutputs(java.util.List<VariableValueInputTO> outputs) {
        this.outputs = outputs;
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (inputs != null) {
            joiner.add("inputs: " + GraphQLRequestSerializer.getEntry(inputs));
        }
        if (outputs != null) {
            joiner.add("outputs: " + GraphQLRequestSerializer.getEntry(outputs));
        }
        if (blockId != null) {
            joiner.add("blockId: " + GraphQLRequestSerializer.getEntry(blockId));
        }
        if (startDate != null) {
            joiner.add("startDate: " + GraphQLRequestSerializer.getEntry(startDate));
        }
        return joiner.toString();
    }

    public static class Builder {

        private BlockInstanceStatusTO status;
        private java.util.List<VariableValueInputTO> inputs;
        private java.util.List<VariableValueInputTO> outputs;
        private String blockId;
        private String startDate;

        public Builder() {
        }

        public Builder setStatus(BlockInstanceStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setInputs(java.util.List<VariableValueInputTO> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setOutputs(java.util.List<VariableValueInputTO> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder setBlockId(String blockId) {
            this.blockId = blockId;
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }


        public AddBlockInstanceInputTO build() {
            return new AddBlockInstanceInputTO(status, inputs, outputs, blockId, startDate);
        }

    }
}
