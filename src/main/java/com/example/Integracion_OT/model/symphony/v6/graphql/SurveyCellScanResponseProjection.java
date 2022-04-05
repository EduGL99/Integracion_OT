package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SurveyCellScan
 */

public class SurveyCellScanResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SurveyCellScanResponseProjection() {
    }

    public SurveyCellScanResponseProjection all$() {
        return all$(3);
    }

    public SurveyCellScanResponseProjection all$(int maxDepth) {
        this.id();
        this.networkType();
        this.signalStrength();
        this.timestamp();
        this.baseStationID();
        this.networkID();
        this.systemID();
        this.cellID();
        this.locationAreaCode();
        this.mobileCountryCode();
        this.mobileNetworkCode();
        this.primaryScramblingCode();
        this.operator();
        this.arfcn();
        this.physicalCellID();
        this.trackingAreaCode();
        this.timingAdvance();
        this.earfcn();
        this.uarfcn();
        this.latitude();
        this.longitude();
        this.altitude();
        this.heading();
        this.rssi();
        this.typename();
        return this;
    }

    public SurveyCellScanResponseProjection id() {
        return id(null);
    }

    public SurveyCellScanResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection networkType() {
        return networkType(null);
    }

    public SurveyCellScanResponseProjection networkType(String alias) {
        fields.add(new GraphQLResponseField("networkType").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection signalStrength() {
        return signalStrength(null);
    }

    public SurveyCellScanResponseProjection signalStrength(String alias) {
        fields.add(new GraphQLResponseField("signalStrength").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection timestamp() {
        return timestamp(null);
    }

    public SurveyCellScanResponseProjection timestamp(String alias) {
        fields.add(new GraphQLResponseField("timestamp").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection baseStationID() {
        return baseStationID(null);
    }

    public SurveyCellScanResponseProjection baseStationID(String alias) {
        fields.add(new GraphQLResponseField("baseStationID").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection networkID() {
        return networkID(null);
    }

    public SurveyCellScanResponseProjection networkID(String alias) {
        fields.add(new GraphQLResponseField("networkID").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection systemID() {
        return systemID(null);
    }

    public SurveyCellScanResponseProjection systemID(String alias) {
        fields.add(new GraphQLResponseField("systemID").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection cellID() {
        return cellID(null);
    }

    public SurveyCellScanResponseProjection cellID(String alias) {
        fields.add(new GraphQLResponseField("cellID").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection locationAreaCode() {
        return locationAreaCode(null);
    }

    public SurveyCellScanResponseProjection locationAreaCode(String alias) {
        fields.add(new GraphQLResponseField("locationAreaCode").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection mobileCountryCode() {
        return mobileCountryCode(null);
    }

    public SurveyCellScanResponseProjection mobileCountryCode(String alias) {
        fields.add(new GraphQLResponseField("mobileCountryCode").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection mobileNetworkCode() {
        return mobileNetworkCode(null);
    }

    public SurveyCellScanResponseProjection mobileNetworkCode(String alias) {
        fields.add(new GraphQLResponseField("mobileNetworkCode").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection primaryScramblingCode() {
        return primaryScramblingCode(null);
    }

    public SurveyCellScanResponseProjection primaryScramblingCode(String alias) {
        fields.add(new GraphQLResponseField("primaryScramblingCode").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection operator() {
        return operator(null);
    }

    public SurveyCellScanResponseProjection operator(String alias) {
        fields.add(new GraphQLResponseField("operator").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection arfcn() {
        return arfcn(null);
    }

    public SurveyCellScanResponseProjection arfcn(String alias) {
        fields.add(new GraphQLResponseField("arfcn").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection physicalCellID() {
        return physicalCellID(null);
    }

    public SurveyCellScanResponseProjection physicalCellID(String alias) {
        fields.add(new GraphQLResponseField("physicalCellID").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection trackingAreaCode() {
        return trackingAreaCode(null);
    }

    public SurveyCellScanResponseProjection trackingAreaCode(String alias) {
        fields.add(new GraphQLResponseField("trackingAreaCode").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection timingAdvance() {
        return timingAdvance(null);
    }

    public SurveyCellScanResponseProjection timingAdvance(String alias) {
        fields.add(new GraphQLResponseField("timingAdvance").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection earfcn() {
        return earfcn(null);
    }

    public SurveyCellScanResponseProjection earfcn(String alias) {
        fields.add(new GraphQLResponseField("earfcn").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection uarfcn() {
        return uarfcn(null);
    }

    public SurveyCellScanResponseProjection uarfcn(String alias) {
        fields.add(new GraphQLResponseField("uarfcn").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection latitude() {
        return latitude(null);
    }

    public SurveyCellScanResponseProjection latitude(String alias) {
        fields.add(new GraphQLResponseField("latitude").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection longitude() {
        return longitude(null);
    }

    public SurveyCellScanResponseProjection longitude(String alias) {
        fields.add(new GraphQLResponseField("longitude").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection altitude() {
        return altitude(null);
    }

    public SurveyCellScanResponseProjection altitude(String alias) {
        fields.add(new GraphQLResponseField("altitude").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection heading() {
        return heading(null);
    }

    public SurveyCellScanResponseProjection heading(String alias) {
        fields.add(new GraphQLResponseField("heading").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection rssi() {
        return rssi(null);
    }

    public SurveyCellScanResponseProjection rssi(String alias) {
        fields.add(new GraphQLResponseField("rssi").alias(alias));
        return this;
    }

    public SurveyCellScanResponseProjection typename() {
        return typename(null);
    }

    public SurveyCellScanResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
