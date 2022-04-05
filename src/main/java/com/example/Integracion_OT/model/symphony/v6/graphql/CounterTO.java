package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CounterTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String externalID;
    @javax.validation.constraints.NotNull
    private String networkManagerSystem;
    @javax.validation.constraints.NotNull
    private java.util.List<CounterFormulaTO> counterformula;
    private CounterFamilyTO counterFamily;
    @javax.validation.constraints.NotNull
    private VendorTO vendorFk;

    public CounterTO() {
    }

    public CounterTO(String id, String name, String externalID, String networkManagerSystem, java.util.List<CounterFormulaTO> counterformula, CounterFamilyTO counterFamily, VendorTO vendorFk) {
        this.id = id;
        this.name = name;
        this.externalID = externalID;
        this.networkManagerSystem = networkManagerSystem;
        this.counterformula = counterformula;
        this.counterFamily = counterFamily;
        this.vendorFk = vendorFk;
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

    public java.util.List<CounterFormulaTO> getCounterformula() {
        return counterformula;
    }

    public void setCounterformula(java.util.List<CounterFormulaTO> counterformula) {
        this.counterformula = counterformula;
    }

    public CounterFamilyTO getCounterFamily() {
        return counterFamily;
    }

    public void setCounterFamily(CounterFamilyTO counterFamily) {
        this.counterFamily = counterFamily;
    }

    public VendorTO getVendorFk() {
        return vendorFk;
    }

    public void setVendorFk(VendorTO vendorFk) {
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
        if (counterformula != null) {
            joiner.add("counterformula: " + GraphQLRequestSerializer.getEntry(counterformula));
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

        private String id;
        private String name;
        private String externalID;
        private String networkManagerSystem;
        private java.util.List<CounterFormulaTO> counterformula;
        private CounterFamilyTO counterFamily;
        private VendorTO vendorFk;

        public Builder() {
        }

        /**
         * The id of the object.
         */
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

        public Builder setCounterformula(java.util.List<CounterFormulaTO> counterformula) {
            this.counterformula = counterformula;
            return this;
        }

        public Builder setCounterFamily(CounterFamilyTO counterFamily) {
            this.counterFamily = counterFamily;
            return this;
        }

        public Builder setVendorFk(VendorTO vendorFk) {
            this.vendorFk = vendorFk;
            return this;
        }


        public CounterTO build() {
            return new CounterTO(id, name, externalID, networkManagerSystem, counterformula, counterFamily, vendorFk);
        }

    }
}
