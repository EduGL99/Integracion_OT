package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderTO implements java.io.Serializable, NamedNodeTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private WorkOrderTypeTO workOrderType;
    private WorkOrderTemplateTO workOrderTemplate;
    @javax.validation.constraints.NotNull
    private String name;
    private String description;
    @javax.validation.constraints.NotNull
    private UserTO owner;
    @javax.validation.constraints.NotNull
    private String creationDate;
    private String installDate;
    private UserTO assignedTo;
    private int index;
    @javax.validation.constraints.NotNull
    private WorkOrderStatusTO status;
    @javax.validation.constraints.NotNull
    private WorkOrderPriorityTO priority;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentTO> equipmentToAdd;
    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentTO> equipmentToRemove;
    @javax.validation.constraints.NotNull
    private java.util.List<LinkTO> linksToAdd;
    @javax.validation.constraints.NotNull
    private java.util.List<LinkTO> linksToRemove;
    @javax.validation.constraints.NotNull
    private java.util.List<FileTO> images;
    @javax.validation.constraints.NotNull
    private java.util.List<FileTO> files;
    @javax.validation.constraints.NotNull
    private java.util.List<CommentTO> comments;
    @javax.validation.constraints.NotNull
    private java.util.List<ActivityTO> activities;
    private LocationTO location;
    @javax.validation.constraints.NotNull
    private java.util.List<PropertyTO> properties;
    private ProjectTO project;
    @javax.validation.constraints.NotNull
    private java.util.List<CheckListCategoryTO> checkListCategories;
    @javax.validation.constraints.NotNull
    private java.util.List<HyperlinkTO> hyperlinks;
    private String closeDate;
    private OrganizationTO organizationFk;
    private String scheduledAt;
    private java.util.List<AppointmentTO> Appointments;

    public WorkOrderTO() {
    }

    public WorkOrderTO(String id, WorkOrderTypeTO workOrderType, WorkOrderTemplateTO workOrderTemplate, String name, String description, UserTO owner, String creationDate, String installDate, UserTO assignedTo, int index, WorkOrderStatusTO status, WorkOrderPriorityTO priority, java.util.List<EquipmentTO> equipmentToAdd, java.util.List<EquipmentTO> equipmentToRemove, java.util.List<LinkTO> linksToAdd, java.util.List<LinkTO> linksToRemove, java.util.List<FileTO> images, java.util.List<FileTO> files, java.util.List<CommentTO> comments, java.util.List<ActivityTO> activities, LocationTO location, java.util.List<PropertyTO> properties, ProjectTO project, java.util.List<CheckListCategoryTO> checkListCategories, java.util.List<HyperlinkTO> hyperlinks, String closeDate, OrganizationTO organizationFk, String scheduledAt, java.util.List<AppointmentTO> Appointments) {
        this.id = id;
        this.workOrderType = workOrderType;
        this.workOrderTemplate = workOrderTemplate;
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.creationDate = creationDate;
        this.installDate = installDate;
        this.assignedTo = assignedTo;
        this.index = index;
        this.status = status;
        this.priority = priority;
        this.equipmentToAdd = equipmentToAdd;
        this.equipmentToRemove = equipmentToRemove;
        this.linksToAdd = linksToAdd;
        this.linksToRemove = linksToRemove;
        this.images = images;
        this.files = files;
        this.comments = comments;
        this.activities = activities;
        this.location = location;
        this.properties = properties;
        this.project = project;
        this.checkListCategories = checkListCategories;
        this.hyperlinks = hyperlinks;
        this.closeDate = closeDate;
        this.organizationFk = organizationFk;
        this.scheduledAt = scheduledAt;
        this.Appointments = Appointments;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the object.
     */
    public String getId() {
        return id;
    }

    /**
     * The id of the object.
     */
    public void setId(String id) {
        this.id = id;
    }

    public WorkOrderTypeTO getWorkOrderType() {
        return workOrderType;
    }

    public void setWorkOrderType(WorkOrderTypeTO workOrderType) {
        this.workOrderType = workOrderType;
    }

    public WorkOrderTemplateTO getWorkOrderTemplate() {
        return workOrderTemplate;
    }

    public void setWorkOrderTemplate(WorkOrderTemplateTO workOrderTemplate) {
        this.workOrderTemplate = workOrderTemplate;
    }

    /**
     * The name of the object.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the object.
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserTO getOwner() {
        return owner;
    }

    public void setOwner(UserTO owner) {
        this.owner = owner;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getInstallDate() {
        return installDate;
    }

    public void setInstallDate(String installDate) {
        this.installDate = installDate;
    }

    public UserTO getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(UserTO assignedTo) {
        this.assignedTo = assignedTo;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public WorkOrderStatusTO getStatus() {
        return status;
    }

    public void setStatus(WorkOrderStatusTO status) {
        this.status = status;
    }

    public WorkOrderPriorityTO getPriority() {
        return priority;
    }

    public void setPriority(WorkOrderPriorityTO priority) {
        this.priority = priority;
    }

    public java.util.List<EquipmentTO> getEquipmentToAdd() {
        return equipmentToAdd;
    }

    public void setEquipmentToAdd(java.util.List<EquipmentTO> equipmentToAdd) {
        this.equipmentToAdd = equipmentToAdd;
    }

    public java.util.List<EquipmentTO> getEquipmentToRemove() {
        return equipmentToRemove;
    }

    public void setEquipmentToRemove(java.util.List<EquipmentTO> equipmentToRemove) {
        this.equipmentToRemove = equipmentToRemove;
    }

    public java.util.List<LinkTO> getLinksToAdd() {
        return linksToAdd;
    }

    public void setLinksToAdd(java.util.List<LinkTO> linksToAdd) {
        this.linksToAdd = linksToAdd;
    }

    public java.util.List<LinkTO> getLinksToRemove() {
        return linksToRemove;
    }

    public void setLinksToRemove(java.util.List<LinkTO> linksToRemove) {
        this.linksToRemove = linksToRemove;
    }

    public java.util.List<FileTO> getImages() {
        return images;
    }

    public void setImages(java.util.List<FileTO> images) {
        this.images = images;
    }

    public java.util.List<FileTO> getFiles() {
        return files;
    }

    public void setFiles(java.util.List<FileTO> files) {
        this.files = files;
    }

    public java.util.List<CommentTO> getComments() {
        return comments;
    }

    public void setComments(java.util.List<CommentTO> comments) {
        this.comments = comments;
    }

    public java.util.List<ActivityTO> getActivities() {
        return activities;
    }

    public void setActivities(java.util.List<ActivityTO> activities) {
        this.activities = activities;
    }

    public LocationTO getLocation() {
        return location;
    }

    public void setLocation(LocationTO location) {
        this.location = location;
    }

    public java.util.List<PropertyTO> getProperties() {
        return properties;
    }

    public void setProperties(java.util.List<PropertyTO> properties) {
        this.properties = properties;
    }

    public ProjectTO getProject() {
        return project;
    }

    public void setProject(ProjectTO project) {
        this.project = project;
    }

    public java.util.List<CheckListCategoryTO> getCheckListCategories() {
        return checkListCategories;
    }

    public void setCheckListCategories(java.util.List<CheckListCategoryTO> checkListCategories) {
        this.checkListCategories = checkListCategories;
    }

    public java.util.List<HyperlinkTO> getHyperlinks() {
        return hyperlinks;
    }

    public void setHyperlinks(java.util.List<HyperlinkTO> hyperlinks) {
        this.hyperlinks = hyperlinks;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public OrganizationTO getOrganizationFk() {
        return organizationFk;
    }

    public void setOrganizationFk(OrganizationTO organizationFk) {
        this.organizationFk = organizationFk;
    }

    public String getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(String scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    public java.util.List<AppointmentTO> getAppointments() {
        return Appointments;
    }

    public void setAppointments(java.util.List<AppointmentTO> Appointments) {
        this.Appointments = Appointments;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (workOrderType != null) {
            joiner.add("workOrderType: " + GraphQLRequestSerializer.getEntry(workOrderType));
        }
        if (workOrderTemplate != null) {
            joiner.add("workOrderTemplate: " + GraphQLRequestSerializer.getEntry(workOrderTemplate));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (owner != null) {
            joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner));
        }
        if (creationDate != null) {
            joiner.add("creationDate: " + GraphQLRequestSerializer.getEntry(creationDate));
        }
        if (installDate != null) {
            joiner.add("installDate: " + GraphQLRequestSerializer.getEntry(installDate));
        }
        if (assignedTo != null) {
            joiner.add("assignedTo: " + GraphQLRequestSerializer.getEntry(assignedTo));
        }
        joiner.add("index: " + GraphQLRequestSerializer.getEntry(index));
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (priority != null) {
            joiner.add("priority: " + GraphQLRequestSerializer.getEntry(priority));
        }
        if (equipmentToAdd != null) {
            joiner.add("equipmentToAdd: " + GraphQLRequestSerializer.getEntry(equipmentToAdd));
        }
        if (equipmentToRemove != null) {
            joiner.add("equipmentToRemove: " + GraphQLRequestSerializer.getEntry(equipmentToRemove));
        }
        if (linksToAdd != null) {
            joiner.add("linksToAdd: " + GraphQLRequestSerializer.getEntry(linksToAdd));
        }
        if (linksToRemove != null) {
            joiner.add("linksToRemove: " + GraphQLRequestSerializer.getEntry(linksToRemove));
        }
        if (images != null) {
            joiner.add("images: " + GraphQLRequestSerializer.getEntry(images));
        }
        if (files != null) {
            joiner.add("files: " + GraphQLRequestSerializer.getEntry(files));
        }
        if (comments != null) {
            joiner.add("comments: " + GraphQLRequestSerializer.getEntry(comments));
        }
        if (activities != null) {
            joiner.add("activities: " + GraphQLRequestSerializer.getEntry(activities));
        }
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        if (properties != null) {
            joiner.add("properties: " + GraphQLRequestSerializer.getEntry(properties));
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project));
        }
        if (checkListCategories != null) {
            joiner.add("checkListCategories: " + GraphQLRequestSerializer.getEntry(checkListCategories));
        }
        if (hyperlinks != null) {
            joiner.add("hyperlinks: " + GraphQLRequestSerializer.getEntry(hyperlinks));
        }
        if (closeDate != null) {
            joiner.add("closeDate: " + GraphQLRequestSerializer.getEntry(closeDate));
        }
        if (organizationFk != null) {
            joiner.add("organizationFk: " + GraphQLRequestSerializer.getEntry(organizationFk));
        }
        if (scheduledAt != null) {
            joiner.add("scheduledAt: " + GraphQLRequestSerializer.getEntry(scheduledAt));
        }
        if (Appointments != null) {
            joiner.add("Appointments: " + GraphQLRequestSerializer.getEntry(Appointments));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private WorkOrderTypeTO workOrderType;
        private WorkOrderTemplateTO workOrderTemplate;
        private String name;
        private String description;
        private UserTO owner;
        private String creationDate;
        private String installDate;
        private UserTO assignedTo;
        private int index;
        private WorkOrderStatusTO status;
        private WorkOrderPriorityTO priority;
        private java.util.List<EquipmentTO> equipmentToAdd;
        private java.util.List<EquipmentTO> equipmentToRemove;
        private java.util.List<LinkTO> linksToAdd;
        private java.util.List<LinkTO> linksToRemove;
        private java.util.List<FileTO> images;
        private java.util.List<FileTO> files;
        private java.util.List<CommentTO> comments;
        private java.util.List<ActivityTO> activities;
        private LocationTO location;
        private java.util.List<PropertyTO> properties;
        private ProjectTO project;
        private java.util.List<CheckListCategoryTO> checkListCategories;
        private java.util.List<HyperlinkTO> hyperlinks;
        private String closeDate;
        private OrganizationTO organizationFk;
        private String scheduledAt;
        private java.util.List<AppointmentTO> Appointments;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setWorkOrderType(WorkOrderTypeTO workOrderType) {
            this.workOrderType = workOrderType;
            return this;
        }

        public Builder setWorkOrderTemplate(WorkOrderTemplateTO workOrderTemplate) {
            this.workOrderTemplate = workOrderTemplate;
            return this;
        }

        /**
         * The name of the object.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setOwner(UserTO owner) {
            this.owner = owner;
            return this;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder setInstallDate(String installDate) {
            this.installDate = installDate;
            return this;
        }

        public Builder setAssignedTo(UserTO assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }

        public Builder setIndex(int index) {
            this.index = index;
            return this;
        }

        public Builder setStatus(WorkOrderStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setPriority(WorkOrderPriorityTO priority) {
            this.priority = priority;
            return this;
        }

        public Builder setEquipmentToAdd(java.util.List<EquipmentTO> equipmentToAdd) {
            this.equipmentToAdd = equipmentToAdd;
            return this;
        }

        public Builder setEquipmentToRemove(java.util.List<EquipmentTO> equipmentToRemove) {
            this.equipmentToRemove = equipmentToRemove;
            return this;
        }

        public Builder setLinksToAdd(java.util.List<LinkTO> linksToAdd) {
            this.linksToAdd = linksToAdd;
            return this;
        }

        public Builder setLinksToRemove(java.util.List<LinkTO> linksToRemove) {
            this.linksToRemove = linksToRemove;
            return this;
        }

        public Builder setImages(java.util.List<FileTO> images) {
            this.images = images;
            return this;
        }

        public Builder setFiles(java.util.List<FileTO> files) {
            this.files = files;
            return this;
        }

        public Builder setComments(java.util.List<CommentTO> comments) {
            this.comments = comments;
            return this;
        }

        public Builder setActivities(java.util.List<ActivityTO> activities) {
            this.activities = activities;
            return this;
        }

        public Builder setLocation(LocationTO location) {
            this.location = location;
            return this;
        }

        public Builder setProperties(java.util.List<PropertyTO> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProject(ProjectTO project) {
            this.project = project;
            return this;
        }

        public Builder setCheckListCategories(java.util.List<CheckListCategoryTO> checkListCategories) {
            this.checkListCategories = checkListCategories;
            return this;
        }

        public Builder setHyperlinks(java.util.List<HyperlinkTO> hyperlinks) {
            this.hyperlinks = hyperlinks;
            return this;
        }

        public Builder setCloseDate(String closeDate) {
            this.closeDate = closeDate;
            return this;
        }

        public Builder setOrganizationFk(OrganizationTO organizationFk) {
            this.organizationFk = organizationFk;
            return this;
        }

        public Builder setScheduledAt(String scheduledAt) {
            this.scheduledAt = scheduledAt;
            return this;
        }

        public Builder setAppointments(java.util.List<AppointmentTO> Appointments) {
            this.Appointments = Appointments;
            return this;
        }


        public WorkOrderTO build() {
            return new WorkOrderTO(id, workOrderType, workOrderTemplate, name, description, owner, creationDate, installDate, assignedTo, index, status, priority, equipmentToAdd, equipmentToRemove, linksToAdd, linksToRemove, images, files, comments, activities, location, properties, project, checkListCategories, hyperlinks, closeDate, organizationFk, scheduledAt, Appointments);
        }

    }
}
