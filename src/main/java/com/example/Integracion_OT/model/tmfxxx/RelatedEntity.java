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
public class RelatedEntity {
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

    public RelatedEntity(RelatedEntity element) {
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
     * Method for merge an old object RelatedEntity with new object RelatedEntity.
     * The old data is overwritten with the new data
     *
     * @param newData new object RelatedEntity type to merge
     * @return RelatedEntity Object merged
     */
    public RelatedEntity merge(RelatedEntity newData) {
        RelatedEntity relatedEntity = new RelatedEntity(this);
        relatedEntity.setName((newData.getName() != null ? newData.getName() : name));
        relatedEntity.setRole((newData.getRole() != null ? newData.getRole() : role));
        relatedEntity.set_atBaseType((newData.get_atBaseType() != null ? newData.get_atBaseType() : _atBaseType));
        relatedEntity.set_atSchemaLocation((newData.get_atSchemaLocation() != null ? newData.get_atSchemaLocation() :
                _atSchemaLocation));
        relatedEntity.set_atType((newData.get_atType() != null ? newData.get_atType() : _atType));
        relatedEntity.set_atReferredType((newData.get_atReferredType() != null ? newData.get_atReferredType() :
                _atReferredType));
        return relatedEntity;
    }
}
