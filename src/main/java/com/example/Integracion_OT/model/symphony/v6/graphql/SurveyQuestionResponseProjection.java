package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for SurveyQuestion
 */

public class SurveyQuestionResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public SurveyQuestionResponseProjection() {
    }

    public SurveyQuestionResponseProjection all$() {
        return all$(3);
    }

    public SurveyQuestionResponseProjection all$(int maxDepth) {
        this.id();
        this.formName();
        this.formDescription();
        this.formIndex();
        this.questionFormat();
        this.questionText();
        this.questionIndex();
        this.boolData();
        this.emailData();
        this.latitude();
        this.longitude();
        this.locationAccuracy();
        this.altitude();
        this.phoneData();
        this.textData();
        this.floatData();
        this.intData();
        this.dateData();
        if (projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.FileResponseProjection.photoData", 0) <= maxDepth) {
            projectionDepthOnFields.put("SurveyQuestionResponseProjection.FileResponseProjection.photoData", projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.FileResponseProjection.photoData", 0) + 1);
            this.photoData(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.FileResponseProjection.photoData", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.SurveyWiFiScanResponseProjection.wifiData", 0) <= maxDepth) {
            projectionDepthOnFields.put("SurveyQuestionResponseProjection.SurveyWiFiScanResponseProjection.wifiData", projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.SurveyWiFiScanResponseProjection.wifiData", 0) + 1);
            this.wifiData(new SurveyWiFiScanResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.SurveyWiFiScanResponseProjection.wifiData", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.SurveyCellScanResponseProjection.cellData", 0) <= maxDepth) {
            projectionDepthOnFields.put("SurveyQuestionResponseProjection.SurveyCellScanResponseProjection.cellData", projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.SurveyCellScanResponseProjection.cellData", 0) + 1);
            this.cellData(new SurveyCellScanResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.SurveyCellScanResponseProjection.cellData", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.FileResponseProjection.images", 0) <= maxDepth) {
            projectionDepthOnFields.put("SurveyQuestionResponseProjection.FileResponseProjection.images", projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.FileResponseProjection.images", 0) + 1);
            this.images(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SurveyQuestionResponseProjection.FileResponseProjection.images", 0)));
        }
        this.typename();
        return this;
    }

    public SurveyQuestionResponseProjection id() {
        return id(null);
    }

    public SurveyQuestionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection formName() {
        return formName(null);
    }

    public SurveyQuestionResponseProjection formName(String alias) {
        fields.add(new GraphQLResponseField("formName").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection formDescription() {
        return formDescription(null);
    }

    public SurveyQuestionResponseProjection formDescription(String alias) {
        fields.add(new GraphQLResponseField("formDescription").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection formIndex() {
        return formIndex(null);
    }

    public SurveyQuestionResponseProjection formIndex(String alias) {
        fields.add(new GraphQLResponseField("formIndex").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection questionFormat() {
        return questionFormat(null);
    }

    public SurveyQuestionResponseProjection questionFormat(String alias) {
        fields.add(new GraphQLResponseField("questionFormat").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection questionText() {
        return questionText(null);
    }

    public SurveyQuestionResponseProjection questionText(String alias) {
        fields.add(new GraphQLResponseField("questionText").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection questionIndex() {
        return questionIndex(null);
    }

    public SurveyQuestionResponseProjection questionIndex(String alias) {
        fields.add(new GraphQLResponseField("questionIndex").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection boolData() {
        return boolData(null);
    }

    public SurveyQuestionResponseProjection boolData(String alias) {
        fields.add(new GraphQLResponseField("boolData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection emailData() {
        return emailData(null);
    }

    public SurveyQuestionResponseProjection emailData(String alias) {
        fields.add(new GraphQLResponseField("emailData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection latitude() {
        return latitude(null);
    }

    public SurveyQuestionResponseProjection latitude(String alias) {
        fields.add(new GraphQLResponseField("latitude").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection longitude() {
        return longitude(null);
    }

    public SurveyQuestionResponseProjection longitude(String alias) {
        fields.add(new GraphQLResponseField("longitude").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection locationAccuracy() {
        return locationAccuracy(null);
    }

    public SurveyQuestionResponseProjection locationAccuracy(String alias) {
        fields.add(new GraphQLResponseField("locationAccuracy").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection altitude() {
        return altitude(null);
    }

    public SurveyQuestionResponseProjection altitude(String alias) {
        fields.add(new GraphQLResponseField("altitude").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection phoneData() {
        return phoneData(null);
    }

    public SurveyQuestionResponseProjection phoneData(String alias) {
        fields.add(new GraphQLResponseField("phoneData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection textData() {
        return textData(null);
    }

    public SurveyQuestionResponseProjection textData(String alias) {
        fields.add(new GraphQLResponseField("textData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection floatData() {
        return floatData(null);
    }

    public SurveyQuestionResponseProjection floatData(String alias) {
        fields.add(new GraphQLResponseField("floatData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection intData() {
        return intData(null);
    }

    public SurveyQuestionResponseProjection intData(String alias) {
        fields.add(new GraphQLResponseField("intData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection dateData() {
        return dateData(null);
    }

    public SurveyQuestionResponseProjection dateData(String alias) {
        fields.add(new GraphQLResponseField("dateData").alias(alias));
        return this;
    }

    public SurveyQuestionResponseProjection photoData(FileResponseProjection subProjection) {
        return photoData(null, subProjection);
    }

    public SurveyQuestionResponseProjection photoData(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("photoData").alias(alias).projection(subProjection));
        return this;
    }

    public SurveyQuestionResponseProjection wifiData(SurveyWiFiScanResponseProjection subProjection) {
        return wifiData(null, subProjection);
    }

    public SurveyQuestionResponseProjection wifiData(String alias, SurveyWiFiScanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("wifiData").alias(alias).projection(subProjection));
        return this;
    }

    public SurveyQuestionResponseProjection cellData(SurveyCellScanResponseProjection subProjection) {
        return cellData(null, subProjection);
    }

    public SurveyQuestionResponseProjection cellData(String alias, SurveyCellScanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cellData").alias(alias).projection(subProjection));
        return this;
    }

    public SurveyQuestionResponseProjection images(FileResponseProjection subProjection) {
        return images(null, subProjection);
    }

    public SurveyQuestionResponseProjection images(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("images").alias(alias).projection(subProjection));
        return this;
    }

    public SurveyQuestionResponseProjection typename() {
        return typename(null);
    }

    public SurveyQuestionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
