package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExitPointTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private BlockTO parentBlock;
    private String cid;
    @javax.validation.constraints.NotNull
    private java.util.List<EntryPointTO> nextEntryPoints;
    private VariableExpressionTO condition;

    public ExitPointTO() {
    }

    public ExitPointTO(String id, BlockTO parentBlock, String cid, java.util.List<EntryPointTO> nextEntryPoints, VariableExpressionTO condition) {
        this.id = id;
        this.parentBlock = parentBlock;
        this.cid = cid;
        this.nextEntryPoints = nextEntryPoints;
        this.condition = condition;
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

    public BlockTO getParentBlock() {
        return parentBlock;
    }

    public void setParentBlock(BlockTO parentBlock) {
        this.parentBlock = parentBlock;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public java.util.List<EntryPointTO> getNextEntryPoints() {
        return nextEntryPoints;
    }

    public void setNextEntryPoints(java.util.List<EntryPointTO> nextEntryPoints) {
        this.nextEntryPoints = nextEntryPoints;
    }

    public VariableExpressionTO getCondition() {
        return condition;
    }

    public void setCondition(VariableExpressionTO condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (parentBlock != null) {
            joiner.add("parentBlock: " + GraphQLRequestSerializer.getEntry(parentBlock));
        }
        if (cid != null) {
            joiner.add("cid: " + GraphQLRequestSerializer.getEntry(cid));
        }
        if (nextEntryPoints != null) {
            joiner.add("nextEntryPoints: " + GraphQLRequestSerializer.getEntry(nextEntryPoints));
        }
        if (condition != null) {
            joiner.add("condition: " + GraphQLRequestSerializer.getEntry(condition));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private BlockTO parentBlock;
        private String cid;
        private java.util.List<EntryPointTO> nextEntryPoints;
        private VariableExpressionTO condition;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setParentBlock(BlockTO parentBlock) {
            this.parentBlock = parentBlock;
            return this;
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }

        public Builder setNextEntryPoints(java.util.List<EntryPointTO> nextEntryPoints) {
            this.nextEntryPoints = nextEntryPoints;
            return this;
        }

        public Builder setCondition(VariableExpressionTO condition) {
            this.condition = condition;
            return this;
        }


        public ExitPointTO build() {
            return new ExitPointTO(id, parentBlock, cid, nextEntryPoints, condition);
        }

    }
}
