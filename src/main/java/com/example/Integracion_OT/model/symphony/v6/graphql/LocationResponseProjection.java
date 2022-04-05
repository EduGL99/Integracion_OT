package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for Location
 */

public class LocationResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public LocationResponseProjection() {
    }

    public LocationResponseProjection all$() {
        return all$(3);
    }

    public LocationResponseProjection all$(int maxDepth) {
        this.id();
        this.externalId();
        this.name();
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationTypeResponseProjection.locationType", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.LocationTypeResponseProjection.locationType", projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationTypeResponseProjection.locationType", 0) + 1);
            this.locationType(new LocationTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationTypeResponseProjection.locationType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationResponseProjection.parentLocation", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.LocationResponseProjection.parentLocation", projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationResponseProjection.parentLocation", 0) + 1);
            this.parentLocation(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationResponseProjection.parentLocation", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationResponseProjection.children", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.LocationResponseProjection.children", projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationResponseProjection.children", 0) + 1);
            this.children(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationResponseProjection.children", 0)));
        }
        this.numChildren();
        this.latitude();
        this.longitude();
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.CoordinatesResponseProjection.parentCoords", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.CoordinatesResponseProjection.parentCoords", projectionDepthOnFields.getOrDefault("LocationResponseProjection.CoordinatesResponseProjection.parentCoords", 0) + 1);
            this.parentCoords(new CoordinatesResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.CoordinatesResponseProjection.parentCoords", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.EquipmentResponseProjection.equipments", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.EquipmentResponseProjection.equipments", projectionDepthOnFields.getOrDefault("LocationResponseProjection.EquipmentResponseProjection.equipments", 0) + 1);
            this.equipments(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.EquipmentResponseProjection.equipments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.PropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.PropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("LocationResponseProjection.PropertyResponseProjection.properties", 0) + 1);
            this.properties(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.PropertyResponseProjection.properties", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.FileResponseProjection.images", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.FileResponseProjection.images", projectionDepthOnFields.getOrDefault("LocationResponseProjection.FileResponseProjection.images", 0) + 1);
            this.images(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.FileResponseProjection.images", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.FileResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.FileResponseProjection.files", projectionDepthOnFields.getOrDefault("LocationResponseProjection.FileResponseProjection.files", 0) + 1);
            this.files(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.FileResponseProjection.files", 0)));
        }
        this.siteSurveyNeeded();
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.NetworkTopologyResponseProjection.topology", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.NetworkTopologyResponseProjection.topology", projectionDepthOnFields.getOrDefault("LocationResponseProjection.NetworkTopologyResponseProjection.topology", 0) + 1);
            this.topology(new NetworkTopologyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.NetworkTopologyResponseProjection.topology", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationResponseProjection.locationHierarchy", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.LocationResponseProjection.locationHierarchy", projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationResponseProjection.locationHierarchy", 0) + 1);
            this.locationHierarchy(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.LocationResponseProjection.locationHierarchy", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.SurveyResponseProjection.surveys", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.SurveyResponseProjection.surveys", projectionDepthOnFields.getOrDefault("LocationResponseProjection.SurveyResponseProjection.surveys", 0) + 1);
            this.surveys(new SurveyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.SurveyResponseProjection.surveys", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.SurveyWiFiScanResponseProjection.wifiData", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.SurveyWiFiScanResponseProjection.wifiData", projectionDepthOnFields.getOrDefault("LocationResponseProjection.SurveyWiFiScanResponseProjection.wifiData", 0) + 1);
            this.wifiData(new SurveyWiFiScanResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.SurveyWiFiScanResponseProjection.wifiData", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.SurveyCellScanResponseProjection.cellData", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.SurveyCellScanResponseProjection.cellData", projectionDepthOnFields.getOrDefault("LocationResponseProjection.SurveyCellScanResponseProjection.cellData", 0) + 1);
            this.cellData(new SurveyCellScanResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.SurveyCellScanResponseProjection.cellData", 0)));
        }
        this.distanceKm();
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.FloorPlanResponseProjection.floorPlans", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.FloorPlanResponseProjection.floorPlans", projectionDepthOnFields.getOrDefault("LocationResponseProjection.FloorPlanResponseProjection.floorPlans", 0) + 1);
            this.floorPlans(new FloorPlanResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.FloorPlanResponseProjection.floorPlans", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LocationResponseProjection.HyperlinkResponseProjection.hyperlinks", 0) <= maxDepth) {
            projectionDepthOnFields.put("LocationResponseProjection.HyperlinkResponseProjection.hyperlinks", projectionDepthOnFields.getOrDefault("LocationResponseProjection.HyperlinkResponseProjection.hyperlinks", 0) + 1);
            this.hyperlinks(new HyperlinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LocationResponseProjection.HyperlinkResponseProjection.hyperlinks", 0)));
        }
        this.typename();
        return this;
    }

    public LocationResponseProjection id() {
        return id(null);
    }

    public LocationResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LocationResponseProjection externalId() {
        return externalId(null);
    }

    public LocationResponseProjection externalId(String alias) {
        fields.add(new GraphQLResponseField("externalId").alias(alias));
        return this;
    }

    public LocationResponseProjection name() {
        return name(null);
    }

    public LocationResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public LocationResponseProjection locationType(LocationTypeResponseProjection subProjection) {
        return locationType(null, subProjection);
    }

    public LocationResponseProjection locationType(String alias, LocationTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locationType").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection parentLocation(LocationResponseProjection subProjection) {
        return parentLocation(null, subProjection);
    }

    public LocationResponseProjection parentLocation(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentLocation").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection children(LocationResponseProjection subProjection) {
        return children(null, subProjection);
    }

    public LocationResponseProjection children(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("children").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection numChildren() {
        return numChildren(null);
    }

    public LocationResponseProjection numChildren(String alias) {
        fields.add(new GraphQLResponseField("numChildren").alias(alias));
        return this;
    }

    public LocationResponseProjection latitude() {
        return latitude(null);
    }

    public LocationResponseProjection latitude(String alias) {
        fields.add(new GraphQLResponseField("latitude").alias(alias));
        return this;
    }

    public LocationResponseProjection longitude() {
        return longitude(null);
    }

    public LocationResponseProjection longitude(String alias) {
        fields.add(new GraphQLResponseField("longitude").alias(alias));
        return this;
    }

    public LocationResponseProjection parentCoords(CoordinatesResponseProjection subProjection) {
        return parentCoords(null, subProjection);
    }

    public LocationResponseProjection parentCoords(String alias, CoordinatesResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parentCoords").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection equipments(EquipmentResponseProjection subProjection) {
        return equipments(null, subProjection);
    }

    public LocationResponseProjection equipments(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipments").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public LocationResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection images(FileResponseProjection subProjection) {
        return images(null, subProjection);
    }

    public LocationResponseProjection images(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("images").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection files(FileResponseProjection subProjection) {
        return files(null, subProjection);
    }

    public LocationResponseProjection files(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection siteSurveyNeeded() {
        return siteSurveyNeeded(null);
    }

    public LocationResponseProjection siteSurveyNeeded(String alias) {
        fields.add(new GraphQLResponseField("siteSurveyNeeded").alias(alias));
        return this;
    }

    public LocationResponseProjection topology(NetworkTopologyResponseProjection subProjection) {
        return topology((String) null, subProjection);
    }

    public LocationResponseProjection topology(String alias, NetworkTopologyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("topology").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection topology(LocationTopologyParametrizedInput input, NetworkTopologyResponseProjection subProjection) {
        return topology(null, input, subProjection);
    }

    public LocationResponseProjection topology(String alias, LocationTopologyParametrizedInput input, NetworkTopologyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("topology").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public LocationResponseProjection locationHierarchy(LocationResponseProjection subProjection) {
        return locationHierarchy(null, subProjection);
    }

    public LocationResponseProjection locationHierarchy(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locationHierarchy").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection surveys(SurveyResponseProjection subProjection) {
        return surveys(null, subProjection);
    }

    public LocationResponseProjection surveys(String alias, SurveyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("surveys").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection wifiData(SurveyWiFiScanResponseProjection subProjection) {
        return wifiData(null, subProjection);
    }

    public LocationResponseProjection wifiData(String alias, SurveyWiFiScanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("wifiData").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection cellData(SurveyCellScanResponseProjection subProjection) {
        return cellData(null, subProjection);
    }

    public LocationResponseProjection cellData(String alias, SurveyCellScanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cellData").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection distanceKm() {
        return distanceKm((String) null);
    }

    public LocationResponseProjection distanceKm(String alias) {
        fields.add(new GraphQLResponseField("distanceKm").alias(alias));
        return this;
    }

    public LocationResponseProjection distanceKm(LocationDistanceKmParametrizedInput input) {
        return distanceKm(null, input);
    }

    public LocationResponseProjection distanceKm(String alias, LocationDistanceKmParametrizedInput input) {
        fields.add(new GraphQLResponseField("distanceKm").alias(alias).parameters(input));
        return this;
    }

    public LocationResponseProjection floorPlans(FloorPlanResponseProjection subProjection) {
        return floorPlans(null, subProjection);
    }

    public LocationResponseProjection floorPlans(String alias, FloorPlanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("floorPlans").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection hyperlinks(HyperlinkResponseProjection subProjection) {
        return hyperlinks(null, subProjection);
    }

    public LocationResponseProjection hyperlinks(String alias, HyperlinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("hyperlinks").alias(alias).projection(subProjection));
        return this;
    }

    public LocationResponseProjection typename() {
        return typename(null);
    }

    public LocationResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
