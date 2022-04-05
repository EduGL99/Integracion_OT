package com.example.Integracion_OT.service.impl;

import com.example.Integracion_OT.model.symphony.v6.graphql.*;
import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import com.example.Integracion_OT.symphony.ProjectTypeGraphToTMFxxx;
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
public class SymphonyProjectTypeService extends SymphonyService {

    @Autowired
    ProjectTypeGraphToTMFxxx projectTypeGraphToTMFxxx;

    @Override
    public WorkTicket get(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException,
            JsonProcessingException {
        // TODO - make logic to get a project type
        return null;
    }

    @Override
    public List<WorkTicket> list(Map<String, String> params) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException {
        ProjectTypesQueryRequest projectTypesQueryRequest = new ProjectTypesQueryRequest();
        // TODO - make pagination and filters
        projectTypesQueryRequest.setFirst(Integer.parseInt(params.getOrDefault("first", "70")));
        ProjectTypeConnectionResponseProjection projectTypeConnectionResponseProjection =
                (ProjectTypeConnectionResponseProjection) dataProjectType();
        GraphQLRequest graphQLRequest = new GraphQLRequest(projectTypesQueryRequest,
                projectTypeConnectionResponseProjection);
        log.debug("*** Message before send Query Project Types: " + graphQLRequest.toQueryString());
        ProjectTypesQueryResponse result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<ProjectTypesQueryResponse>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to get project types: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            ProjectTypeConnectionTO projectTypeConnectionTO = result.projectTypes();
            log.debug("*** Response List Project Types Edges: " + json.writeValueAsString(projectTypeConnectionTO));
            List<ProjectTypeTO> listProjectTypes = projectTypeConnectionTO.getEdges().stream()
                    .map(ProjectTypeEdgeTO::getNode).collect(Collectors.toList());
            log.debug("*** Response List Project Types: " + json.writeValueAsString(listProjectTypes));
            return listProjectTypes.stream()
                    .map(projectTypeGraphToTMFxxx::transform).collect(Collectors.toList());
        }
        return null;
    }

    @Override
    public WorkTicket edit(WorkTicket element) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException {
        // TODO - make logic to edit a project type
        return null;
    }

    @Override
    public WorkTicket add(WorkTicket element) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException {
        // TODO - make logic to add a project type
        return null;
    }

    @Override
    public void delete(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException,
            JsonProcessingException {
        // TODO - make logic to delete a project type
    }
}
