package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<LocationTO> locations;
    private int count;

    public LocationSearchResultTO() {
    }

    public LocationSearchResultTO(java.util.List<LocationTO> locations, int count) {
        this.locations = locations;
        this.count = count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<LocationTO> getLocations() {
        return locations;
    }

    public void setLocations(java.util.List<LocationTO> locations) {
        this.locations = locations;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (locations != null) {
            joiner.add("locations: " + GraphQLRequestSerializer.getEntry(locations));
        }
        joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<LocationTO> locations;
        private int count;

        public Builder() {
        }

        public Builder setLocations(java.util.List<LocationTO> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public LocationSearchResultTO build() {
            return new LocationSearchResultTO(locations, count);
        }

    }
}
