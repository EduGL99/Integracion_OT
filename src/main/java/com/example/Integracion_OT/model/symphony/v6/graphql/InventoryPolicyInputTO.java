package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryPolicyInputTO implements java.io.Serializable {

    private BasicPermissionRuleInputTO read;
    private LocationCUDInputTO location;
    private DocumentCategoryCUDInputTO documentCategory;
    private BasicCUDInputTO equipment;
    private BasicCUDInputTO equipmentType;
    private BasicCUDInputTO locationType;
    private BasicCUDInputTO portType;
    private BasicCUDInputTO serviceType;

    public InventoryPolicyInputTO() {
    }

    public InventoryPolicyInputTO(BasicPermissionRuleInputTO read, LocationCUDInputTO location, DocumentCategoryCUDInputTO documentCategory, BasicCUDInputTO equipment, BasicCUDInputTO equipmentType, BasicCUDInputTO locationType, BasicCUDInputTO portType, BasicCUDInputTO serviceType) {
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

    public BasicPermissionRuleInputTO getRead() {
        return read;
    }

    public void setRead(BasicPermissionRuleInputTO read) {
        this.read = read;
    }

    public LocationCUDInputTO getLocation() {
        return location;
    }

    public void setLocation(LocationCUDInputTO location) {
        this.location = location;
    }

    public DocumentCategoryCUDInputTO getDocumentCategory() {
        return documentCategory;
    }

    public void setDocumentCategory(DocumentCategoryCUDInputTO documentCategory) {
        this.documentCategory = documentCategory;
    }

    public BasicCUDInputTO getEquipment() {
        return equipment;
    }

    public void setEquipment(BasicCUDInputTO equipment) {
        this.equipment = equipment;
    }

    public BasicCUDInputTO getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(BasicCUDInputTO equipmentType) {
        this.equipmentType = equipmentType;
    }

    public BasicCUDInputTO getLocationType() {
        return locationType;
    }

    public void setLocationType(BasicCUDInputTO locationType) {
        this.locationType = locationType;
    }

    public BasicCUDInputTO getPortType() {
        return portType;
    }

    public void setPortType(BasicCUDInputTO portType) {
        this.portType = portType;
    }

    public BasicCUDInputTO getServiceType() {
        return serviceType;
    }

    public void setServiceType(BasicCUDInputTO serviceType) {
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

        private BasicPermissionRuleInputTO read;
        private LocationCUDInputTO location;
        private DocumentCategoryCUDInputTO documentCategory;
        private BasicCUDInputTO equipment;
        private BasicCUDInputTO equipmentType;
        private BasicCUDInputTO locationType;
        private BasicCUDInputTO portType;
        private BasicCUDInputTO serviceType;

        public Builder() {
        }

        public Builder setRead(BasicPermissionRuleInputTO read) {
            this.read = read;
            return this;
        }

        public Builder setLocation(LocationCUDInputTO location) {
            this.location = location;
            return this;
        }

        public Builder setDocumentCategory(DocumentCategoryCUDInputTO documentCategory) {
            this.documentCategory = documentCategory;
            return this;
        }

        public Builder setEquipment(BasicCUDInputTO equipment) {
            this.equipment = equipment;
            return this;
        }

        public Builder setEquipmentType(BasicCUDInputTO equipmentType) {
            this.equipmentType = equipmentType;
            return this;
        }

        public Builder setLocationType(BasicCUDInputTO locationType) {
            this.locationType = locationType;
            return this;
        }

        public Builder setPortType(BasicCUDInputTO portType) {
            this.portType = portType;
            return this;
        }

        public Builder setServiceType(BasicCUDInputTO serviceType) {
            this.serviceType = serviceType;
            return this;
        }


        public InventoryPolicyInputTO build() {
            return new InventoryPolicyInputTO(read, location, documentCategory, equipment, equipmentType, locationType, portType, serviceType);
        }

    }
}
