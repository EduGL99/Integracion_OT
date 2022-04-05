package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VertexTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String type;
    @javax.validation.constraints.NotNull
    private java.util.List<FieldTO> fields;
    @javax.validation.constraints.NotNull
    private java.util.List<EdgeTO> edges;

    public VertexTO() {
    }

    public VertexTO(String id, String type, java.util.List<FieldTO> fields, java.util.List<EdgeTO> edges) {
        this.id = id;
        this.type = type;
        this.fields = fields;
        this.edges = edges;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public java.util.List<FieldTO> getFields() {
        return fields;
    }

    public void setFields(java.util.List<FieldTO> fields) {
        this.fields = fields;
    }

    public java.util.List<EdgeTO> getEdges() {
        return edges;
    }

    public void setEdges(java.util.List<EdgeTO> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (fields != null) {
            joiner.add("fields: " + GraphQLRequestSerializer.getEntry(fields));
        }
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String type;
        private java.util.List<FieldTO> fields;
        private java.util.List<EdgeTO> edges;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setFields(java.util.List<FieldTO> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setEdges(java.util.List<EdgeTO> edges) {
            this.edges = edges;
            return this;
        }


        public VertexTO build() {
            return new VertexTO(id, type, fields, edges);
        }

    }
}
