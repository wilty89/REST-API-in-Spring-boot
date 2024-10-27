package com.wilber.Spring.Initializr.Domain.sevice;

import com.wilber.Spring.Initializr.Domain.persistence.entity.Vehiculo;

import java.util.List;

public interface VehiculoService {


    List<Vehiculo> findByName(String name);
}
