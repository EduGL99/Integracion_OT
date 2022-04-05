package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for CheckListItem
 */

public class CheckListItemResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public CheckListItemResponseProjection() {
    }

    public CheckListItemResponseProjection all$() {
        return all$(3);
    }

    public CheckListItemResponseProjection all$(int maxDepth) {
        this.id();
        this.title();
        this.type();
        this.index();
        this.isMandatory();
        this.helpText();
        this.enumValues();
        this.enumSelectionMode();
        this.selectedEnumValues();
        this.stringValue();
        this.checked();
        if (projectionDepthOnFields.getOrDefault("CheckListItemResponseProjection.FileResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckListItemResponseProjection.FileResponseProjection.files", projectionDepthOnFields.getOrDefault("CheckListItemResponseProjection.FileResponseProjection.files", 0) + 1);
            this.files(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckListItemResponseProjection.FileResponseProjection.files", 0)));
        }
        this.yesNoResponse();
        if (projectionDepthOnFields.getOrDefault("CheckListItemResponseProjection.SurveyWiFiScanResponseProjection.wifiData", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckListItemResponseProjection.SurveyWiFiScanResponseProjection.wifiData", projectionDepthOnFields.getOrDefault("CheckListItemResponseProjection.SurveyWiFiScanResponseProjection.wifiData", 0) + 1);
            this.wifiData(new SurveyWiFiScanResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckListItemResponseProjection.SurveyWiFiScanResponseProjection.wifiData", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CheckListItemResponseProjection.SurveyCellScanResponseProjection.cellData", 0) <= maxDepth) {
            projectionDepthOnFields.put("CheckListItemResponseProjection.SurveyCellScanResponseProjection.cellData", projectionDepthOnFields.getOrDefault("CheckListItemResponseProjection.SurveyCellScanResponseProjection.cellData", 0) + 1);
            this.cellData(new SurveyCellScanResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CheckListItemResponseProjection.SurveyCellScanResponseProjection.cellData", 0)));
        }
        this.typename();
        return this;
    }

    public CheckListItemResponseProjection id() {
        return id(null);
    }

    public CheckListItemResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection title() {
        return title(null);
    }

    public CheckListItemResponseProjection title(String alias) {
        fields.add(new GraphQLResponseField("title").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection type() {
        return type(null);
    }

    public CheckListItemResponseProjection type(String alias) {
        fields.add(new GraphQLResponseField("type").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection index() {
        return index(null);
    }

    public CheckListItemResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection isMandatory() {
        return isMandatory(null);
    }

    public CheckListItemResponseProjection isMandatory(String alias) {
        fields.add(new GraphQLResponseField("isMandatory").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection helpText() {
        return helpText(null);
    }

    public CheckListItemResponseProjection helpText(String alias) {
        fields.add(new GraphQLResponseField("helpText").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection enumValues() {
        return enumValues(null);
    }

    public CheckListItemResponseProjection enumValues(String alias) {
        fields.add(new GraphQLResponseField("enumValues").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection enumSelectionMode() {
        return enumSelectionMode(null);
    }

    public CheckListItemResponseProjection enumSelectionMode(String alias) {
        fields.add(new GraphQLResponseField("enumSelectionMode").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection selectedEnumValues() {
        return selectedEnumValues(null);
    }

    public CheckListItemResponseProjection selectedEnumValues(String alias) {
        fields.add(new GraphQLResponseField("selectedEnumValues").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection stringValue() {
        return stringValue(null);
    }

    public CheckListItemResponseProjection stringValue(String alias) {
        fields.add(new GraphQLResponseField("stringValue").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection checked() {
        return checked(null);
    }

    public CheckListItemResponseProjection checked(String alias) {
        fields.add(new GraphQLResponseField("checked").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection files(FileResponseProjection subProjection) {
        return files(null, subProjection);
    }

    public CheckListItemResponseProjection files(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection));
        return this;
    }

    public CheckListItemResponseProjection yesNoResponse() {
        return yesNoResponse(null);
    }

    public CheckListItemResponseProjection yesNoResponse(String alias) {
        fields.add(new GraphQLResponseField("yesNoResponse").alias(alias));
        return this;
    }

    public CheckListItemResponseProjection wifiData(SurveyWiFiScanResponseProjection subProjection) {
        return wifiData(null, subProjection);
    }

    public CheckListItemResponseProjection wifiData(String alias, SurveyWiFiScanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("wifiData").alias(alias).projection(subProjection));
        return this;
    }

    public CheckListItemResponseProjection cellData(SurveyCellScanResponseProjection subProjection) {
        return cellData(null, subProjection);
    }

    public CheckListItemResponseProjection cellData(String alias, SurveyCellScanResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cellData").alias(alias).projection(subProjection));
        return this;
    }

    public CheckListItemResponseProjection typename() {
        return typename(null);
    }

    public CheckListItemResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
