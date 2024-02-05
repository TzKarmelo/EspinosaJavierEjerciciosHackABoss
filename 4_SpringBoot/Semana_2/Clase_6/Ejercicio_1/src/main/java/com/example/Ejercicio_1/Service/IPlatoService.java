package com.example.Ejercicio_1.Service;

import com.example.Ejercicio_1.DTO.CaloriasDTO;
import com.example.Ejercicio_1.DTO.IngredienteDTO;
import com.example.Ejercicio_1.DTO.PlatoDTO;

import java.util.List;

public interface IPlatoService {

    List<PlatoDTO> getPlatos();
    List<IngredienteDTO> getIngredientes();
    CaloriasDTO getCaloriasDTO(String name);
}
