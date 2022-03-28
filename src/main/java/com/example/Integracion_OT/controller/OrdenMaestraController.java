package com.example.Integracion_OT.controller;

public class OrdenMaestraController {

    int idOrdenMaestra; // valor que se obtiene al invocar una secuencia en BD de OTs
    String titulo; // campo que viene de symphony
    String fechaObjetivo; // campo que viene de symphony
    String justificacionTecnica; // campo que viene de symphony
    String Objetivo = "No aplica";
    String fechaCreada; //cuando ejecuta el evento
    int idAutor; // se va a mandar valor seteado Usuario Sistema (243)
    int idPryecto = 3;
    int idEstatusMaestra = 1;
    String riesgo = "No aplica";
    int idCalendario = 0;
    int esCritica = 5;
    String idOTPMaestra = null;
    String idTipoOrdenMaestra =  null;

}
