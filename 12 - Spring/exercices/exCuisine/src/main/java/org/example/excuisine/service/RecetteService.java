package org.example.excuisine.service;

import org.example.excuisine.model.Categorie;
import org.example.excuisine.model.Recette;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class RecetteService implements IService<Recette> {

    private final Map<UUID,Recette> recettes;

    public RecetteService() {
        recettes = new HashMap<>();


    }

    @Override
    public void saveOrUpdate(Recette recette) {
        recettes.put(recette.getId(),recette);

    }

    @Override
    public Recette getById(UUID id) {
        return recettes.get(id);
    }

    @Override
    public List<Recette> getAll() {
        return recettes.values().stream().toList();
    }

    @Override
    public void delete(UUID id) {
        recettes.remove(id);

    }
}
