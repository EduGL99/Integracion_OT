package com.example.Integracion_OT.model.tmfxxx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Characteristic {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("valueType")
    private String valueType;

    @JsonProperty("value")
    private String value;

    @JsonProperty("@baseType")
    private String _atBaseType;

    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;

    @JsonProperty("@type")
    private String _atType;

    public Characteristic(Characteristic element) {
        id = element.getId();
        name = element.getName();
        valueType = element.getValueType();
        value = element.getValue();
        _atBaseType = element.get_atBaseType();
        _atSchemaLocation = element.get_atSchemaLocation();
        _atType = element.get_atType();
    }

    /**
     * Method for merge an old object Characteristic with new object Characteristic.
     * The old data is overwritten with the new data
     *
     * @param newData new object Characteristic type to merge
     * @return Characteristic Object merged
     */
    public Characteristic merge(Characteristic newData) {
        Characteristic characteristic = new Characteristic(this);
        characteristic.setValueType((newData.getValueType() != null ? newData.getValueType() : valueType));
        characteristic.setValue((newData.getValue() != null ? newData.getValue() : value));
        characteristic.set_atBaseType((newData.get_atBaseType() != null ? newData.get_atBaseType() : _atBaseType));
        characteristic.set_atSchemaLocation((newData.get_atSchemaLocation() != null ? newData.get_atSchemaLocation() :
                _atSchemaLocation));
        characteristic.set_atType((newData.get_atType() != null ? newData.get_atType() : _atType));
        return characteristic;
    }
}
