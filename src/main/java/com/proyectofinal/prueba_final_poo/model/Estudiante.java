package com.proyectofinal.prueba_final_poo.model;

// Importaciones para JPA (base de datos)
import jakarta.persistence.*;
// Importaciones para validaciones
import jakarta.validation.constraints.*;

//entidad que representa la tabla estudiante
@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "El email no es válido")
    private String email;

    @Min(value = 16, message = "La edad mínima es 16")
    @Max(value = 60, message = "La edad máxima es 60")
    private Integer edad;

    @NotBlank(message = "La carrera es obligatoria")
    private String carrera;

    // Constructor vacío (obligatorio para JPA)
    public Estudiante() {
    }

    public Estudiante(String nombre, String email, Integer edad, String carrera) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.carrera = carrera;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
