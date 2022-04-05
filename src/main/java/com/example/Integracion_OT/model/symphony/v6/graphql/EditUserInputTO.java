package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditUserInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String firstName;
    private String lastName;
    private UserStatusTO status;
    private UserRoleTO role;
    private DistanceUnitTO distanceUnit;
    private String organizationFk;

    public EditUserInputTO() {
    }

    public EditUserInputTO(String id, String firstName, String lastName, UserStatusTO status, UserRoleTO role, DistanceUnitTO distanceUnit, String organizationFk) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.role = role;
        this.distanceUnit = distanceUnit;
        this.organizationFk = organizationFk;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserStatusTO getStatus() {
        return status;
    }

    public void setStatus(UserStatusTO status) {
        this.status = status;
    }

    public UserRoleTO getRole() {
        return role;
    }

    public void setRole(UserRoleTO role) {
        this.role = role;
    }

    public DistanceUnitTO getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(DistanceUnitTO distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public String getOrganizationFk() {
        return organizationFk;
    }

    public void setOrganizationFk(String organizationFk) {
        this.organizationFk = organizationFk;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (firstName != null) {
            joiner.add("firstName: " + GraphQLRequestSerializer.getEntry(firstName));
        }
        if (lastName != null) {
            joiner.add("lastName: " + GraphQLRequestSerializer.getEntry(lastName));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (distanceUnit != null) {
            joiner.add("distanceUnit: " + GraphQLRequestSerializer.getEntry(distanceUnit));
        }
        if (organizationFk != null) {
            joiner.add("organizationFk: " + GraphQLRequestSerializer.getEntry(organizationFk));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String firstName;
        private String lastName;
        private UserStatusTO status;
        private UserRoleTO role;
        private DistanceUnitTO distanceUnit;
        private String organizationFk;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setStatus(UserStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setRole(UserRoleTO role) {
            this.role = role;
            return this;
        }

        public Builder setDistanceUnit(DistanceUnitTO distanceUnit) {
            this.distanceUnit = distanceUnit;
            return this;
        }

        public Builder setOrganizationFk(String organizationFk) {
            this.organizationFk = organizationFk;
            return this;
        }


        public EditUserInputTO build() {
            return new EditUserInputTO(id, firstName, lastName, status, role, distanceUnit, organizationFk);
        }

    }
}
