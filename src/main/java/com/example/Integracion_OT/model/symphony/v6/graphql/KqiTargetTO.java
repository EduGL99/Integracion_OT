package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KqiTargetTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String impact;
    private double period;
    private double allowedVariation;
    @javax.validation.constraints.NotNull
    private String initTime;
    @javax.validation.constraints.NotNull
    private String endTime;
    private boolean status;
    @javax.validation.constraints.NotNull
    private KqiTO kqi;
    @javax.validation.constraints.NotNull
    private java.util.List<KqiComparatorTO> kqiComparator;

    public KqiTargetTO() {
    }

    public KqiTargetTO(String id, String name, String impact, double period, double allowedVariation, String initTime, String endTime, boolean status, KqiTO kqi, java.util.List<KqiComparatorTO> kqiComparator) {
        this.id = id;
        this.name = name;
        this.impact = impact;
        this.period = period;
        this.allowedVariation = allowedVariation;
        this.initTime = initTime;
        this.endTime = endTime;
        this.status = status;
        this.kqi = kqi;
        this.kqiComparator = kqiComparator;
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

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public double getPeriod() {
        return period;
    }

    public void setPeriod(double period) {
        this.period = period;
    }

    public double getAllowedVariation() {
        return allowedVariation;
    }

    public void setAllowedVariation(double allowedVariation) {
        this.allowedVariation = allowedVariation;
    }

    public String getInitTime() {
        return initTime;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public KqiTO getKqi() {
        return kqi;
    }

    public void setKqi(KqiTO kqi) {
        this.kqi = kqi;
    }

    public java.util.List<KqiComparatorTO> getKqiComparator() {
        return kqiComparator;
    }

    public void setKqiComparator(java.util.List<KqiComparatorTO> kqiComparator) {
        this.kqiComparator = kqiComparator;
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
        if (impact != null) {
            joiner.add("impact: " + GraphQLRequestSerializer.getEntry(impact));
        }
        joiner.add("period: " + GraphQLRequestSerializer.getEntry(period));
        joiner.add("allowedVariation: " + GraphQLRequestSerializer.getEntry(allowedVariation));
        if (initTime != null) {
            joiner.add("initTime: " + GraphQLRequestSerializer.getEntry(initTime));
        }
        if (endTime != null) {
            joiner.add("endTime: " + GraphQLRequestSerializer.getEntry(endTime));
        }
        joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        if (kqi != null) {
            joiner.add("kqi: " + GraphQLRequestSerializer.getEntry(kqi));
        }
        if (kqiComparator != null) {
            joiner.add("kqiComparator: " + GraphQLRequestSerializer.getEntry(kqiComparator));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String impact;
        private double period;
        private double allowedVariation;
        private String initTime;
        private String endTime;
        private boolean status;
        private KqiTO kqi;
        private java.util.List<KqiComparatorTO> kqiComparator;

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

        public Builder setImpact(String impact) {
            this.impact = impact;
            return this;
        }

        public Builder setPeriod(double period) {
            this.period = period;
            return this;
        }

        public Builder setAllowedVariation(double allowedVariation) {
            this.allowedVariation = allowedVariation;
            return this;
        }

        public Builder setInitTime(String initTime) {
            this.initTime = initTime;
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setStatus(boolean status) {
            this.status = status;
            return this;
        }

        public Builder setKqi(KqiTO kqi) {
            this.kqi = kqi;
            return this;
        }

        public Builder setKqiComparator(java.util.List<KqiComparatorTO> kqiComparator) {
            this.kqiComparator = kqiComparator;
            return this;
        }


        public KqiTargetTO build() {
            return new KqiTargetTO(id, name, impact, period, allowedVariation, initTime, endTime, status, kqi, kqiComparator);
        }

    }
}
