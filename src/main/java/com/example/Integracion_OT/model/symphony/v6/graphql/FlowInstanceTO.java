package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlowInstanceTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String bssCode;
    private String serviceInstanceCode;
    @javax.validation.constraints.NotNull
    private FlowInstanceStatusTO status;
    @javax.validation.constraints.NotNull
    private FlowExecutionTemplateTO template;
    @javax.validation.constraints.NotNull
    private java.util.List<BlockInstanceTO> blocks;
    @javax.validation.constraints.NotNull
    private String startDate;
    private String endDate;

    public FlowInstanceTO() {
    }

    public FlowInstanceTO(String id, String bssCode, String serviceInstanceCode, FlowInstanceStatusTO status, FlowExecutionTemplateTO template, java.util.List<BlockInstanceTO> blocks, String startDate, String endDate) {
        this.id = id;
        this.bssCode = bssCode;
        this.serviceInstanceCode = serviceInstanceCode;
        this.status = status;
        this.template = template;
        this.blocks = blocks;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getBssCode() {
        return bssCode;
    }

    public void setBssCode(String bssCode) {
        this.bssCode = bssCode;
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

    public FlowExecutionTemplateTO getTemplate() {
        return template;
    }

    public void setTemplate(FlowExecutionTemplateTO template) {
        this.template = template;
    }

    public java.util.List<BlockInstanceTO> getBlocks() {
        return blocks;
    }

    public void setBlocks(java.util.List<BlockInstanceTO> blocks) {
        this.blocks = blocks;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
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
        if (bssCode != null) {
            joiner.add("bssCode: " + GraphQLRequestSerializer.getEntry(bssCode));
        }
        if (serviceInstanceCode != null) {
            joiner.add("serviceInstanceCode: " + GraphQLRequestSerializer.getEntry(serviceInstanceCode));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (template != null) {
            joiner.add("template: " + GraphQLRequestSerializer.getEntry(template));
        }
        if (blocks != null) {
            joiner.add("blocks: " + GraphQLRequestSerializer.getEntry(blocks));
        }
        if (startDate != null) {
            joiner.add("startDate: " + GraphQLRequestSerializer.getEntry(startDate));
        }
        if (endDate != null) {
            joiner.add("endDate: " + GraphQLRequestSerializer.getEntry(endDate));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String id;
        private String bssCode;
        private String serviceInstanceCode;
        private FlowInstanceStatusTO status;
        private FlowExecutionTemplateTO template;
        private java.util.List<BlockInstanceTO> blocks;
        private String startDate;
        private String endDate;

        public Builder() {
        }

        /**
         * The id of the object.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setBssCode(String bssCode) {
            this.bssCode = bssCode;
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

        public Builder setTemplate(FlowExecutionTemplateTO template) {
            this.template = template;
            return this;
        }

        public Builder setBlocks(java.util.List<BlockInstanceTO> blocks) {
            this.blocks = blocks;
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        public FlowInstanceTO build() {
            return new FlowInstanceTO(id, bssCode, serviceInstanceCode, status, template, blocks, startDate, endDate);
        }

    }
}
