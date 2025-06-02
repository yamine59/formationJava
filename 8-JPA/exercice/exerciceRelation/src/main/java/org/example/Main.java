package org.example;

import org.example.dao.ComputerDao;
import org.example.entity.*;
import org.example.service.ComputerService;

import java.util.ArrayList;
import java.util.List;
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

////        computerService.save("MacBook", "00:00:00:00:00:00", "127.0.0.1");
//


//        computerService.save("samsung10","linus","1.25","i9","54851245","44444111");
//        computerService.getAll().forEach(System.out::println);

//        computerService.save("MacBook", "windows","0.5","i15","54851245","44444111");

//        List<OperatingSystem> operatingSystems = computerService.getAllOS();
//        for (OperatingSystem operatingSystem : operatingSystems){
//            System.out.println(operatingSystem.getName() + " : " + operatingSystem.getComputers());
//        }
//
//        System.out.println(computerService.getOSByName("linus"));

//        computerService.createProject("projet1","description1");
//        computerService.getAllProject().forEach(System.out::println);

        List<Project> projects = new ArrayList<>();

        projects.add(computerService.getProjectById(1));
        projects.add(computerService.getProjectById(2));


//        computerService.addToProject(projects,computerService.getById(7));
//
        computerService.removeToProject(projects,computerService.getById(7));

//         System.out.println(computerService.getProjectById(1));
        System.out.println( computerService.getById(7));
//        computerService.getProjectById(1).getComputers().forEach(System.out::println);



    }
}