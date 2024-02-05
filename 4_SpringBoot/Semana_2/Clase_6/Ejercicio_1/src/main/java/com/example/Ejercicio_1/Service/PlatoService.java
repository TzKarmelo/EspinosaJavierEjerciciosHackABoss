package com.example.Ejercicio_1.Service;

import com.example.Ejercicio_1.DTO.CaloriasDTO;
import com.example.Ejercicio_1.DTO.IngredienteDTO;
import com.example.Ejercicio_1.DTO.PlatoDTO;
import com.example.Ejercicio_1.Repository.PlatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlatoService implements IPlatoService{

    private final PlatoRepository platoRepository = new PlatoRepository();
    @Override
    public List<PlatoDTO> getPlatos() {
        return platoRepository.getPlatos();
    }

    @Override
    public List<IngredienteDTO> getIngredientes() {
        return platoRepository.getIngredientes();
    }

    @Override
    public CaloriasDTO getCaloriasDTO(String name) {
        return platoRepository.getCaloriesDTO(name);
    }
}
