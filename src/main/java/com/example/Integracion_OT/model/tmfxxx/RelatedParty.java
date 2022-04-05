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
public class RelatedParty {
    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("name")
    private String name;

    @JsonProperty("role")
    private String role;

    @JsonProperty("@baseType")
    private String _atBaseType;

    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;

    @JsonProperty("@type")
    private String _atType;

    @JsonProperty("@referredType")
    private String _atReferredType;

    public RelatedParty(RelatedParty element) {
        id = element.getId();
        href = element.getHref();
        name = element.getName();
        role = element.getRole();
        _atBaseType = element.get_atBaseType();
        _atSchemaLocation = element.get_atSchemaLocation();
        _atType = element.get_atType();
        _atReferredType = element.get_atReferredType();
    }

    /**
     * Method for merge an old object RelatedParty with new object RelatedParty.
     * The old data is overwritten with the new data
     *
     * @param newData new object RelatedParty type to merge
     * @return RelatedParty Object merged
     */
    public RelatedParty merge(RelatedParty newData) {
        RelatedParty relatedParty = new RelatedParty(this);
        relatedParty.setName((newData.getName() != null ? newData.getName() : name));
        relatedParty.setRole((newData.getRole() != null ? newData.getRole() : role));
        relatedParty.set_atBaseType((newData.get_atBaseType() != null ? newData.get_atBaseType() : _atBaseType));
        relatedParty.set_atSchemaLocation((newData.get_atSchemaLocation() != null ? newData.get_atSchemaLocation() :
                _atSchemaLocation));
        relatedParty.set_atType((newData.get_atType() != null ? newData.get_atType() : _atType));
        relatedParty.set_atReferredType((newData.get_atReferredType() != null ? newData.get_atReferredType() :
                _atReferredType));
        return relatedParty;
    }
}
