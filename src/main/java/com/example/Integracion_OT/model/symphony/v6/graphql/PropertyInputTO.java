package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PropertyInputTO implements java.io.Serializable {

    private String id;
    @javax.validation.constraints.NotNull
    private String propertyTypeID;
    private String stringValue;
    private Integer intValue;
    private Boolean booleanValue;
    private Double floatValue;
    private Double latitudeValue;
    private Double longitudeValue;
    private Double rangeFromValue;
    private Double rangeToValue;
    private String nodeIDValue;
    private Boolean isEditable;
    private Boolean isInstanceProperty;

    public PropertyInputTO() {
    }

    public PropertyInputTO(String id, String propertyTypeID, String stringValue, Integer intValue, Boolean booleanValue, Double floatValue, Double latitudeValue, Double longitudeValue, Double rangeFromValue, Double rangeToValue, String nodeIDValue, Boolean isEditable, Boolean isInstanceProperty) {
        this.id = id;
        this.propertyTypeID = propertyTypeID;
        this.stringValue = stringValue;
        this.intValue = intValue;
        this.booleanValue = booleanValue;
        this.floatValue = floatValue;
        this.latitudeValue = latitudeValue;
        this.longitudeValue = longitudeValue;
        this.rangeFromValue = rangeFromValue;
        this.rangeToValue = rangeToValue;
        this.nodeIDValue = nodeIDValue;
        this.isEditable = isEditable;
        this.isInstanceProperty = isInstanceProperty;
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

    public String getPropertyTypeID() {
        return propertyTypeID;
    }

    public void setPropertyTypeID(String propertyTypeID) {
        this.propertyTypeID = propertyTypeID;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public Double getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Double floatValue) {
        this.floatValue = floatValue;
    }

    public Double getLatitudeValue() {
        return latitudeValue;
    }

    public void setLatitudeValue(Double latitudeValue) {
        this.latitudeValue = latitudeValue;
    }

    public Double getLongitudeValue() {
        return longitudeValue;
    }

    public void setLongitudeValue(Double longitudeValue) {
        this.longitudeValue = longitudeValue;
    }

    public Double getRangeFromValue() {
        return rangeFromValue;
    }

    public void setRangeFromValue(Double rangeFromValue) {
        this.rangeFromValue = rangeFromValue;
    }

    public Double getRangeToValue() {
        return rangeToValue;
    }

    public void setRangeToValue(Double rangeToValue) {
        this.rangeToValue = rangeToValue;
    }

    public String getNodeIDValue() {
        return nodeIDValue;
    }

    public void setNodeIDValue(String nodeIDValue) {
        this.nodeIDValue = nodeIDValue;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    public Boolean getIsInstanceProperty() {
        return isInstanceProperty;
    }

    public void setIsInstanceProperty(Boolean isInstanceProperty) {
        this.isInstanceProperty = isInstanceProperty;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (propertyTypeID != null) {
            joiner.add("propertyTypeID: " + GraphQLRequestSerializer.getEntry(propertyTypeID));
        }
        if (stringValue != null) {
            joiner.add("stringValue: " + GraphQLRequestSerializer.getEntry(stringValue));
        }
        if (intValue != null) {
            joiner.add("intValue: " + GraphQLRequestSerializer.getEntry(intValue));
        }
        if (booleanValue != null) {
            joiner.add("booleanValue: " + GraphQLRequestSerializer.getEntry(booleanValue));
        }
        if (floatValue != null) {
            joiner.add("floatValue: " + GraphQLRequestSerializer.getEntry(floatValue));
        }
        if (latitudeValue != null) {
            joiner.add("latitudeValue: " + GraphQLRequestSerializer.getEntry(latitudeValue));
        }
        if (longitudeValue != null) {
            joiner.add("longitudeValue: " + GraphQLRequestSerializer.getEntry(longitudeValue));
        }
        if (rangeFromValue != null) {
            joiner.add("rangeFromValue: " + GraphQLRequestSerializer.getEntry(rangeFromValue));
        }
        if (rangeToValue != null) {
            joiner.add("rangeToValue: " + GraphQLRequestSerializer.getEntry(rangeToValue));
        }
        if (nodeIDValue != null) {
            joiner.add("nodeIDValue: " + GraphQLRequestSerializer.getEntry(nodeIDValue));
        }
        if (isEditable != null) {
            joiner.add("isEditable: " + GraphQLRequestSerializer.getEntry(isEditable));
        }
        if (isInstanceProperty != null) {
            joiner.add("isInstanceProperty: " + GraphQLRequestSerializer.getEntry(isInstanceProperty));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String propertyTypeID;
        private String stringValue;
        private Integer intValue;
        private Boolean booleanValue;
        private Double floatValue;
        private Double latitudeValue;
        private Double longitudeValue;
        private Double rangeFromValue;
        private Double rangeToValue;
        private String nodeIDValue;
        private Boolean isEditable;
        private Boolean isInstanceProperty;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPropertyTypeID(String propertyTypeID) {
            this.propertyTypeID = propertyTypeID;
            return this;
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setIntValue(Integer intValue) {
            this.intValue = intValue;
            return this;
        }

        public Builder setBooleanValue(Boolean booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        public Builder setFloatValue(Double floatValue) {
            this.floatValue = floatValue;
            return this;
        }

        public Builder setLatitudeValue(Double latitudeValue) {
            this.latitudeValue = latitudeValue;
            return this;
        }

        public Builder setLongitudeValue(Double longitudeValue) {
            this.longitudeValue = longitudeValue;
            return this;
        }

        public Builder setRangeFromValue(Double rangeFromValue) {
            this.rangeFromValue = rangeFromValue;
            return this;
        }

        public Builder setRangeToValue(Double rangeToValue) {
            this.rangeToValue = rangeToValue;
            return this;
        }

        public Builder setNodeIDValue(String nodeIDValue) {
            this.nodeIDValue = nodeIDValue;
            return this;
        }

        public Builder setIsEditable(Boolean isEditable) {
            this.isEditable = isEditable;
            return this;
        }

        public Builder setIsInstanceProperty(Boolean isInstanceProperty) {
            this.isInstanceProperty = isInstanceProperty;
            return this;
        }


        public PropertyInputTO build() {
            return new PropertyInputTO(id, propertyTypeID, stringValue, intValue, booleanValue, floatValue, latitudeValue, longitudeValue, rangeFromValue, rangeToValue, nodeIDValue, isEditable, isInstanceProperty);
        }

    }
}
