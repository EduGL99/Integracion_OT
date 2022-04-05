package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NetworkTopologyTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<NodeTO> nodes;
    @javax.validation.constraints.NotNull
    private java.util.List<TopologyLinkTO> links;

    public NetworkTopologyTO() {
    }

    public NetworkTopologyTO(java.util.List<NodeTO> nodes, java.util.List<TopologyLinkTO> links) {
        this.nodes = nodes;
        this.links = links;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<NodeTO> getNodes() {
        return nodes;
    }

    public void setNodes(java.util.List<NodeTO> nodes) {
        this.nodes = nodes;
    }

    public java.util.List<TopologyLinkTO> getLinks() {
        return links;
    }

    public void setLinks(java.util.List<TopologyLinkTO> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (nodes != null) {
            joiner.add("nodes: " + GraphQLRequestSerializer.getEntry(nodes));
        }
        if (links != null) {
            joiner.add("links: " + GraphQLRequestSerializer.getEntry(links));
        }
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<NodeTO> nodes;
        private java.util.List<TopologyLinkTO> links;

        public Builder() {
        }

        public Builder setNodes(java.util.List<NodeTO> nodes) {
            this.nodes = nodes;
            return this;
        }

        public Builder setLinks(java.util.List<TopologyLinkTO> links) {
            this.links = links;
            return this;
        }


        public NetworkTopologyTO build() {
            return new NetworkTopologyTO(nodes, links);
        }

    }
}
