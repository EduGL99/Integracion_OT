package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PropertyTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private PropertyTypeTO propertyType;
    private String stringValue;
    private Integer intValue;
    private Boolean booleanValue;
    private Double floatValue;
    private Double latitudeValue;
    private Double longitudeValue;
    private Double rangeFromValue;
    private Double rangeToValue;
    private NameNodeTOImpl nodeValue;
    private String rawValue;

    public PropertyTO() {
    }

    public PropertyTO(String id, PropertyTypeTO propertyType, String stringValue, Integer intValue, Boolean booleanValue, Double floatValue, Double latitudeValue, Double longitudeValue, Double rangeFromValue, Double rangeToValue, NameNodeTOImpl nodeValue, String rawValue) {
        this.id = id;
        this.propertyType = propertyType;
        this.stringValue = stringValue;
        this.intValue = intValue;
        this.booleanValue = booleanValue;
        this.floatValue = floatValue;
        this.latitudeValue = latitudeValue;
        this.longitudeValue = longitudeValue;
        this.rangeFromValue = rangeFromValue;
        this.rangeToValue = rangeToValue;
        this.nodeValue = nodeValue;
        this.rawValue = rawValue;
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

    public PropertyTypeTO getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyTypeTO propertyType) {
        this.propertyType = propertyType;
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

    public NamedNodeTO getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(NameNodeTOImpl nodeValue) {
        this.nodeValue = nodeValue;
    }

    public String getRawValue() {
        return rawValue;
    }

    public void setRawValue(String rawValue) {
        this.rawValue = rawValue;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (propertyType != null) {
            joiner.add("propertyType: " + GraphQLRequestSerializer.getEntry(propertyType));
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
        if (nodeValue != null) {
            joiner.add("nodeValue: " + GraphQLRequestSerializer.getEntry(nodeValue));
        }
        if (rawValue != null) {
            joiner.add("rawValue: " + GraphQLRequestSerializer.getEntry(rawValue));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private PropertyTypeTO propertyType;
        private String stringValue;
        private Integer intValue;
        private Boolean booleanValue;
        private Double floatValue;
        private Double latitudeValue;
        private Double longitudeValue;
        private Double rangeFromValue;
        private Double rangeToValue;
        private NameNodeTOImpl nodeValue;
        private String rawValue;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPropertyType(PropertyTypeTO propertyType) {
            this.propertyType = propertyType;
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

        public Builder setNodeValue(NameNodeTOImpl nodeValue) {
            this.nodeValue = nodeValue;
            return this;
        }

        public Builder setRawValue(String rawValue) {
            this.rawValue = rawValue;
            return this;
        }


        public PropertyTO build() {
            return new PropertyTO(id, propertyType, stringValue, intValue, booleanValue, floatValue, latitudeValue, longitudeValue, rangeFromValue, rangeToValue, nodeValue, rawValue);
        }

    }
}
