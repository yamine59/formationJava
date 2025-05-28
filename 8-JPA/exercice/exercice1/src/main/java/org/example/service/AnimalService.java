package org.example.service;

import org.example.dao.AnimalsDao;
import org.example.entity.Animals;
import org.example.entity.Diet;

public class AnimalService {

    private AnimalsDao animalsDao = new AnimalsDao();
    public void createAnimal(Animals animal) {
        animalsDao.createAnimal(animal);
    }

    public void getById(int id){
        animalsDao.getById(id);
    }

    public void getByName(String name){
        animalsDao.getByName(name);
    }

    public void getByDiet(Diet diet){
        animalsDao.getByDiet(diet);
    }
}
