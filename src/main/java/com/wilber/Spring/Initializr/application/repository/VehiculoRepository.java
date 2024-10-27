package com.wilber.Spring.Initializr.application.repository;

import com.wilber.Spring.Initializr.Domain.persistence.entity.Estudiante;
import com.wilber.Spring.Initializr.Domain.persistence.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
    public List<Vehiculo>findByNameIgnoreCase(String names);

    public Optional<Vehiculo> findByName(String name);
}
