package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GotoBlockTO implements java.io.Serializable, BlockDetailsTO {

    private BlockTO target;
    @javax.validation.constraints.NotNull
    private EntryPointTO entryPoint;

    public GotoBlockTO() {
    }

    public GotoBlockTO(BlockTO target, EntryPointTO entryPoint) {
        this.target = target;
        this.entryPoint = entryPoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public BlockTO getTarget() {
        return target;
    }

    public void setTarget(BlockTO target) {
        this.target = target;
    }

    public EntryPointTO getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(EntryPointTO entryPoint) {
        this.entryPoint = entryPoint;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (target != null) {
            joiner.add("target: " + GraphQLRequestSerializer.getEntry(target));
        }
        if (entryPoint != null) {
            joiner.add("entryPoint: " + GraphQLRequestSerializer.getEntry(entryPoint));
        }
        return joiner.toString();
    }

    public static class Builder {

        private BlockTO target;
        private EntryPointTO entryPoint;

        public Builder() {
        }

        public Builder setTarget(BlockTO target) {
            this.target = target;
            return this;
        }

        public Builder setEntryPoint(EntryPointTO entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }


        public GotoBlockTO build() {
            return new GotoBlockTO(target, entryPoint);
        }

    }
}
