package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationTypeIndexTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String locationTypeID;
    private int index;

    public LocationTypeIndexTO() {
    }

    public LocationTypeIndexTO(String locationTypeID, int index) {
        this.locationTypeID = locationTypeID;
        this.index = index;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getLocationTypeID() {
        return locationTypeID;
    }

    public void setLocationTypeID(String locationTypeID) {
        this.locationTypeID = locationTypeID;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (locationTypeID != null) {
            joiner.add("locationTypeID: " + GraphQLRequestSerializer.getEntry(locationTypeID));
        }
        joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        return joiner.toString();
    }

    public static class Builder {

        private String locationTypeID;
        private int index;

        public Builder() {
        }

        public Builder setLocationTypeID(String locationTypeID) {
            this.locationTypeID = locationTypeID;
            return this;
        }

        public Builder setIndex(int index) {
            this.index = index;
            return this;
        }


        public LocationTypeIndexTO build() {
            return new LocationTypeIndexTO(locationTypeID, index);
        }

    }
}
