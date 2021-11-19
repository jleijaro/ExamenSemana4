package com.example.ExamenSemana4.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Alumnos")
@Getter @Setter
public class Alumno {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String mail;

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(Integer dni, String nombre, String apellido, String direccion, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.mail = mail;
    }
}
