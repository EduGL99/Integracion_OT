package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckListCategoryDefinitionTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String title;
    private String description;
    @javax.validation.constraints.NotNull
    private java.util.List<CheckListItemDefinitionTO> checklistItemDefinitions;

    public CheckListCategoryDefinitionTO() {
    }

    public CheckListCategoryDefinitionTO(String id, String title, String description, java.util.List<CheckListItemDefinitionTO> checklistItemDefinitions) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.checklistItemDefinitions = checklistItemDefinitions;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<CheckListItemDefinitionTO> getChecklistItemDefinitions() {
        return checklistItemDefinitions;
    }

    public void setChecklistItemDefinitions(java.util.List<CheckListItemDefinitionTO> checklistItemDefinitions) {
        this.checklistItemDefinitions = checklistItemDefinitions;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (checklistItemDefinitions != null) {
            joiner.add("checklistItemDefinitions: " + GraphQLRequestSerializer.getEntry(checklistItemDefinitions));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String title;
        private String description;
        private java.util.List<CheckListItemDefinitionTO> checklistItemDefinitions;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setChecklistItemDefinitions(java.util.List<CheckListItemDefinitionTO> checklistItemDefinitions) {
            this.checklistItemDefinitions = checklistItemDefinitions;
            return this;
        }


        public CheckListCategoryDefinitionTO build() {
            return new CheckListCategoryDefinitionTO(id, title, description, checklistItemDefinitions);
        }

    }
}
