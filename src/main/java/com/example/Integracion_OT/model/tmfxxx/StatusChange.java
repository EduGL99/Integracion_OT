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
public class StatusChange {
    @JsonProperty("changeDate")
    private String changeDate;

    @JsonProperty("changeReason")
    private String changeReason;

    @JsonProperty("status")
    private String status;

    @JsonProperty("@baseType")
    private String _atBaseType;

    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;

    @JsonProperty("@type")
    private String _atType;

    public StatusChange(StatusChange element) {
        changeDate = element.getChangeDate();
        changeReason = element.getChangeReason();
        status = element.getStatus();
        _atBaseType = element.get_atBaseType();
        _atSchemaLocation = element.get_atSchemaLocation();
        _atType = element.get_atType();
    }

    /**
     * Method for merge an old object StatusChange with new object StatusChange.
     * The old data is overwritten with the new data
     *
     * @param newData new object StatusChange type to merge
     * @return StatusChange Object merged
     */
    public StatusChange merge(StatusChange newData) {
        StatusChange statusChange = new StatusChange(this);
        statusChange.setChangeDate((newData.getChangeDate() != null ? newData.getChangeDate() : changeDate));
        statusChange.setChangeReason((newData.getChangeReason() != null ? newData.getChangeReason() : changeReason));
        statusChange.setStatus((newData.getStatus() != null ? newData.getStatus() : status));
        statusChange.set_atBaseType((newData.get_atBaseType() != null ? newData.get_atBaseType() : _atBaseType));
        statusChange.set_atSchemaLocation((newData.get_atSchemaLocation() != null ? newData.get_atSchemaLocation() :
                _atSchemaLocation));
        statusChange.set_atType((newData.get_atType() != null ? newData.get_atType() : _atType));
        return statusChange;
    }
}
