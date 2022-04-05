package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddProjectInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    private ProjectPriorityTO priority;
    private String creatorId;
    @javax.validation.constraints.NotNull
    private String type;
    private String location;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyInputTO> properties;

    public AddProjectInputTO() {
    }

    public AddProjectInputTO(String name, String description, ProjectPriorityTO priority, String creatorId, String type, String location, java.util.List<PropertyInputTO> properties) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.creatorId = creatorId;
        this.type = type;
        this.location = location;
        this.properties = properties;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectPriorityTO getPriority() {
        return priority;
    }

    public void setPriority(ProjectPriorityTO priority) {
        this.priority = priority;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public java.util.List<PropertyInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyInputTO> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (priority != null) {
            joiner.add("priority: " + GraphQLRequestSerializer.getEntry(priority));
        }
        if (creatorId != null) {
            joiner.add("creatorId: " + GraphQLRequestSerializer.getEntry(creatorId));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String description;
        private ProjectPriorityTO priority;
        private String creatorId;
        private String type;
        private String location;
        private java.util.List<PropertyInputTO> properties;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPriority(ProjectPriorityTO priority) {
            this.priority = priority;
            return this;
        }

        public Builder setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyInputTO> properties) {
            this.properties = properties;
            return this;
        }


        public AddProjectInputTO build() {
            return new AddProjectInputTO(name, description, priority, creatorId, type, location, properties);
        }

    }
}
