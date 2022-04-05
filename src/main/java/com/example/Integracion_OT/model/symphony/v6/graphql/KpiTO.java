package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KpiTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String description;
    @javax.validation.constraints.NotNull
    private ThresholdTO threshold;
    private boolean status;
    @javax.validation.constraints.NotNull
    private DomainTO domainFk;
    private java.util.List<FormulaTO> formulaFk;
    @javax.validation.constraints.NotNull
    private KpiCategoryTO kpiCategoryFK;

    public KpiTO() {
    }

    public KpiTO(String id, String name, String description, ThresholdTO threshold, boolean status, DomainTO domainFk, java.util.List<FormulaTO> formulaFk, KpiCategoryTO kpiCategoryFK) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.threshold = threshold;
        this.status = status;
        this.domainFk = domainFk;
        this.formulaFk = formulaFk;
        this.kpiCategoryFK = kpiCategoryFK;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ThresholdTO getThreshold() {
        return threshold;
    }

    public void setThreshold(ThresholdTO threshold) {
        this.threshold = threshold;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public DomainTO getDomainFk() {
        return domainFk;
    }

    public void setDomainFk(DomainTO domainFk) {
        this.domainFk = domainFk;
    }

    public java.util.List<FormulaTO> getFormulaFk() {
        return formulaFk;
    }

    public void setFormulaFk(java.util.List<FormulaTO> formulaFk) {
        this.formulaFk = formulaFk;
    }

    public KpiCategoryTO getKpiCategoryFK() {
        return kpiCategoryFK;
    }

    public void setKpiCategoryFK(KpiCategoryTO kpiCategoryFK) {
        this.kpiCategoryFK = kpiCategoryFK;
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
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (threshold != null) {
            joiner.add("threshold: " + GraphQLRequestSerializer.getEntry(threshold));
        }
        joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        if (domainFk != null) {
            joiner.add("domainFk: " + GraphQLRequestSerializer.getEntry(domainFk));
        }
        if (formulaFk != null) {
            joiner.add("formulaFk: " + GraphQLRequestSerializer.getEntry(formulaFk));
        }
        if (kpiCategoryFK != null) {
            joiner.add("kpiCategoryFK: " + GraphQLRequestSerializer.getEntry(kpiCategoryFK));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private ThresholdTO threshold;
        private boolean status;
        private DomainTO domainFk;
        private java.util.List<FormulaTO> formulaFk;
        private KpiCategoryTO kpiCategoryFK;

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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setThreshold(ThresholdTO threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder setStatus(boolean status) {
            this.status = status;
            return this;
        }

        public Builder setDomainFk(DomainTO domainFk) {
            this.domainFk = domainFk;
            return this;
        }

        public Builder setFormulaFk(java.util.List<FormulaTO> formulaFk) {
            this.formulaFk = formulaFk;
            return this;
        }

        public Builder setKpiCategoryFK(KpiCategoryTO kpiCategoryFK) {
            this.kpiCategoryFK = kpiCategoryFK;
            return this;
        }


        public KpiTO build() {
            return new KpiTO(id, name, description, threshold, status, domainFk, formulaFk, kpiCategoryFK);
        }

    }
}
