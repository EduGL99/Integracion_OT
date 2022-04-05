package com.example.Integracion_OT.controller;

import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import okhttp3.*;

import java.util.Objects;

import static com.example.Integracion_OT.models.GetUnsafeOkHttpClient.getUnsafeOkHttpClient;

public class QueryController extends WorkTicket {

    public String queryMutacion(String name, String description, String type, String priority) {
        try {
            OkHttpClient client = getUnsafeOkHttpClient();
            MediaType mediaType = MediaType.parse("application/json");
            RequestBody body = RequestBody.create(mediaType, "{\"query\":\"mutation project($new: AddProjectInput!){\\r\\n  createProject(input : $new){\\r\\n    name\\r\\n    description\\r\\n    location{\\r\\n      name\\r\\n    }\\r\\n    type{\\r\\n      id\\r\\n    }\\r\\n    properties{\\r\\n      propertyType{\\r\\n        id\\r\\n      }\\r\\n    }\\r\\n  }\\r\\n}\",\"variables\":{\"new\":{\"type\":\""+type+"\",\"name\":\""+name+"\",\"description\":\""+description+"\",\"priority\":\""+priority+"\"}}}");
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
        }catch (Exception e){
            return null;
        }
    }


}
