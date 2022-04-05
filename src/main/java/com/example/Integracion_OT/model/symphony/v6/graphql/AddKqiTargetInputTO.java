package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddKqiTargetInputTO implements java.io.Serializable {

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
    private String kqi;

    public AddKqiTargetInputTO() {
    }

    public AddKqiTargetInputTO(String name, String impact, double period, double allowedVariation, String initTime, String endTime, boolean status, String kqi) {
        this.name = name;
        this.impact = impact;
        this.period = period;
        this.allowedVariation = allowedVariation;
        this.initTime = initTime;
        this.endTime = endTime;
        this.status = status;
        this.kqi = kqi;
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

    public String getKqi() {
        return kqi;
    }

    public void setKqi(String kqi) {
        this.kqi = kqi;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        return joiner.toString();
    }

    public static class Builder {

        private String name;
        private String impact;
        private double period;
        private double allowedVariation;
        private String initTime;
        private String endTime;
        private boolean status;
        private String kqi;

        public Builder() {
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

        public Builder setKqi(String kqi) {
            this.kqi = kqi;
            return this;
        }


        public AddKqiTargetInputTO build() {
            return new AddKqiTargetInputTO(name, impact, period, allowedVariation, initTime, endTime, status, kqi);
        }

    }
}
