package com.example.Integracion_OT.controller;

import com.example.Integracion_OT.models.OrdenMaestra;
import com.example.Integracion_OT.models.Tarea;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import static com.example.Integracion_OT.models.GetUnsafeOkHttpClient.getUnsafeOkHttpClient;

@RestController
@RequestMapping("/tarea")
public class TareaController {

    @RequestMapping(value = "prueba", method = RequestMethod.GET)
    public void setTarea(){
        Tarea tarea=new Tarea();
        OrdenMaestra maestra=new OrdenMaestra();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");

        tarea.setFechaCreada(dtf.format(LocalDateTime.now())); // fecha cuando se ejecuta el evento
        tarea.setIdEstatus(1);
        tarea.setServiciosAfectados("No aplica");
        tarea.setRiesgo("No aplica");
        tarea.setIdOrdenMaestra(maestra.getIdOrdenMaestra()); // valor id de la orden maestra
        tarea.setIdUsuaarioSS("0");
        tarea.setIdBovedaPass(0);
        tarea.setIdTipoTrabajo("9999999999");
        tarea.setIdSubtipoTrabajo(264);
        tarea.setIdAfectacion(2);
        tarea.setIdAfectacionCarrier(2);
        tarea.setIdAfectacionCliente(1);
        tarea.setIdOrigen(3);
        tarea.setIdTarea(maestra.getIdOrdenMaestra() + 0.001); // valor de concatenacion del idOrdenMaestra con .001
        tarea.setIdAutor(243);
        tarea.setIdFirmaCCR(0);
        tarea.setIdFirmaCPD(0);
        tarea.setIdFirmaROP(0);
        tarea.setIdCPD(null);
        tarea.setVentana(0);
        tarea.setIdOTPTarea(null);
        tarea.setIdCTLProyecto(null);
        tarea.setReprogramada(0);
        tarea.setUrgente(1);
    }

    @RequestMapping(value = "crear_tarea", method = RequestMethod.POST)
    public void crearTarea(@RequestBody Tarea tarea){
        setTarea();
        tarea.getIdOrden();
        tarea.getTitulo();
        tarea.getFechaInicio();
        tarea.getFechaFin();
        tarea.getFolioGUIO();
    }

    public void modificarTarea(){

    }

    public String createWorkOrder(String name, String workOrderTypeId, String propertyTypeID, String stringValue, String description, String status, String priority){
        try {
            OkHttpClient client = getUnsafeOkHttpClient();
            MediaType mediaType = MediaType.parse("application/json");
            okhttp3.RequestBody body = okhttp3.RequestBody.create(mediaType, "{\"query\":\"mutation workorder($new: AddWorkOrderInput!){ \\r\\n  addWorkOrder(input : $new){ \\r\\n  \\tid\\r\\n    workOrderType{\\r\\n      id\\r\\n      name\\r\\n    }\\r\\n    description\\r\\n    status\\r\\n    priority\\r\\n  }\\r\\n}\",\"variables\":{\"new\":{\"name\":\""+name+"\",\"workOrderTypeId\":\""+workOrderTypeId+"\",\"properties\":[{\"propertyTypeID\":\""+propertyTypeID+"\",\"stringValue\":\""+stringValue+"\"}],\"description\":\""+description+"\",\"status\":\""+status+"\",\"priority\":\""+priority+"\"}}}");
            Request request = new Request.Builder()
                    .url("https://symphony.telefonica.com.mx/graph/query")
                    .method("POST", body)
                    .addHeader("Authorization", "Basic am9zZWVkdWFyZG8uZ2FyY2lhbHVuYUBudHRkYXRhLmNvbTo2OTY5Njk2OTY5")
                    .addHeader("Content-Type", "application/json")
                    .build();
            Response response = client.newCall(request).execute();
            String mJsonString = Objects.requireNonNull(response.body().string());
            return mJsonString;
        } catch (Exception e){
            return null;
        }
    }

    public String editWorkOrder(String id, String name, String propertyTypeID, String stringValue, String description, String status, String priority){
        try {
            OkHttpClient client = getUnsafeOkHttpClient();
            MediaType mediaType = MediaType.parse("application/json");
            okhttp3.RequestBody body = okhttp3.RequestBody.create(mediaType, "{\"query\":\"mutation upworkorder($new: EditWorkOrderInput!){ \\r\\n  editWorkOrder(input : $new){ \\r\\n  \\tid\\r\\n    workOrderType{\\r\\n      id\\r\\n      name\\r\\n    }\\r\\n    description\\r\\n    status\\r\\n    priority\\r\\n  }\\r\\n}\",\"variables\":{\"new\":{\"id\":\""+id+"\",\"name\":\""+name+"\",\"properties\":[{\"propertyTypeID\":\""+propertyTypeID+"\",\"stringValue\":\""+stringValue+"\"}],\"description\":\""+description+"\",\"status\":\""+status+"\",\"priority\":\""+priority+"\"}}}");
            Request request = new Request.Builder()
                    .url("https://symphony.telefonica.com.mx/graph/query")
                    .method("POST", body)
                    .addHeader("Authorization", "Basic am9zZWVkdWFyZG8uZ2FyY2lhbHVuYUBudHRkYXRhLmNvbTo2OTY5Njk2OTY5")
                    .addHeader("Content-Type", "application/json")
                    .build();
            Response response = client.newCall(request).execute();
            String mJsonString = Objects.requireNonNull(response.body().string());
            return  mJsonString;
        }catch (Exception e){
            return null;
        }
    }

}
