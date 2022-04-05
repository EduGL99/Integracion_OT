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
public class ChannelRef {
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

    public ChannelRef(ChannelRef element) {
        id = element.getId();
        href = element.getHref();
        name = element.getName();
        _atBaseType = element.get_atBaseType();
        _atSchemaLocation = element.get_atSchemaLocation();
        _atType = element.get_atType();
        _atReferredType = element.get_atReferredType();
    }

    /**
     * Method for merge an old object ChannelRef with new object ChannelRef.
     * The old data is overwritten with the new data
     *
     * @param newData new object ChannelRef type to merge
     * @return ChannelRef Object merged
     */
    public ChannelRef merge(ChannelRef newData) {
        ChannelRef channelRef = new ChannelRef(this);
        channelRef.setHref(newData.getHref() != null ? newData.getHref() : href);
        channelRef.setName(newData.getName() != null ? newData.getName() : name);
        channelRef.set_atBaseType(newData.get_atBaseType() != null ? newData.get_atBaseType() : _atBaseType);
        channelRef.set_atSchemaLocation(newData.get_atSchemaLocation() != null ? newData.get_atSchemaLocation() :
                _atSchemaLocation);
        channelRef.set_atType(newData.get_atType() != null ? newData.get_atType() : _atType);
        channelRef.set_atReferredType(newData.get_atReferredType() != null ? newData.get_atReferredType() :
                _atReferredType);
        return channelRef;
    }
}
