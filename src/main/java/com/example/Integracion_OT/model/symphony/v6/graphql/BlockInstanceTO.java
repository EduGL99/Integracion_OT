package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockInstanceTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private BlockInstanceStatusTO status;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableValueTO> inputs;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableValueTO> outputs;
    private String failure_reason;
    @javax.validation.constraints.NotNull
    private BlockTO block;
    @javax.validation.constraints.NotNull
    private String startDate;
    private String endDate;

    public BlockInstanceTO() {
    }

    public BlockInstanceTO(String id, BlockInstanceStatusTO status, java.util.List<VariableValueTO> inputs, java.util.List<VariableValueTO> outputs, String failure_reason, BlockTO block, String startDate, String endDate) {
        this.id = id;
        this.status = status;
        this.inputs = inputs;
        this.outputs = outputs;
        this.failure_reason = failure_reason;
        this.block = block;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public BlockInstanceStatusTO getStatus() {
        return status;
    }

    public void setStatus(BlockInstanceStatusTO status) {
        this.status = status;
    }

    public java.util.List<VariableValueTO> getInputs() {
        return inputs;
    }

    public void setInputs(java.util.List<VariableValueTO> inputs) {
        this.inputs = inputs;
    }

    public java.util.List<VariableValueTO> getOutputs() {
        return outputs;
    }

    public void setOutputs(java.util.List<VariableValueTO> outputs) {
        this.outputs = outputs;
    }

    public String getFailure_reason() {
        return failure_reason;
    }

    public void setFailure_reason(String failure_reason) {
        this.failure_reason = failure_reason;
    }

    public BlockTO getBlock() {
        return block;
    }

    public void setBlock(BlockTO block) {
        this.block = block;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (inputs != null) {
            joiner.add("inputs: " + GraphQLRequestSerializer.getEntry(inputs));
        }
        if (outputs != null) {
            joiner.add("outputs: " + GraphQLRequestSerializer.getEntry(outputs));
        }
        if (failure_reason != null) {
            joiner.add("failure_reason: " + GraphQLRequestSerializer.getEntry(failure_reason));
        }
        if (block != null) {
            joiner.add("block: " + GraphQLRequestSerializer.getEntry(block));
        }
        if (startDate != null) {
            joiner.add("startDate: " + GraphQLRequestSerializer.getEntry(startDate));
        }
        if (endDate != null) {
            joiner.add("endDate: " + GraphQLRequestSerializer.getEntry(endDate));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private BlockInstanceStatusTO status;
        private java.util.List<VariableValueTO> inputs;
        private java.util.List<VariableValueTO> outputs;
        private String failure_reason;
        private BlockTO block;
        private String startDate;
        private String endDate;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setStatus(BlockInstanceStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setInputs(java.util.List<VariableValueTO> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setOutputs(java.util.List<VariableValueTO> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder setFailure_reason(String failure_reason) {
            this.failure_reason = failure_reason;
            return this;
        }

        public Builder setBlock(BlockTO block) {
            this.block = block;
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        public BlockInstanceTO build() {
            return new BlockInstanceTO(id, status, inputs, outputs, failure_reason, block, startDate, endDate);
        }

    }
}
