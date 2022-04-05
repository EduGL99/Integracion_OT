package com.example.Integracion_OT.controller;

import com.example.Integracion_OT.models.OrdenMaestra;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

import static com.example.Integracion_OT.models.GetUnsafeOkHttpClient.getUnsafeOkHttpClient;

@RestController
@RequestMapping("/maestra")
public class OrdenMaestraController {

    @RequestMapping(value = "prueba", method = RequestMethod.GET)
    public ArrayList setOrdenMaestra(){
        OrdenMaestra maestra=new OrdenMaestra();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");

        maestra.setObjetivo("No aplica");
        maestra.setFechaCreada(dtf.format(LocalDateTime.now())); // fecha cuando se ejecuta el evento
        maestra.setIdAutor(243);
        maestra.setIdPryecto(3);
        maestra.setIdEstatusMaestra(1);
        maestra.setRiesgo("No aplica");
        maestra.setIdCalendario(0);
        maestra.setEsCritica(5);
        maestra.setIdOTPMaestra(null);
        maestra.setIdTipoOrdenMaestra(null);

        ArrayList arrayListMaestra = new ArrayList();
        arrayListMaestra.add(maestra);
        return arrayListMaestra;
    }

    @RequestMapping(value = "crear_orden_maestra", method = RequestMethod.POST)
    public ArrayList crearOrdenMaestra(@RequestBody OrdenMaestra ordenMaestra){
        setOrdenMaestra();
        ordenMaestra.getIdOrdenMaestra();
        ordenMaestra.getTitulo();
        ordenMaestra.getFechaObjetivo();
        ordenMaestra.getJustificacionTecnica();

        ArrayList crearOM=new ArrayList();
        crearOM.add(setOrdenMaestra());
        crearOM.add(ordenMaestra);
        return crearOM;
    }

    public void modificarOrdenMaestra(){

    }

    public String createProject(String name, String description, String type, String priority) {
        try {
            OkHttpClient client = getUnsafeOkHttpClient();
            MediaType mediaType = MediaType.parse("application/json");
            okhttp3.RequestBody body = okhttp3.RequestBody.create(mediaType, "{\"query\":\"mutation project($new: AddProjectInput!){\\r\\n  createProject(input : $new){\\r\\n    name\\r\\n    description\\r\\n    location{\\r\\n      name\\r\\n    }\\r\\n    type{\\r\\n      id\\r\\n    }\\r\\n    properties{\\r\\n      propertyType{\\r\\n        id\\r\\n      }\\r\\n    }\\r\\n  }\\r\\n}\",\"variables\":{\"new\":{\"type\":\"" + type + "\",\"name\":\"" + name + "\",\"description\":\"" + description + "\",\"priority\":\"" + priority + "\"}}}");
            Request request = new Request.Builder()
                    .url("https://symphony.telefonica.com.mx/graph/query")
                    .method("POST", body)
                    .addHeader("Authorization", "Basic am9zZWVkdWFyZG8uZ2FyY2lhbHVuYUBudHRkYXRhLmNvbTo2OTY5Njk2OTY5")
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Cookie", "connect.sid=s%3AJXLLeDJmCurlEiIT2-Kds-DHDnLpNex2.RK2eam0f5AWqHqlLFrbMTq%2BOTHNB6%2FLOmfZnxJYN%2Bn4")
                    .build();
            Response response = client.newCall(request).execute();
            String mJsonString = Objects.requireNonNull(response.body().string());
            return mJsonString;
        } catch (Exception e) {
            return null;
        }
    }

    public String editProject(String id, String name, String description, String type, String priority){
        try {
            OkHttpClient client = getUnsafeOkHttpClient();
            MediaType mediaType = MediaType.parse("application/json");
            okhttp3.RequestBody body = okhttp3.RequestBody.create(mediaType, "{\"query\":\"mutation upproject($new: EditProjectInput!){\\r\\n  editProject(input: $new){\\r\\n    id\\r\\n    name\\r\\n    description\\r\\n    location{\\r\\n      name\\r\\n    }\\r\\n    type{\\r\\n      id\\r\\n    }\\r\\n    properties{\\r\\n      propertyType{\\r\\n        id\\r\\n      }\\r\\n    }\\r\\n  }\\r\\n}\",\"variables\":{\"new\":{\"id\":\""+id+"\",\"type\":\""+type+"\",\"name\":\""+name+"\",\"description\":\""+description+"\",\"priority\":\""+priority+"\"}}}");
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
            return  null;
        }
    }

}
