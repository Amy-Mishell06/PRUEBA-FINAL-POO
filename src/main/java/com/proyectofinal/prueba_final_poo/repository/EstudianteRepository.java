package com.proyectofinal.prueba_final_poo.repository;

// Importa la entidad
import com.proyectofinal.prueba_final_poo.model.Estudiante;
// Importa JPA Repository
import org.springframework.data.jpa.repository.JpaRepository;
// Marca esta interfaz como repositorio
import org.springframework.stereotype.Repository;

// Repositorio que maneja la entidad Estudiante
// JpaRepository ya trae CRUD listo
@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    // No es necesario escribir métodos
    // Spring genera automáticamente findAll, save, delete, etc.
}
