package com.wilber.Spring.Initializr.Domain.sevice;

import com.wilber.Spring.Initializr.Domain.persistence.entity.Vehiculo;
import com.wilber.Spring.Initializr.application.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class VehiculoServiceImpl implements VehiculoService {
    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public List<Vehiculo> findByName(String name){
        return new ArrayList<>(vehiculoRepository.findByNameIgnoreCase("%"+ name + "%"));
    }
}
