package org.example.excuisine.service;

import java.util.List;
import java.util.UUID;

public interface IService<T>{

    void saveOrUpdate(T t);
    T getById(UUID id);
    List<T> getAll();
    void delete(UUID id);
}
