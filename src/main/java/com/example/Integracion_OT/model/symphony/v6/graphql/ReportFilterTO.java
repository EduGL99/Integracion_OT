package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportFilterTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private FilterEntityTO entity;
    @javax.validation.constraints.NotNull
    private java.util.List<GeneralFilterTO> filters;

    public ReportFilterTO() {
    }

    public ReportFilterTO(String id, String name, FilterEntityTO entity, java.util.List<GeneralFilterTO> filters) {
        this.id = id;
        this.name = name;
        this.entity = entity;
        this.filters = filters;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FilterEntityTO getEntity() {
        return entity;
    }

    public void setEntity(FilterEntityTO entity) {
        this.entity = entity;
    }

    public java.util.List<GeneralFilterTO> getFilters() {
        return filters;
    }

    public void setFilters(java.util.List<GeneralFilterTO> filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (entity != null) {
            joiner.add("entity: " + GraphQLRequestSerializer.getEntry(entity));
        }
        if (filters != null) {
            joiner.add("filters: " + GraphQLRequestSerializer.getEntry(filters));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private FilterEntityTO entity;
        private java.util.List<GeneralFilterTO> filters;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEntity(FilterEntityTO entity) {
            this.entity = entity;
            return this;
        }

        public Builder setFilters(java.util.List<GeneralFilterTO> filters) {
            this.filters = filters;
            return this;
        }


        public ReportFilterTO build() {
            return new ReportFilterTO(id, name, entity, filters);
        }

    }
}
