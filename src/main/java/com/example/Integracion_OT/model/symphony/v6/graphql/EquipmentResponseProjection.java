package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Equipment
 */

public class EquipmentResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public EquipmentResponseProjection() {
    }

    public EquipmentResponseProjection all$() {
        return all$(3);
    }

    public EquipmentResponseProjection all$(int maxDepth) {
        this.id();
        this.externalId();
        this.name();
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.LocationResponseProjection.parentLocation", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.LocationResponseProjection.parentLocation", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.LocationResponseProjection.parentLocation", 0) + 1);
            this.parentLocation(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.LocationResponseProjection.parentLocation", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPositionResponseProjection.parentPosition", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.EquipmentPositionResponseProjection.parentPosition", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPositionResponseProjection.parentPosition", 0) + 1);
            this.parentPosition(new EquipmentPositionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPositionResponseProjection.parentPosition", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentTypeResponseProjection.equipmentType", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.EquipmentTypeResponseProjection.equipmentType", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentTypeResponseProjection.equipmentType", 0) + 1);
            this.equipmentType(new EquipmentTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentTypeResponseProjection.equipmentType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPositionResponseProjection.positions", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.EquipmentPositionResponseProjection.positions", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPositionResponseProjection.positions", 0) + 1);
            this.positions(new EquipmentPositionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPositionResponseProjection.positions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPortResponseProjection.ports", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.EquipmentPortResponseProjection.ports", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPortResponseProjection.ports", 0) + 1);
            this.ports(new EquipmentPortResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPortResponseProjection.ports", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentResponseProjection.descendentsIncludingSelf", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.EquipmentResponseProjection.descendentsIncludingSelf", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentResponseProjection.descendentsIncludingSelf", 0) + 1);
            this.descendentsIncludingSelf(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentResponseProjection.descendentsIncludingSelf", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.PropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.PropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.PropertyResponseProjection.properties", 0) + 1);
            this.properties(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.PropertyResponseProjection.properties", 0)));
        }
        this.futureState();
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.WorkOrderResponseProjection.workOrder", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.WorkOrderResponseProjection.workOrder", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.WorkOrderResponseProjection.workOrder", 0) + 1);
            this.workOrder(new WorkOrderResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.WorkOrderResponseProjection.workOrder", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.LocationResponseProjection.locationHierarchy", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.LocationResponseProjection.locationHierarchy", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.LocationResponseProjection.locationHierarchy", 0) + 1);
            this.locationHierarchy(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.LocationResponseProjection.locationHierarchy", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.LocationResponseProjection.firstLocation", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.LocationResponseProjection.firstLocation", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.LocationResponseProjection.firstLocation", 0) + 1);
            this.firstLocation(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.LocationResponseProjection.firstLocation", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPositionResponseProjection.positionHierarchy", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.EquipmentPositionResponseProjection.positionHierarchy", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPositionResponseProjection.positionHierarchy", 0) + 1);
            this.positionHierarchy(new EquipmentPositionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.EquipmentPositionResponseProjection.positionHierarchy", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.ServiceResponseProjection.services", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.ServiceResponseProjection.services", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.ServiceResponseProjection.services", 0) + 1);
            this.services(new ServiceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.ServiceResponseProjection.services", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.FileResponseProjection.images", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.FileResponseProjection.images", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.FileResponseProjection.images", 0) + 1);
            this.images(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.FileResponseProjection.images", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.FileResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.FileResponseProjection.files", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.FileResponseProjection.files", 0) + 1);
            this.files(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.FileResponseProjection.files", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.HyperlinkResponseProjection.hyperlinks", 0) <= maxDepth) {
            projectionDepthOnFields.put("EquipmentResponseProjection.HyperlinkResponseProjection.hyperlinks", projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.HyperlinkResponseProjection.hyperlinks", 0) + 1);
            this.hyperlinks(new HyperlinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("EquipmentResponseProjection.HyperlinkResponseProjection.hyperlinks", 0)));
        }
        this.typename();
        return this;
    }

    public EquipmentResponseProjection id() {
        return id(null);
    }

    public EquipmentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public EquipmentResponseProjection externalId() {
        return externalId(null);
    }

    public EquipmentResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public EquipmentResponseProjection name() {
        return name(null);
    }

    public EquipmentResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public EquipmentResponseProjection parentLocation(LocationResponseProjection subProjection) {
        return parentLocation(null, subProjection);
    }

    public EquipmentResponseProjection parentLocation(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentLocation").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection parentPosition(EquipmentPositionResponseProjection subProjection) {
        return parentPosition(null, subProjection);
    }

    public EquipmentResponseProjection parentPosition(String alias, EquipmentPositionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentPosition").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection equipmentType(EquipmentTypeResponseProjection subProjection) {
        return equipmentType(null, subProjection);
    }

    public EquipmentResponseProjection equipmentType(String alias, EquipmentTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentType").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection positions(EquipmentPositionResponseProjection subProjection) {
        return positions(null, subProjection);
    }

    public EquipmentResponseProjection positions(String alias, EquipmentPositionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("positions").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection ports(EquipmentPortResponseProjection subProjection) {
        return ports((String) null, subProjection);
    }

    public EquipmentResponseProjection ports(String alias, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ports").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection ports(EquipmentPortsParametrizedInput input, EquipmentPortResponseProjection subProjection) {
        return ports(null, input, subProjection);
    }

    public EquipmentResponseProjection ports(String alias, EquipmentPortsParametrizedInput input, EquipmentPortResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("ports").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection descendentsIncludingSelf(EquipmentResponseProjection subProjection) {
        return descendentsIncludingSelf(null, subProjection);
    }

    public EquipmentResponseProjection descendentsIncludingSelf(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("descendentsIncludingSelf").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public EquipmentResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection futureState() {
        return futureState(null);
    }

    public EquipmentResponseProjection futureState(String alias) {
        fields.add(new GraphQLResponseField("futureState").alias(alias));
        return this;
    }

    public EquipmentResponseProjection workOrder(WorkOrderResponseProjection subProjection) {
        return workOrder(null, subProjection);
    }

    public EquipmentResponseProjection workOrder(String alias, WorkOrderResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrder").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection locationHierarchy(LocationResponseProjection subProjection) {
        return locationHierarchy(null, subProjection);
    }

    public EquipmentResponseProjection locationHierarchy(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locationHierarchy").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection firstLocation(LocationResponseProjection subProjection) {
        return firstLocation(null, subProjection);
    }

    public EquipmentResponseProjection firstLocation(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("firstLocation").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection positionHierarchy(EquipmentPositionResponseProjection subProjection) {
        return positionHierarchy(null, subProjection);
    }

    public EquipmentResponseProjection positionHierarchy(String alias, EquipmentPositionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("positionHierarchy").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection services(ServiceResponseProjection subProjection) {
        return services(null, subProjection);
    }

    public EquipmentResponseProjection services(String alias, ServiceResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("services").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection images(FileResponseProjection subProjection) {
        return images(null, subProjection);
    }

    public EquipmentResponseProjection images(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("images").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection files(FileResponseProjection subProjection) {
        return files(null, subProjection);
    }

    public EquipmentResponseProjection files(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection hyperlinks(HyperlinkResponseProjection subProjection) {
        return hyperlinks(null, subProjection);
    }

    public EquipmentResponseProjection hyperlinks(String alias, HyperlinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("hyperlinks").alias(alias).projection(subProjection));
        return this;
    }

    public EquipmentResponseProjection typename() {
        return typename(null);
    }

    public EquipmentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
