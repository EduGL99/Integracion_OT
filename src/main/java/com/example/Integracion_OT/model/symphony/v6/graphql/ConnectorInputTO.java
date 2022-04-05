package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConnectorInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String sourceBlockCid;
    private ExitPointInputTO sourcePoint;
    @javax.validation.constraints.NotNull
    private String targetBlockCid;
    private EntryPointInputTO targetPoint;

    public ConnectorInputTO() {
    }

    public ConnectorInputTO(String sourceBlockCid, ExitPointInputTO sourcePoint, String targetBlockCid, EntryPointInputTO targetPoint) {
        this.sourceBlockCid = sourceBlockCid;
        this.sourcePoint = sourcePoint;
        this.targetBlockCid = targetBlockCid;
        this.targetPoint = targetPoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getSourceBlockCid() {
        return sourceBlockCid;
    }

    public void setSourceBlockCid(String sourceBlockCid) {
        this.sourceBlockCid = sourceBlockCid;
    }

    public ExitPointInputTO getSourcePoint() {
        return sourcePoint;
    }

    public void setSourcePoint(ExitPointInputTO sourcePoint) {
        this.sourcePoint = sourcePoint;
    }

    public String getTargetBlockCid() {
        return targetBlockCid;
    }

    public void setTargetBlockCid(String targetBlockCid) {
        this.targetBlockCid = targetBlockCid;
    }

    public EntryPointInputTO getTargetPoint() {
        return targetPoint;
    }

    public void setTargetPoint(EntryPointInputTO targetPoint) {
        this.targetPoint = targetPoint;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (sourceBlockCid != null) {
            joiner.add("sourceBlockCid: " + GraphQLRequestSerializer.getEntry(sourceBlockCid));
        }
        if (sourcePoint != null) {
            joiner.add("sourcePoint: " + GraphQLRequestSerializer.getEntry(sourcePoint));
        }
        if (targetBlockCid != null) {
            joiner.add("targetBlockCid: " + GraphQLRequestSerializer.getEntry(targetBlockCid));
        }
        if (targetPoint != null) {
            joiner.add("targetPoint: " + GraphQLRequestSerializer.getEntry(targetPoint));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String sourceBlockCid;
        private ExitPointInputTO sourcePoint;
        private String targetBlockCid;
        private EntryPointInputTO targetPoint;

        public Builder() {
        }

        public Builder setSourceBlockCid(String sourceBlockCid) {
            this.sourceBlockCid = sourceBlockCid;
            return this;
        }

        public Builder setSourcePoint(ExitPointInputTO sourcePoint) {
            this.sourcePoint = sourcePoint;
            return this;
        }

        public Builder setTargetBlockCid(String targetBlockCid) {
            this.targetBlockCid = targetBlockCid;
            return this;
        }

        public Builder setTargetPoint(EntryPointInputTO targetPoint) {
            this.targetPoint = targetPoint;
            return this;
        }


        public ConnectorInputTO build() {
            return new ConnectorInputTO(sourceBlockCid, sourcePoint, targetBlockCid, targetPoint);
        }

    }
}
