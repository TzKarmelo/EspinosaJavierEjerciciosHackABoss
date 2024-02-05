package com.example.Ejercicio_1.Repository;

import com.example.Ejercicio_1.DTO.CaloriasDTO;
import com.example.Ejercicio_1.DTO.IngredienteDTO;
import com.example.Ejercicio_1.DTO.PlatoDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
@Getter
public class PlatoRepository {

    private final List<PlatoDTO> platos = loadDataBasePlatos();
    private final List<IngredienteDTO> ingredientes = loadDataBaseIngredientes();

    private List<PlatoDTO> loadDataBasePlatos() {
        File file = null;
        try {
            file = ResourceUtils.getFile("dishes.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PlatoDTO>> typeRef = new TypeReference<>() {
        };
        List<PlatoDTO> platos = null;
        try {
            platos = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return platos;
    }

    private List<IngredienteDTO> loadDataBaseIngredientes() {
        File file = null;
        try {
            file = ResourceUtils.getFile("ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<IngredienteDTO>> typeRef = new TypeReference<>() {
        };
        List<IngredienteDTO> ingredientes = null;
        try {
            ingredientes = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingredientes;
    }

    private PlatoDTO platoPorNombre(String name) {
        return platos.stream()
                .filter(dishDTO -> dishDTO.getNombre().equals(name))
                .findFirst()
                .orElse(null);
    }

    private IngredienteDTO ingredientePorId(Long id) {
        return ingredientes.stream()
                .filter(ingredientDTO -> ingredientDTO.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    private Long sumarCalorias(PlatoDTO plato) {
        Long suma = 0L;
        for (Long ingredienteId : plato.getIngredientes()) {
            IngredienteDTO ingrediente = ingredientePorId(ingredienteId);
            if (ingrediente != null) {
                suma += ingrediente.getCalories();
            }
        }

        return suma;
    }

    private IngredienteDTO getMayorCalorias(PlatoDTO dish) {
        IngredienteDTO highestCalories = ingredientes.get(0);
        for (Long ingrdedientId : dish.getIngredientes()) {
            IngredienteDTO ingredientDTO = ingredientePorId(ingrdedientId);
            if (ingredientDTO != null
                    && ingredientDTO.getCalories() > highestCalories.getCalories()) {
                highestCalories = ingredientDTO;
            }
        }

        return highestCalories;
    }

    private List<IngredienteDTO> getIngredientListByIds(Long[] ids) {
        List<IngredienteDTO> ingredients = new ArrayList<>();
        for (Long id : ids) {
            IngredienteDTO ingredient = ingredientePorId(id);
            if (ingredient != null) {
                ingredientes.add(ingredient);
            }
        }

        return ingredientes;
    }

    public CaloriasDTO getCaloriesDTO(String name) {
        PlatoDTO plato = platoPorNombre(name);
        CaloriasDTO caloriasDTO = new CaloriasDTO();
        if (plato != null) {
            caloriasDTO.setTotalCalorias(sumarCalorias(plato));
            caloriasDTO.setMayorCalorias(getMayorCalorias(plato));
            caloriasDTO.setIngredientes(getIngredientListByIds(plato.getIngredientes()));
        }
        return caloriasDTO;
    }
}
