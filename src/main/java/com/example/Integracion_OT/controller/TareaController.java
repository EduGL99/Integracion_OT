package com.example.Integracion_OT.controller;

public class TareaController {

    int idOrden; // valor que se obtiene al invocar una secuencia en BD de OTs
    String titulo; // campo que viene de symphony
    String fechaCreada; //cuando ejecuta el evento
    String fechaInicio; // campo que viene de symphony
    String fechaFin; // campo que viene de symphony
    int idEstatus = 1;
    String ServiciosAfectados = "No aplica";
    String Riesgo = "No aplica";
    int idOrdenMaestra; // valor de la orden maestra
    String idUsuaarioSS = "0";
    int idBovedaPass = 0;
    String idTipoTrabajo = "9999999999";
    int idSubtipoTrabajo = 264;
    int idAfectacion = 2;
    int idAfectacionCarrier = 2;
    int idAfectacionCliente = 1;
    int idOrigen = 3;
    int idTarea; // valor de concatenacion del idOrdenMaestra con .001
    int idAutor; // se va a mandar valor seteado Usuario Sistema (243)
    int idFirmaCCR = 0;
    int idFirmaCPD = 0;
    int idFirmaROP = 0;
    String idCPD = null;
    int ventana = 0;
    String idOTPTarea = null;
    String folioGUIO; // campo que viene de symphony
    String idCTLProyecto =  null;
    int reprogramada = 0;
    int urgente = 1;

}
