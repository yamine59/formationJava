package org.example.dao;

import org.example.entity.Processor;

import java.util.List;

public class ProcessorDao extends BaseDao<Processor> {
    public List<Processor> getAll (){
        return em.createQuery("Select p from Processor p ", Processor.class).getResultList();
    }
}
