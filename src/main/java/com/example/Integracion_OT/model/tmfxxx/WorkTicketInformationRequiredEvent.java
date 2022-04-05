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
public class WorkTicketInformationRequiredEvent {
    @JsonProperty("eventId")
    private String eventId;

    @JsonProperty("eventTime")
    private String eventTime;

    @JsonProperty("eventType")
    private String eventType;

    @JsonProperty("correlationId")
    private String correlationId;

    @JsonProperty("domain")
    private String domain;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("timeOcurred")
    private String timeOcurred;

    @JsonProperty("fieldPath")
    private String fieldPath;

    @JsonProperty("event")
    private WorkTicketInformationRequiredEventPayload event;
}
