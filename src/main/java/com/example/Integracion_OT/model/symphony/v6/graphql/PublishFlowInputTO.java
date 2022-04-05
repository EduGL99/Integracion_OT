package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PublishFlowInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String flowDraftID;
    @javax.validation.constraints.NotNull
    private FlowNewInstancesPolicyTO flowInstancesPolicy;

    public PublishFlowInputTO() {
    }

    public PublishFlowInputTO(String flowDraftID, FlowNewInstancesPolicyTO flowInstancesPolicy) {
        this.flowDraftID = flowDraftID;
        this.flowInstancesPolicy = flowInstancesPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getFlowDraftID() {
        return flowDraftID;
    }

    public void setFlowDraftID(String flowDraftID) {
        this.flowDraftID = flowDraftID;
    }

    public FlowNewInstancesPolicyTO getFlowInstancesPolicy() {
        return flowInstancesPolicy;
    }

    public void setFlowInstancesPolicy(FlowNewInstancesPolicyTO flowInstancesPolicy) {
        this.flowInstancesPolicy = flowInstancesPolicy;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (flowDraftID != null) {
            joiner.add("flowDraftID: " + GraphQLRequestSerializer.getEntry(flowDraftID));
        }
        if (flowInstancesPolicy != null) {
            joiner.add("flowInstancesPolicy: " + GraphQLRequestSerializer.getEntry(flowInstancesPolicy));
        }
        return joiner.toString();
    }

    public static class Builder {

        private String flowDraftID;
        private FlowNewInstancesPolicyTO flowInstancesPolicy;

        public Builder() {
        }

        public Builder setFlowDraftID(String flowDraftID) {
            this.flowDraftID = flowDraftID;
            return this;
        }

        public Builder setFlowInstancesPolicy(FlowNewInstancesPolicyTO flowInstancesPolicy) {
            this.flowInstancesPolicy = flowInstancesPolicy;
            return this;
        }


        public PublishFlowInputTO build() {
            return new PublishFlowInputTO(flowDraftID, flowInstancesPolicy);
        }

    }
}
