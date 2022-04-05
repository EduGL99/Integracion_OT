package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<UserTO> users;
    private int count;

    public UserSearchResultTO() {
    }

    public UserSearchResultTO(java.util.List<UserTO> users, int count) {
        this.users = users;
        this.count = count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<UserTO> getUsers() {
        return users;
    }

    public void setUsers(java.util.List<UserTO> users) {
        this.users = users;
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
        if (users != null) {
            joiner.add("users: " + GraphQLRequestSerializer.getEntry(users));
        }
        joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<UserTO> users;
        private int count;

        public Builder() {
        }

        public Builder setUsers(java.util.List<UserTO> users) {
            this.users = users;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public UserSearchResultTO build() {
            return new UserSearchResultTO(users, count);
        }

    }
}
