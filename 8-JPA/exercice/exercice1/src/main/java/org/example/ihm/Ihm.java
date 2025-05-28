package org.example.ihm;


import org.example.entity.Animals;
import org.example.entity.Diet;
import org.example.service.AnimalService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Objects;
import java.util.Scanner;

public class Ihm {

    private Scanner scanner = new Scanner(System.in);


    public void start() {
        while (true) {
            System.out.println("\n==== TODO LIST ====");
            System.out.println("1. Ajouter un animal");
            System.out.println("2. rechercher par id");
            System.out.println("3. rechercher par nom");
            System.out.println("4. rechercher par regime");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> createAnimal();
                case "2" -> getById();
                case "3" -> getByName();
                case "4" -> getByDiet();


                case "0" -> {
                    System.out.println("Au revoir !");
                    return;
                }
                default -> System.out.println("Choix invalide.");
            }
        }
    }

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
    private EntityManager em = emf.createEntityManager();
    private AnimalService animalService = new AnimalService();
    private void createAnimal() {


        System.out.println("entrer le nom :");
        String name = scanner.nextLine();

        System.out.println("entrer l'age :");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("entrer le regime alimentaire : carninore/herbivore/omnivore");
        Diet diet = Diet.valueOf(scanner.next());

        if (Objects.equals(diet, "carnivore")){
            diet = Diet.carnivore;
        }
        if (Objects.equals(diet, "herbivore")){
            diet = Diet.herbivore;
        }
        if (Objects.equals(diet, "omnivore")){
            diet =Diet.omnivore;
        }
        scanner.nextLine();
        System.out.println("entrer la date d'arrive :");

        String date = scanner.nextLine();

        Animals animals = Animals.builder().name(name).age(age).diet(diet).arrivalDate(date).build();
        animalService.createAnimal(animals);

    }

    private void getById() {
        System.out.println("entrer l'id de l'animal :");
        int id = scanner.nextInt();
        scanner.nextLine();
        animalService.getById(id);
    }

    private void getByName() {
        System.out.println("entrer le nom de l'animal :");
        String name = scanner.nextLine();
        animalService.getByName(name);
    }
    
    private void getByDiet() {
        System.out.println("entrer le regime alimentaire : carnivore/herbivore/omnivore");
      
        Diet diet = Diet.valueOf(scanner.nextLine());

        
        animalService.getByDiet(diet);
    }


}
