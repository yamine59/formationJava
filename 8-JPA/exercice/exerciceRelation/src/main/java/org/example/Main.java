package org.example;

import org.example.dao.ComputerDao;
import org.example.entity.Computer;
import org.example.entity.Identification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ComputerDao computerDao = new ComputerDao() ;
        Identification identification = Identification.builder().macAdress("macadress").ipAdress("1021851782").build();
        Computer computer = Computer.builder().model("model").identification(identification).build();

        computerDao.createCumputer(computer);
        computerDao.getAllCumputer();

    }
}