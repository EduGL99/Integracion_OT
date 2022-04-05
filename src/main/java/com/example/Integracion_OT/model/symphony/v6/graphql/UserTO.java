package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserTO implements java.io.Serializable, NamedNodeTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String authID;
    @javax.validation.constraints.NotNull
    private String firstName;
    @javax.validation.constraints.NotNull
    private String lastName;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private UserStatusTO status;
    @javax.validation.constraints.NotNull
    private UserRoleTO role;
    private FileTO profilePhoto;
    @javax.validation.constraints.NotNull
    private java.util.List<UsersGroupTO> groups;
    private DistanceUnitTO distanceUnit;
    private OrganizationTO organizationFk;

    public UserTO() {
    }

    public UserTO(String id, String authID, String firstName, String lastName, String name, String email, UserStatusTO status, UserRoleTO role, FileTO profilePhoto, java.util.List<UsersGroupTO> groups, DistanceUnitTO distanceUnit, OrganizationTO organizationFk) {
        this.id = id;
        this.authID = authID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = name;
        this.email = email;
        this.status = status;
        this.role = role;
        this.profilePhoto = profilePhoto;
        this.groups = groups;
        this.distanceUnit = distanceUnit;
        this.organizationFk = organizationFk;
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

    public String getAuthID() {
        return authID;
    }

    public void setAuthID(String authID) {
        this.authID = authID;
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

    /**
     * The name of the object.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the object.
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public FileTO getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(FileTO profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public java.util.List<UsersGroupTO> getGroups() {
        return groups;
    }

    public void setGroups(java.util.List<UsersGroupTO> groups) {
        this.groups = groups;
    }

    public DistanceUnitTO getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(DistanceUnitTO distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public OrganizationTO getOrganizationFk() {
        return organizationFk;
    }

    public void setOrganizationFk(OrganizationTO organizationFk) {
        this.organizationFk = organizationFk;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (authID != null) {
            joiner.add("authID: " + GraphQLRequestSerializer.getEntry(authID));
        }
        if (firstName != null) {
            joiner.add("firstName: " + GraphQLRequestSerializer.getEntry(firstName));
        }
        if (lastName != null) {
            joiner.add("lastName: " + GraphQLRequestSerializer.getEntry(lastName));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (role != null) {
            joiner.add("role: " + GraphQLRequestSerializer.getEntry(role));
        }
        if (profilePhoto != null) {
            joiner.add("profilePhoto: " + GraphQLRequestSerializer.getEntry(profilePhoto));
        }
        if (groups != null) {
            joiner.add("groups: " + GraphQLRequestSerializer.getEntry(groups));
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
        private String authID;
        private String firstName;
        private String lastName;
        private String name;
        private String email;
        private UserStatusTO status;
        private UserRoleTO role;
        private FileTO profilePhoto;
        private java.util.List<UsersGroupTO> groups;
        private DistanceUnitTO distanceUnit;
        private OrganizationTO organizationFk;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setAuthID(String authID) {
            this.authID = authID;
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

        /**
         * The name of the object.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
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

        public Builder setProfilePhoto(FileTO profilePhoto) {
            this.profilePhoto = profilePhoto;
            return this;
        }

        public Builder setGroups(java.util.List<UsersGroupTO> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setDistanceUnit(DistanceUnitTO distanceUnit) {
            this.distanceUnit = distanceUnit;
            return this;
        }

        public Builder setOrganizationFk(OrganizationTO organizationFk) {
            this.organizationFk = organizationFk;
            return this;
        }


        public UserTO build() {
            return new UserTO(id, authID, firstName, lastName, name, email, status, role, profilePhoto, groups, distanceUnit, organizationFk);
        }

    }
}
