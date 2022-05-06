package com.example.Integracion_OT.controller;

import com.example.Integracion_OT.model.tmfxxx.WorkTicket;
import com.google.gson.Gson;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.stereotype.Component;

@Component
@ExternalTaskSubscription("CheckProyectServiceOT")
public class ExecuteMicroService implements ExternalTaskHandler{

    @Override
    public void execute(ExternalTask extTask, ExternalTaskService extTaskService) {
        String workOrderJson = extTask.getVariable("workOrder").toString();
        String elementoWO = extTask.getVariable("elemento").toString();
        WorkTicketController workTicketController = new WorkTicketController();
        WorkTicket workOrder = new Gson().fromJson(workOrderJson,WorkTicket.class);
        try{
            workTicketController.SolicitaOT(workOrder);

            OrdenMaestraController ordenMaestraController=new OrdenMaestraController();
            ordenMaestraController.setOrdenMaestra(workOrder);

            TareaController tareaController=new TareaController();
            tareaController.setTarea(workOrder);

            VariableMap variables = Variables.createVariables();
            extTaskService.complete(extTask,variables);

        }catch (Exception e){
            VariableMap variables = Variables.createVariables();
            extTaskService.complete(extTask,variables);
        }

    }

}
