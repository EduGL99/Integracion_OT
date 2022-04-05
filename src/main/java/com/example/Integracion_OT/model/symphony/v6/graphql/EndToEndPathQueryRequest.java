package com.example.Integracion_OT.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;

/**
 * Fetches end to end path of links
 */

public class EndToEndPathQueryRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "endToEndPath";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public EndToEndPathQueryRequest() {
    }

    public EndToEndPathQueryRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setLinkId(String linkId) {
        this.input.put("linkId", linkId);
    }

    public void setPortId(String portId) {
        this.input.put("portId", portId);
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
        private String linkId;
        private String portId;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setLinkId(String linkId) {
            this.linkId = linkId;
            return this;
        }

        public Builder setPortId(String portId) {
            this.portId = portId;
            return this;
        }


        public EndToEndPathQueryRequest build() {
            EndToEndPathQueryRequest obj = new EndToEndPathQueryRequest($alias);
            obj.setLinkId(linkId);
            obj.setPortId(portId);
            return obj;
        }

    }
}
