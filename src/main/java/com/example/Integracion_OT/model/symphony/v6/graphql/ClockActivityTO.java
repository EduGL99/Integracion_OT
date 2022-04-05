package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClockActivityTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private UserTO author;
    @javax.validation.constraints.NotNull
    private ClockDetailsTO details;
    @javax.validation.constraints.NotNull
    private String time;

    public ClockActivityTO() {
    }

    public ClockActivityTO(UserTO author, ClockDetailsTO details, String time) {
        this.author = author;
        this.details = details;
        this.time = time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public UserTO getAuthor() {
        return author;
    }

    public void setAuthor(UserTO author) {
        this.author = author;
    }

    public ClockDetailsTO getDetails() {
        return details;
    }

    public void setDetails(ClockDetailsTO details) {
        this.details = details;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author));
        }
        if (details != null) {
            joiner.add("details: " + GraphQLRequestSerializer.getEntry(details));
        }
        if (time != null) {
            joiner.add("time: " + GraphQLRequestSerializer.getEntry(time));
        }
        return joiner.toString();
    }

    public static class Builder {

        private UserTO author;
        private ClockDetailsTO details;
        private String time;

        public Builder() {
        }

        public Builder setAuthor(UserTO author) {
            this.author = author;
            return this;
        }

        public Builder setDetails(ClockDetailsTO details) {
            this.details = details;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }


        public ClockActivityTO build() {
            return new ClockActivityTO(author, details, time);
        }

    }
}
