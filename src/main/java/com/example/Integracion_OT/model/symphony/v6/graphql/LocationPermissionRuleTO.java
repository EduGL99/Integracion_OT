package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationPermissionRuleTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private PermissionValueTO isAllowed;
    @javax.validation.constraints.NotNull
    private java.util.List<String> locationTypeIds;

    public LocationPermissionRuleTO() {
    }

    public LocationPermissionRuleTO(PermissionValueTO isAllowed, java.util.List<String> locationTypeIds) {
        this.isAllowed = isAllowed;
        this.locationTypeIds = locationTypeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public PermissionValueTO getIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(PermissionValueTO isAllowed) {
        this.isAllowed = isAllowed;
    }

    public java.util.List<String> getLocationTypeIds() {
        return locationTypeIds;
    }

    public void setLocationTypeIds(java.util.List<String> locationTypeIds) {
        this.locationTypeIds = locationTypeIds;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (isAllowed != null) {
            joiner.add("isAllowed: " + GraphQLRequestSerializer.getEntry(isAllowed));
        }
        if (locationTypeIds != null) {
            joiner.add("locationTypeIds: " + GraphQLRequestSerializer.getEntry(locationTypeIds));
        }
        return joiner.toString();
    }

    public static class Builder {

        private PermissionValueTO isAllowed;
        private java.util.List<String> locationTypeIds;

        public Builder() {
        }

        public Builder setIsAllowed(PermissionValueTO isAllowed) {
            this.isAllowed = isAllowed;
            return this;
        }

        public Builder setLocationTypeIds(java.util.List<String> locationTypeIds) {
            this.locationTypeIds = locationTypeIds;
            return this;
        }


        public LocationPermissionRuleTO build() {
            return new LocationPermissionRuleTO(isAllowed, locationTypeIds);
        }

    }
}
