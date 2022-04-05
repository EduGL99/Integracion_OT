package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectTO implements java.io.Serializable, NamedNodeTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private ProjectPriorityTO priority;
    private UserTO createdBy;
    @javax.validation.constraints.NotNull
    private String createTime;
    @javax.validation.constraints.NotNull
    private ProjectTypeTO type;
    private ProjectTemplateTO template;
    private LocationTO location;
    @javax.validation.constraints.NotNull
    private java.util.List<WorkOrderTO> workOrders;
    private int numberOfWorkOrders;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<CommentTO> comments;

    public ProjectTO() {
    }

    public ProjectTO(String id, String name, String description, ProjectPriorityTO priority, UserTO createdBy, String createTime, ProjectTypeTO type, ProjectTemplateTO template, LocationTO location, java.util.List<WorkOrderTO> workOrders, int numberOfWorkOrders, java.util.List<PropertyTO> properties, java.util.List<CommentTO> comments) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.createdBy = createdBy;
        this.createTime = createTime;
        this.type = type;
        this.template = template;
        this.location = location;
        this.workOrders = workOrders;
        this.numberOfWorkOrders = numberOfWorkOrders;
        this.properties = properties;
        this.comments = comments;
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

    /**
     * The name of the object.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the object.
     */
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

    public UserTO getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserTO createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ProjectTypeTO getType() {
        return type;
    }

    public void setType(ProjectTypeTO type) {
        this.type = type;
    }

    public ProjectTemplateTO getTemplate() {
        return template;
    }

    public void setTemplate(ProjectTemplateTO template) {
        this.template = template;
    }

    public LocationTO getLocation() {
        return location;
    }

    public void setLocation(LocationTO location) {
        this.location = location;
    }

    public java.util.List<WorkOrderTO> getWorkOrders() {
        return workOrders;
    }

    public void setWorkOrders(java.util.List<WorkOrderTO> workOrders) {
        this.workOrders = workOrders;
    }

    public int getNumberOfWorkOrders() {
        return numberOfWorkOrders;
    }

    public void setNumberOfWorkOrders(int numberOfWorkOrders) {
        this.numberOfWorkOrders = numberOfWorkOrders;
    }

    public java.util.List<PropertyTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTO> properties) {
        this.properties = properties;
    }

    public java.util.List<CommentTO> getComments() {
        return comments;
    }

    public void setComments(java.util.List<CommentTO> comments) {
        this.comments = comments;
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
        if (priority != null) {
            joiner.add("priority: " + GraphQLRequestSerializer.getEntry(priority));
        }
        if (createdBy != null) {
            joiner.add("createdBy: " + GraphQLRequestSerializer.getEntry(createdBy));
        }
        if (createTime != null) {
            joiner.add("createTime: " + GraphQLRequestSerializer.getEntry(createTime));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template));
        }
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        if (workOrders != null) {
            joiner.add("workOrders: " + GraphQLRequestSerializer.getEntry(workOrders));
        }
        joiner.add("numberOfWorkOrders: " + GraphQLRequestSerializer.getEntry(numberOfWorkOrders));
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (comments != null) {
            joiner.add("comments: " + GraphQLRequestSerializer.getEntry(comments));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private ProjectPriorityTO priority;
        private UserTO createdBy;
        private String createTime;
        private ProjectTypeTO type;
        private ProjectTemplateTO template;
        private LocationTO location;
        private java.util.List<WorkOrderTO> workOrders;
        private int numberOfWorkOrders;
        private java.util.List<PropertyTO> properties;
        private java.util.List<CommentTO> comments;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the object.
         */
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

        public Builder setCreatedBy(UserTO createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setType(ProjectTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setTemplate(ProjectTemplateTO template) {
            this.template = template;
            return this;
        }

        public Builder setLocation(LocationTO location) {
            this.location = location;
            return this;
        }

        public Builder setWorkOrders(java.util.List<WorkOrderTO> workOrders) {
            this.workOrders = workOrders;
            return this;
        }

        public Builder setNumberOfWorkOrders(int numberOfWorkOrders) {
            this.numberOfWorkOrders = numberOfWorkOrders;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setComments(java.util.List<CommentTO> comments) {
            this.comments = comments;
            return this;
        }


        public ProjectTO build() {
            return new ProjectTO(id, name, description, priority, createdBy, createTime, type, template, location, workOrders, numberOfWorkOrders, properties, comments);
        }

    }
}
