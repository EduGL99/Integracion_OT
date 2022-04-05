package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditCounterInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String externalID;
    @javax.validation.constraints.NotNull
    private String networkManagerSystem;
    @javax.validation.constraints.NotNull
    private String vendorFk;

    public EditCounterInputTO() {
    }

    public EditCounterInputTO(String id, String name, String externalID, String networkManagerSystem, String vendorFk) {
        this.id = id;
        this.name = name;
        this.externalID = externalID;
        this.networkManagerSystem = networkManagerSystem;
        this.vendorFk = vendorFk;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public String getNetworkManagerSystem() {
        return networkManagerSystem;
    }

    public void setNetworkManagerSystem(String networkManagerSystem) {
        this.networkManagerSystem = networkManagerSystem;
    }

    public String getVendorFk() {
        return vendorFk;
    }

    public void setVendorFk(String vendorFk) {
        this.vendorFk = vendorFk;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (externalID != null) {
            joiner.add("externalID: " + GraphQLRequestSerializer.getEntry(externalID));
        }
        if (networkManagerSystem != null) {
            joiner.add("networkManagerSystem: " + GraphQLRequestSerializer.getEntry(networkManagerSystem));
        }
        if (vendorFk != null) {
            joiner.add("vendorFk: " + GraphQLRequestSerializer.getEntry(vendorFk));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String externalID;
        private String networkManagerSystem;
        private String vendorFk;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setExternalID(String externalID) {
            this.externalID = externalID;
            return this;
        }

        public Builder setNetworkManagerSystem(String networkManagerSystem) {
            this.networkManagerSystem = networkManagerSystem;
            return this;
        }

        public Builder setVendorFk(String vendorFk) {
            this.vendorFk = vendorFk;
            return this;
        }


        public EditCounterInputTO build() {
            return new EditCounterInputTO(id, name, externalID, networkManagerSystem, vendorFk);
        }

    }
}
