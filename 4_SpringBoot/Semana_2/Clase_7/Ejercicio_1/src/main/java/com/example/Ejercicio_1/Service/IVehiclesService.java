package com.example.Ejercicio_1.Service;

import com.example.Ejercicio_1.Model.Vehicles;

import java.util.List;
import java.util.Optional;

public interface IVehiclesService {

    public Vehicles createVehicle(Vehicles vehicle);
    public List<Vehicles> getAllVehicles();
    public List<Vehicles> getVehiclesByPrice();
    public Vehicles getVehicleById(Long id);
}
