package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Expedientes")
@Getter
@Setter
public class Expediente {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String fechaInsc;
    private int calificacion;
    private String fechaFin;

}
