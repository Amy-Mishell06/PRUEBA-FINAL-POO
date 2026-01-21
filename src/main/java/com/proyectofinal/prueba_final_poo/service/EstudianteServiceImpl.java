package com.proyectofinal.prueba_final_poo.service;

// Importa la excepción personalizada
import com.proyectofinal.prueba_final_poo.exception.ResourceNotFoundException;
// Importa la entidad
import com.proyectofinal.prueba_final_poo.model.Estudiante;
// Importa el repositorio
import com.proyectofinal.prueba_final_poo.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Indica que esta clase es un servicio
@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository repository;

    @Override
    public List<Estudiante> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Estudiante obtenerPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Estudiante no encontrado con ID: " + id));
    }

    @Override
    public Estudiante guardar(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    @Override
    public Estudiante actualizar(Long id, Estudiante estudiante) {
        Estudiante existente = obtenerPorId(id);
        existente.setNombre(estudiante.getNombre());
        existente.setEmail(estudiante.getEmail());
        existente.setEdad(estudiante.getEdad());
        existente.setCarrera(estudiante.getCarrera());
        return repository.save(existente);
    }

    @Override
    public void eliminar(Long id) {
        Estudiante estudiante = obtenerPorId(id);
        repository.delete(estudiante);
    }
}
