package com.tarea.demo.model;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")

@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String username;
    private String contraseña;

}
