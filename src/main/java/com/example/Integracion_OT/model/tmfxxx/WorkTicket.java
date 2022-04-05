package com.example.Integracion_OT.model.tmfxxx;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkTicket {
    @JsonProperty("id")
    private String id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("creationDate")
    private String creationDate;

    @JsonProperty("description")
    private String description;

    @JsonProperty("expectedResolutionDate")
    private String expectedResolutionDate;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("lastUpdate")
    private String lastUpdate;

    @JsonProperty("name")
    private String name;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("requestedResolutionDate")
    private String requestedResolutionDate;

    @JsonProperty("resolutionDate")
    private String resolutionDate;

    @JsonProperty("severity")
    private String severity;

    @JsonProperty("statusChangeDate")
    private String statusChangeDate;

    @JsonProperty("statusChangeReason")
    private String statusChangeReason;

    @JsonProperty("ticketType")
    private String ticketType;

    @JsonProperty("attachment")
    private List<AttachmentRefOrValue> attachment;

    @JsonProperty("channel")
    private ChannelRef channel;

    @JsonProperty("characteristic")
    private List<Characteristic> characteristic;

    @JsonProperty("checkList")
    private List<CheckList> checklist;

    @JsonProperty("note")
    private List<Note> note;

    @JsonProperty("relatedEntity")
    private List<RelatedEntity> relatedEntity;

    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty;

    @JsonProperty("status")
    private WorkTicketStatusType status;

    @JsonProperty("statusChange")
    private List<StatusChange> statusChange;

    @JsonProperty("workTicketRelationship")
    private List<WorkTicketRelationship> workTicketRelationship;

    @JsonProperty("@baseType")
    private String _atBaseType;

    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;

    @JsonProperty("@type")
    private String _atType;

    public WorkTicket(WorkTicket element) {
        id = element.getId();
        href = element.getHref();
        creationDate = element.getCreationDate();
        description = element.getDescription();
        expectedResolutionDate = element.getExpectedResolutionDate();
        externalId = element.getExternalId();
        lastUpdate = element.getLastUpdate();
        name = element.getName();
        priority = element.getPriority();
        requestedResolutionDate = element.getRequestedResolutionDate();
        resolutionDate = element.getResolutionDate();
        severity = element.getSeverity();
        statusChangeDate = element.getStatusChangeDate();
        statusChangeReason = element.getStatusChangeReason();
        ticketType = element.getTicketType();
        attachment = element.getAttachment();
        channel = element.getChannel();
        characteristic = element.getCharacteristic();
        checklist = element.getChecklist();
        note = element.getNote();
        relatedEntity = element.getRelatedEntity();
        relatedParty = element.getRelatedParty();
        status = element.getStatus();
        statusChange = element.getStatusChange();
        workTicketRelationship = element.getWorkTicketRelationship();
        _atBaseType = element.get_atBaseType();
        _atSchemaLocation = element.get_atSchemaLocation();
        _atType = element.get_atType();
    }

    /**
     * Method for merge an old object WorkTicket with new object WorkTicket.
     * The old data is overwritten with the new data
     *
     * @param newData new object WorkTicket type to merge
     * @return WorkTicket Object merged
     */
    public WorkTicket merge(WorkTicket newData) {
        WorkTicket workTicket = new WorkTicket(this);
        workTicket.setCreationDate((newData.getCreationDate() != null ? newData.getCreationDate() : creationDate));
        workTicket.setDescription((newData.getDescription() != null ? newData.getDescription() : description));
        workTicket.setExpectedResolutionDate((newData.getExpectedResolutionDate() != null ?
                newData.getExpectedResolutionDate() : expectedResolutionDate));
        workTicket.setExternalId((newData.getExternalId() != null ? newData.getExternalId() : externalId));
        workTicket.setLastUpdate((newData.getLastUpdate() != null ? newData.getLastUpdate() : lastUpdate));
        workTicket.setName((newData.getName() != null ? newData.getName() : name));
        workTicket.setPriority((newData.getPriority() != null ? newData.getPriority() : priority));
        workTicket.setRequestedResolutionDate((newData.getRequestedResolutionDate() != null ?
                newData.getRequestedResolutionDate() : requestedResolutionDate));
        workTicket.setResolutionDate((newData.getResolutionDate() != null ? newData.getResolutionDate() :
                resolutionDate));
        workTicket.setSeverity((newData.getSeverity() != null ? newData.getSeverity() : severity));
        workTicket.setStatusChangeDate((newData.getStatusChangeDate() != null ? newData.getStatusChangeDate() :
                statusChangeDate));
        workTicket.setStatusChangeReason((newData.getStatusChangeReason() != null ? newData.getStatusChangeReason() :
                statusChangeReason));
        workTicket.setTicketType((newData.getTicketType() != null ? newData.getTicketType() : ticketType));
        workTicket.setAttachment(mergeListAttachment(newData.getAttachment()));
        workTicket.setChannel((newData.getChannel() != null ? workTicket.getChannel().merge(newData.getChannel()) :
                channel));
        workTicket.setCharacteristic(mergeListCharacteristic(newData.getCharacteristic()));
        workTicket.setChecklist(mergeListCheckList(newData.getChecklist()));
        workTicket.setNote(mergeNote(newData.getNote()));
        workTicket.setRelatedEntity(mergeRelatedEntity(newData.getRelatedEntity()));
        workTicket.setRelatedParty(mergeRelatedParty(newData.getRelatedParty()));
        workTicket.setStatus((newData.getStatus() != null ? newData.getStatus() : status));
        workTicket.setStatusChange((newData.getStatusChange() != null ? newData.getStatusChange() : statusChange));
        workTicket.setWorkTicketRelationship(mergeWorkTicketRelationship(newData.getWorkTicketRelationship()));
        workTicket.set_atBaseType((newData.get_atBaseType() != null ? newData.get_atBaseType() : _atBaseType));
        workTicket.set_atSchemaLocation((newData.get_atSchemaLocation() != null ? newData.get_atSchemaLocation() :
                _atSchemaLocation));
        workTicket.set_atType((newData.get_atType() != null ? newData.get_atType() : _atType));
        return workTicket;
    }

    /**
     * Method for merge a list of old object AttachmentRefOrValue with new list objects AttachmentRefOrValue.
     *
     * @param newListItem List objects AttachmentRefOrValue type with new data
     * @return List<Item> List merged
     */
    private List<AttachmentRefOrValue> mergeListAttachment(List<AttachmentRefOrValue> newListItem) {
        List<AttachmentRefOrValue> itemsMerged = new ArrayList<>();
        boolean existNewDataItems = newListItem != null;
        if (this.getAttachment() != null) {
            this.getAttachment().forEach(item -> {
                AttachmentRefOrValue itemMerged = item;
                if (existNewDataItems && newListItem.stream().filter(newDataItem -> newDataItem.getId() != null)
                        .anyMatch(newDataItem -> newDataItem.getId().equals(item.getId()))) {
                    itemMerged = itemMerged.merge(newListItem.stream()
                            .filter(newDataItem -> newDataItem.getId().equals(item.getId()))
                            .collect(Collectors.toList()).get(0));
                }
                itemsMerged.add(itemMerged);
            });
            if (existNewDataItems) {
                newListItem.forEach(newDataItem -> {
                    if (this.getAttachment().stream()
                            .noneMatch(oldItem -> oldItem.getId().equals(newDataItem.getId()))) {
                        itemsMerged.add(newDataItem);
                    }
                });
            }
        } else {
            if (existNewDataItems) {
                itemsMerged.addAll(newListItem);
            }
        }
        return (itemsMerged.size() > 0 ? itemsMerged : null);
    }

    /**
     * Method for merge a list of old object Characteristic with new list objects Characteristic.
     *
     * @param newListItem List objects Characteristic type with new data
     * @return Characteristic List merged
     */
    private List<Characteristic> mergeListCharacteristic(List<Characteristic> newListItem) {
        List<Characteristic> itemsMerged = new ArrayList<>();
        boolean existNewDataItems = newListItem != null;
        if (this.getCharacteristic() != null) {
            this.getCharacteristic().forEach(item -> {
                Characteristic itemMerged = item;
                if (existNewDataItems && newListItem.stream().filter(newDataItem -> newDataItem.getId() != null)
                        .anyMatch(newDataItem -> newDataItem.getId().equals(item.getId()))) {
                    itemMerged = itemMerged.merge(newListItem.stream()
                            .filter(newDataItem -> newDataItem.getId().equals(item.getId()))
                            .collect(Collectors.toList()).get(0));
                }
                itemsMerged.add(itemMerged);
            });
            if (existNewDataItems) {
                newListItem.forEach(newDataItem -> {
                    if (this.getCharacteristic().stream()
                            .noneMatch(oldItem -> oldItem.getId().equals(newDataItem.getId()))) {
                        itemsMerged.add(newDataItem);
                    }
                });
            }
        } else {
            if (existNewDataItems) {
                itemsMerged.addAll(newListItem);
            }
        }
        return (itemsMerged.size() > 0 ? itemsMerged : null);
    }

    /**
     * Method for merge a list of old object CheckList with new list objects CheckList.
     *
     * @param newListItem List objects CheckList type with new data
     * @return CheckList List merged
     */
    private List<CheckList> mergeListCheckList(List<CheckList> newListItem) {
        List<CheckList> itemsMerged = new ArrayList<>();
        boolean existNewDataItems = newListItem != null;
        if (this.getChecklist() != null) {
            this.getChecklist().forEach(item -> {
                CheckList itemMerged = item;
                if (existNewDataItems && newListItem.stream().filter(newDataItem -> newDataItem.getId() != null)
                        .anyMatch(newDataItem -> newDataItem.getId().equals(item.getId()))) {
                    itemMerged = itemMerged.merge(newListItem.stream()
                            .filter(newDataItem -> newDataItem.getId().equals(item.getId()))
                            .collect(Collectors.toList()).get(0));
                }
                itemsMerged.add(itemMerged);
            });
            if (existNewDataItems) {
                newListItem.forEach(newDataItem -> {
                    if (this.getChecklist().stream()
                            .noneMatch(oldItem -> oldItem.getId().equals(newDataItem.getId()))) {
                        itemsMerged.add(newDataItem);
                    }
                });
            }
        } else {
            if (existNewDataItems) {
                itemsMerged.addAll(newListItem);
            }
        }
        return (itemsMerged.size() > 0 ? itemsMerged : null);
    }

    /**
     * Method for merge a list of old object Note with new list objects Note.
     *
     * @param newListItem List objects Note type with new data
     * @return Note List merged
     */
    private List<Note> mergeNote(List<Note> newListItem) {
        List<Note> itemsMerged = new ArrayList<>();
        boolean existNewDataItems = newListItem != null;
        if (this.getNote() != null) {
            this.getNote().forEach(item -> {
                Note itemMerged = item;
                if (existNewDataItems && newListItem.stream().filter(newDataItem -> newDataItem.getId() != null)
                        .anyMatch(newDataItem -> newDataItem.getId().equals(item.getId()))) {
                    itemMerged = itemMerged.merge(newListItem.stream()
                            .filter(newDataItem -> newDataItem.getId().equals(item.getId()))
                            .collect(Collectors.toList()).get(0));
                }
                itemsMerged.add(itemMerged);
            });
            if (existNewDataItems) {
                newListItem.forEach(newDataItem -> {
                    if (this.getNote().stream()
                            .noneMatch(oldItem -> oldItem.getId().equals(newDataItem.getId()))) {
                        itemsMerged.add(newDataItem);
                    }
                });
            }
        } else {
            if (existNewDataItems) {
                itemsMerged.addAll(newListItem);
            }
        }
        return (itemsMerged.size() > 0 ? itemsMerged : null);
    }

    /**
     * Method for merge a list of old object RelatedEntity with new list objects RelatedEntity.
     *
     * @param newListItem List objects RelatedEntity type with new data
     * @return RelatedEntity List merged
     */
    private List<RelatedEntity> mergeRelatedEntity(List<RelatedEntity> newListItem) {
        List<RelatedEntity> itemsMerged = new ArrayList<>();
        boolean existNewDataItems = newListItem != null;
        if (this.getRelatedEntity() != null) {
            this.getRelatedEntity().forEach(item -> {
                RelatedEntity itemMerged = item;
                if (existNewDataItems && newListItem.stream().filter(newDataItem -> newDataItem.getId() != null)
                        .anyMatch(newDataItem -> newDataItem.getId().equals(item.getId()))) {
                    itemMerged = itemMerged.merge(newListItem.stream()
                            .filter(newDataItem -> newDataItem.getId().equals(item.getId()))
                            .collect(Collectors.toList()).get(0));
                }
                itemsMerged.add(itemMerged);
            });
            if (existNewDataItems) {
                newListItem.forEach(newDataItem -> {
                    if (this.getRelatedEntity().stream()
                            .noneMatch(oldItem -> oldItem.getId().equals(newDataItem.getId()))) {
                        itemsMerged.add(newDataItem);
                    }
                });
            }
        } else {
            if (existNewDataItems) {
                itemsMerged.addAll(newListItem);
            }
        }
        return (itemsMerged.size() > 0 ? itemsMerged : null);
    }

    /**
     * Method for merge a list of old object RelatedParty with new list objects RelatedParty.
     *
     * @param newListItem List objects RelatedParty type with new data
     * @return RelatedParty List merged
     */
    private List<RelatedParty> mergeRelatedParty(List<RelatedParty> newListItem) {
        List<RelatedParty> itemsMerged = new ArrayList<>();
        boolean existNewDataItems = newListItem != null;
        if (this.getRelatedParty() != null) {
            this.getRelatedParty().forEach(item -> {
                RelatedParty itemMerged = item;
                if (existNewDataItems && newListItem.stream().filter(newDataItem -> newDataItem.getId() != null)
                        .anyMatch(newDataItem -> newDataItem.getId().equals(item.getId()))) {
                    itemMerged = itemMerged.merge(newListItem.stream()
                            .filter(newDataItem -> newDataItem.getId().equals(item.getId()))
                            .collect(Collectors.toList()).get(0));
                }
                itemsMerged.add(itemMerged);
            });
            if (existNewDataItems) {
                newListItem.forEach(newDataItem -> {
                    if (this.getRelatedParty().stream()
                            .noneMatch(oldItem -> oldItem.getId().equals(newDataItem.getId()))) {
                        itemsMerged.add(newDataItem);
                    }
                });
            }
        } else {
            if (existNewDataItems) {
                itemsMerged.addAll(newListItem);
            }
        }
        return (itemsMerged.size() > 0 ? itemsMerged : null);
    }

    /**
     * Method for merge a list of old object WorkTicketRelationship with new list objects WorkTicketRelationship.
     *
     * @param newListItem List objects WorkTicketRelationship type with new data
     * @return WorkTicketRelationship List merged
     */
    private List<WorkTicketRelationship> mergeWorkTicketRelationship(List<WorkTicketRelationship> newListItem) {
        List<WorkTicketRelationship> itemsMerged = new ArrayList<>();
        boolean existNewDataItems = newListItem != null;
        if (this.getWorkTicketRelationship() != null) {
            this.getWorkTicketRelationship().forEach(item -> {
                WorkTicketRelationship itemMerged = item;
                if (existNewDataItems && newListItem.stream().filter(newDataItem -> newDataItem.getId() != null)
                        .anyMatch(newDataItem -> newDataItem.getId().equals(item.getId()))) {
                    itemMerged = itemMerged.merge(newListItem.stream()
                            .filter(newDataItem -> newDataItem.getId().equals(item.getId()))
                            .collect(Collectors.toList()).get(0));
                }
                itemsMerged.add(itemMerged);
            });
            if (existNewDataItems) {
                newListItem.forEach(newDataItem -> {
                    if (this.getWorkTicketRelationship().stream()
                            .noneMatch(oldItem -> oldItem.getId().equals(newDataItem.getId()))) {
                        itemsMerged.add(newDataItem);
                    }
                });
            }
        } else {
            if (existNewDataItems) {
                itemsMerged.addAll(newListItem);
            }
        }
        return (itemsMerged.size() > 0 ? itemsMerged : null);
    }
}
