package com.example.Ejercicio_1.Controller;

import com.example.Ejercicio_1.DTO.CaloriasDTO;
import com.example.Ejercicio_1.DTO.IngredienteDTO;
import com.example.Ejercicio_1.DTO.PlatoDTO;
import com.example.Ejercicio_1.Service.PlatoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlatoController {
    private final PlatoService platoService = new PlatoService();

    @GetMapping("/platos")
    public List<PlatoDTO> devolverPlatos() {
        return platoService.getPlatos();
    }

    @GetMapping("/ingredientes")
    public List<IngredienteDTO> devolverIngredientes() {
        return platoService.getIngredientes();
    }

    @GetMapping("/platos/{name}")
    public CaloriasDTO devolverCalorias(@PathVariable String name){
        return platoService.getCaloriasDTO(name);
    }
}
