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

    int idOrden;
    String titulo;
    String fechaCreada;
    String fechaInicio;
    String fechaFin;
    int idEstatus;
    String ServiciosAfectados;
    String Riesgo;
    int idOrdenMaestra;
    String idUsuaarioSS;
    int idBovedaPass;
    String idTipoTrabajo;
    int idSubtipoTrabajo;
    int idAfectacion;
    int idAfectacionCarrier;
    int idAfectacionCliente;
    int idOrigen;
    int idTarea;
    int idAutor;
    int idFirmaCCR;
    int idFirmaCPD;
    int idFirmaROP;
    String idCPD;
    int ventana;
    String idOTPTarea;
    String folioGUIO;
    String idCTLProyecto;
    int reprogramada;
    int urgente;

}
