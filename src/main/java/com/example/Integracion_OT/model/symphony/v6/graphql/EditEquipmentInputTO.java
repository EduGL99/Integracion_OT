package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditEquipmentInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyInputTO> properties;
    private String deviceID;
    private String externalId;

    public EditEquipmentInputTO() {
    }

    public EditEquipmentInputTO(String id, String name, java.util.List<PropertyInputTO> properties, String deviceID, String externalId) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.deviceID = deviceID;
        this.externalId = externalId;
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

    public java.util.List<PropertyInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyInputTO> properties) {
        this.properties = properties;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (deviceID != null) {
            joiner.add("deviceID: " + GraphQLRequestSerializer.getEntry(deviceID));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<PropertyInputTO> properties;
        private String deviceID;
        private String externalId;

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

        public Builder setProperties(java.util.List<PropertyInputTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setDeviceID(String deviceID) {
            this.deviceID = deviceID;
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }


        public EditEquipmentInputTO build() {
            return new EditEquipmentInputTO(id, name, properties, deviceID, externalId);
        }

    }
}
