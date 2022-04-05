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
public class AttachmentRefOrValue {
    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("attachmentType")
    private String attachmentType;

    @JsonProperty("content")
    private String content;

    @JsonProperty("description")
    private String description;

    @JsonProperty("mimeType")
    private String mimeType;

    @JsonProperty("name")
    private String name;

    @JsonProperty("url")
    private String url;

    @JsonProperty("size")
    private Quantity size;

    @JsonProperty("validFor")
    private TimePeriod validFor;

    @JsonProperty("@baseType")
    private String _atBaseType;

    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;

    @JsonProperty("@type")
    private String _atType;

    @JsonProperty("@referredType")
    private String _atReferredType;

    public AttachmentRefOrValue(AttachmentRefOrValue element) {
        id = element.getId();
        href = element.getHref();
        attachmentType = element.getAttachmentType();
        content = element.getContent();
        description = element.getDescription();
        mimeType = element.getMimeType();
        name = element.getName();
        url = element.getUrl();
        size = element.getSize();
        validFor = element.getValidFor();
        _atBaseType = element.get_atBaseType();
        _atSchemaLocation = element.get_atSchemaLocation();
        _atType = element.get_atType();
        _atReferredType = element.get_atReferredType();
    }

    /**
     * Method for merge an old object AttachmentRefOrValue with new object AttachmentRefOrValue.
     * The old data is overwritten with the new data
     *
     * @param newData new object AttachmentRefOrValue type to merge
     * @return AttachmentRefOrValue Object merged
     */
    public AttachmentRefOrValue merge(AttachmentRefOrValue newData) {
        AttachmentRefOrValue attachmentRefOrValue = new AttachmentRefOrValue(this);
        attachmentRefOrValue.setAttachmentType((newData.getAttachmentType() != null ? newData.getAttachmentType() :
                attachmentType));
        attachmentRefOrValue.setContent((newData.getContent() != null ? newData.getContent() : content));
        attachmentRefOrValue.setDescription((newData.getDescription() != null ? newData.getDescription() :
                description));
        attachmentRefOrValue.setMimeType((newData.getMimeType() != null ? newData.getMimeType() : mimeType));
        attachmentRefOrValue.setName((newData.getName() != null ? newData.getName() : name));
        attachmentRefOrValue.setUrl((newData.getUrl() != null ? newData.getUrl() : url));
        attachmentRefOrValue.setSize((newData.getSize() != null ?
                attachmentRefOrValue.getSize().merge(newData.getSize()) : size));
        attachmentRefOrValue.setValidFor((newData.getValidFor() != null ?
                attachmentRefOrValue.getValidFor().merge(newData.getValidFor()) : validFor));
        attachmentRefOrValue.set_atBaseType((newData.get_atBaseType() != null ? newData.get_atBaseType() :
                _atBaseType));
        attachmentRefOrValue.set_atSchemaLocation((newData.get_atSchemaLocation() != null ?
                newData.get_atSchemaLocation() : _atSchemaLocation));
        attachmentRefOrValue.set_atType((newData.get_atType() != null ? newData.get_atType() : _atType));
        attachmentRefOrValue.set_atReferredType((newData.get_atReferredType() != null ? newData.get_atReferredType() :
                _atReferredType));
        return attachmentRefOrValue;
    }
}
