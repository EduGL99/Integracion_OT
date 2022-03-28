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

    int idOrdenMaestra;
    String titulo;
    String fechaObjetivo;
    String justificacionTecnica;
    String Objetivo;
    String fechaCreada;
    int idAutor;
    int idPryecto;
    int idEstatusMaestra;
    String riesgo;
    int idCalendario;
    int esCritica;
    int idOTPMaestra;
    int idTipoOrdenMaestra;

}
