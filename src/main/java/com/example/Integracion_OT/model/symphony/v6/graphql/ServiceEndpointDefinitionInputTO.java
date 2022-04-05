package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEndpointDefinitionInputTO implements java.io.Serializable {

    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    private String role;
    private int index;
    @javax.validation.constraints.NotNull
    private String equipmentTypeID;

    public ServiceEndpointDefinitionInputTO() {
    }

    public ServiceEndpointDefinitionInputTO(String id, String name, String role, int index, String equipmentTypeID) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.index = index;
        this.equipmentTypeID = equipmentTypeID;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getEquipmentTypeID() {
        return equipmentTypeID;
    }

    public void setEquipmentTypeID(String equipmentTypeID) {
        this.equipmentTypeID = equipmentTypeID;
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
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        if (equipmentTypeID != null) {
            joiner.add("equipmentTypeID: " + GraphQLRequestSerializer.getEntry(equipmentTypeID));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String role;
        private int index;
        private String equipmentTypeID;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder setIndex(int index) {
            this.index = index;
            return this;
        }

        public Builder setEquipmentTypeID(String equipmentTypeID) {
            this.equipmentTypeID = equipmentTypeID;
            return this;
        }


        public ServiceEndpointDefinitionInputTO build() {
            return new ServiceEndpointDefinitionInputTO(id, name, role, index, equipmentTypeID);
        }

    }
}
