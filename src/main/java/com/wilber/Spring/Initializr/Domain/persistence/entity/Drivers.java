package com.wilber.Spring.Initializr.Domain.persistence.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

public class Drivers {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nombre;
        private Integer edad;
    public Drivers() {


    }
    public Drivers(Long id, String nombre, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setName(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setAge(Integer edad) {
        this.edad = edad;
    }
}
