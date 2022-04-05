package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntryPointTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private BlockTO parentBlock;
    private String cid;
    @javax.validation.constraints.NotNull
    private java.util.List<ExitPointTO> prevExitPoints;

    public EntryPointTO() {
    }

    public EntryPointTO(String id, BlockTO parentBlock, String cid, java.util.List<ExitPointTO> prevExitPoints) {
        this.id = id;
        this.parentBlock = parentBlock;
        this.cid = cid;
        this.prevExitPoints = prevExitPoints;
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

    public java.util.List<ExitPointTO> getPrevExitPoints() {
        return prevExitPoints;
    }

    public void setPrevExitPoints(java.util.List<ExitPointTO> prevExitPoints) {
        this.prevExitPoints = prevExitPoints;
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
        if (prevExitPoints != null) {
            joiner.add("prevExitPoints: " + GraphQLRequestSerializer.getEntry(prevExitPoints));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private BlockTO parentBlock;
        private String cid;
        private java.util.List<ExitPointTO> prevExitPoints;

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

        public Builder setPrevExitPoints(java.util.List<ExitPointTO> prevExitPoints) {
            this.prevExitPoints = prevExitPoints;
            return this;
        }


        public EntryPointTO build() {
            return new EntryPointTO(id, parentBlock, cid, prevExitPoints);
        }

    }
}
