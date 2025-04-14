package com.tarea.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarea.demo.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
}
