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
    int idTipoTrabajo;
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
    int idCPD;
    int ventana;
    int idOTPTarea;
    String folioGUIO;
    int idCTLProyecto;
    int reprogramada;
    int urgente;

}
