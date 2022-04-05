package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmFilterTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String networkResource;
    private boolean enable;
    @javax.validation.constraints.NotNull
    private String beginTime;
    @javax.validation.constraints.NotNull
    private String endTime;
    @javax.validation.constraints.NotNull
    private String reason;
    @javax.validation.constraints.NotNull
    private String user;
    @javax.validation.constraints.NotNull
    private String creationTime;
    private AlarmStatusTO alarmStatus;

    public AlarmFilterTO() {
    }

    public AlarmFilterTO(String id, String name, String networkResource, boolean enable, String beginTime, String endTime, String reason, String user, String creationTime, AlarmStatusTO alarmStatus) {
        this.id = id;
        this.name = name;
        this.networkResource = networkResource;
        this.enable = enable;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.reason = reason;
        this.user = user;
        this.creationTime = creationTime;
        this.alarmStatus = alarmStatus;
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

    public String getNetworkResource() {
        return networkResource;
    }

    public void setNetworkResource(String networkResource) {
        this.networkResource = networkResource;
    }

    public boolean getEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public AlarmStatusTO getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(AlarmStatusTO alarmStatus) {
        this.alarmStatus = alarmStatus;
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
        if (networkResource != null) {
            joiner.add("networkResource: " + GraphQLRequestSerializer.getEntry(networkResource));
        }
        joiner.add("enable: " + GraphQLRequestSerializer.getEntry(enable));
        if (beginTime != null) {
            joiner.add("beginTime: " + GraphQLRequestSerializer.getEntry(beginTime));
        }
        if (endTime != null) {
            joiner.add("endTime: " + GraphQLRequestSerializer.getEntry(endTime));
        }
        if (reason != null) {
            joiner.add("reason: " + GraphQLRequestSerializer.getEntry(reason));
        }
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user));
        }
        if (creationTime != null) {
            joiner.add("creationTime: " + GraphQLRequestSerializer.getEntry(creationTime));
        }
        if (alarmStatus != null) {
            joiner.add("alarmStatus: " + GraphQLRequestSerializer.getEntry(alarmStatus));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private String networkResource;
        private boolean enable;
        private String beginTime;
        private String endTime;
        private String reason;
        private String user;
        private String creationTime;
        private AlarmStatusTO alarmStatus;

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

        public Builder setNetworkResource(String networkResource) {
            this.networkResource = networkResource;
            return this;
        }

        public Builder setEnable(boolean enable) {
            this.enable = enable;
            return this;
        }

        public Builder setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setUser(String user) {
            this.user = user;
            return this;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setAlarmStatus(AlarmStatusTO alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }


        public AlarmFilterTO build() {
            return new AlarmFilterTO(id, name, networkResource, enable, beginTime, endTime, reason, user, creationTime, alarmStatus);
        }

    }
}
