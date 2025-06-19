package org.example.excuisine.service;

import org.example.excuisine.model.Categorie;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class CategorieService implements IService<Categorie>{
    private final Map<UUID, Categorie> categories;

    public CategorieService() {
        categories = new HashMap<>();
    }
    @Override
    public void saveOrUpdate(Categorie categorie) {
        categories.put(categorie.getId(),categorie);
    }

    @Override
    public Categorie getById(UUID id) {
        return categories.get(id);
    }

    public Categorie getByNom(String nom) {
        return categories.values().stream().filter(c -> c.getNom().equals(nom)).findFirst().orElse(null);
    }

    @Override
    public List<Categorie> getAll() {
        return categories.values().stream().toList();
    }

    @Override
    public void delete(UUID id) {
        categories.remove(id);
    }
}
