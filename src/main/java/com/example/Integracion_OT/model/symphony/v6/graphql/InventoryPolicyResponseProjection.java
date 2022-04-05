package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

import java.util.HashMap;
import java.util.Map;

/**
 * Response projection for InventoryPolicy
 */

public class InventoryPolicyResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public InventoryPolicyResponseProjection() {
    }

    public InventoryPolicyResponseProjection all$() {
        return all$(3);
    }

    public InventoryPolicyResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.BasicPermissionRuleResponseProjection.read", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryPolicyResponseProjection.BasicPermissionRuleResponseProjection.read", projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.BasicPermissionRuleResponseProjection.read", 0) + 1);
            this.read(new BasicPermissionRuleResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.BasicPermissionRuleResponseProjection.read", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.LocationCUDResponseProjection.location", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryPolicyResponseProjection.LocationCUDResponseProjection.location", projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.LocationCUDResponseProjection.location", 0) + 1);
            this.location(new LocationCUDResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.LocationCUDResponseProjection.location", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.DocumentCategoryCUDResponseProjection.documentCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryPolicyResponseProjection.DocumentCategoryCUDResponseProjection.documentCategory", projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.DocumentCategoryCUDResponseProjection.documentCategory", 0) + 1);
            this.documentCategory(new DocumentCategoryCUDResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.DocumentCategoryCUDResponseProjection.documentCategory", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.equipment", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryPolicyResponseProjection.CUDResponseProjection.equipment", projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.equipment", 0) + 1);
            this.equipment(new CUDResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.equipment", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.equipmentType", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryPolicyResponseProjection.CUDResponseProjection.equipmentType", projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.equipmentType", 0) + 1);
            this.equipmentType(new CUDResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.equipmentType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.locationType", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryPolicyResponseProjection.CUDResponseProjection.locationType", projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.locationType", 0) + 1);
            this.locationType(new CUDResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.locationType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.portType", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryPolicyResponseProjection.CUDResponseProjection.portType", projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.portType", 0) + 1);
            this.portType(new CUDResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.portType", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.serviceType", 0) <= maxDepth) {
            projectionDepthOnFields.put("InventoryPolicyResponseProjection.CUDResponseProjection.serviceType", projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.serviceType", 0) + 1);
            this.serviceType(new CUDResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("InventoryPolicyResponseProjection.CUDResponseProjection.serviceType", 0)));
        }
        this.typename();
        return this;
    }

    public InventoryPolicyResponseProjection read(BasicPermissionRuleResponseProjection subProjection) {
        return read(null, subProjection);
    }

    public InventoryPolicyResponseProjection read(String alias, BasicPermissionRuleResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("read").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection location(LocationCUDResponseProjection subProjection) {
        return location(null, subProjection);
    }

    public InventoryPolicyResponseProjection location(String alias, LocationCUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("location").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection documentCategory(DocumentCategoryCUDResponseProjection subProjection) {
        return documentCategory(null, subProjection);
    }

    public InventoryPolicyResponseProjection documentCategory(String alias, DocumentCategoryCUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("documentCategory").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection equipment(CUDResponseProjection subProjection) {
        return equipment(null, subProjection);
    }

    public InventoryPolicyResponseProjection equipment(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipment").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection equipmentType(CUDResponseProjection subProjection) {
        return equipmentType(null, subProjection);
    }

    public InventoryPolicyResponseProjection equipmentType(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("equipmentType").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection locationType(CUDResponseProjection subProjection) {
        return locationType(null, subProjection);
    }

    public InventoryPolicyResponseProjection locationType(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("locationType").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection portType(CUDResponseProjection subProjection) {
        return portType(null, subProjection);
    }

    public InventoryPolicyResponseProjection portType(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("portType").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection serviceType(CUDResponseProjection subProjection) {
        return serviceType(null, subProjection);
    }

    public InventoryPolicyResponseProjection serviceType(String alias, CUDResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("serviceType").alias(alias).projection(subProjection));
        return this;
    }

    public InventoryPolicyResponseProjection typename() {
        return typename(null);
    }

    public InventoryPolicyResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
