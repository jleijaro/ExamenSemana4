package com.example.ExamenSemana4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Contenido")
@Getter
@Setter
public class Contenido {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String nombre;
    private String descripcion;
    private int duracion;
}
