package org.example.dao;

import org.example.entity.Computer;
import org.example.entity.OperatingSystem;

import javax.persistence.TypedQuery;
import java.util.List;

public class OsDao extends BaseDao<OperatingSystem>{
    public List<OperatingSystem> getAll (){
        return em.createQuery("Select o from OperatingSystem o ", OperatingSystem.class).getResultList();
    }

    public List<OperatingSystem> getOSByName (String name){
        TypedQuery<OperatingSystem> query = em.createQuery("Select o from OperatingSystem o where o.name = :name ", OperatingSystem.class);
        query.setParameter("name",name).getResultList();
        return query.getResultList();

    }

}
