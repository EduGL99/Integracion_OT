package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechnicianWorkOrderUploadInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String workOrderId;
    @javax.validation.constraints.NotNull
    private java.util.List<CheckListCategoryInputTO> checkListCategories;

    public TechnicianWorkOrderUploadInputTO() {
    }

    public TechnicianWorkOrderUploadInputTO(String workOrderId, java.util.List<CheckListCategoryInputTO> checkListCategories) {
        this.workOrderId = workOrderId;
        this.checkListCategories = checkListCategories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public java.util.List<CheckListCategoryInputTO> getCheckListCategories() {
        return checkListCategories;
    }

    public void setCheckListCategories(java.util.List<CheckListCategoryInputTO> checkListCategories) {
        this.checkListCategories = checkListCategories;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (workOrderId != null) {
            joiner.add("workOrderId: " + GraphQLRequestSerializer.getEntry(workOrderId));
        }
        if (checkListCategories != null) {
            joiner.add("checkListCategories: " + GraphQLRequestSerializer.getEntry(checkListCategories));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String workOrderId;
        private java.util.List<CheckListCategoryInputTO> checkListCategories;

        public Builder() {
        }

        public Builder setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }

        public Builder setCheckListCategories(java.util.List<CheckListCategoryInputTO> checkListCategories) {
            this.checkListCategories = checkListCategories;
            return this;
        }


        public TechnicianWorkOrderUploadInputTO build() {
            return new TechnicianWorkOrderUploadInputTO(workOrderId, checkListCategories);
        }

    }
}
