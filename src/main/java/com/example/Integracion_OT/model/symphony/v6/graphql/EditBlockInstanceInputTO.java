package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditBlockInstanceInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private BlockInstanceStatusTO status;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableValueInputTO> inputs;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableValueInputTO> outputs;
    private String failure_reason;
    private String endDate;

    public EditBlockInstanceInputTO() {
    }

    public EditBlockInstanceInputTO(String id, BlockInstanceStatusTO status, java.util.List<VariableValueInputTO> inputs, java.util.List<VariableValueInputTO> outputs, String failure_reason, String endDate) {
        this.id = id;
        this.status = status;
        this.inputs = inputs;
        this.outputs = outputs;
        this.failure_reason = failure_reason;
        this.endDate = endDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getFailure_reason() {
        return failure_reason;
    }

    public void setFailure_reason(String failure_reason) {
        this.failure_reason = failure_reason;
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
        if (endDate != null) {
            joiner.add("endDate: " + GraphQLRequestSerializer.getEntry(endDate));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private BlockInstanceStatusTO status;
        private java.util.List<VariableValueInputTO> inputs;
        private java.util.List<VariableValueInputTO> outputs;
        private String failure_reason;
        private String endDate;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
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

        public Builder setFailure_reason(String failure_reason) {
            this.failure_reason = failure_reason;
            return this;
        }

        public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        public EditBlockInstanceInputTO build() {
            return new EditBlockInstanceInputTO(id, status, inputs, outputs, failure_reason, endDate);
        }

    }
}
