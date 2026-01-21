package com.proyectofinal.prueba_final_poo.exception;

// Excepción que se lanza cuando un recurso no existe
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String mensaje) {
        super(mensaje);
    }
}
