package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PropertyTypeInputTO implements java.io.Serializable {

    private String id;
    private String externalId;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private PropertyKindTO type;
    private String nodeType;
    private Integer index;
    private String category;
    private String stringValue;
    private Integer intValue;
    private Boolean booleanValue;
    private Double floatValue;
    private Double latitudeValue;
    private Double longitudeValue;
    private Double rangeFromValue;
    private Double rangeToValue;
    private Boolean isEditable;
    private Boolean isInstanceProperty;
    private Boolean isMandatory;
    private Boolean isDeleted;
    private Boolean isListable;

    public PropertyTypeInputTO() {
    }

    public PropertyTypeInputTO(String id, String externalId, String name, PropertyKindTO type, String nodeType, Integer index, String category, String stringValue, Integer intValue, Boolean booleanValue, Double floatValue, Double latitudeValue, Double longitudeValue, Double rangeFromValue, Double rangeToValue, Boolean isEditable, Boolean isInstanceProperty, Boolean isMandatory, Boolean isDeleted, Boolean isListable) {
        this.id = id;
        this.externalId = externalId;
        this.name = name;
        this.type = type;
        this.nodeType = nodeType;
        this.index = index;
        this.category = category;
        this.stringValue = stringValue;
        this.intValue = intValue;
        this.booleanValue = booleanValue;
        this.floatValue = floatValue;
        this.latitudeValue = latitudeValue;
        this.longitudeValue = longitudeValue;
        this.rangeFromValue = rangeFromValue;
        this.rangeToValue = rangeToValue;
        this.isEditable = isEditable;
        this.isInstanceProperty = isInstanceProperty;
        this.isMandatory = isMandatory;
        this.isDeleted = isDeleted;
        this.isListable = isListable;
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PropertyKindTO getType() {
        return type;
    }

    public void setType(PropertyKindTO type) {
        this.type = type;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public Boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsListable() {
        return isListable;
    }

    public void setIsListable(Boolean isListable) {
        this.isListable = isListable;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (externalId != null) {
            joiner.add("externalId: " + GraphQLRequestSerializer.getEntry(externalId));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (type != null) {
            joiner.add("type: " + GraphQLRequestSerializer.getEntry(type));
        }
        if (nodeType != null) {
            joiner.add("nodeType: " + GraphQLRequestSerializer.getEntry(nodeType));
        }
        if (index != null) {
            joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        }
        if (category != null) {
            joiner.add("category: " + GraphQLRequestSerializer.getEntry(category));
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
        if (isEditable != null) {
            joiner.add("isEditable: " + GraphQLRequestSerializer.getEntry(isEditable));
        }
        if (isInstanceProperty != null) {
            joiner.add("isInstanceProperty: " + GraphQLRequestSerializer.getEntry(isInstanceProperty));
        }
        if (isMandatory != null) {
            joiner.add("isMandatory: " + GraphQLRequestSerializer.getEntry(isMandatory));
        }
        if (isDeleted != null) {
            joiner.add("isDeleted: " + GraphQLRequestSerializer.getEntry(isDeleted));
        }
        if (isListable != null) {
            joiner.add("isListable: " + GraphQLRequestSerializer.getEntry(isListable));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String externalId;
        private String name;
        private PropertyKindTO type;
        private String nodeType;
        private Integer index;
        private String category;
        private String stringValue;
        private Integer intValue;
        private Boolean booleanValue;
        private Double floatValue;
        private Double latitudeValue;
        private Double longitudeValue;
        private Double rangeFromValue;
        private Double rangeToValue;
        private Boolean isEditable;
        private Boolean isInstanceProperty;
        private Boolean isMandatory;
        private Boolean isDeleted;
        private Boolean isListable;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(PropertyKindTO type) {
            this.type = type;
            return this;
        }

        public Builder setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = index;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
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

        public Builder setIsEditable(Boolean isEditable) {
            this.isEditable = isEditable;
            return this;
        }

        public Builder setIsInstanceProperty(Boolean isInstanceProperty) {
            this.isInstanceProperty = isInstanceProperty;
            return this;
        }

        public Builder setIsMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            return this;
        }

        public Builder setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        public Builder setIsListable(Boolean isListable) {
            this.isListable = isListable;
            return this;
        }


        public PropertyTypeInputTO build() {
            return new PropertyTypeInputTO(id, externalId, name, type, nodeType, index, category, stringValue, intValue, booleanValue, floatValue, latitudeValue, longitudeValue, rangeFromValue, rangeToValue, isEditable, isInstanceProperty, isMandatory, isDeleted, isListable);
        }

    }
}
