package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class AddServiceLinkMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "addServiceLink";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public AddServiceLinkMutationRequest() {
    }

    public AddServiceLinkMutationRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setLinkId(String linkId) {
        this.input.put("linkId", linkId);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String $alias;
        private String id;
        private String linkId;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setLinkId(String linkId) {
            this.linkId = linkId;
            return this;
        }


        public AddServiceLinkMutationRequest build() {
            AddServiceLinkMutationRequest obj = new AddServiceLinkMutationRequest($alias);
            obj.setId(id);
            obj.setLinkId(linkId);
            return obj;
        }

    }
}
