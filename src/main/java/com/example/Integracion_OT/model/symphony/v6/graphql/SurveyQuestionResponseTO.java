package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyQuestionResponseTO implements java.io.Serializable {

    private String formName;
    private String formDescription;
    private int formIndex;
    private SurveyQuestionTypeTO questionFormat;
    @javax.validation.constraints.NotNull
    private String questionText;
    private int questionIndex;
    private Boolean boolData;
    private String emailData;
    private Double latitude;
    private Double longitude;
    private Double locationAccuracy;
    private Double altitude;
    private String phoneData;
    private String textData;
    private Double floatData;
    private Integer intData;
    private Integer dateData;
    private FileInputTO photoData;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyWiFiScanDataTO> wifiData;
    @javax.validation.constraints.NotNull
    private java.util.List<SurveyCellScanDataTO> cellData;
    @javax.validation.constraints.NotNull
    private java.util.List<FileInputTO> imagesData;

    public SurveyQuestionResponseTO() {
    }

    public SurveyQuestionResponseTO(String formName, String formDescription, int formIndex, SurveyQuestionTypeTO questionFormat, String questionText, int questionIndex, Boolean boolData, String emailData, Double latitude, Double longitude, Double locationAccuracy, Double altitude, String phoneData, String textData, Double floatData, Integer intData, Integer dateData, FileInputTO photoData, java.util.List<SurveyWiFiScanDataTO> wifiData, java.util.List<SurveyCellScanDataTO> cellData, java.util.List<FileInputTO> imagesData) {
        this.formName = formName;
        this.formDescription = formDescription;
        this.formIndex = formIndex;
        this.questionFormat = questionFormat;
        this.questionText = questionText;
        this.questionIndex = questionIndex;
        this.boolData = boolData;
        this.emailData = emailData;
        this.latitude = latitude;
        this.longitude = longitude;
        this.locationAccuracy = locationAccuracy;
        this.altitude = altitude;
        this.phoneData = phoneData;
        this.textData = textData;
        this.floatData = floatData;
        this.intData = intData;
        this.dateData = dateData;
        this.photoData = photoData;
        this.wifiData = wifiData;
        this.cellData = cellData;
        this.imagesData = imagesData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getFormDescription() {
        return formDescription;
    }

    public void setFormDescription(String formDescription) {
        this.formDescription = formDescription;
    }

    public int getFormIndex() {
        return formIndex;
    }

    public void setFormIndex(int formIndex) {
        this.formIndex = formIndex;
    }

    public SurveyQuestionTypeTO getQuestionFormat() {
        return questionFormat;
    }

    public void setQuestionFormat(SurveyQuestionTypeTO questionFormat) {
        this.questionFormat = questionFormat;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getQuestionIndex() {
        return questionIndex;
    }

    public void setQuestionIndex(int questionIndex) {
        this.questionIndex = questionIndex;
    }

    public Boolean getBoolData() {
        return boolData;
    }

    public void setBoolData(Boolean boolData) {
        this.boolData = boolData;
    }

    public String getEmailData() {
        return emailData;
    }

    public void setEmailData(String emailData) {
        this.emailData = emailData;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLocationAccuracy() {
        return locationAccuracy;
    }

    public void setLocationAccuracy(Double locationAccuracy) {
        this.locationAccuracy = locationAccuracy;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public String getPhoneData() {
        return phoneData;
    }

    public void setPhoneData(String phoneData) {
        this.phoneData = phoneData;
    }

    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
    }

    public Double getFloatData() {
        return floatData;
    }

    public void setFloatData(Double floatData) {
        this.floatData = floatData;
    }

    public Integer getIntData() {
        return intData;
    }

    public void setIntData(Integer intData) {
        this.intData = intData;
    }

    public Integer getDateData() {
        return dateData;
    }

    public void setDateData(Integer dateData) {
        this.dateData = dateData;
    }

    public FileInputTO getPhotoData() {
        return photoData;
    }

    public void setPhotoData(FileInputTO photoData) {
        this.photoData = photoData;
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

    public java.util.List<FileInputTO> getImagesData() {
        return imagesData;
    }

    public void setImagesData(java.util.List<FileInputTO> imagesData) {
        this.imagesData = imagesData;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (formName != null) {
            joiner.add("formName: " + GraphQLRequestSerializer.getEntry(formName));
        }
        if (formDescription != null) {
            joiner.add("formDescription: " + GraphQLRequestSerializer.getEntry(formDescription));
        }
        joiner.add("formIndex: " + GraphQLRequestSerializer.getEntry(formIndex));
        if (questionFormat != null) {
            joiner.add("questionFormat: " + GraphQLRequestSerializer.getEntry(questionFormat));
        }
        if (questionText != null) {
            joiner.add("questionText: " + GraphQLRequestSerializer.getEntry(questionText));
        }
        joiner.add("questionIndex: " + GraphQLRequestSerializer.getEntry(questionIndex));
        if (boolData != null) {
            joiner.add("boolData: " + GraphQLRequestSerializer.getEntry(boolData));
        }
        if (emailData != null) {
            joiner.add("emailData: " + GraphQLRequestSerializer.getEntry(emailData));
        }
        if (latitude != null) {
            joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        }
        if (longitude != null) {
            joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        }
        if (locationAccuracy != null) {
            joiner.add("locationAccuracy: " + GraphQLRequestSerializer.getEntry(locationAccuracy));
        }
        if (altitude != null) {
            joiner.add("altitude: " + GraphQLRequestSerializer.getEntry(altitude));
        }
        if (phoneData != null) {
            joiner.add("phoneData: " + GraphQLRequestSerializer.getEntry(phoneData));
        }
        if (textData != null) {
            joiner.add("textData: " + GraphQLRequestSerializer.getEntry(textData));
        }
        if (floatData != null) {
            joiner.add("floatData: " + GraphQLRequestSerializer.getEntry(floatData));
        }
        if (intData != null) {
            joiner.add("intData: " + GraphQLRequestSerializer.getEntry(intData));
        }
        if (dateData != null) {
            joiner.add("dateData: " + GraphQLRequestSerializer.getEntry(dateData));
        }
        if (photoData != null) {
            joiner.add("photoData: " + GraphQLRequestSerializer.getEntry(photoData));
        }
        if (wifiData != null) {
            joiner.add("wifiData: " + GraphQLRequestSerializer.getEntry(wifiData));
        }
        if (cellData != null) {
            joiner.add("cellData: " + GraphQLRequestSerializer.getEntry(cellData));
        }
        if (imagesData != null) {
            joiner.add("imagesData: " + GraphQLRequestSerializer.getEntry(imagesData));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String formName;
        private String formDescription;
        private int formIndex;
        private SurveyQuestionTypeTO questionFormat;
        private String questionText;
        private int questionIndex;
        private Boolean boolData;
        private String emailData;
        private Double latitude;
        private Double longitude;
        private Double locationAccuracy;
        private Double altitude;
        private String phoneData;
        private String textData;
        private Double floatData;
        private Integer intData;
        private Integer dateData;
        private FileInputTO photoData;
        private java.util.List<SurveyWiFiScanDataTO> wifiData;
        private java.util.List<SurveyCellScanDataTO> cellData;
        private java.util.List<FileInputTO> imagesData;

        public Builder() {
        }

        public Builder setFormName(String formName) {
            this.formName = formName;
            return this;
        }

        public Builder setFormDescription(String formDescription) {
            this.formDescription = formDescription;
            return this;
        }

        public Builder setFormIndex(int formIndex) {
            this.formIndex = formIndex;
            return this;
        }

        public Builder setQuestionFormat(SurveyQuestionTypeTO questionFormat) {
            this.questionFormat = questionFormat;
            return this;
        }

        public Builder setQuestionText(String questionText) {
            this.questionText = questionText;
            return this;
        }

        public Builder setQuestionIndex(int questionIndex) {
            this.questionIndex = questionIndex;
            return this;
        }

        public Builder setBoolData(Boolean boolData) {
            this.boolData = boolData;
            return this;
        }

        public Builder setEmailData(String emailData) {
            this.emailData = emailData;
            return this;
        }

        public Builder setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setLocationAccuracy(Double locationAccuracy) {
            this.locationAccuracy = locationAccuracy;
            return this;
        }

        public Builder setAltitude(Double altitude) {
            this.altitude = altitude;
            return this;
        }

        public Builder setPhoneData(String phoneData) {
            this.phoneData = phoneData;
            return this;
        }

        public Builder setTextData(String textData) {
            this.textData = textData;
            return this;
        }

        public Builder setFloatData(Double floatData) {
            this.floatData = floatData;
            return this;
        }

        public Builder setIntData(Integer intData) {
            this.intData = intData;
            return this;
        }

        public Builder setDateData(Integer dateData) {
            this.dateData = dateData;
            return this;
        }

        public Builder setPhotoData(FileInputTO photoData) {
            this.photoData = photoData;
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

        public Builder setImagesData(java.util.List<FileInputTO> imagesData) {
            this.imagesData = imagesData;
            return this;
        }


        public SurveyQuestionResponseTO build() {
            return new SurveyQuestionResponseTO(formName, formDescription, formIndex, questionFormat, questionText, questionIndex, boolData, emailData, latitude, longitude, locationAccuracy, altitude, phoneData, textData, floatData, intData, dateData, photoData, wifiData, cellData, imagesData);
        }

    }
}
