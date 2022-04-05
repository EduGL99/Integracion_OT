package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SurveyWiFiScan
 */

public class SurveyWiFiScanResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SurveyWiFiScanResponseProjection() {
    }

    public SurveyWiFiScanResponseProjection all$() {
        return all$(3);
    }

    public SurveyWiFiScanResponseProjection all$(int maxDepth) {
        this.id();
        this.timestamp();
        this.frequency();
        this.channel();
        this.bssid();
        this.strength();
        this.ssid();
        this.band();
        this.channelWidth();
        this.capabilities();
        this.latitude();
        this.longitude();
        this.altitude();
        this.heading();
        this.rssi();
        this.typename();
        return this;
    }

    public SurveyWiFiScanResponseProjection id() {
        return id(null);
    }

    public SurveyWiFiScanResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection timestamp() {
        return timestamp(null);
    }

    public SurveyWiFiScanResponseProjection timestamp(String alias) {
        fields.add(new GraphQLResponseField("timestamp").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection frequency() {
        return frequency(null);
    }

    public SurveyWiFiScanResponseProjection frequency(String alias) {
        fields.add(new GraphQLResponseField("frequency").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection channel() {
        return channel(null);
    }

    public SurveyWiFiScanResponseProjection channel(String alias) {
        fields.add(new GraphQLResponseField("channel").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection bssid() {
        return bssid(null);
    }

    public SurveyWiFiScanResponseProjection bssid(String alias) {
        fields.add(new GraphQLResponseField("bssid").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection strength() {
        return strength(null);
    }

    public SurveyWiFiScanResponseProjection strength(String alias) {
        fields.add(new GraphQLResponseField("strength").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection ssid() {
        return ssid(null);
    }

    public SurveyWiFiScanResponseProjection ssid(String alias) {
        fields.add(new GraphQLResponseField("ssid").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection band() {
        return band(null);
    }

    public SurveyWiFiScanResponseProjection band(String alias) {
        fields.add(new GraphQLResponseField("band").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection channelWidth() {
        return channelWidth(null);
    }

    public SurveyWiFiScanResponseProjection channelWidth(String alias) {
        fields.add(new GraphQLResponseField("channelWidth").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection capabilities() {
        return capabilities(null);
    }

    public SurveyWiFiScanResponseProjection capabilities(String alias) {
        fields.add(new GraphQLResponseField("capabilities").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection latitude() {
        return latitude(null);
    }

    public SurveyWiFiScanResponseProjection latitude(String alias) {
        fields.add(new GraphQLResponseField("latitude").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection longitude() {
        return longitude(null);
    }

    public SurveyWiFiScanResponseProjection longitude(String alias) {
        fields.add(new GraphQLResponseField("longitude").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection altitude() {
        return altitude(null);
    }

    public SurveyWiFiScanResponseProjection altitude(String alias) {
        fields.add(new GraphQLResponseField("altitude").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection heading() {
        return heading(null);
    }

    public SurveyWiFiScanResponseProjection heading(String alias) {
        fields.add(new GraphQLResponseField("heading").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection rssi() {
        return rssi(null);
    }

    public SurveyWiFiScanResponseProjection rssi(String alias) {
        fields.add(new GraphQLResponseField("rssi").alias(alias));
        return this;
    }

    public SurveyWiFiScanResponseProjection typename() {
        return typename(null);
    }

    public SurveyWiFiScanResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
