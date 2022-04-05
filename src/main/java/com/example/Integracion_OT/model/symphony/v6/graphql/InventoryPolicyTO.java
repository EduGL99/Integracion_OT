package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryPolicyTO implements java.io.Serializable, SystemPolicyTO {

    @javax.validation.constraints.NotNull
    private BasicPermissionRuleTO read;
    @javax.validation.constraints.NotNull
    private LocationCUDTO location;
    @javax.validation.constraints.NotNull
    private DocumentCategoryCUDTO documentCategory;
    @javax.validation.constraints.NotNull
    private CUDTO equipment;
    @javax.validation.constraints.NotNull
    private CUDTO equipmentType;
    @javax.validation.constraints.NotNull
    private CUDTO locationType;
    @javax.validation.constraints.NotNull
    private CUDTO portType;
    @javax.validation.constraints.NotNull
    private CUDTO serviceType;

    public InventoryPolicyTO() {
    }

    public InventoryPolicyTO(BasicPermissionRuleTO read, LocationCUDTO location, DocumentCategoryCUDTO documentCategory, CUDTO equipment, CUDTO equipmentType, CUDTO locationType, CUDTO portType, CUDTO serviceType) {
        this.read = read;
        this.location = location;
        this.documentCategory = documentCategory;
        this.equipment = equipment;
        this.equipmentType = equipmentType;
        this.locationType = locationType;
        this.portType = portType;
        this.serviceType = serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public BasicPermissionRuleTO getRead() {
        return read;
    }

    public void setRead(BasicPermissionRuleTO read) {
        this.read = read;
    }

    public LocationCUDTO getLocation() {
        return location;
    }

    public void setLocation(LocationCUDTO location) {
        this.location = location;
    }

    public DocumentCategoryCUDTO getDocumentCategory() {
        return documentCategory;
    }

    public void setDocumentCategory(DocumentCategoryCUDTO documentCategory) {
        this.documentCategory = documentCategory;
    }

    public CUDTO getEquipment() {
        return equipment;
    }

    public void setEquipment(CUDTO equipment) {
        this.equipment = equipment;
    }

    public CUDTO getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(CUDTO equipmentType) {
        this.equipmentType = equipmentType;
    }

    public CUDTO getLocationType() {
        return locationType;
    }

    public void setLocationType(CUDTO locationType) {
        this.locationType = locationType;
    }

    public CUDTO getPortType() {
        return portType;
    }

    public void setPortType(CUDTO portType) {
        this.portType = portType;
    }

    public CUDTO getServiceType() {
        return serviceType;
    }

    public void setServiceType(CUDTO serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (read != null) {
            joiner.add("read: " + GraphQLRequestSerializer.getEntry(read));
        }
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        if (documentCategory != null) {
            joiner.add("documentCategory: " + GraphQLRequestSerializer.getEntry(documentCategory));
        }
        if (equipment != null) {
            joiner.add("equipment: " + GraphQLRequestSerializer.getEntry(equipment));
        }
        if (equipmentType != null) {
            joiner.add("equipmentType: " + GraphQLRequestSerializer.getEntry(equipmentType));
        }
        if (locationType != null) {
            joiner.add("locationType: " + GraphQLRequestSerializer.getEntry(locationType));
        }
        if (portType != null) {
            joiner.add("portType: " + GraphQLRequestSerializer.getEntry(portType));
        }
        if (serviceType != null) {
            joiner.add("serviceType: " + GraphQLRequestSerializer.getEntry(serviceType));
        }
        return joiner.toString();
    }

    public static class Builder {

        private BasicPermissionRuleTO read;
        private LocationCUDTO location;
        private DocumentCategoryCUDTO documentCategory;
        private CUDTO equipment;
        private CUDTO equipmentType;
        private CUDTO locationType;
        private CUDTO portType;
        private CUDTO serviceType;

        public Builder() {
        }

        public Builder setRead(BasicPermissionRuleTO read) {
            this.read = read;
            return this;
        }

        public Builder setLocation(LocationCUDTO location) {
            this.location = location;
            return this;
        }

        public Builder setDocumentCategory(DocumentCategoryCUDTO documentCategory) {
            this.documentCategory = documentCategory;
            return this;
        }

        public Builder setEquipment(CUDTO equipment) {
            this.equipment = equipment;
            return this;
        }

        public Builder setEquipmentType(CUDTO equipmentType) {
            this.equipmentType = equipmentType;
            return this;
        }

        public Builder setLocationType(CUDTO locationType) {
            this.locationType = locationType;
            return this;
        }

        public Builder setPortType(CUDTO portType) {
            this.portType = portType;
            return this;
        }

        public Builder setServiceType(CUDTO serviceType) {
            this.serviceType = serviceType;
            return this;
        }


        public InventoryPolicyTO build() {
            return new InventoryPolicyTO(read, location, documentCategory, equipment, equipmentType, locationType, portType, serviceType);
        }

    }
}
