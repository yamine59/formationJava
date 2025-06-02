package org.example.dao;

import org.example.entity.Computer;
import org.example.entity.Processor;
import org.example.entity.Project;

import java.util.List;

public class ProjectDao extends BaseDao<Project>{
    public List<Project> getAll (){
        return em.createQuery("Select p from Project p ", Project.class).getResultList();
    }

    public void addProject(Project project, Computer computer){
        em.getTransaction().begin();
        em.persist(project);
        computer.getProjects().add(project);
        em.getTransaction().commit();
    }

    public void removeProject(Project project, Computer computer){
        em.getTransaction().begin();
        computer.getProjects().remove(project);
        em.getTransaction().commit();
    }

}
