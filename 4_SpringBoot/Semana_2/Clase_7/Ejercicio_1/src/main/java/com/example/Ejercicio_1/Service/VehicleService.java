package com.example.Ejercicio_1.Service;

import com.example.Ejercicio_1.Model.Vehicles;
import com.example.Ejercicio_1.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService implements IVehiclesService{

    List<Vehicles> vehiclesList =new ArrayList<>();
    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public Vehicles createVehicle(Vehicles vehicle) {
        return vehicleRepository.createVehicle(vehicle);
    }

    @Override
    public List<Vehicles> getAllVehicles() {
        return vehicleRepository.getAllVehicles();
    }

    @Override
    public List<Vehicles> getVehiclesByPrice() {
        return vehicleRepository.getVehiclesByPrice();
    }

    @Override
    public Vehicles getVehicleById(Long id) {
        return vehicleRepository.getVehicleById(id).orElse(null);
    }
}
