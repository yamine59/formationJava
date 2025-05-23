package org.example.Poo;



import org.example.Poo.entity.Student;

import java.sql.SQLException;
import java.util.Scanner;

public class IHM {
    private Scanner scanner;
    private GestionStudent gestionStudent;

    public  IHM() {
        scanner = new Scanner(System.in);
        gestionStudent = new GestionStudent();
    }
    public void start() {
        String choix;
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    addStudentAction();
                    break;
                case "2":
                    getAllStudentsAction();
                    break;
                case "3":
                    getStudentsByClassIdAction();
                    break;
                case "4":
                    deleteStudentAction();
                    break;
            }
        }while (!choix.equals("0"));
    }

    private void menu() {
        System.out.println("1 - Ajouter un étudiant ");
        System.out.println("2 - Afficher la liste des étudiants");
        System.out.println("3 - Afficher les étudiants d'une classe");
        System.out.println("4 - Supprimer un étudiant");
        System.out.println("0 - Quitter");

    }

    private void addStudentAction()  {
        System.out.println("**** Ajouter un étudiant ****");
        System.out.print("Merci de saisir le nom : ");
        String lastName = scanner.nextLine();
        System.out.print("Merci de saisir le prénom : ");
        String firstName = scanner.nextLine();
        System.out.print("Merci de saisir la date du diplome : ");
        String dateDegreeString = scanner.nextLine();
        System.out.print("Merci de saisir la classe : ");
        int classNumber = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(firstName, lastName, dateDegreeString, classNumber);
        try {
            gestionStudent.save(student);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void getAllStudentsAction() {
        try {
            gestionStudent.getAll().forEach(e -> System.out.println(e));
//            for (Student e : gestionStudent.getAll()){
//                System.out.println(e);
//            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void getStudentsByClassIdAction() {
        try {
            System.out.print("Merci de saisir la classe : ");
            int classNumber = scanner.nextInt();
            scanner.nextLine();
            gestionStudent.getByClass(classNumber).forEach(e -> System.out.println(e));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteStudentAction() {
        System.out.print("Merci de saisir l'id de l'étudiant : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        try {
            Student student = gestionStudent.getById(id);
            if(student != null) {
                gestionStudent.delete(student.getId());
            }
            else {
                System.out.println("Aucun étudiant avec cet id");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
