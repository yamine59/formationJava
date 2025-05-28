package org.example;

import org.example.dao.ComputerDao;
import org.example.entity.Computer;
import org.example.entity.Identification;
import org.example.service.ComputerService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//
//        ComputerService computerService = new ComputerService();
//
//        System.out.println("Saisir l'id de l'ordinateur à modifier :");
//        int id = sc.nextInt();
//        sc.nextLine();
//        Computer computer = null;
//
//        try{
//            computer = computerService.getById(id);
//        }catch (Exception e){
//            System.out.println("Il n'y a pas d'ordinateur avec cet id");
//        }
//        System.out.println("saisir le modèle");
//        computer.setModel(sc.nextLine());
//
//
////        computer.setIdentification(new Identification());
//        try{
//            computerService.update(computer);
//            System.out.println("L'ordinateur a bien été modifié");
//        } catch (Exception e){
//            System.out.printf(e.getMessage());
//        }

        ComputerService computerService = new ComputerService();
//        computerService.save("MacBook", "00:00:00:00:00:00", "127.0.0.1");
        computerService.getAll().forEach(System.out::println);



    }
}