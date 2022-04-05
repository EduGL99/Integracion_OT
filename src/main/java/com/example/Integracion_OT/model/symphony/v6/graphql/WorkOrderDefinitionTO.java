package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderDefinitionTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private Integer index;
    @javax.validation.constraints.NotNull
    private WorkOrderTypeTO type;

    public WorkOrderDefinitionTO() {
    }

    public WorkOrderDefinitionTO(String id, Integer index, WorkOrderTypeTO type) {
        this.id = id;
        this.index = index;
        this.type = type;
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

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public WorkOrderTypeTO getType() {
        return type;
    }

    public void setType(WorkOrderTypeTO type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private Integer index;
        private WorkOrderTypeTO type;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Builder setType(WorkOrderTypeTO type) {
            this.type = type;
            return this;
        }


        public WorkOrderDefinitionTO build() {
            return new WorkOrderDefinitionTO(id, index, type);
        }

    }
}
