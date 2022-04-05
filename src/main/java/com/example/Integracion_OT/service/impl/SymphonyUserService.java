package com.example.Integracion_OT.service.impl;

import com.example.Integracion_OT.exception.BadRequestException;
import com.example.Integracion_OT.model.symphony.QueryResponse;
import com.example.Integracion_OT.model.symphony.v6.graphql.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;

import java.net.URI;
import java.util.Map;

@Slf4j
public class SymphonyUserService extends SymphonyService2{

    @Autowired
    SymphonyUserService service;

    public UserTO getUser(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException,
            JsonProcessingException{
    UserTO workTicket = null;
        NodeQueryRequest nodeQueryRequest = new NodeQueryRequest();
        nodeQueryRequest.setId(id);
        NamedNodeResponseProjection namedNodeResponseProjection = new NamedNodeResponseProjection()
                .onUser((UserResponseProjection) dataUser());
        GraphQLRequest graphQLRequest = new GraphQLRequest(nodeQueryRequest, namedNodeResponseProjection);
        log.debug("*** Message before send Query Work Order: " + graphQLRequest.toHttpJsonBody());
        QueryResponse<UserTO> result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<QueryResponse<UserTO>>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to get work order: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            UserTO workOrder = result.node();
            log.debug("*** Response Get Work Order: " + json.writeValueAsString(workOrder));
            if (workOrder != null) {
                System.out.println(workOrder);
                //workTicket = workOrderGraphToTMFxxx.transform(workOrder);
            }
        }
        return workTicket;
    }

    public UserTO getUser(String id, Map<String, String> params) throws BadRequestException,
            ResourceAccessException {
        UserTO workTicket = null;
        NodeQueryRequest nodeQueryRequest = new NodeQueryRequest();
        nodeQueryRequest.setId(id);
        NamedNodeResponseProjection namedNodeResponseProjection = new NamedNodeResponseProjection()
                .onUser((UserResponseProjection) dataUser());
        GraphQLRequest graphQLRequest = new GraphQLRequest(nodeQueryRequest, namedNodeResponseProjection);
        log.debug("*** Message before send Query Work Order: " + graphQLRequest.toHttpJsonBody());
        QueryResponse<WorkOrderTO> result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<QueryResponse<WorkOrderTO>>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to get work order: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            WorkOrderTO workOrder = result.node();
            //log.debug("*** Response Get Work Order: " + json.writeValueAsString(workOrder));
            if (workOrder != null) {
                System.out.println(workOrder);
                //workTicket = workOrderGraphToTMFxxx.transform(workOrder);
            }
        }
        return workTicket;
    }


}
