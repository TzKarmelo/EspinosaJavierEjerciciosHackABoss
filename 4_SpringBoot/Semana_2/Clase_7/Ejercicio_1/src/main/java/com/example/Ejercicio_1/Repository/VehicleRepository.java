package com.example.Ejercicio_1.Repository;

import com.example.Ejercicio_1.Model.Vehicles;
import com.example.Ejercicio_1.Service.VehicleService;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class VehicleRepository {

    private final List<Vehicles> vehicleList = new ArrayList<>();
    public Vehicles createVehicle(Vehicles vehicle) {
        vehicleList.add(vehicle);
        return vehicle;
    }

    public List<Vehicles> getAllVehicles() {
            return vehicleList;
    }

    public List<Vehicles> getVehiclesByPrice() {
        return vehicleList.stream()
                .sorted((v1, v2) -> v1.getPrice().compareTo(v2.getPrice()))
                .toList();
    }

    public Optional<Vehicles> getVehicleById(Long id) {
        return vehicleList.stream()
                .filter(vehicle -> vehicle.getId().equals(id))
                .findFirst();
    }
}
