package org.example.service;

import org.example.dao.ComputerDao;
import org.example.dao.OsDao;
import org.example.dao.ProcessorDao;
import org.example.dao.ProjectDao;
import org.example.entity.*;

import java.util.List;

public class ComputerService {
    ComputerDao computerDao = new ComputerDao();
    OsDao osDao = new OsDao();
    ProcessorDao processorDao = new ProcessorDao();
    ProjectDao projectDao = new ProjectDao();


    public Computer getById(int id) {
        return computerDao.getById(id,Computer.class);
    }

    public Project getProjectById(int id) {
        return projectDao.getById(id,Project.class);
    }

    public List<Computer> getAll (){
       return computerDao.getAll();
    }
    public List<Processor> getAllProcessor (){
       return processorDao.getAll();
    }

    public List<Project> getAllProject (){
        return projectDao.getAll();
    }

    public List<OperatingSystem> getAllOS (){
       return osDao.getAll();
    }

    public List<OperatingSystem> getOSByName (String name){
        return osDao.getOSByName(name);
    }

    public void save(String model,String nameOS,String versionOS,String NameProc, String macAdress,String ipAdress) {

        Identification identification = Identification.builder().macAdress(macAdress).ipAdress(ipAdress).build();
        Processor processor = Processor.builder().name(NameProc).build();
        OperatingSystem operatingSystem = OperatingSystem.builder().name(nameOS).version(versionOS).build();
        Computer computer = Computer.builder().model(model).operatingSystem(operatingSystem).processor(processor).identification(identification).build();
        computerDao.save(computer);
    }

    public void createProject(String name , String description){
        Project project = Project.builder().name(name).description(description).build();
        computerDao.addProject(project);
    }

    public void addToProject(List<Project> projects , Computer computer){
        for (Project project : projects) {
            projectDao.addProject(project,computer);
        }

    }

    public void removeToProject(List<Project> projects, Computer computer){
        for (Project project : projects) {
            projectDao.removeProject(project,computer);
        }
    }

    public void update(Computer computer){

        computerDao.update(computer);
    }

    public void remove(int id) {
        computerDao.remove(id,Computer.class);

    }


}
