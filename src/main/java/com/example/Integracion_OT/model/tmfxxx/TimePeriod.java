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
public class TimePeriod {
    @JsonProperty("endDateTime")
    private String endDateTime;

    @JsonProperty("startDateTime")
    private String startDateTime;

    public TimePeriod(TimePeriod element) {
        endDateTime = element.getEndDateTime();
        startDateTime = element.getStartDateTime();
    }

    /**
     * Method for merge an old object TimePeriod with new object TimePeriod.
     * The old data is overwritten with the new data
     *
     * @param newData new object TimePeriod type to merge
     * @return TimePeriod Object merged
     */
    public TimePeriod merge(TimePeriod newData) {
        TimePeriod timePeriod = new TimePeriod(this);
        timePeriod.setEndDateTime((newData.getEndDateTime()) != null ? newData.getEndDateTime() : endDateTime);
        timePeriod.setStartDateTime((newData.getStartDateTime()) != null ? newData.getStartDateTime() : startDateTime);
        return timePeriod;
    }
}
