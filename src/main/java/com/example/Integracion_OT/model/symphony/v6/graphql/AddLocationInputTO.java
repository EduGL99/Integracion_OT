package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddLocationInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String type;
    private String parent;
    private Double latitude;
    private Double longitude;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyInputTO> properties;
    private String externalID;

    public AddLocationInputTO() {
    }

    public AddLocationInputTO(String name, String type, String parent, Double latitude, Double longitude, java.util.List<PropertyInputTO> properties, String externalID) {
        this.name = name;
        this.type = type;
        this.parent = parent;
        this.latitude = latitude;
        this.longitude = longitude;
        this.properties = properties;
        this.externalID = externalID;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public java.util.List<PropertyInputTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyInputTO> properties) {
        this.properties = properties;
    }

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (parent != null) {
            joiner.add("parent: " + GraphQLRequestSerializer.getEntry(parent));
        }
        if (latitude != null) {
            joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        }
        if (longitude != null) {
            joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (externalID != null) {
            joiner.add("externalID: " + GraphQLRequestSerializer.getEntry(externalID));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String type;
        private String parent;
        private Double latitude;
        private Double longitude;
        private java.util.List<PropertyInputTO> properties;
        private String externalID;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = parent;
            return this;
        }

        public Builder setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyInputTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setExternalID(String externalID) {
            this.externalID = externalID;
            return this;
        }


        public AddLocationInputTO build() {
            return new AddLocationInputTO(name, type, parent, latitude, longitude, properties, externalID);
        }

    }
}
