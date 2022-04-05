package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectTypeTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<ProjectTO> projects;
    private int numberOfProjects;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTypeTO> properties;
    @javax.validation.constraints.NotNull
    private java.util.List<WorkOrderDefinitionTO> workOrders;

    public ProjectTypeTO() {
    }

    public ProjectTypeTO(String id, String name, String description, java.util.List<ProjectTO> projects, int numberOfProjects, java.util.List<PropertyTypeTO> properties, java.util.List<WorkOrderDefinitionTO> workOrders) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.projects = projects;
        this.numberOfProjects = numberOfProjects;
        this.properties = properties;
        this.workOrders = workOrders;
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

    public java.util.List<ProjectTO> getProjects() {
        return projects;
    }

    public void setProjects(java.util.List<ProjectTO> projects) {
        this.projects = projects;
    }

    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    public void setNumberOfProjects(int numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }

    public java.util.List<PropertyTypeTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTypeTO> properties) {
        this.properties = properties;
    }

    public java.util.List<WorkOrderDefinitionTO> getWorkOrders() {
        return workOrders;
    }

    public void setWorkOrders(java.util.List<WorkOrderDefinitionTO> workOrders) {
        this.workOrders = workOrders;
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
        if (projects != null) {
            joiner.add("projects: " + GraphQLRequestSerializer.getEntry(projects));
        }
        joiner.add("numberOfProjects: " + GraphQLRequestSerializer.getEntry(numberOfProjects));
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (workOrders != null) {
            joiner.add("workOrders: " + GraphQLRequestSerializer.getEntry(workOrders));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.util.List<ProjectTO> projects;
        private int numberOfProjects;
        private java.util.List<PropertyTypeTO> properties;
        private java.util.List<WorkOrderDefinitionTO> workOrders;

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

        public Builder setProjects(java.util.List<ProjectTO> projects) {
            this.projects = projects;
            return this;
        }

        public Builder setNumberOfProjects(int numberOfProjects) {
            this.numberOfProjects = numberOfProjects;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTypeTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setWorkOrders(java.util.List<WorkOrderDefinitionTO> workOrders) {
            this.workOrders = workOrders;
            return this;
        }


        public ProjectTypeTO build() {
            return new ProjectTypeTO(id, name, description, projects, numberOfProjects, properties, workOrders);
        }

    }
}
