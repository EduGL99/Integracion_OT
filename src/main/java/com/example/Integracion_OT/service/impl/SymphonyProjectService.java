package com.example.Integracion_OT.service.impl;

import com.example.Integracion_OT.model.symphony.QueryResponse;
import com.example.Integracion_OT.model.symphony.v6.graphql.*;
import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import com.example.Integracion_OT.symphony.ProjectGraphToTMFxxx;
import com.example.Integracion_OT.symphony.ProjectTMFxxxToGraph;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
public class SymphonyProjectService extends SymphonyService {

    @Autowired
    ProjectGraphToTMFxxx projectGraphToTMFxxx;

    @Autowired
    ProjectTMFxxxToGraph projectTMFxxxToGraph;

    @Override
    public WorkTicket get(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException,
            JsonProcessingException {
        WorkTicket workTicket = null;
        NodeQueryRequest nodeQueryRequest = new NodeQueryRequest();
        nodeQueryRequest.setId(id);
        NamedNodeResponseProjection namedNodeResponseProjection = new NamedNodeResponseProjection()
                .onProject((ProjectResponseProjection) dataProject());
        GraphQLRequest graphQLRequest = new GraphQLRequest(nodeQueryRequest,
                namedNodeResponseProjection);
        log.debug("*** Message before send Query Project: " + graphQLRequest.toQueryString());
        QueryResponse<ProjectTO> result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<QueryResponse<ProjectTO>>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to get project: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            ProjectTO project = result.node();
            log.debug("*** Response Get Project: " + json.writeValueAsString(project));
            if (project != null) {
                workTicket = projectGraphToTMFxxx.transform(project);
            }
        }
        return workTicket;
    }

    @Override
    public List<WorkTicket> list(Map<String, String> params) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException {
        List<WorkTicket> workTickets = new ArrayList<>();
        ProjectsQueryRequest projectsQueryRequest = new ProjectsQueryRequest();
        // TODO - support for pagination and filters
        projectsQueryRequest.setFirst(Integer.parseInt(params.getOrDefault("first", "100")));
        ProjectConnectionResponseProjection projectConnectionResponseProjection =
                new ProjectConnectionResponseProjection().edges(new ProjectEdgeResponseProjection()
                                .node((ProjectResponseProjection) dataProject()))
                        .pageInfo(new PageInfoResponseProjection().hasNextPage().hasPreviousPage().startCursor()
                                .endCursor());
        GraphQLRequest graphQLRequest = new GraphQLRequest(projectsQueryRequest, projectConnectionResponseProjection);
        log.debug("*** Message before send Query Projects: " + graphQLRequest.toQueryString());
        ProjectsQueryResponse result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<ProjectsQueryResponse>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to get projects: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            ProjectConnectionTO projectConnectionTO = result.projects();
            log.debug("*** Response List Projects Edges: " + json.writeValueAsString(projectConnectionTO));
            if (projectConnectionTO.getEdges().stream().map(ProjectEdgeTO::getNode).findAny().isPresent()) {
                List<ProjectTO> listProjects = projectConnectionTO.getEdges().stream()
                        .map(ProjectEdgeTO::getNode).collect(Collectors.toList());
                log.debug("*** Response List projects: " + json.writeValueAsString(listProjects));
                workTickets = listProjects.stream()
                        .map(projectGraphToTMFxxx::transform).collect(Collectors.toList());
            }
        }
        return workTickets;
    }

    @Override
    public WorkTicket edit(WorkTicket element) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException {
        ProjectTO project = projectTMFxxxToGraph.transform(element);
        List<PropertyInputTO> properties = mapProperties(project.getProperties());
        EditProjectMutationRequest editProjectMutationRequest = new EditProjectMutationRequest();
        EditProjectInputTO.Builder editProjectInput = new EditProjectInputTO.Builder()
                .setId(project.getId())
                .setName(project.getName())
                .setDescription(project.getDescription())
                .setType(project.getType().getId());
        if (properties.size() > 0) {
            editProjectInput.setProperties(properties);
        }
        if (project.getLocation() != null) {
            editProjectInput.setLocation(project.getLocation().getId());
        }
        if (project.getCreatedBy() != null) {
            editProjectInput.setCreatorId(project.getCreatedBy().getId());
        }
        if (project.getComments() != null) {
            project.getComments().forEach(c -> {
                CommentInputTO.Builder comment = CommentInputTO.builder()
                        .setId(project.getId())
                        .setEntityType(CommentEntityTO.PROJECT)
                        .setText(c.getText());
                addComment(comment.build());
            });
        }
        editProjectMutationRequest.setInput(editProjectInput.build());
        ProjectResponseProjection projectResponseProjection = (ProjectResponseProjection) dataProject();
        GraphQLRequest graphQLRequest = new GraphQLRequest(editProjectMutationRequest, projectResponseProjection);
        log.debug("*** Message before send edit Project: " + graphQLRequest.toQueryString());
        EditProjectMutationResponse result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<EditProjectMutationResponse>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to update project: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            ProjectTO projectTO = result.editProject();
            log.debug("*** Response edit Project: " + json.writeValueAsString(projectTO));
            return projectGraphToTMFxxx.transform(projectTO);
        }
        return null;
    }

    @Override
    public WorkTicket add(WorkTicket element) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException {
        ProjectTO project = projectTMFxxxToGraph.transform(element);
        List<PropertyInputTO> properties = mapProperties(project.getProperties());
        CreateProjectMutationRequest createProjectMutationRequest = new CreateProjectMutationRequest();
        AddProjectInputTO.Builder addProjectInput = AddProjectInputTO.builder()
                .setName(project.getName())
                .setType(project.getType().getId())
                .setPriority(project.getPriority());
        if (project.getDescription() != null) {
            addProjectInput.setDescription(project.getDescription());
        }
        if (project.getLocation() != null) {
            addProjectInput.setLocation(project.getLocation().getId());
        }
        if (project.getCreatedBy() != null) {
            addProjectInput.setCreatorId(project.getCreatedBy().getId());
        }
        if (properties.size() > 0) {
            addProjectInput.setProperties(properties);
        }
        createProjectMutationRequest.setInput(addProjectInput.build());
        ProjectResponseProjection projectResponseProjection = (ProjectResponseProjection) dataProject();
        GraphQLRequest graphQLRequest = new GraphQLRequest(createProjectMutationRequest, projectResponseProjection);
        log.debug("*** Message before send Add Project: " + graphQLRequest.toQueryString());
        CreateProjectMutationResponse result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<CreateProjectMutationResponse>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to create project: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            ProjectTO projectTO = result.createProject();
            log.debug("*** Response Create Project: " + json.writeValueAsString(projectTO));
            return projectGraphToTMFxxx.transform(projectTO);
        }
        return null;
    }

    @Override
    public void delete(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException,
            JsonProcessingException {
        // TODO - make logic to delete a project
    }
}
