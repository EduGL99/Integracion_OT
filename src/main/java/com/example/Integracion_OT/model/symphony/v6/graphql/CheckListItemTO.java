package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckListItemTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String title;
    @javax.validation.constraints.NotNull
    private CheckListItemTypeTO type;
    private Integer index;
    private Boolean isMandatory;
    private String helpText;
    private String enumValues;
    private CheckListItemEnumSelectionModeTO enumSelectionMode;
    private String selectedEnumValues;
    private String stringValue;
    private Boolean checked;
    @javax.validation.constraints.NotNull
    private java.util.List<FileTO> files;
    private YesNoResponseTO yesNoResponse;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyWiFiScanTO> wifiData;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyCellScanTO> cellData;

    public CheckListItemTO() {
    }

    public CheckListItemTO(String id, String title, CheckListItemTypeTO type, Integer index, Boolean isMandatory, String helpText, String enumValues, CheckListItemEnumSelectionModeTO enumSelectionMode, String selectedEnumValues, String stringValue, Boolean checked, java.util.List<FileTO> files, YesNoResponseTO yesNoResponse, java.util.List<SurveyWiFiScanTO> wifiData, java.util.List<SurveyCellScanTO> cellData) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.index = index;
        this.isMandatory = isMandatory;
        this.helpText = helpText;
        this.enumValues = enumValues;
        this.enumSelectionMode = enumSelectionMode;
        this.selectedEnumValues = selectedEnumValues;
        this.stringValue = stringValue;
        this.checked = checked;
        this.files = files;
        this.yesNoResponse = yesNoResponse;
        this.wifiData = wifiData;
        this.cellData = cellData;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CheckListItemTypeTO getType() {
        return type;
    }

    public void setType(CheckListItemTypeTO type) {
        this.type = type;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    public String getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(String enumValues) {
        this.enumValues = enumValues;
    }

    public CheckListItemEnumSelectionModeTO getEnumSelectionMode() {
        return enumSelectionMode;
    }

    public void setEnumSelectionMode(CheckListItemEnumSelectionModeTO enumSelectionMode) {
        this.enumSelectionMode = enumSelectionMode;
    }

    public String getSelectedEnumValues() {
        return selectedEnumValues;
    }

    public void setSelectedEnumValues(String selectedEnumValues) {
        this.selectedEnumValues = selectedEnumValues;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public java.util.List<FileTO> getFiles() {
        return files;
    }

    public void setFiles(java.util.List<FileTO> files) {
        this.files = files;
    }

    public YesNoResponseTO getYesNoResponse() {
        return yesNoResponse;
    }

    public void setYesNoResponse(YesNoResponseTO yesNoResponse) {
        this.yesNoResponse = yesNoResponse;
    }

    public java.util.List<SurveyWiFiScanTO> getWifiData() {
        return wifiData;
    }

    public void setWifiData(java.util.List<SurveyWiFiScanTO> wifiData) {
        this.wifiData = wifiData;
    }

    public java.util.List<SurveyCellScanTO> getCellData() {
        return cellData;
    }

    public void setCellData(java.util.List<SurveyCellScanTO> cellData) {
        this.cellData = cellData;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (isMandatory != null) {
            joiner.add("isMandatory: " + GraphQLRequestSerializer.getEntry(isMandatory));
        }
        if (helpText != null) {
            joiner.add("helpText: " + GraphQLRequestSerializer.getEntry(helpText));
        }
        if (enumValues != null) {
            joiner.add("enumValues: " + GraphQLRequestSerializer.getEntry(enumValues));
        }
        if (enumSelectionMode != null) {
            joiner.add("enumSelectionMode: " + GraphQLRequestSerializer.getEntry(enumSelectionMode));
        }
        if (selectedEnumValues != null) {
            joiner.add("selectedEnumValues: " + GraphQLRequestSerializer.getEntry(selectedEnumValues));
        }
        if (stringValue != null) {
            joiner.add("stringValue: " + GraphQLRequestSerializer.getEntry(stringValue));
        }
        if (checked != null) {
            joiner.add("checked: " + GraphQLRequestSerializer.getEntry(checked));
        }
        if (files != null) {
            joiner.add("files: " + GraphQLRequestSerializer.getEntry(files));
        }
        if (yesNoResponse != null) {
            joiner.add("yesNoResponse: " + GraphQLRequestSerializer.getEntry(yesNoResponse));
        }
        if (wifiData != null) {
            joiner.add("wifiData: " + GraphQLRequestSerializer.getEntry(wifiData));
        }
        if (cellData != null) {
            joiner.add("cellData: " + GraphQLRequestSerializer.getEntry(cellData));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String title;
        private CheckListItemTypeTO type;
        private Integer index;
        private Boolean isMandatory;
        private String helpText;
        private String enumValues;
        private CheckListItemEnumSelectionModeTO enumSelectionMode;
        private String selectedEnumValues;
        private String stringValue;
        private Boolean checked;
        private java.util.List<FileTO> files;
        private YesNoResponseTO yesNoResponse;
        private java.util.List<SurveyWiFiScanTO> wifiData;
        private java.util.List<SurveyCellScanTO> cellData;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setType(CheckListItemTypeTO type) {
            this.type = type;
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Builder setIsMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            return this;
        }

        public Builder setHelpText(String helpText) {
            this.helpText = helpText;
            return this;
        }

        public Builder setEnumValues(String enumValues) {
            this.enumValues = enumValues;
            return this;
        }

        public Builder setEnumSelectionMode(CheckListItemEnumSelectionModeTO enumSelectionMode) {
            this.enumSelectionMode = enumSelectionMode;
            return this;
        }

        public Builder setSelectedEnumValues(String selectedEnumValues) {
            this.selectedEnumValues = selectedEnumValues;
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setChecked(Boolean checked) {
            this.checked = checked;
            return this;
        }

        public Builder setFiles(java.util.List<FileTO> files) {
            this.files = files;
            return this;
        }

        public Builder setYesNoResponse(YesNoResponseTO yesNoResponse) {
            this.yesNoResponse = yesNoResponse;
            return this;
        }

        public Builder setWifiData(java.util.List<SurveyWiFiScanTO> wifiData) {
            this.wifiData = wifiData;
            return this;
        }

        public Builder setCellData(java.util.List<SurveyCellScanTO> cellData) {
            this.cellData = cellData;
            return this;
        }


        public CheckListItemTO build() {
            return new CheckListItemTO(id, title, type, index, isMandatory, helpText, enumValues, enumSelectionMode, selectedEnumValues, stringValue, checked, files, yesNoResponse, wifiData, cellData);
        }

    }
}
