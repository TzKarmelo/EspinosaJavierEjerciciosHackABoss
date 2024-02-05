package com.example.Ejercicio_1.Controller;

import com.example.Ejercicio_1.Model.Vehicles;
import com.example.Ejercicio_1.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping
    public Vehicles createVehicle(@RequestBody Vehicles vehicle) {
        return vehicleService.createVehicle(vehicle);
    }

    @GetMapping
    public List<Vehicles> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/prices")
    public List<Vehicles> getVehiclesByPrice() {
        return vehicleService.getVehiclesByPrice();
    }

    @GetMapping("/{id}")
    public Vehicles getVehicleById(@PathVariable Long id) {
        return vehicleService.getVehicleById(id);
    }
}
