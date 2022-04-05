package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsersGroupSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<UsersGroupTO> usersGroups;
    private int count;

    public UsersGroupSearchResultTO() {
    }

    public UsersGroupSearchResultTO(java.util.List<UsersGroupTO> usersGroups, int count) {
        this.usersGroups = usersGroups;
        this.count = count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<UsersGroupTO> getUsersGroups() {
        return usersGroups;
    }

    public void setUsersGroups(java.util.List<UsersGroupTO> usersGroups) {
        this.usersGroups = usersGroups;
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
        if (usersGroups != null) {
            joiner.add("usersGroups: " + GraphQLRequestSerializer.getEntry(usersGroups));
        }
        joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<UsersGroupTO> usersGroups;
        private int count;

        public Builder() {
        }

        public Builder setUsersGroups(java.util.List<UsersGroupTO> usersGroups) {
            this.usersGroups = usersGroups;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public UsersGroupSearchResultTO build() {
            return new UsersGroupSearchResultTO(usersGroups, count);
        }

    }
}
