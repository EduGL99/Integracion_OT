package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderExecutionResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentTO> equipmentAdded;
    @javax.validation.constraints.NotNull
    private java.util.List<String> equipmentRemoved;
    @javax.validation.constraints.NotNull
    private java.util.List<LinkTO> linkAdded;
    @javax.validation.constraints.NotNull
    private java.util.List<String> linkRemoved;

    public WorkOrderExecutionResultTO() {
    }

    public WorkOrderExecutionResultTO(String id, String name, java.util.List<EquipmentTO> equipmentAdded, java.util.List<String> equipmentRemoved, java.util.List<LinkTO> linkAdded, java.util.List<String> linkRemoved) {
        this.id = id;
        this.name = name;
        this.equipmentAdded = equipmentAdded;
        this.equipmentRemoved = equipmentRemoved;
        this.linkAdded = linkAdded;
        this.linkRemoved = linkRemoved;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<EquipmentTO> getEquipmentAdded() {
        return equipmentAdded;
    }

    public void setEquipmentAdded(java.util.List<EquipmentTO> equipmentAdded) {
        this.equipmentAdded = equipmentAdded;
    }

    public java.util.List<String> getEquipmentRemoved() {
        return equipmentRemoved;
    }

    public void setEquipmentRemoved(java.util.List<String> equipmentRemoved) {
        this.equipmentRemoved = equipmentRemoved;
    }

    public java.util.List<LinkTO> getLinkAdded() {
        return linkAdded;
    }

    public void setLinkAdded(java.util.List<LinkTO> linkAdded) {
        this.linkAdded = linkAdded;
    }

    public java.util.List<String> getLinkRemoved() {
        return linkRemoved;
    }

    public void setLinkRemoved(java.util.List<String> linkRemoved) {
        this.linkRemoved = linkRemoved;
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
        if (equipmentAdded != null) {
            joiner.add("equipmentAdded: " + GraphQLRequestSerializer.getEntry(equipmentAdded));
        }
        if (equipmentRemoved != null) {
            joiner.add("equipmentRemoved: " + GraphQLRequestSerializer.getEntry(equipmentRemoved));
        }
        if (linkAdded != null) {
            joiner.add("linkAdded: " + GraphQLRequestSerializer.getEntry(linkAdded));
        }
        if (linkRemoved != null) {
            joiner.add("linkRemoved: " + GraphQLRequestSerializer.getEntry(linkRemoved));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<EquipmentTO> equipmentAdded;
        private java.util.List<String> equipmentRemoved;
        private java.util.List<LinkTO> linkAdded;
        private java.util.List<String> linkRemoved;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEquipmentAdded(java.util.List<EquipmentTO> equipmentAdded) {
            this.equipmentAdded = equipmentAdded;
            return this;
        }

        public Builder setEquipmentRemoved(java.util.List<String> equipmentRemoved) {
            this.equipmentRemoved = equipmentRemoved;
            return this;
        }

        public Builder setLinkAdded(java.util.List<LinkTO> linkAdded) {
            this.linkAdded = linkAdded;
            return this;
        }

        public Builder setLinkRemoved(java.util.List<String> linkRemoved) {
            this.linkRemoved = linkRemoved;
            return this;
        }


        public WorkOrderExecutionResultTO build() {
            return new WorkOrderExecutionResultTO(id, name, equipmentAdded, equipmentRemoved, linkAdded, linkRemoved);
        }

    }
}
