package com.example.Integracion_OT.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrdenMaestra {

    private int idOrdenMaestra;
    private String titulo;
    private String fechaObjetivo;
    private String justificacionTecnica;
    private String Objetivo;
    private String fechaCreada;
    private int idAutor;
    private int idProyecto;
    private int idEstatusMaestra;
    private String riesgo;
    private int idCalendario;
    private int esCritica;
    private String idOTPMaestra;
    private String idTipoOrdenMaestra;

}
