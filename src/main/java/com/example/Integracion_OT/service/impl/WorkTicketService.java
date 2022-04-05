package com.example.Integracion_OT.service.impl;

import com.example.Integracion_OT.exception.BadRequestException;
import com.example.Integracion_OT.exception.InternalErrorException;
import com.example.Integracion_OT.exception.NotFoundException;
import com.example.Integracion_OT.exception.UnprocessableEntityException;
import com.example.Integracion_OT.model.tmfxxx.Characteristic;
import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
public class WorkTicketService {

    @Autowired
    SymphonyWorkOrderService simphonyWorkOrderService;

    @Autowired
    SymphonyProjectService symphonyProjectService;

    @Autowired
    SymphonyWorkOrderTypeService simphonyWorkOrderTypeService;

    @Autowired
    SymphonyProjectTypeService symphonyProjectTypeService;

    public List<WorkTicket> listWorkTicket(Map<String, String> params) throws BadRequestException,
            HttpClientErrorException, ResourceAccessException {
        List<WorkTicket> list = new ArrayList<>();
        SymphonyService service = verifyEntity(params);
        try {
            list = service.list(params);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return list;
    }

    public WorkTicket getWorkTicket(String id, Map<String, String> params) throws BadRequestException,
            ResourceAccessException {
        WorkTicket workTicket;
        SymphonyService service = verifyEntity(params);
        try {
            workTicket = service.get(id);
            if (workTicket == null) {
                throw new NotFoundException();
            }
        } catch (JsonProcessingException e) {
            log.error("*** Error to convert json message. Cause: " + e.getCause() + " -- Message: "
                    + e.getMessage());
            throw new InternalErrorException();
        } catch (HttpClientErrorException h) {
            if (h.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
                throw new NotFoundException();
            } else {
                log.error("*** Error to get entity of Simphony. Cause: " + h.getCause() + " -- Message: "
                        + h.getMessage());
                throw new InternalErrorException();
            }
        }
        return workTicket;
    }

    public WorkTicket createWorkTicket(WorkTicket workTicket) throws BadRequestException, HttpClientErrorException,
            ResourceAccessException, UnprocessableEntityException {
        WorkTicket workTicket1 = null;
        SymphonyService service = verifyEntity(workTicket.get_atBaseType());
        try {
            // TODO - make query for complementary or mandatory data to create work order
            workTicket1 = service.add(workTicket);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return workTicket1;
    }

    public WorkTicket updateWorkTicket(String id, Map<String, String> params, WorkTicket workTicket)
            throws BadRequestException, HttpClientErrorException, ResourceAccessException {
        WorkTicket workTicket1 = null;
        WorkTicket ticketPrevious = getWorkTicket(id, params);
        SymphonyService service = verifyEntity(params);
        WorkTicket ticketMerged = deltaTicket(workTicket, ticketPrevious);
        try {
            workTicket1 = service.edit(ticketMerged);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return workTicket1;
    }

    public void deleteWorkTicket(String id, Map<String, String> params) throws BadRequestException {
        // TODO - make business logic for delete Work Orders
    }

    private SymphonyService verifyEntity(Map<String, String> params) throws BadRequestException {
        boolean exception = true;
        SymphonyService srv = null;
        Map<String, SymphonyService> services = entitiesAvailable();
        if (params.containsKey("@baseType")) {
            if (services.containsKey(params.get("@baseType"))) {
                srv = services.get(params.get("@baseType"));
                exception = false;
            }
        }
        if (exception) {
            log.info("**** Error, don't exist the @baseType.");
            throw new BadRequestException();
        }
        return srv;
    }

    private SymphonyService verifyEntity(String baseType) {
        Map<String, String> params = new HashMap<>();
        if (baseType != null) {
            params.put("@baseType", baseType);
        }
        return verifyEntity(params);
    }

    private Map<String, SymphonyService> entitiesAvailable() {
        Map<String, SymphonyService> services = new HashMap<>();
        services.put("workOrder", simphonyWorkOrderService);
        services.put("project", symphonyProjectService);
        services.put("workOrderType", simphonyWorkOrderTypeService);
        services.put("projectType", symphonyProjectTypeService);
        return services;
    }

    private WorkTicket deltaTicket(WorkTicket newTicket, WorkTicket oldTicket)
            throws BadRequestException, HttpClientErrorException, ResourceAccessException {
        WorkTicket mergedTicket = oldTicket.merge(newTicket);
        if (newTicket.getCharacteristic() != null && newTicket.getCharacteristic().size() > 0
                && oldTicket.getCharacteristic() != null) {
            List<Characteristic> listOldProps = oldTicket.getCharacteristic().stream()
                    .filter(c -> !c.get_atBaseType().equals("hyperlink")).collect(Collectors.toList());
            List<Characteristic> listNewProps = newTicket.getCharacteristic().stream()
                    .filter(ncr -> !ncr.get_atBaseType().equals("hyperlink")).collect(Collectors.toList());
            listOldProps.forEach(c -> {
                if (listNewProps.stream().anyMatch(nc -> nc.getName().equals(c.getName()))) {
                    String val = listNewProps.stream()
                            .filter(nc -> nc.getName().equals(c.getName()))
                            .map(Characteristic::getValue)
                            .collect(Collectors.toList()).get(0);
                    c.setValue(val);
                }
            });
            List<Characteristic> filter = new ArrayList<>(listOldProps);
            if (oldTicket.get_atBaseType().equals("workOrder") && newTicket.getCharacteristic().stream()
                    .anyMatch(h -> h.get_atBaseType().equals("hyperlink"))) {
                List<Characteristic> listOldHyperlinks = oldTicket.getCharacteristic().stream()
                        .filter(c -> c.get_atBaseType().equals("hyperlink")).collect(Collectors.toList());
                List<Characteristic> listNewHyperlinks = newTicket.getCharacteristic().stream()
                        .filter(c -> c.get_atBaseType().equals("hyperlink")).collect(Collectors.toList());
                if (listOldHyperlinks.size() > 0) {
                    listNewHyperlinks.forEach(h -> {
                        if (listOldHyperlinks.stream().noneMatch(oh -> oh.getValue().equals(h.getValue()))) {
                            filter.add(h);
                        }
                    });
                } else {
                    filter.addAll(listNewHyperlinks);
                }
            }
            mergedTicket.setCharacteristic(filter);
        }
        mergedTicket.setNote(null);
        if (newTicket.getNote() != null && newTicket.getNote().size() > 0) {
            mergedTicket.setNote(newTicket.getNote());
        }
        return mergedTicket;
    }
}
