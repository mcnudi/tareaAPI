package com.tarea.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarea.demo.model.Tarea;
import com.tarea.demo.repository.TareaRepository;

@RestController
@RequestMapping("/api/tareas")
@CrossOrigin(origins = "http://localhost:4200")

public class TareaController {
    @Autowired
    private TareaRepository tareaRepo;
    
    @PostMapping("/crear")
    public ResponseEntity<Tarea> crearTarea(@RequestBody Tarea tarea){
        Tarea tareaG = tareaRepo.save(tarea);
        
        return ResponseEntity.ok(tareaG);
    }
    @GetMapping("/listadoT")
    public List<Tarea> mostrarTareas(){
        return tareaRepo.findAll();
    }

    @GetMapping("/listadoCaducar")
    public ResponseEntity<List<Tarea>> mostrarTareasCaducadas(){
        // Obtener la fecha de hoy
        //LocalDate today = LocalDate.now();

        // Obtener la fecha de dos días antes  de la fecha de finalización hasta hoy
        //LocalDate twoDaysBefore = today.minusDays(2);
        //System.out.println("Hoy es:"+twoDaysBefore);
        
        // Consulta de tareas cuya fecha esté entre dos días antes de finalizar y hoy
        List<Tarea> tareas = tareaRepo.findTareasByFechaBetween();
        
        // Si no hay tareas que caducan, se devuelve un 204 No Content
        if (tareas.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            // Devolver las tareas encontradas con un 200 OK
            return ResponseEntity.ok(tareas);
        }
    }

    
    
}
