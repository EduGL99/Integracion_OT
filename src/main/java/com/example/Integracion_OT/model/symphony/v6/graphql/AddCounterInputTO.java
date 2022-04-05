package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddCounterInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String externalID;
    @javax.validation.constraints.NotNull
    private String networkManagerSystem;
    @javax.validation.constraints.NotNull
    private String counterFamily;
    @javax.validation.constraints.NotNull
    private String vendorFk;

    public AddCounterInputTO() {
    }

    public AddCounterInputTO(String name, String externalID, String networkManagerSystem, String counterFamily, String vendorFk) {
        this.name = name;
        this.externalID = externalID;
        this.networkManagerSystem = networkManagerSystem;
        this.counterFamily = counterFamily;
        this.vendorFk = vendorFk;
    }

    public static Builder builder() {
        return new Builder();
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

    public String getCounterFamily() {
        return counterFamily;
    }

    public void setCounterFamily(String counterFamily) {
        this.counterFamily = counterFamily;
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (externalID != null) {
            joiner.add("externalID: " + GraphQLRequestSerializer.getEntry(externalID));
        }
        if (networkManagerSystem != null) {
            joiner.add("networkManagerSystem: " + GraphQLRequestSerializer.getEntry(networkManagerSystem));
        }
        if (counterFamily != null) {
            joiner.add("counterFamily: " + GraphQLRequestSerializer.getEntry(counterFamily));
        }
        if (vendorFk != null) {
            joiner.add("vendorFk: " + GraphQLRequestSerializer.getEntry(vendorFk));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String externalID;
        private String networkManagerSystem;
        private String counterFamily;
        private String vendorFk;

        public Builder() {
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

        public Builder setCounterFamily(String counterFamily) {
            this.counterFamily = counterFamily;
            return this;
        }

        public Builder setVendorFk(String vendorFk) {
            this.vendorFk = vendorFk;
            return this;
        }


        public AddCounterInputTO build() {
            return new AddCounterInputTO(name, externalID, networkManagerSystem, counterFamily, vendorFk);
        }

    }
}
