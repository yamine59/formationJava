package org.example.service;

import org.example.dao.ComputerDao;
import org.example.dao.OsDao;
import org.example.dao.ProcessorDao;
import org.example.entity.Computer;
import org.example.entity.Identification;
import org.example.entity.OperatingSystem;
import org.example.entity.Processor;

import java.util.List;

public class ComputerService {
    ComputerDao computerDao = new ComputerDao();
    OsDao osDao = new OsDao();
    ProcessorDao processorDao = new ProcessorDao();


    public Computer getById(int id) {
        return computerDao.getById(id,Computer.class);
    }

    public List<Computer> getAll (){
       return computerDao.getAll();
    }
    public List<Processor> getAllProcessor (){
       return processorDao.getAll();
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

    public void update(Computer computer){

        computerDao.update(computer);
    }

    public void remove(int id) {
        computerDao.remove(id,Computer.class);

    }
}
