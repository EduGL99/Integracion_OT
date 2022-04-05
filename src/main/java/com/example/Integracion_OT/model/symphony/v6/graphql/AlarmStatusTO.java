package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmStatusTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<AlarmFilterTO> AlarmFilter;

    public AlarmStatusTO() {
    }

    public AlarmStatusTO(String id, String name, java.util.List<AlarmFilterTO> AlarmFilter) {
        this.id = id;
        this.name = name;
        this.AlarmFilter = AlarmFilter;
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

    public java.util.List<AlarmFilterTO> getAlarmFilter() {
        return AlarmFilter;
    }

    public void setAlarmFilter(java.util.List<AlarmFilterTO> AlarmFilter) {
        this.AlarmFilter = AlarmFilter;
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
        if (AlarmFilter != null) {
            joiner.add("AlarmFilter: " + GraphQLRequestSerializer.getEntry(AlarmFilter));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<AlarmFilterTO> AlarmFilter;

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

        public Builder setAlarmFilter(java.util.List<AlarmFilterTO> AlarmFilter) {
            this.AlarmFilter = AlarmFilter;
            return this;
        }


        public AlarmStatusTO build() {
            return new AlarmStatusTO(id, name, AlarmFilter);
        }

    }
}
