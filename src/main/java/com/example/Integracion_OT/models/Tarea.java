package com.example.Integracion_OT.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tarea {

    private int idOrden;
    private String titulo;
    private String fechaCreada;
    private String fechaInicio;
    private String fechaFin;
    private int idEstatus;
    private String serviciosAfectados;
    private String riesgo;
    private int idOrdenMaestra;
    private String idUsuaarioSS;
    private int idBovedaPass;
    private String idTipoTrabajo;
    private int idSubtipoTrabajo;
    private int idAfectacion;
    private int idAfectacionCarrier;
    private int idAfectacionCliente;
    private int idOrigen;
    private double idTarea;
    private int idAutor;
    private int idFirmaCCR;
    private int idFirmaCPD;
    private int idFirmaROP;
    private String idCPD;
    private int ventana;
    private String idOTPTarea;
    private String folioGUIO;
    private String idCTLProyecto;
    private int reprogramada;
    private int urgente;

}
