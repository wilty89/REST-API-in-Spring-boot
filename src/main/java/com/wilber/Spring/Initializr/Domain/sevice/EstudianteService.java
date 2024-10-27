package com.wilber.Spring.Initializr.Domain.sevice;

import com.wilber.Spring.Initializr.application.repository.EstudianteRepository;
import com.wilber.Spring.Initializr.Domain.persistence.entity.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    public  EstudianteRepository estudianteRepository;

    private List<Estudiante> userList;
    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }
    public List<Estudiante> listarEstudiantes() {
        return estudianteRepository.findAllByOrderByNombreAsc();
    }
    public List<Estudiante> listarEstudiantesPorId(long id) {
        return estudianteRepository.findById(id);
    }
    public Estudiante AgregarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
    public void eliminarEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }

    public EstudianteService() {
        userList = new ArrayList<>();

        Estudiante user1 = new Estudiante(1,"Ida", 32);
        Estudiante user2 = new Estudiante(2,"Hans", 26);
        Estudiante user3 = new Estudiante(3,"Lars", 45);
        Estudiante user4 = new Estudiante(4,"Ben", 32);
        Estudiante user5 = new Estudiante(5,"Eva", 59);

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }
    public Optional<Estudiante> getUser(Integer id) {
        Optional<Estudiante> optional = Optional.empty();
        for (Estudiante estudiante: userList) {
            if(id == estudiante.getId()){
                optional = Optional.of(estudiante);
                return optional;
            }
        }
        return optional;
    }
}
