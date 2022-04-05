package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditFormulaInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String textFormula;
    private boolean status;
    @javax.validation.constraints.NotNull
    private String techFk;
    @javax.validation.constraints.NotNull
    private String networkTypeFk;
    @javax.validation.constraints.NotNull
    private String kpiFk;

    public EditFormulaInputTO() {
    }

    public EditFormulaInputTO(String id, String textFormula, boolean status, String techFk, String networkTypeFk, String kpiFk) {
        this.id = id;
        this.textFormula = textFormula;
        this.status = status;
        this.techFk = techFk;
        this.networkTypeFk = networkTypeFk;
        this.kpiFk = kpiFk;
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

    public String getTechFk() {
        return techFk;
    }

    public void setTechFk(String techFk) {
        this.techFk = techFk;
    }

    public String getNetworkTypeFk() {
        return networkTypeFk;
    }

    public void setNetworkTypeFk(String networkTypeFk) {
        this.networkTypeFk = networkTypeFk;
    }

    public String getKpiFk() {
        return kpiFk;
    }

    public void setKpiFk(String kpiFk) {
        this.kpiFk = kpiFk;
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
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String textFormula;
        private boolean status;
        private String techFk;
        private String networkTypeFk;
        private String kpiFk;

        public Builder() {
        }

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

        public Builder setTechFk(String techFk) {
            this.techFk = techFk;
            return this;
        }

        public Builder setNetworkTypeFk(String networkTypeFk) {
            this.networkTypeFk = networkTypeFk;
            return this;
        }

        public Builder setKpiFk(String kpiFk) {
            this.kpiFk = kpiFk;
            return this;
        }


        public EditFormulaInputTO build() {
            return new EditFormulaInputTO(id, textFormula, status, techFk, networkTypeFk, kpiFk);
        }

    }
}
