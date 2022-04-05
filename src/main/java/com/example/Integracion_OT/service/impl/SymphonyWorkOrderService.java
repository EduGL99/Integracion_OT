package com.example.Integracion_OT.service.impl;

import com.example.Integracion_OT.model.symphony.QueryResponse;
import com.example.Integracion_OT.model.symphony.v6.graphql.*;
import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import com.example.Integracion_OT.symphony.WorkOrderGraphToTMFxxx;
import com.example.Integracion_OT.symphony.WorkOrderTMFxxxToGraph;
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
public class SymphonyWorkOrderService extends SymphonyService {

    @Autowired
    WorkOrderGraphToTMFxxx workOrderGraphToTMFxxx;

    @Autowired
    WorkOrderTMFxxxToGraph workOrderTMFxxxToGraph;

    @Override
    public WorkTicket get(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException,
            JsonProcessingException {
        WorkTicket workTicket = null;
        NodeQueryRequest nodeQueryRequest = new NodeQueryRequest();
        nodeQueryRequest.setId(id);
        NamedNodeResponseProjection namedNodeResponseProjection = new NamedNodeResponseProjection()
                .onWorkOrder((WorkOrderResponseProjection) dataWorkOrder());
        GraphQLRequest graphQLRequest = new GraphQLRequest(nodeQueryRequest, namedNodeResponseProjection);
        log.debug("*** Message before send Query Work Order: " + graphQLRequest.toHttpJsonBody());
        QueryResponse<WorkOrderTO> result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),HttpMethod.POST,httpEntity(graphQLRequest),new ParameterizedTypeReference<QueryResponse<WorkOrderTO>>() {}).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to get work order: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            WorkOrderTO workOrder = result.node();
            log.debug("*** Response Get Work Order: " + json.writeValueAsString(workOrder));
            if (workOrder != null) {
                workTicket = workOrderGraphToTMFxxx.transform(workOrder);
            }
        }
        return workTicket;
    }

    @Override
    public List<WorkTicket> list(Map<String, String> params) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException {
        List<WorkTicket> workTickets = new ArrayList<>();
        WorkOrdersQueryRequest workOrdersQueryRequest = new WorkOrdersQueryRequest();
        // TODO - support for pagination
        WorkOrderOrderTO order = new WorkOrderOrderTO();
        order.setDirection(OrderDirectionTO.ASC);
        order.setField(WorkOrderOrderFieldTO.CREATED_AT);
        workOrdersQueryRequest.setOrderBy(order);
        WorkOrderConnectionResponseProjection workOrderConnectionResponseProjection =
                new WorkOrderConnectionResponseProjection().edges(new WorkOrderEdgeResponseProjection()
                                .node((WorkOrderResponseProjection) dataWorkOrder()))
                        .pageInfo(new PageInfoResponseProjection().hasNextPage().hasPreviousPage().startCursor()
                                .endCursor());
        GraphQLRequest graphQLRequest = new GraphQLRequest(workOrdersQueryRequest,
                workOrderConnectionResponseProjection);
        log.debug("*** Message before send Query Work Order: " + graphQLRequest.toQueryString());
        WorkOrdersQueryResponse result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<WorkOrdersQueryResponse>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to query work orders: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            WorkOrderConnectionTO workOrderConnectionTO = result.workOrders();
            log.debug("*** Response List Work Orders Edges: " + json.writeValueAsString(workOrderConnectionTO));
            if (workOrderConnectionTO.getEdges().stream().map(WorkOrderEdgeTO::getNode).findAny().isPresent()) {
                List<WorkOrderTO> listWorkOrders = workOrderConnectionTO.getEdges().stream()
                        .map(WorkOrderEdgeTO::getNode).collect(Collectors.toList());
                log.debug("*** Response List Work Orders: " + json.writeValueAsString(listWorkOrders));
                workTickets = listWorkOrders.stream()
                        .map(workOrderGraphToTMFxxx::transform).collect(Collectors.toList());
            }
        }
        return workTickets;
    }

    @Override
    public WorkTicket edit(WorkTicket element) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException {
        WorkOrderTO workOrder = workOrderTMFxxxToGraph.transform(element);
        List<PropertyInputTO> properties = mapProperties(workOrder.getProperties());
        List<CheckListCategoryInputTO> checkList = mapCheckList(workOrder.getCheckListCategories());
        EditWorkOrderMutationRequest editWorkOrderMutationRequest = new EditWorkOrderMutationRequest();
        EditWorkOrderInputTO.Builder editWorkOrderInput = EditWorkOrderInputTO.builder()
                .setId(workOrder.getId())
                .setName(workOrder.getName())
                .setPriority(workOrder.getPriority())
                .setStatus(workOrder.getStatus());
        if (workOrder.getDescription() != null) {
            editWorkOrderInput.setDescription(workOrder.getDescription());
        }
        if (workOrder.getProject() != null) {
            editWorkOrderInput.setProjectId(workOrder.getProject().getId());
        }
        if (workOrder.getLocation() != null) {
            editWorkOrderInput.setLocationId(workOrder.getLocation().getId());
        }
        if (properties.size() > 0) {
            editWorkOrderInput.setProperties(properties);
        }
        if (checkList.size() > 0) {
            editWorkOrderInput.setCheckListCategories(checkList);
        }
        if (workOrder.getOwner() != null) {
            editWorkOrderInput.setOwnerId(workOrder.getOwner().getId());
        }
        if (workOrder.getAssignedTo() != null) {
            editWorkOrderInput.setAssigneeId(workOrder.getAssignedTo().getId());
        }
        editWorkOrderMutationRequest.setInput(editWorkOrderInput.build());
        if (workOrder.getHyperlinks() != null) {
            workOrder.getHyperlinks().forEach(h -> {
                AddHyperlinkInputTO.Builder hyperlink = AddHyperlinkInputTO.builder()
                        .setUrl(h.getUrl())
                        .setDisplayName(h.getDisplayName())
                        .setEntityType(ImageEntityTO.WORK_ORDER)
                        .setEntityId(workOrder.getId());
                addHyperlink(hyperlink.build());
            });
        }
        if (workOrder.getComments() != null) {
            workOrder.getComments().forEach(c -> {
                CommentInputTO.Builder comment = CommentInputTO.builder()
                        .setId(workOrder.getId())
                        .setEntityType(CommentEntityTO.WORK_ORDER)
                        .setText(c.getText());
                addComment(comment.build());
            });
        }
        WorkOrderResponseProjection workOrderResponseProjection = (WorkOrderResponseProjection) dataWorkOrder();
        GraphQLRequest graphQLRequest = new GraphQLRequest(editWorkOrderMutationRequest, workOrderResponseProjection);
        log.debug("*** Message before send edit Work Order: " + graphQLRequest.toQueryString());
        EditWorkOrderMutationResponse result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<EditWorkOrderMutationResponse>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to update work order: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            WorkOrderTO workOrderTO = result.editWorkOrder();
            log.debug("*** Response edit Work Order: " + json.writeValueAsString(workOrderTO));
            return workOrderGraphToTMFxxx.transform(workOrderTO);
        }
        return null;
    }

    @Override
    public WorkTicket add(WorkTicket element) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException {
        WorkOrderTO workOrder = workOrderTMFxxxToGraph.transform(element);
        List<PropertyInputTO> properties = mapProperties(workOrder.getProperties());
        List<CheckListCategoryInputTO> checkList = mapCheckList(workOrder.getCheckListCategories());
        AddWorkOrderMutationRequest addWorkOrderMutationRequest = new AddWorkOrderMutationRequest();
        AddWorkOrderInputTO.Builder addWorkOrderInputTO = AddWorkOrderInputTO.builder()
                .setName(workOrder.getName())
                .setDescription(workOrder.getDescription())
                .setPriority(workOrder.getPriority())
                .setStatus(workOrder.getStatus())
                .setWorkOrderTypeId(workOrder.getWorkOrderType().getId());
        if (workOrder.getProject() != null) {
            addWorkOrderInputTO.setProjectId(workOrder.getProject().getId());
        }
        if (workOrder.getLocation() != null) {
            addWorkOrderInputTO.setLocationId(workOrder.getLocation().getId());
        }
        if (workOrder.getOwner() != null) {
            addWorkOrderInputTO.setOwnerId(workOrder.getOwner().getId());
        }
        if (workOrder.getAssignedTo() != null) {
            addWorkOrderInputTO.setAssigneeId(workOrder.getAssignedTo().getId());
        }
        if (properties.size() > 0) {
            addWorkOrderInputTO.setProperties(properties);
        }
        if (checkList.size() > 0) {
            addWorkOrderInputTO.setCheckListCategories(checkList);
        }
        addWorkOrderMutationRequest.setInput(addWorkOrderInputTO.build());
        WorkOrderResponseProjection workOrderResponseProjection = (WorkOrderResponseProjection) dataWorkOrder();
        GraphQLRequest graphQLRequest = new GraphQLRequest(addWorkOrderMutationRequest, workOrderResponseProjection);
        log.debug("*** Message before send Add Work Order: " + graphQLRequest.toQueryString());
        AddWorkOrderMutationResponse result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<AddWorkOrderMutationResponse>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error to create work order: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            WorkOrderTO workOrderTO = result.addWorkOrder();
            log.debug("*** Response Add Work Order: " + json.writeValueAsString(workOrderTO));
            return workOrderGraphToTMFxxx.transform(workOrderTO);
        }
        return null;
    }

    @Override
    public void delete(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException,
            JsonProcessingException {
        // TODO - make logic to delete a work order
    }
}
