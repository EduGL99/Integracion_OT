package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String cid;
    @javax.validation.constraints.NotNull
    private java.util.List<BlockTO> nextBlocks;
    @javax.validation.constraints.NotNull
    private java.util.List<BlockTO> prevBlocks;
    @javax.validation.constraints.NotNull
    private BlockDetailsTO details;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableDefinitionTO> inputParamDefinitions;
    @javax.validation.constraints.NotNull
    private java.util.List<VariableDefinitionTO> outputParamDefinitions;
    private BlockUIRepresentationTO uiRepresentation;

    public BlockTO() {
    }

    public BlockTO(String id, String cid, java.util.List<BlockTO> nextBlocks, java.util.List<BlockTO> prevBlocks, BlockDetailsTO details, java.util.List<VariableDefinitionTO> inputParamDefinitions, java.util.List<VariableDefinitionTO> outputParamDefinitions, BlockUIRepresentationTO uiRepresentation) {
        this.id = id;
        this.cid = cid;
        this.nextBlocks = nextBlocks;
        this.prevBlocks = prevBlocks;
        this.details = details;
        this.inputParamDefinitions = inputParamDefinitions;
        this.outputParamDefinitions = outputParamDefinitions;
        this.uiRepresentation = uiRepresentation;
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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public java.util.List<BlockTO> getNextBlocks() {
        return nextBlocks;
    }

    public void setNextBlocks(java.util.List<BlockTO> nextBlocks) {
        this.nextBlocks = nextBlocks;
    }

    public java.util.List<BlockTO> getPrevBlocks() {
        return prevBlocks;
    }

    public void setPrevBlocks(java.util.List<BlockTO> prevBlocks) {
        this.prevBlocks = prevBlocks;
    }

    public BlockDetailsTO getDetails() {
        return details;
    }

    public void setDetails(BlockDetailsTO details) {
        this.details = details;
    }

    public java.util.List<VariableDefinitionTO> getInputParamDefinitions() {
        return inputParamDefinitions;
    }

    public void setInputParamDefinitions(java.util.List<VariableDefinitionTO> inputParamDefinitions) {
        this.inputParamDefinitions = inputParamDefinitions;
    }

    public java.util.List<VariableDefinitionTO> getOutputParamDefinitions() {
        return outputParamDefinitions;
    }

    public void setOutputParamDefinitions(java.util.List<VariableDefinitionTO> outputParamDefinitions) {
        this.outputParamDefinitions = outputParamDefinitions;
    }

    public BlockUIRepresentationTO getUiRepresentation() {
        return uiRepresentation;
    }

    public void setUiRepresentation(BlockUIRepresentationTO uiRepresentation) {
        this.uiRepresentation = uiRepresentation;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (cid != null) {
            joiner.add("cid: " + GraphQLRequestSerializer.getEntry(cid));
        }
        if (nextBlocks != null) {
            joiner.add("nextBlocks: " + GraphQLRequestSerializer.getEntry(nextBlocks));
        }
        if (prevBlocks != null) {
            joiner.add("prevBlocks: " + GraphQLRequestSerializer.getEntry(prevBlocks));
        }
        if (details != null) {
            joiner.add("details: " + GraphQLRequestSerializer.getEntry(details));
        }
        if (inputParamDefinitions != null) {
            joiner.add("inputParamDefinitions: " + GraphQLRequestSerializer.getEntry(inputParamDefinitions));
        }
        if (outputParamDefinitions != null) {
            joiner.add("outputParamDefinitions: " + GraphQLRequestSerializer.getEntry(outputParamDefinitions));
        }
        if (uiRepresentation != null) {
            joiner.add("uiRepresentation: " + GraphQLRequestSerializer.getEntry(uiRepresentation));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String cid;
        private java.util.List<BlockTO> nextBlocks;
        private java.util.List<BlockTO> prevBlocks;
        private BlockDetailsTO details;
        private java.util.List<VariableDefinitionTO> inputParamDefinitions;
        private java.util.List<VariableDefinitionTO> outputParamDefinitions;
        private BlockUIRepresentationTO uiRepresentation;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }

        public Builder setNextBlocks(java.util.List<BlockTO> nextBlocks) {
            this.nextBlocks = nextBlocks;
            return this;
        }

        public Builder setPrevBlocks(java.util.List<BlockTO> prevBlocks) {
            this.prevBlocks = prevBlocks;
            return this;
        }

        public Builder setDetails(BlockDetailsTO details) {
            this.details = details;
            return this;
        }

        public Builder setInputParamDefinitions(java.util.List<VariableDefinitionTO> inputParamDefinitions) {
            this.inputParamDefinitions = inputParamDefinitions;
            return this;
        }

        public Builder setOutputParamDefinitions(java.util.List<VariableDefinitionTO> outputParamDefinitions) {
            this.outputParamDefinitions = outputParamDefinitions;
            return this;
        }

        public Builder setUiRepresentation(BlockUIRepresentationTO uiRepresentation) {
            this.uiRepresentation = uiRepresentation;
            return this;
        }


        public BlockTO build() {
            return new BlockTO(id, cid, nextBlocks, prevBlocks, details, inputParamDefinitions, outputParamDefinitions, uiRepresentation);
        }

    }
}
