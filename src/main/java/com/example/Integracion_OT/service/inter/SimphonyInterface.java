package com.example.Integracion_OT.service.inter;

import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;
import java.util.Map;

public interface SimphonyInterface {

    WorkTicket get(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException,
            JsonProcessingException;


    List<WorkTicket> list(Map<String, String> params) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException;

    WorkTicket edit(WorkTicket element) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException;

    WorkTicket add(WorkTicket element) throws HttpClientErrorException, HttpServerErrorException,
            ResourceAccessException, JsonProcessingException;

    void delete(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException,
            JsonProcessingException;
}
