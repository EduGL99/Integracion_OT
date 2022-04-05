package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegularHoursInputTO implements java.io.Serializable {

    private int workdayStartHour;
    private int workdayStartMinute;
    private int workdayEndHour;
    private int workdayEndMinute;
    private String timezone;

    public RegularHoursInputTO() {
    }

    public RegularHoursInputTO(int workdayStartHour, int workdayStartMinute, int workdayEndHour, int workdayEndMinute, String timezone) {
        this.workdayStartHour = workdayStartHour;
        this.workdayStartMinute = workdayStartMinute;
        this.workdayEndHour = workdayEndHour;
        this.workdayEndMinute = workdayEndMinute;
        this.timezone = timezone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getWorkdayStartHour() {
        return workdayStartHour;
    }

    public void setWorkdayStartHour(int workdayStartHour) {
        this.workdayStartHour = workdayStartHour;
    }

    public int getWorkdayStartMinute() {
        return workdayStartMinute;
    }

    public void setWorkdayStartMinute(int workdayStartMinute) {
        this.workdayStartMinute = workdayStartMinute;
    }

    public int getWorkdayEndHour() {
        return workdayEndHour;
    }

    public void setWorkdayEndHour(int workdayEndHour) {
        this.workdayEndHour = workdayEndHour;
    }

    public int getWorkdayEndMinute() {
        return workdayEndMinute;
    }

    public void setWorkdayEndMinute(int workdayEndMinute) {
        this.workdayEndMinute = workdayEndMinute;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("workdayStartHour: " + GraphQLRequestSerializer.getEntry(workdayStartHour));
        joiner.add("workdayStartMinute: " + GraphQLRequestSerializer.getEntry(workdayStartMinute));
        joiner.add("workdayEndHour: " + GraphQLRequestSerializer.getEntry(workdayEndHour));
        joiner.add("workdayEndMinute: " + GraphQLRequestSerializer.getEntry(workdayEndMinute));
        if (timezone != null) {
            joiner.add("timezone: " + GraphQLRequestSerializer.getEntry(timezone));
        }
        return joiner.toString();
    }

    public static class Builder {

        private int workdayStartHour;
        private int workdayStartMinute;
        private int workdayEndHour;
        private int workdayEndMinute;
        private String timezone;

        public Builder() {
        }

        public Builder setWorkdayStartHour(int workdayStartHour) {
            this.workdayStartHour = workdayStartHour;
            return this;
        }

        public Builder setWorkdayStartMinute(int workdayStartMinute) {
            this.workdayStartMinute = workdayStartMinute;
            return this;
        }

        public Builder setWorkdayEndHour(int workdayEndHour) {
            this.workdayEndHour = workdayEndHour;
            return this;
        }

        public Builder setWorkdayEndMinute(int workdayEndMinute) {
            this.workdayEndMinute = workdayEndMinute;
            return this;
        }

        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }


        public RegularHoursInputTO build() {
            return new RegularHoursInputTO(workdayStartHour, workdayStartMinute, workdayEndHour, workdayEndMinute, timezone);
        }

    }
}
