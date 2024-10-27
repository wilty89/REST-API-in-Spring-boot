package com.wilber.Spring.Initializr.web.contoller;

import com.wilber.Spring.Initializr.Domain.DTO.KeyDto;
import com.wilber.Spring.Initializr.Domain.persistence.entity.Vehiculo;
import com.wilber.Spring.Initializr.Domain.sevice.VehiculoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {
    @Autowired
    private VehiculoServiceImpl vehiculoServices;
    @PostMapping("/findByName")
    public ResponseEntity<Object>findByName(@RequestBody KeyDto<String> KeyDto){
        List<Vehiculo> byName= vehiculoServices.findByName(KeyDto.getKey());
        return ResponseHelper.generateResponse("Successfully retrieved data!", HttpStatus.OK, byName, byName.toString().length());
    }

}


