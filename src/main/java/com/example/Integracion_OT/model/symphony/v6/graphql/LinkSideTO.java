package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkSideTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String equipment;
    @javax.validation.constraints.NotNull
    private String port;

    public LinkSideTO() {
    }

    public LinkSideTO(String equipment, String port) {
        this.equipment = equipment;
        this.port = port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (equipment != null) {
            joiner.add("equipment: " + GraphQLRequestSerializer.getEntry(equipment));
        }
        if (port != null) {
            joiner.add("port: " + GraphQLRequestSerializer.getEntry(port));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String equipment;
        private String port;

        public Builder() {
        }

        public Builder setEquipment(String equipment) {
            this.equipment = equipment;
            return this;
        }

        public Builder setPort(String port) {
            this.port = port;
            return this;
        }


        public LinkSideTO build() {
            return new LinkSideTO(equipment, port);
        }

    }
}
