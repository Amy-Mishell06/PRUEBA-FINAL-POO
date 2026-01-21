package com.proyectofinal.prueba_final_poo.service;

import com.proyectofinal.prueba_final_poo.model.Estudiante;
import java.util.List;

// Interfaz del servicio
public interface EstudianteService {

    List<Estudiante> listarTodos();

    Estudiante obtenerPorId(Long id);

    Estudiante guardar(Estudiante estudiante);

    Estudiante actualizar(Long id, Estudiante estudiante);

    void eliminar(Long id);
}
