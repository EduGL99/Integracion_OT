package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentTO implements java.io.Serializable, NamedNodeTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    private String externalId;
    @javax.validation.constraints.NotNull
    private String name;
    private LocationTO parentLocation;
    private EquipmentPositionTO parentPosition;
    @javax.validation.constraints.NotNull
    private EquipmentTypeTO equipmentType;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPositionTO> positions;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPortTO> ports;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentTO> descendentsIncludingSelf;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTO> properties;
    private FutureStateTO futureState;
    private WorkOrderTO workOrder;
    @javax.validation.constraints.NotNull
    private java.util.List<LocationTO> locationHierarchy;
    @javax.validation.constraints.NotNull
    private LocationTO firstLocation;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentPositionTO> positionHierarchy;
    @javax.validation.constraints.NotNull
    private java.util.List<ServiceTO> services;
    @javax.validation.constraints.NotNull
    private java.util.List<FileTO> images;
    @javax.validation.constraints.NotNull
    private java.util.List<FileTO> files;
    @javax.validation.constraints.NotNull
    private java.util.List<HyperlinkTO> hyperlinks;

    public EquipmentTO() {
    }

    public EquipmentTO(String id, String externalId, String name, LocationTO parentLocation, EquipmentPositionTO parentPosition, EquipmentTypeTO equipmentType, java.util.List<EquipmentPositionTO> positions, java.util.List<EquipmentPortTO> ports, java.util.List<EquipmentTO> descendentsIncludingSelf, java.util.List<PropertyTO> properties, FutureStateTO futureState, WorkOrderTO workOrder, java.util.List<LocationTO> locationHierarchy, LocationTO firstLocation, java.util.List<EquipmentPositionTO> positionHierarchy, java.util.List<ServiceTO> services, java.util.List<FileTO> images, java.util.List<FileTO> files, java.util.List<HyperlinkTO> hyperlinks) {
        this.id = id;
        this.externalId = externalId;
        this.name = name;
        this.parentLocation = parentLocation;
        this.parentPosition = parentPosition;
        this.equipmentType = equipmentType;
        this.positions = positions;
        this.ports = ports;
        this.descendentsIncludingSelf = descendentsIncludingSelf;
        this.properties = properties;
        this.futureState = futureState;
        this.workOrder = workOrder;
        this.locationHierarchy = locationHierarchy;
        this.firstLocation = firstLocation;
        this.positionHierarchy = positionHierarchy;
        this.services = services;
        this.images = images;
        this.files = files;
        this.hyperlinks = hyperlinks;
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * The name of the object.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the object.
     */
    public void setName(String name) {
        this.name = name;
    }

    public LocationTO getParentLocation() {
        return parentLocation;
    }

    public void setParentLocation(LocationTO parentLocation) {
        this.parentLocation = parentLocation;
    }

    public EquipmentPositionTO getParentPosition() {
        return parentPosition;
    }

    public void setParentPosition(EquipmentPositionTO parentPosition) {
        this.parentPosition = parentPosition;
    }

    public EquipmentTypeTO getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentTypeTO equipmentType) {
        this.equipmentType = equipmentType;
    }

    public java.util.List<EquipmentPositionTO> getPositions() {
        return positions;
    }

    public void setPositions(java.util.List<EquipmentPositionTO> positions) {
        this.positions = positions;
    }

    public java.util.List<EquipmentPortTO> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<EquipmentPortTO> ports) {
        this.ports = ports;
    }

    public java.util.List<EquipmentTO> getDescendentsIncludingSelf() {
        return descendentsIncludingSelf;
    }

    public void setDescendentsIncludingSelf(java.util.List<EquipmentTO> descendentsIncludingSelf) {
        this.descendentsIncludingSelf = descendentsIncludingSelf;
    }

    public java.util.List<PropertyTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTO> properties) {
        this.properties = properties;
    }

    public FutureStateTO getFutureState() {
        return futureState;
    }

    public void setFutureState(FutureStateTO futureState) {
        this.futureState = futureState;
    }

    public WorkOrderTO getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrderTO workOrder) {
        this.workOrder = workOrder;
    }

    public java.util.List<LocationTO> getLocationHierarchy() {
        return locationHierarchy;
    }

    public void setLocationHierarchy(java.util.List<LocationTO> locationHierarchy) {
        this.locationHierarchy = locationHierarchy;
    }

    public LocationTO getFirstLocation() {
        return firstLocation;
    }

    public void setFirstLocation(LocationTO firstLocation) {
        this.firstLocation = firstLocation;
    }

    public java.util.List<EquipmentPositionTO> getPositionHierarchy() {
        return positionHierarchy;
    }

    public void setPositionHierarchy(java.util.List<EquipmentPositionTO> positionHierarchy) {
        this.positionHierarchy = positionHierarchy;
    }

    public java.util.List<ServiceTO> getServices() {
        return services;
    }

    public void setServices(java.util.List<ServiceTO> services) {
        this.services = services;
    }

    public java.util.List<FileTO> getImages() {
        return images;
    }

    public void setImages(java.util.List<FileTO> images) {
        this.images = images;
    }

    public java.util.List<FileTO> getFiles() {
        return files;
    }

    public void setFiles(java.util.List<FileTO> files) {
        this.files = files;
    }

    public java.util.List<HyperlinkTO> getHyperlinks() {
        return hyperlinks;
    }

    public void setHyperlinks(java.util.List<HyperlinkTO> hyperlinks) {
        this.hyperlinks = hyperlinks;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (parentLocation != null) {
            joiner.add("parentLocation: " + GraphQLRequestSerializer.getEntry(parentLocation));
        }
        if (parentPosition != null) {
            joiner.add("parentPosition: " + GraphQLRequestSerializer.getEntry(parentPosition));
        }
        if (equipmentType != null) {
            joiner.add("equipmentType: " + GraphQLRequestSerializer.getEntry(equipmentType));
        }
        if (positions != null) {
            joiner.add("positions: " + GraphQLRequestSerializer.getEntry(positions));
        }
        if (ports != null) {
            joiner.add("ports: " + GraphQLRequestSerializer.getEntry(ports));
        }
        if (descendentsIncludingSelf != null) {
            joiner.add("descendentsIncludingSelf: " + GraphQLRequestSerializer.getEntry(descendentsIncludingSelf));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (futureState != null) {
            joiner.add("futureState: " + GraphQLRequestSerializer.getEntry(futureState));
        }
        if (workOrder != null) {
            joiner.add("workOrder: " + GraphQLRequestSerializer.getEntry(workOrder));
        }
        if (locationHierarchy != null) {
            joiner.add("locationHierarchy: " + GraphQLRequestSerializer.getEntry(locationHierarchy));
        }
        if (firstLocation != null) {
            joiner.add("firstLocation: " + GraphQLRequestSerializer.getEntry(firstLocation));
        }
        if (positionHierarchy != null) {
            joiner.add("positionHierarchy: " + GraphQLRequestSerializer.getEntry(positionHierarchy));
        }
        if (services != null) {
            joiner.add("services: " + GraphQLRequestSerializer.getEntry(services));
        }
        if (images != null) {
            joiner.add("images: " + GraphQLRequestSerializer.getEntry(images));
        }
        if (files != null) {
            joiner.add("files: " + GraphQLRequestSerializer.getEntry(files));
        }
        if (hyperlinks != null) {
            joiner.add("hyperlinks: " + GraphQLRequestSerializer.getEntry(hyperlinks));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String externalId;
        private String name;
        private LocationTO parentLocation;
        private EquipmentPositionTO parentPosition;
        private EquipmentTypeTO equipmentType;
        private java.util.List<EquipmentPositionTO> positions;
        private java.util.List<EquipmentPortTO> ports;
        private java.util.List<EquipmentTO> descendentsIncludingSelf;
        private java.util.List<PropertyTO> properties;
        private FutureStateTO futureState;
        private WorkOrderTO workOrder;
        private java.util.List<LocationTO> locationHierarchy;
        private LocationTO firstLocation;
        private java.util.List<EquipmentPositionTO> positionHierarchy;
        private java.util.List<ServiceTO> services;
        private java.util.List<FileTO> images;
        private java.util.List<FileTO> files;
        private java.util.List<HyperlinkTO> hyperlinks;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * The name of the object.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setParentLocation(LocationTO parentLocation) {
            this.parentLocation = parentLocation;
            return this;
        }

        public Builder setParentPosition(EquipmentPositionTO parentPosition) {
            this.parentPosition = parentPosition;
            return this;
        }

        public Builder setEquipmentType(EquipmentTypeTO equipmentType) {
            this.equipmentType = equipmentType;
            return this;
        }

        public Builder setPositions(java.util.List<EquipmentPositionTO> positions) {
            this.positions = positions;
            return this;
        }

        public Builder setPorts(java.util.List<EquipmentPortTO> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setDescendentsIncludingSelf(java.util.List<EquipmentTO> descendentsIncludingSelf) {
            this.descendentsIncludingSelf = descendentsIncludingSelf;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setFutureState(FutureStateTO futureState) {
            this.futureState = futureState;
            return this;
        }

        public Builder setWorkOrder(WorkOrderTO workOrder) {
            this.workOrder = workOrder;
            return this;
        }

        public Builder setLocationHierarchy(java.util.List<LocationTO> locationHierarchy) {
            this.locationHierarchy = locationHierarchy;
            return this;
        }

        public Builder setFirstLocation(LocationTO firstLocation) {
            this.firstLocation = firstLocation;
            return this;
        }

        public Builder setPositionHierarchy(java.util.List<EquipmentPositionTO> positionHierarchy) {
            this.positionHierarchy = positionHierarchy;
            return this;
        }

        public Builder setServices(java.util.List<ServiceTO> services) {
            this.services = services;
            return this;
        }

        public Builder setImages(java.util.List<FileTO> images) {
            this.images = images;
            return this;
        }

        public Builder setFiles(java.util.List<FileTO> files) {
            this.files = files;
            return this;
        }

        public Builder setHyperlinks(java.util.List<HyperlinkTO> hyperlinks) {
            this.hyperlinks = hyperlinks;
            return this;
        }


        public EquipmentTO build() {
            return new EquipmentTO(id, externalId, name, parentLocation, parentPosition, equipmentType, positions, ports, descendentsIncludingSelf, properties, futureState, workOrder, locationHierarchy, firstLocation, positionHierarchy, services, images, files, hyperlinks);
        }

    }
}
