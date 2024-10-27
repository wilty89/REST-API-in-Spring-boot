package com.wilber.Spring.Initializr.web.contoller;

import com.wilber.Spring.Initializr.Domain.sevice.EstudianteService;
import com.wilber.Spring.Initializr.Domain.persistence.entity.Estudiante;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")

public class StudentsController {
    private final EstudianteService estudianteService;
    public StudentsController(EstudianteService estudianteService ) {

        this.estudianteService = estudianteService;

    }
    @GetMapping("/est")
    public ResponseEntity<Estudiante> getEstudents2(){

        var Estudiante2=new Estudiante();
        Estudiante2.setId(56);
        Estudiante2.setNombre("alex");


        return new ResponseEntity<>(Estudiante2,HttpStatus.OK);
    }


    //http://localhost:8554/v1/api/students/user?id=1
    @GetMapping("/user")
    public Estudiante getUser(@RequestParam Integer id){
        Optional<Estudiante> estudiante = estudianteService.getUser(id);
        return (Estudiante) estudiante.orElse(null);
    }

    @GetMapping("/getstudents")
    public List<Estudiante> getstudents() {

        return estudianteService.listarEstudiantes();
    }

    // Create a new students
    @RequestMapping(value = "/createstudents",method = RequestMethod.POST)
    public Estudiante createstudents(@RequestBody Estudiante estudiante) {
        return estudianteService.AgregarEstudiante(estudiante);
    }

    @RequestMapping(value="deletestudents/{id}" ,method= RequestMethod.DELETE)
    public void deletestudents(@PathVariable Long id) {
        estudianteService.eliminarEstudiante(id);
    }

    @GetMapping("/getstudentsbyid/{id}")
    public ResponseEntity<?> getstudentsbyid(@PathVariable Long id) {
        try {
            System.out.println("id:" + id);
            return ResponseEntity.status(HttpStatus.OK).body(estudianteService.listarEstudiantesPorId(id));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

}