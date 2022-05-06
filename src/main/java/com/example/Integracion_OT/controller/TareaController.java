package com.example.Integracion_OT.controller;

import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import com.example.Integracion_OT.models.OrdenMaestra;
import com.example.Integracion_OT.models.Tarea;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static com.example.Integracion_OT.models.GetUnsafeOkHttpClient.getUnsafeOkHttpClient;

@RestController
@RequestMapping("/tarea")
public class TareaController {

    // envio de valores a ws
    @RequestMapping(value = "prueba", method = RequestMethod.GET)
    public String setTarea(WorkTicket workTicket){
        Tarea tarea=new Tarea();
        OrdenMaestra maestra=new OrdenMaestra();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        String titulo = workTicket.getCharacteristic().get(0).getValue();
        String ventanaValue = workTicket.getCharacteristic().get(1).getValue();
        String fechaI = workTicket.getCharacteristic().get(2).getValue();
        String fechaF = workTicket.getCharacteristic().get(3).getValue();
        String riesgo = workTicket.getCharacteristic().get(5).getValue();
        String ventana = "";
        // validacion de cambio en ventana
        if (ventanaValue.equals("No Aplica")){
            ventana = "0";
        }
        if (ventanaValue.equals("Si Aplica")){
            ventana = "1";
        }
        if (ventanaValue.equals("Extendida")){
            ventana = "2";
        }

        String projectId = workTicket.getRelatedEntity().get(0).getId();
        String jsonProject = consultaWO(projectId);
        String origenFolio = "";
        String nivelAfectacion = "";
        String afectacionCliente = "";
        try{
            JSONObject jsonObject=new JSONObject(jsonProject);
            origenFolio = jsonObject.getJSONObject("data").getJSONObject("project").getJSONArray("properties").getJSONObject(5).getString("stringValue");
            nivelAfectacion = jsonObject.getJSONObject("data").getJSONObject("project").getJSONArray("properties").getJSONObject(7).getString("stringValue");
            afectacionCliente = jsonObject.getJSONObject("data").getJSONObject("project").getJSONArray("properties").getJSONObject(8).getString("stringValue");
        }catch (Exception e){
            System.out.println("Exception: " + e.toString());
        }

        tarea.setTitulo(titulo);
        tarea.setFechaInicio(fechaI);
        tarea.setFechaFin(fechaF);
        tarea.setRiesgo(riesgo);
        tarea.setVentana(ventana);
        tarea.setFolioGUIO(workTicket.getRelatedEntity().get(0).getName());
        tarea.setServiciosAfectados(origenFolio+"/"+nivelAfectacion+"/"+afectacionCliente);
//        tarea.setIdElemento();
        tarea.setFechaCreada(dtf.format(LocalDateTime.now())); // fecha cuando se ejecuta el evento
        tarea.setIdEstatus(1);
        tarea.setIdOrdenMaestra(maestra.getIdOrdenMaestra()); // valor id de la orden maestra
        tarea.setIdUsuaarioSS("0");
        tarea.setIdBovedaPass(0);
        tarea.setIdTipoTrabajo("9999999999");
        tarea.setIdSubtipoTrabajo(264);
        tarea.setIdAfectacion(2);
        tarea.setIdAfectacionCarrier(2);
        tarea.setIdAfectacionCliente(1);
        tarea.setIdOrigen(9); // se mandara el id_origen que equivale a symphony
        tarea.setIdTarea(maestra.getIdOrdenMaestra() + 0.001); // valor de concatenacion del idOrdenMaestra con .001
        tarea.setIdAutor(243);
        tarea.setIdFirmaCCR(0);
        tarea.setIdFirmaCPD(0);
        tarea.setIdFirmaROP(0);
        tarea.setIdCPD(null);
        tarea.setIdOTPTarea(null);
        tarea.setIdCTLProyecto(null);
        tarea.setReprogramada(0);
        tarea.setUrgente(1);

        ArrayList arrayListTarea=new ArrayList();
        arrayListTarea.add(tarea);
        //return arrayListTarea;
        String TareaJson = new Gson().toJson(arrayListTarea);
        return TareaJson;
    }

    @RequestMapping(value = "crear_tarea", method = RequestMethod.POST)
    public ArrayList crearTarea(@RequestBody Tarea tarea){
        //setTarea();
        tarea.getTitulo();
        tarea.getFechaInicio();
        tarea.getFechaFin();
        tarea.getServiciosAfectados();
        tarea.getRiesgo();
        tarea.getFolioGUIO();
        tarea.getIdElemento();

        ArrayList crearT=new ArrayList();
        //crearT.add(setTarea());
        crearT.add(tarea);
        return crearT;
    }

    public String consultaWO(String projectId){
        try {
            OkHttpClient client = getUnsafeOkHttpClient();
            MediaType mediaType = MediaType.parse("application/json");
            okhttp3.RequestBody body = okhttp3.RequestBody.create(mediaType, "{\"query\":\"query proyectOT($projectId: ID!){\\r\\n  project: node(id: $projectId){\\r\\n    ...datos\\r\\n  }\\r\\n}\\r\\n\\r\\nfragment datos on Project{\\r\\n  id\\r\\n  name\\r\\n  properties{\\r\\n    id\\r\\n    stringValue\\r\\n  }\\r\\n}\",\"variables\":{\"projectId\":\""+projectId+"\"}}");
            Request request = new Request.Builder()
                    .url("https://symphony.telefonica.com.mx/graph/query")
                    .method("POST", body)
                    .addHeader("Authorization", "Basic am9zZWVkdWFyZG8uZ2FyY2lhbHVuYUBudHRkYXRhLmNvbTo2OTY5Njk2OTY5")
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Cookie", "connect.sid=s%3Ac6bEcxgtwR0XIbYx1h9ozHfVrV-ISJeT.pox8BVCgNKkmYz1WJF6ly2PdlQPW%2BcsOIgTpUl189P0")
                    .build();
            Response response = client.newCall(request).execute();
            return Objects.requireNonNull(response.body().string());
        } catch (Exception e){
            return null;
        }
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
