package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormulaTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String textFormula;
    private boolean status;
    @javax.validation.constraints.NotNull
    private TechTO techFk;
    @javax.validation.constraints.NotNull
    private NetworkTypeTO networkTypeFk;
    @javax.validation.constraints.NotNull
    private KpiTO kpiFk;
    private java.util.List<CounterFormulaTO> counterformulaFk;

    public FormulaTO() {
    }

    public FormulaTO(String id, String textFormula, boolean status, TechTO techFk, NetworkTypeTO networkTypeFk, KpiTO kpiFk, java.util.List<CounterFormulaTO> counterformulaFk) {
        this.id = id;
        this.textFormula = textFormula;
        this.status = status;
        this.techFk = techFk;
        this.networkTypeFk = networkTypeFk;
        this.kpiFk = kpiFk;
        this.counterformulaFk = counterformulaFk;
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

    public String getTextFormula() {
        return textFormula;
    }

    public void setTextFormula(String textFormula) {
        this.textFormula = textFormula;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public TechTO getTechFk() {
        return techFk;
    }

    public void setTechFk(TechTO techFk) {
        this.techFk = techFk;
    }

    public NetworkTypeTO getNetworkTypeFk() {
        return networkTypeFk;
    }

    public void setNetworkTypeFk(NetworkTypeTO networkTypeFk) {
        this.networkTypeFk = networkTypeFk;
    }

    public KpiTO getKpiFk() {
        return kpiFk;
    }

    public void setKpiFk(KpiTO kpiFk) {
        this.kpiFk = kpiFk;
    }

    public java.util.List<CounterFormulaTO> getCounterformulaFk() {
        return counterformulaFk;
    }

    public void setCounterformulaFk(java.util.List<CounterFormulaTO> counterformulaFk) {
        this.counterformulaFk = counterformulaFk;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (textFormula != null) {
            joiner.add("textFormula: " + GraphQLRequestSerializer.getEntry(textFormula));
        }
        joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        if (techFk != null) {
            joiner.add("techFk: " + GraphQLRequestSerializer.getEntry(techFk));
        }
        if (networkTypeFk != null) {
            joiner.add("networkTypeFk: " + GraphQLRequestSerializer.getEntry(networkTypeFk));
        }
        if (kpiFk != null) {
            joiner.add("kpiFk: " + GraphQLRequestSerializer.getEntry(kpiFk));
        }
        if (counterformulaFk != null) {
            joiner.add("counterformulaFk: " + GraphQLRequestSerializer.getEntry(counterformulaFk));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String textFormula;
        private boolean status;
        private TechTO techFk;
        private NetworkTypeTO networkTypeFk;
        private KpiTO kpiFk;
        private java.util.List<CounterFormulaTO> counterformulaFk;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTextFormula(String textFormula) {
            this.textFormula = textFormula;
            return this;
        }

        public Builder setStatus(boolean status) {
            this.status = status;
            return this;
        }

        public Builder setTechFk(TechTO techFk) {
            this.techFk = techFk;
            return this;
        }

        public Builder setNetworkTypeFk(NetworkTypeTO networkTypeFk) {
            this.networkTypeFk = networkTypeFk;
            return this;
        }

        public Builder setKpiFk(KpiTO kpiFk) {
            this.kpiFk = kpiFk;
            return this;
        }

        public Builder setCounterformulaFk(java.util.List<CounterFormulaTO> counterformulaFk) {
            this.counterformulaFk = counterformulaFk;
            return this;
        }


        public FormulaTO build() {
            return new FormulaTO(id, textFormula, status, techFk, networkTypeFk, kpiFk, counterformulaFk);
        }

    }
}
