package com.example.Integracion_OT.service.impl;

import com.example.Integracion_OT.model.symphony.v6.graphql.*;
import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import com.example.Integracion_OT.symphony.WorkOrderTypeGraphToTMFxxx;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
public class SymphonyWorkOrderTypeService extends SymphonyService {

    @Autowired
    WorkOrderTypeGraphToTMFxxx workOrderTypeGraphToTMFxxx;

    @Override
    public WorkTicket get(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException,
            JsonProcessingException {
        // TODO - make logic to get a work order type
        return null;
    }

    @Override
    public List<WorkTicket> list(Map<String, String> params) throws HttpClientErrorException, ResourceAccessException,
            HttpServerErrorException, JsonProcessingException {
        WorkOrderTypesQueryRequest workOrderTypesQueryRequest = new WorkOrderTypesQueryRequest();
        // TODO - make filters and pagination
        workOrderTypesQueryRequest.setFirst(Integer.parseInt(params.getOrDefault("first", "70")));
        WorkOrderTypeConnectionResponseProjection workOrderTypeConnectionResponseProjection =
                (WorkOrderTypeConnectionResponseProjection) dataWorOrderType();
        GraphQLRequest graphQLRequest = new GraphQLRequest(workOrderTypesQueryRequest,
                workOrderTypeConnectionResponseProjection);
        log.debug("*** Message before send Query Work Order Types: " + graphQLRequest.toQueryString());
        WorkOrderTypesQueryResponse result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<WorkOrderTypesQueryResponse>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to get work order types: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            WorkOrderTypeConnectionTO workOrderTypeConnectionTO = result.workOrderTypes();
            log.debug("*** Response List Work Order Types Edges: " + json.writeValueAsString(workOrderTypeConnectionTO));
            List<WorkOrderTypeTO> listWorkOrderTypes = workOrderTypeConnectionTO.getEdges().stream()
                    .map(WorkOrderTypeEdgeTO::getNode).collect(Collectors.toList());
            log.debug("*** Response List Work Order Types: " + json.writeValueAsString(listWorkOrderTypes));
            return listWorkOrderTypes.stream()
                    .map(workOrderTypeGraphToTMFxxx::transform).collect(Collectors.toList());
        }
        return null;
    }

    @Override
    public WorkTicket edit(WorkTicket element) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException {
        // TODO - make logic to edit a work order type
        return null;
    }

    @Override
    public WorkTicket add(WorkTicket element) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException {
        // TODO - make logic to add a work order type
        return null;
    }

    @Override
    public void delete(String id) throws HttpClientErrorException, ResourceAccessException, HttpServerErrorException,
            JsonProcessingException {
        // TODO - make logic to delete a work order type
    }
}
