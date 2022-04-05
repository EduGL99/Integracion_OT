package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionsPolicyTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    private boolean isGlobal;
    private boolean isMulticontractor;
    @javax.validation.constraints.NotNull
    private SystemPolicyTO policy;
    @javax.validation.constraints.NotNull
    private java.util.List<UsersGroupTO> groups;

    public PermissionsPolicyTO() {
    }

    public PermissionsPolicyTO(String id, String name, String description, boolean isGlobal, boolean isMulticontractor, SystemPolicyTO policy, java.util.List<UsersGroupTO> groups) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isGlobal = isGlobal;
        this.isMulticontractor = isMulticontractor;
        this.policy = policy;
        this.groups = groups;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(boolean isGlobal) {
        this.isGlobal = isGlobal;
    }

    public boolean getIsMulticontractor() {
        return isMulticontractor;
    }

    public void setIsMulticontractor(boolean isMulticontractor) {
        this.isMulticontractor = isMulticontractor;
    }

    public SystemPolicyTO getPolicy() {
        return policy;
    }

    public void setPolicy(SystemPolicyTO policy) {
        this.policy = policy;
    }

    public java.util.List<UsersGroupTO> getGroups() {
        return groups;
    }

    public void setGroups(java.util.List<UsersGroupTO> groups) {
        this.groups = groups;
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        joiner.add("isGlobal: " + GraphQLRequestSerializer.getEntry(isGlobal));
        joiner.add("isMulticontractor: " + GraphQLRequestSerializer.getEntry(isMulticontractor));
        if (policy != null) {
            joiner.add("policy: " + GraphQLRequestSerializer.getEntry(policy));
        }
        if (groups != null) {
            joiner.add("groups: " + GraphQLRequestSerializer.getEntry(groups));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private boolean isGlobal;
        private boolean isMulticontractor;
        private SystemPolicyTO policy;
        private java.util.List<UsersGroupTO> groups;

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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setIsGlobal(boolean isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder setIsMulticontractor(boolean isMulticontractor) {
            this.isMulticontractor = isMulticontractor;
            return this;
        }

        public Builder setPolicy(SystemPolicyTO policy) {
            this.policy = policy;
            return this;
        }

        public Builder setGroups(java.util.List<UsersGroupTO> groups) {
            this.groups = groups;
            return this;
        }


        public PermissionsPolicyTO build() {
            return new PermissionsPolicyTO(id, name, description, isGlobal, isMulticontractor, policy, groups);
        }

    }
}
