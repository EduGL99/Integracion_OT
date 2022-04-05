package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;

/**
 * A list of projects.
 */

public class ProjectsQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "projects";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public ProjectsQueryRequest() {
    }

    public ProjectsQueryRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setAfter(String after) {
        this.input.put("after", after);
    }

    public void setFirst(Integer first) {
        this.input.put("first", first);
    }

    public void setBefore(String before) {
        this.input.put("before", before);
    }

    public void setLast(Integer last) {
        this.input.put("last", last);
    }

    public void setOrderBy(ProjectOrderTO orderBy) {
        this.input.put("orderBy", orderBy);
    }

    public void setFilterBy(List<ProjectFilterInputTO> filterBy) {
        this.input.put("filterBy", filterBy);
    }

    public void setPropertyValue(String propertyValue) {
        this.input.put("propertyValue", propertyValue);
    }

    public void setPropertyOrder(String propertyOrder) {
        this.input.put("propertyOrder", propertyOrder);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String $alias;
        private String after;
        private Integer first;
        private String before;
        private Integer last;
        private ProjectOrderTO orderBy;
        private List<ProjectFilterInputTO> filterBy;
        private String propertyValue;
        private String propertyOrder;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setAfter(String after) {
            this.after = after;
            return this;
        }

        public Builder setFirst(Integer first) {
            this.first = first;
            return this;
        }

        public Builder setBefore(String before) {
            this.before = before;
            return this;
        }

        public Builder setLast(Integer last) {
            this.last = last;
            return this;
        }

        public Builder setOrderBy(ProjectOrderTO orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder setFilterBy(List<ProjectFilterInputTO> filterBy) {
            this.filterBy = filterBy;
            return this;
        }

        public Builder setPropertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            return this;
        }

        public Builder setPropertyOrder(String propertyOrder) {
            this.propertyOrder = propertyOrder;
            return this;
        }


        public ProjectsQueryRequest build() {
            ProjectsQueryRequest obj = new ProjectsQueryRequest($alias);
            obj.setAfter(after);
            obj.setFirst(first);
            obj.setBefore(before);
            obj.setLast(last);
            obj.setOrderBy(orderBy);
            obj.setFilterBy(filterBy);
            obj.setPropertyValue(propertyValue);
            obj.setPropertyOrder(propertyOrder);
            return obj;
        }

    }
}
