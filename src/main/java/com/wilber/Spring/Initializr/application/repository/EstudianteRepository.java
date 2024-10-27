package com.wilber.Spring.Initializr.application.repository;

import com.wilber.Spring.Initializr.Domain.persistence.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    List<Estudiante> findAllByOrderByNombreAsc();
    List<Estudiante> findById(long id);
    //public Estudiante AgregarEstudiante(Estudiante estudiante);


}
