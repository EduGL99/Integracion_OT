package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateUserGroupsInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private java.util.List<String> addGroupIds;
    @javax.validation.constraints.NotNull
    private java.util.List<String> removeGroupIds;

    public UpdateUserGroupsInputTO() {
    }

    public UpdateUserGroupsInputTO(String id, java.util.List<String> addGroupIds, java.util.List<String> removeGroupIds) {
        this.id = id;
        this.addGroupIds = addGroupIds;
        this.removeGroupIds = removeGroupIds;
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

    public java.util.List<String> getAddGroupIds() {
        return addGroupIds;
    }

    public void setAddGroupIds(java.util.List<String> addGroupIds) {
        this.addGroupIds = addGroupIds;
    }

    public java.util.List<String> getRemoveGroupIds() {
        return removeGroupIds;
    }

    public void setRemoveGroupIds(java.util.List<String> removeGroupIds) {
        this.removeGroupIds = removeGroupIds;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (addGroupIds != null) {
            joiner.add("addGroupIds: " + GraphQLRequestSerializer.getEntry(addGroupIds));
        }
        if (removeGroupIds != null) {
            joiner.add("removeGroupIds: " + GraphQLRequestSerializer.getEntry(removeGroupIds));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private java.util.List<String> addGroupIds;
        private java.util.List<String> removeGroupIds;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAddGroupIds(java.util.List<String> addGroupIds) {
            this.addGroupIds = addGroupIds;
            return this;
        }

        public Builder setRemoveGroupIds(java.util.List<String> removeGroupIds) {
            this.removeGroupIds = removeGroupIds;
            return this;
        }


        public UpdateUserGroupsInputTO build() {
            return new UpdateUserGroupsInputTO(id, addGroupIds, removeGroupIds);
        }

    }
}
