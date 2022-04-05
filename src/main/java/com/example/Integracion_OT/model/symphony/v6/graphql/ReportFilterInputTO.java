package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportFilterInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private FilterEntityTO entity;
    private java.util.List<GeneralFilterInputTO> filters;

    public ReportFilterInputTO() {
    }

    public ReportFilterInputTO(String name, FilterEntityTO entity, java.util.List<GeneralFilterInputTO> filters) {
        this.name = name;
        this.entity = entity;
        this.filters = filters;
    }

    public static Builder builder() {
        return new Builder();
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

    public java.util.List<GeneralFilterInputTO> getFilters() {
        return filters;
    }

    public void setFilters(java.util.List<GeneralFilterInputTO> filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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

        private String name;
        private FilterEntityTO entity;
        private java.util.List<GeneralFilterInputTO> filters;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEntity(FilterEntityTO entity) {
            this.entity = entity;
            return this;
        }

        public Builder setFilters(java.util.List<GeneralFilterInputTO> filters) {
            this.filters = filters;
            return this;
        }


        public ReportFilterInputTO build() {
            return new ReportFilterInputTO(name, entity, filters);
        }

    }
}
