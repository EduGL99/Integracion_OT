package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechnicianCheckListItemInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String selectedEnumValues;
    private String stringValue;
    private Boolean checked;
    private YesNoResponseTO yesNoResponse;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyWiFiScanDataTO> wifiData;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyCellScanDataTO> cellData;
    @javax.validation.constraints.NotNull
    private java.util.List<FileInputTO> filesData;

    public TechnicianCheckListItemInputTO() {
    }

    public TechnicianCheckListItemInputTO(String id, String selectedEnumValues, String stringValue, Boolean checked, YesNoResponseTO yesNoResponse, java.util.List<SurveyWiFiScanDataTO> wifiData, java.util.List<SurveyCellScanDataTO> cellData, java.util.List<FileInputTO> filesData) {
        this.id = id;
        this.selectedEnumValues = selectedEnumValues;
        this.stringValue = stringValue;
        this.checked = checked;
        this.yesNoResponse = yesNoResponse;
        this.wifiData = wifiData;
        this.cellData = cellData;
        this.filesData = filesData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public YesNoResponseTO getYesNoResponse() {
        return yesNoResponse;
    }

    public void setYesNoResponse(YesNoResponseTO yesNoResponse) {
        this.yesNoResponse = yesNoResponse;
    }

    public java.util.List<SurveyWiFiScanDataTO> getWifiData() {
        return wifiData;
    }

    public void setWifiData(java.util.List<SurveyWiFiScanDataTO> wifiData) {
        this.wifiData = wifiData;
    }

    public java.util.List<SurveyCellScanDataTO> getCellData() {
        return cellData;
    }

    public void setCellData(java.util.List<SurveyCellScanDataTO> cellData) {
        this.cellData = cellData;
    }

    public java.util.List<FileInputTO> getFilesData() {
        return filesData;
    }

    public void setFilesData(java.util.List<FileInputTO> filesData) {
        this.filesData = filesData;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
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
        if (yesNoResponse != null) {
            joiner.add("yesNoResponse: " + GraphQLRequestSerializer.getEntry(yesNoResponse));
        }
        if (wifiData != null) {
            joiner.add("wifiData: " + GraphQLRequestSerializer.getEntry(wifiData));
        }
        if (cellData != null) {
            joiner.add("cellData: " + GraphQLRequestSerializer.getEntry(cellData));
        }
        if (filesData != null) {
            joiner.add("filesData: " + GraphQLRequestSerializer.getEntry(filesData));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String selectedEnumValues;
        private String stringValue;
        private Boolean checked;
        private YesNoResponseTO yesNoResponse;
        private java.util.List<SurveyWiFiScanDataTO> wifiData;
        private java.util.List<SurveyCellScanDataTO> cellData;
        private java.util.List<FileInputTO> filesData;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
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

        public Builder setYesNoResponse(YesNoResponseTO yesNoResponse) {
            this.yesNoResponse = yesNoResponse;
            return this;
        }

        public Builder setWifiData(java.util.List<SurveyWiFiScanDataTO> wifiData) {
            this.wifiData = wifiData;
            return this;
        }

        public Builder setCellData(java.util.List<SurveyCellScanDataTO> cellData) {
            this.cellData = cellData;
            return this;
        }

        public Builder setFilesData(java.util.List<FileInputTO> filesData) {
            this.filesData = filesData;
            return this;
        }


        public TechnicianCheckListItemInputTO build() {
            return new TechnicianCheckListItemInputTO(id, selectedEnumValues, stringValue, checked, yesNoResponse, wifiData, cellData, filesData);
        }

    }
}
