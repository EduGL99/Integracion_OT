package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConnectorTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private ExitPointTO source;
    @javax.validation.constraints.NotNull
    private EntryPointTO target;

    public ConnectorTO() {
    }

    public ConnectorTO(ExitPointTO source, EntryPointTO target) {
        this.source = source;
        this.target = target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ExitPointTO getSource() {
        return source;
    }

    public void setSource(ExitPointTO source) {
        this.source = source;
    }

    public EntryPointTO getTarget() {
        return target;
    }

    public void setTarget(EntryPointTO target) {
        this.target = target;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (source != null) {
            joiner.add("source: " + GraphQLRequestSerializer.getEntry(source));
        }
        if (target != null) {
            joiner.add("target: " + GraphQLRequestSerializer.getEntry(target));
        }
        return joiner.toString();
    }

    public static class Builder {

        private ExitPointTO source;
        private EntryPointTO target;

        public Builder() {
        }

        public Builder setSource(ExitPointTO source) {
            this.source = source;
            return this;
        }

        public Builder setTarget(EntryPointTO target) {
            this.target = target;
            return this;
        }


        public ConnectorTO build() {
            return new ConnectorTO(source, target);
        }

    }
}
