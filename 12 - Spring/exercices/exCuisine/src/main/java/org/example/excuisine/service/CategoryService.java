package org.example.excuisine.service;

import org.example.excuisine.model.Category;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class CategoryService implements IService<Category>{
    private final Map<UUID, Category> categories;

    public CategoryService() {
        categories = new HashMap<>();
    }
    @Override
    public void saveOrUpdate(Category categorie) {
        categories.put(categorie.getId(),categorie);
    }

    @Override
    public Category getById(UUID id) {
        return categories.get(id);
    }

    public Category getByNom(String nom) {
        return categories.values().stream().filter(c -> c.getNom().equals(nom)).findFirst().orElse(null);
    }

    @Override
    public List<Category> getAll() {
        return categories.values().stream().toList();
    }

    @Override
    public void delete(UUID id) {
        categories.remove(id);
    }
}
