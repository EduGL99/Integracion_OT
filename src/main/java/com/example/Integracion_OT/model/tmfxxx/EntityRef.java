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
public class EntityRef {
    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("name")
    private String name;

    @JsonProperty("@baseType")
    private String _atBaseType;

    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;

    @JsonProperty("@type")
    private String _atType;

    @JsonProperty("@referredType")
    private String _atReferredType;
}
