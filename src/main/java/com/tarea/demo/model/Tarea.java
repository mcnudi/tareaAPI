package com.tarea.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "tarea")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private boolean completada;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private  LocalDate fecha;
    private String prioridad;


   
}

