package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentTO> equipment;
    private int count;

    public EquipmentSearchResultTO() {
    }

    public EquipmentSearchResultTO(java.util.List<EquipmentTO> equipment, int count) {
        this.equipment = equipment;
        this.count = count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public java.util.List<EquipmentTO> getEquipment() {
        return equipment;
    }

    public void setEquipment(java.util.List<EquipmentTO> equipment) {
        this.equipment = equipment;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (equipment != null) {
            joiner.add("equipment: " + GraphQLRequestSerializer.getEntry(equipment));
        }
        joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        return joiner.toString();
    }

    public static class Builder {

        private java.util.List<EquipmentTO> equipment;
        private int count;

        public Builder() {
        }

        public Builder setEquipment(java.util.List<EquipmentTO> equipment) {
            this.equipment = equipment;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public EquipmentSearchResultTO build() {
            return new EquipmentSearchResultTO(equipment, count);
        }

    }
}
