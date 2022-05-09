package com.example.Integracion_OT.controller;

import com.example.Integracion_OT.model.tmfxxx.WorkTicket;

import java.util.List;

public class WorkTicketController {

    public void SolicitaOT(WorkTicket workTicket){

        String name = workTicket.getName();
        List characteristic = workTicket.getCharacteristic();
        List relatedEntity = workTicket.getRelatedEntity();
        
        OrdenMaestraController ordenMaestraController=new OrdenMaestraController();
        ordenMaestraController.setOrdenMaestra(workTicket);

        TareaController tareaController=new TareaController();
        tareaController.setTarea(workTicket);

    }

}
