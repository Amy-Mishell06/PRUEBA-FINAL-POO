package com.proyectofinal.prueba_final_poo.controller;

// Importaciones necesarias
import com.proyectofinal.prueba_final_poo.model.Estudiante;
import com.proyectofinal.prueba_final_poo.service.EstudianteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Indica que esta clase es un controlador REST
@RestController
// Ruta base del controlador
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    // Inyección del servicio
    @Autowired
    private EstudianteService service;

    // GET: listar todos los estudiantes
    @GetMapping
    public List<Estudiante> listar() {
        return service.listarTodos();
    }

    // GET: obtener estudiante por ID
    @GetMapping("/{id}")
    public Estudiante obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    // POST: crear nuevo estudiante
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Estudiante crear(@Valid @RequestBody Estudiante estudiante) {
        return service.guardar(estudiante);
    }

    // PUT: actualizar estudiante
    @PutMapping("/{id}")
    public Estudiante actualizar(@PathVariable Long id,
                                 @Valid @RequestBody Estudiante estudiante) {
        return service.actualizar(id, estudiante);
    }

    // DELETE: eliminar estudiante
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
