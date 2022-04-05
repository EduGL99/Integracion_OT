package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GotoBlockInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cid;
    private String targetBlockCid;
    private BlockUIRepresentationInputTO uiRepresentation;

    public GotoBlockInputTO() {
    }

    public GotoBlockInputTO(String cid, String targetBlockCid, BlockUIRepresentationInputTO uiRepresentation) {
        this.cid = cid;
        this.targetBlockCid = targetBlockCid;
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

    public String getTargetBlockCid() {
        return targetBlockCid;
    }

    public void setTargetBlockCid(String targetBlockCid) {
        this.targetBlockCid = targetBlockCid;
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
        if (targetBlockCid != null) {
            joiner.add("targetBlockCid: " + GraphQLRequestSerializer.getEntry(targetBlockCid));
        }
        if (uiRepresentation != null) {
            joiner.add("uiRepresentation: " + GraphQLRequestSerializer.getEntry(uiRepresentation));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String cid;
        private String targetBlockCid;
        private BlockUIRepresentationInputTO uiRepresentation;

        public Builder() {
        }

        public Builder setCid(String cid) {
            this.cid = cid;
            return this;
        }

        public Builder setTargetBlockCid(String targetBlockCid) {
            this.targetBlockCid = targetBlockCid;
            return this;
        }

        public Builder setUiRepresentation(BlockUIRepresentationInputTO uiRepresentation) {
            this.uiRepresentation = uiRepresentation;
            return this;
        }


        public GotoBlockInputTO build() {
            return new GotoBlockInputTO(cid, targetBlockCid, uiRepresentation);
        }

    }
}
