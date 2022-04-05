package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddBulkServiceLinksAndPortsInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.List<String> portIds;
    @javax.validation.constraints.NotNull
    private java.util.List<String> linkIds;

    public AddBulkServiceLinksAndPortsInputTO() {
    }

    public AddBulkServiceLinksAndPortsInputTO(String id, java.util.List<String> portIds, java.util.List<String> linkIds) {
        this.id = id;
        this.portIds = portIds;
        this.linkIds = linkIds;
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

    public java.util.List<String> getPortIds() {
        return portIds;
    }

    public void setPortIds(java.util.List<String> portIds) {
        this.portIds = portIds;
    }

    public java.util.List<String> getLinkIds() {
        return linkIds;
    }

    public void setLinkIds(java.util.List<String> linkIds) {
        this.linkIds = linkIds;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (portIds != null) {
            joiner.add("portIds: " + GraphQLRequestSerializer.getEntry(portIds));
        }
        if (linkIds != null) {
            joiner.add("linkIds: " + GraphQLRequestSerializer.getEntry(linkIds));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private java.util.List<String> portIds;
        private java.util.List<String> linkIds;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPortIds(java.util.List<String> portIds) {
            this.portIds = portIds;
            return this;
        }

        public Builder setLinkIds(java.util.List<String> linkIds) {
            this.linkIds = linkIds;
            return this;
        }


        public AddBulkServiceLinksAndPortsInputTO build() {
            return new AddBulkServiceLinksAndPortsInputTO(id, portIds, linkIds);
        }

    }
}
