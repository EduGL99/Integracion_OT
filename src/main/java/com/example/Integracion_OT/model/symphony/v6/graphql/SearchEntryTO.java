package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchEntryTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String entityId;
    @javax.validation.constraints.NotNull
    private String entityType;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String type;
    private String externalId;

    public SearchEntryTO() {
    }

    public SearchEntryTO(String entityId, String entityType, String name, String type, String externalId) {
        this.entityId = entityId;
        this.entityType = entityType;
        this.name = name;
        this.type = type;
        this.externalId = externalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityId != null) {
            joiner.add("entityId: " + GraphQLRequestSerializer.getEntry(entityId));
        }
        if (entityType != null) {
            joiner.add("entityType: " + GraphQLRequestSerializer.getEntry(entityType));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String entityId;
        private String entityType;
        private String name;
        private String type;
        private String externalId;

        public Builder() {
        }

        public Builder setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }


        public SearchEntryTO build() {
            return new SearchEntryTO(entityId, entityType, name, type, externalId);
        }

    }
}
