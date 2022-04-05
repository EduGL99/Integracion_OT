package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopologyLinkTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private TopologyLinkTypeTO type;
    @javax.validation.constraints.NotNull
    private NodeTO source;
    @javax.validation.constraints.NotNull
    private NodeTO target;

    public TopologyLinkTO() {
    }

    public TopologyLinkTO(TopologyLinkTypeTO type, NodeTO source, NodeTO target) {
        this.type = type;
        this.source = source;
        this.target = target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public TopologyLinkTypeTO getType() {
        return type;
    }

    public void setType(TopologyLinkTypeTO type) {
        this.type = type;
    }

    public NodeTO getSource() {
        return source;
    }

    public void setSource(NodeTO source) {
        this.source = source;
    }

    public NodeTO getTarget() {
        return target;
    }

    public void setTarget(NodeTO target) {
        this.target = target;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (source != null) {
            joiner.add("source: " + GraphQLRequestSerializer.getEntry(source));
        }
        if (target != null) {
            joiner.add("target: " + GraphQLRequestSerializer.getEntry(target));
        }
        return joiner.toString();
    }

    public static class Builder {

        private TopologyLinkTypeTO type;
        private NodeTO source;
        private NodeTO target;

        public Builder() {
        }

        public Builder setType(TopologyLinkTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setSource(NodeTO source) {
            this.source = source;
            return this;
        }

        public Builder setTarget(NodeTO target) {
            this.target = target;
            return this;
        }


        public TopologyLinkTO build() {
            return new TopologyLinkTO(type, source, target);
        }

    }
}
