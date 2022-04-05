package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for WorkOrder
 */

public class WorkOrderResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public WorkOrderResponseProjection() {
    }

    public WorkOrderResponseProjection all$() {
        return all$(3);
    }

    public WorkOrderResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.WorkOrderTypeResponseProjection.workOrderType", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.WorkOrderTypeResponseProjection.workOrderType", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.WorkOrderTypeResponseProjection.workOrderType", 0) + 1);
            this.workOrderType(new WorkOrderTypeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.WorkOrderTypeResponseProjection.workOrderType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.WorkOrderTemplateResponseProjection.workOrderTemplate", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.WorkOrderTemplateResponseProjection.workOrderTemplate", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.WorkOrderTemplateResponseProjection.workOrderTemplate", 0) + 1);
            this.workOrderTemplate(new WorkOrderTemplateResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.WorkOrderTemplateResponseProjection.workOrderTemplate", 0)));
        }
        this.name();
        this.description();
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.UserResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.UserResponseProjection.owner", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.UserResponseProjection.owner", 0) + 1);
            this.owner(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.UserResponseProjection.owner", 0)));
        }
        this.creationDate();
        this.installDate();
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.UserResponseProjection.assignedTo", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.UserResponseProjection.assignedTo", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.UserResponseProjection.assignedTo", 0) + 1);
            this.assignedTo(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.UserResponseProjection.assignedTo", 0)));
        }
        this.index();
        this.status();
        this.priority();
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.EquipmentResponseProjection.equipmentToAdd", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.EquipmentResponseProjection.equipmentToAdd", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.EquipmentResponseProjection.equipmentToAdd", 0) + 1);
            this.equipmentToAdd(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.EquipmentResponseProjection.equipmentToAdd", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.EquipmentResponseProjection.equipmentToRemove", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.EquipmentResponseProjection.equipmentToRemove", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.EquipmentResponseProjection.equipmentToRemove", 0) + 1);
            this.equipmentToRemove(new EquipmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.EquipmentResponseProjection.equipmentToRemove", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.LinkResponseProjection.linksToAdd", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.LinkResponseProjection.linksToAdd", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.LinkResponseProjection.linksToAdd", 0) + 1);
            this.linksToAdd(new LinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.LinkResponseProjection.linksToAdd", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.LinkResponseProjection.linksToRemove", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.LinkResponseProjection.linksToRemove", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.LinkResponseProjection.linksToRemove", 0) + 1);
            this.linksToRemove(new LinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.LinkResponseProjection.linksToRemove", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.FileResponseProjection.images", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.FileResponseProjection.images", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.FileResponseProjection.images", 0) + 1);
            this.images(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.FileResponseProjection.images", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.FileResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.FileResponseProjection.files", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.FileResponseProjection.files", 0) + 1);
            this.files(new FileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.FileResponseProjection.files", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.CommentResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.CommentResponseProjection.comments", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.CommentResponseProjection.comments", 0) + 1);
            this.comments(new CommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.CommentResponseProjection.comments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.ActivityResponseProjection.activities", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.ActivityResponseProjection.activities", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.ActivityResponseProjection.activities", 0) + 1);
            this.activities(new ActivityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.ActivityResponseProjection.activities", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.LocationResponseProjection.location", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.LocationResponseProjection.location", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.LocationResponseProjection.location", 0) + 1);
            this.location(new LocationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.LocationResponseProjection.location", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.PropertyResponseProjection.properties", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.PropertyResponseProjection.properties", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.PropertyResponseProjection.properties", 0) + 1);
            this.properties(new PropertyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.PropertyResponseProjection.properties", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.ProjectResponseProjection.project", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.CheckListCategoryResponseProjection.checkListCategories", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.CheckListCategoryResponseProjection.checkListCategories", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.CheckListCategoryResponseProjection.checkListCategories", 0) + 1);
            this.checkListCategories(new CheckListCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.CheckListCategoryResponseProjection.checkListCategories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.HyperlinkResponseProjection.hyperlinks", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.HyperlinkResponseProjection.hyperlinks", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.HyperlinkResponseProjection.hyperlinks", 0) + 1);
            this.hyperlinks(new HyperlinkResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.HyperlinkResponseProjection.hyperlinks", 0)));
        }
        this.closeDate();
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.OrganizationResponseProjection.organizationFk", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.OrganizationResponseProjection.organizationFk", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.OrganizationResponseProjection.organizationFk", 0) + 1);
            this.organizationFk(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.OrganizationResponseProjection.organizationFk", 0)));
        }
        this.scheduledAt();
        if (projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.AppointmentResponseProjection.Appointments", 0) <= maxDepth) {
            projectionDepthOnFields.put("WorkOrderResponseProjection.AppointmentResponseProjection.Appointments", projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.AppointmentResponseProjection.Appointments", 0) + 1);
            this.Appointments(new AppointmentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("WorkOrderResponseProjection.AppointmentResponseProjection.Appointments", 0)));
        }
        this.typename();
        return this;
    }

    public WorkOrderResponseProjection id() {
        return id(null);
    }

    public WorkOrderResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection workOrderType(WorkOrderTypeResponseProjection subProjection) {
        return workOrderType(null, subProjection);
    }

    public WorkOrderResponseProjection workOrderType(String alias, WorkOrderTypeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrderType").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection workOrderTemplate(WorkOrderTemplateResponseProjection subProjection) {
        return workOrderTemplate(null, subProjection);
    }

    public WorkOrderResponseProjection workOrderTemplate(String alias, WorkOrderTemplateResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("workOrderTemplate").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection name() {
        return name(null);
    }

    public WorkOrderResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection description() {
        return description(null);
    }

    public WorkOrderResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection owner(UserResponseProjection subProjection) {
        return owner(null, subProjection);
    }

    public WorkOrderResponseProjection owner(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection creationDate() {
        return creationDate(null);
    }

    public WorkOrderResponseProjection creationDate(String alias) {
        fields.add(new GraphQLResponseField("creationDate").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection installDate() {
        return installDate(null);
    }

    public WorkOrderResponseProjection installDate(String alias) {
        fields.add(new GraphQLResponseField("installDate").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection assignedTo(UserResponseProjection subProjection) {
        return assignedTo(null, subProjection);
    }

    public WorkOrderResponseProjection assignedTo(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignedTo").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection index() {
        return index(null);
    }

    public WorkOrderResponseProjection index(String alias) {
        fields.add(new GraphQLResponseField("index").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection status() {
        return status(null);
    }

    public WorkOrderResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection priority() {
        return priority(null);
    }

    public WorkOrderResponseProjection priority(String alias) {
        fields.add(new GraphQLResponseField("priority").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection equipmentToAdd(EquipmentResponseProjection subProjection) {
        return equipmentToAdd(null, subProjection);
    }

    public WorkOrderResponseProjection equipmentToAdd(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentToAdd").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection equipmentToRemove(EquipmentResponseProjection subProjection) {
        return equipmentToRemove(null, subProjection);
    }

    public WorkOrderResponseProjection equipmentToRemove(String alias, EquipmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentToRemove").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection linksToAdd(LinkResponseProjection subProjection) {
        return linksToAdd(null, subProjection);
    }

    public WorkOrderResponseProjection linksToAdd(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("linksToAdd").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection linksToRemove(LinkResponseProjection subProjection) {
        return linksToRemove(null, subProjection);
    }

    public WorkOrderResponseProjection linksToRemove(String alias, LinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("linksToRemove").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection images(FileResponseProjection subProjection) {
        return images(null, subProjection);
    }

    public WorkOrderResponseProjection images(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("images").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection files(FileResponseProjection subProjection) {
        return files(null, subProjection);
    }

    public WorkOrderResponseProjection files(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection comments(CommentResponseProjection subProjection) {
        return comments(null, subProjection);
    }

    public WorkOrderResponseProjection comments(String alias, CommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection activities(ActivityResponseProjection subProjection) {
        return activities((String) null, subProjection);
    }

    public WorkOrderResponseProjection activities(String alias, ActivityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("activities").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection activities(WorkOrderActivitiesParametrizedInput input, ActivityResponseProjection subProjection) {
        return activities(null, input, subProjection);
    }

    public WorkOrderResponseProjection activities(String alias, WorkOrderActivitiesParametrizedInput input, ActivityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("activities").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection location(LocationResponseProjection subProjection) {
        return location(null, subProjection);
    }

    public WorkOrderResponseProjection location(String alias, LocationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("location").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection properties(PropertyResponseProjection subProjection) {
        return properties(null, subProjection);
    }

    public WorkOrderResponseProjection properties(String alias, PropertyResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("properties").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public WorkOrderResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection checkListCategories(CheckListCategoryResponseProjection subProjection) {
        return checkListCategories(null, subProjection);
    }

    public WorkOrderResponseProjection checkListCategories(String alias, CheckListCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("checkListCategories").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection hyperlinks(HyperlinkResponseProjection subProjection) {
        return hyperlinks(null, subProjection);
    }

    public WorkOrderResponseProjection hyperlinks(String alias, HyperlinkResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("hyperlinks").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection closeDate() {
        return closeDate(null);
    }

    public WorkOrderResponseProjection closeDate(String alias) {
        fields.add(new GraphQLResponseField("closeDate").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection organizationFk(OrganizationResponseProjection subProjection) {
        return organizationFk(null, subProjection);
    }

    public WorkOrderResponseProjection organizationFk(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organizationFk").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection scheduledAt() {
        return scheduledAt(null);
    }

    public WorkOrderResponseProjection scheduledAt(String alias) {
        fields.add(new GraphQLResponseField("scheduledAt").alias(alias));
        return this;
    }

    public WorkOrderResponseProjection Appointments(AppointmentResponseProjection subProjection) {
        return Appointments(null, subProjection);
    }

    public WorkOrderResponseProjection Appointments(String alias, AppointmentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("Appointments").alias(alias).projection(subProjection));
        return this;
    }

    public WorkOrderResponseProjection typename() {
        return typename(null);
    }

    public WorkOrderResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
