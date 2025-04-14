package com.tarea.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tarea.demo.model.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Long>{
    @Query(value="SELECT * FROM Tarea WHERE fecha >= DATE_SUB(fecha, INTERVAL 2 DAY) AND completada = false",nativeQuery = true)
    List<Tarea> findTareasByFechaBetween();
}
