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
public class Quantity {
    @JsonProperty("amount")
    private Float amount = 1.0f;

    @JsonProperty("units")
    private String units;

    public Quantity(Quantity element) {
        amount = element.getAmount();
        units = element.getUnits();
    }

    /**
     * Method for merge an old object Quantity with new object Quantity.
     * The old data is overwritten with the new data
     *
     * @param newData new object Quantity type to merge
     * @return Quantity Object merged
     */
    public Quantity merge(Quantity newData) {
        Quantity quantity = new Quantity(this);
        quantity.setAmount((newData.getAmount()) != null ? newData.getAmount() : amount);
        quantity.setUnits((newData.getUnits()) != null ? newData.getUnits() : units);
        return quantity;
    }
}
