package org.example.service;

import org.example.dao.ComputerDao;
import org.example.entity.Computer;
import org.example.entity.Identification;

import java.util.List;

public class ComputerService {
    ComputerDao computerDao = new ComputerDao();

    public Computer getById(int id) {
        return computerDao.getById(id,Computer.class);
    }

    public List<Computer> getAll (){
       return computerDao.getAll();
    }

    public void save(String model, String macadress,String ipAdress) {
        Identification identification = Identification.builder().macAdress(macadress).ipAdress(ipAdress).build();

        Computer computer = Computer.builder().model(model).identification(identification).build();
        computerDao.save(computer);
    }

    public void update(Computer computer){
        computerDao.update(computer);
    }

    public void remove(int id) {
        computerDao.remove(id,Computer.class);

    }
}
