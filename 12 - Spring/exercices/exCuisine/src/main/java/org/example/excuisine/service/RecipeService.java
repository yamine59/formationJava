package org.example.excuisine.service;

import org.example.excuisine.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class RecipeService implements IService<Recipe> {

    private final Map<UUID, Recipe> recettes;

    public RecipeService() {
        recettes = new HashMap<>();
    }

    @Override
    public void saveOrUpdate(Recipe recette) {
        recettes.put(recette.getId(),recette);
    }

    @Override
    public Recipe getById(UUID id) {
        return recettes.get(id);
    }

    @Override
    public List<Recipe> getAll() {
        return recettes.values().stream().toList();
    }

    @Override
    public void delete(UUID id) {
        recettes.remove(id);
    }
}
