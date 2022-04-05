package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EditFlowInstanceInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String id;
    private String serviceInstanceCode;
    private FlowInstanceStatusTO status;
    private String endDate;

    public EditFlowInstanceInputTO() {
    }

    public EditFlowInstanceInputTO(String id, String serviceInstanceCode, FlowInstanceStatusTO status, String endDate) {
        this.id = id;
        this.serviceInstanceCode = serviceInstanceCode;
        this.status = status;
        this.endDate = endDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceInstanceCode() {
        return serviceInstanceCode;
    }

    public void setServiceInstanceCode(String serviceInstanceCode) {
        this.serviceInstanceCode = serviceInstanceCode;
    }

    public FlowInstanceStatusTO getStatus() {
        return status;
    }

    public void setStatus(FlowInstanceStatusTO status) {
        this.status = status;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (serviceInstanceCode != null) {
            joiner.add("serviceInstanceCode: " + GraphQLRequestSerializer.getEntry(serviceInstanceCode));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (endDate != null) {
            joiner.add("endDate: " + GraphQLRequestSerializer.getEntry(endDate));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String serviceInstanceCode;
        private FlowInstanceStatusTO status;
        private String endDate;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setServiceInstanceCode(String serviceInstanceCode) {
            this.serviceInstanceCode = serviceInstanceCode;
            return this;
        }

        public Builder setStatus(FlowInstanceStatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        public EditFlowInstanceInputTO build() {
            return new EditFlowInstanceInputTO(id, serviceInstanceCode, status, endDate);
        }

    }
}
