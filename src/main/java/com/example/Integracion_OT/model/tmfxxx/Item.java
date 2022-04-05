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
public class Item {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("options")
    private String options;
    @JsonProperty("valueType")
    private String valueType;
    @JsonProperty("value")
    private Object value;

    public Item(Item element) {
        id = element.getId();
        name = element.getName();
        description = element.getDescription();
        options = element.getOptions();
        valueType = element.getValueType();
        value = element.getValue();
    }

    /**
     * Method for merge an old object Item with new object Item.
     * The old data is overwritten with the new data
     *
     * @param newData new object Item type to merge
     * @return Item
     */
    public Item merge(Item newData) {
        Item item = new Item(this);
        item.setId((newData.getId() != null ? newData.getId() : name));
        item.setName((newData.getName() != null ? newData.getName() : name));
        item.setValueType((newData.getValueType() != null ? newData.getValueType() : valueType));
        item.setDescription((newData.getDescription() != null ? newData.getDescription() : valueType));
        item.setOptions((newData.getOptions() != null ? newData.getOptions() : valueType));
        item.setValue((newData.getValue() != null ? newData.getValue() : value));
        return item;
    }
}
