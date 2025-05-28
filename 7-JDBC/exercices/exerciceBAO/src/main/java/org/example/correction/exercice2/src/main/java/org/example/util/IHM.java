package org.example.correction.exercice2.src.main.java.org.example.util;

import org.example.model.BankAccount;
import org.example.model.Customer;
import org.example.model.Operation;
import org.example.service.BankService;

import java.util.Scanner;

public class IHM {

    Scanner scanner;
    String choix;

    private BankService bankService;
    public IHM() {
        scanner = new Scanner(System.in);
        bankService = new BankService();
    }

    public void start() {
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    createAccountAction();
                    break;
                case "2":
                    depositAction();
                    break;
                case "3":
                    withDrawlAction();
                    break;
                case "4":
                    getAccountOperation();
                    break;
            }
        }while (!choix.equals("0"));
    }

    private void menu() {
        System.out.println("###  Menu Compte Bancaire  ###");
        System.out.println("1 - Création de client et compte ");
        System.out.println("2 - Dépôt ");
        System.out.println("3 - Retrait ");
        System.out.println("4 - Affichage compte ");
        System.out.println("0 - Quitter ");
        System.out.println("Votre Choix : ");
    }

    /*
    1. **Création d’un client et d’un compte bancaire associé**
   - Saisie du nom, prénom, téléphone du client.
   - Création automatique d’un compte lié.
     */
    // Création de client et compte
    private void getAccountOperation() {
        System.out.print("Merci de saisir l'id : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        BankAccount bankAccount = bankService.getAccountAction(id);
        if(bankAccount != null){
            System.out.println(bankAccount.getCustomer());
            for (Operation op : bankService.getAllOpertionByIdAccount(bankAccount.getId())) {
                System.out.println(op);
            }
            System.out.println("solde compte actuelle :"+bankAccount.getTotalAmount());
        }
    }

    /*
    2. **Dépôt d’argent sur un compte existant**
   - Saisie de l’ID du compte et du montant.
   - Ajout d’une opération de type "DÉPÔT" liée à ce compte.
     */
    // Dépôt
    private void withDrawlAction() {
        System.out.print("Merci de saisir l'id : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        BankAccount bankAccount = bankService.getAccountAction(id);
        System.out.print("Merci de saisir le montant du retrait : ");
        double montant = scanner.nextDouble();
        scanner.nextLine();
        if(bankAccount != null){
            if(bankService.makeOperationWithDraw(montant*-1, bankAccount.getId())){
                System.out.println("retrait réussi");
            }else {
                System.out.println("erreur");
            }
        }
    }

    /*
    3. **Retrait d’argent d’un compte existant**
   - Saisie de l’ID du compte et du montant.
   - Ajout d’une opération de type "RETRAIT".
     */
    // Retrait
    private void depositAction() {
        System.out.print("Merci de saisir l'id : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        BankAccount bankAccount = bankService.getAccountAction(id);
        System.out.print("Merci de saisir le montant du dépôt : ");
        double montant = scanner.nextDouble();
        scanner.nextLine();
        if(bankAccount != null){
            if (bankService.makeOperationDeposit(montant,bankAccount.getId())){
                System.out.println("dépot réussi");
            }else {
                System.out.println("erreur");
            }
        }
    }

    /*
    4. **Affichage d’un compte**
   - Saisie de l’ID du compte.
   - Affichage des informations du compte, du client associé et des opérations effectuées.
     */
    // Affichage compte
    private void createAccountAction() {
        Customer customer = createCustomerAction();
        if(customer != null) {
            BankAccount bankAccount = bankService.createAndSaveAccount(customer.getId());
            if (bankAccount != null){
                System.out.println("Compte crée avec l'id "+bankAccount.getId());
            }
        }
    }

    private Customer createCustomerAction() {
        Customer customer = null;
        System.out.print("Merci de saisir le nom : ");
        String lastName = scanner.nextLine();
        System.out.print("Merci de saisir le prénom : ");
        String firstName = scanner.nextLine();
        System.out.print("Merci de saisir le téléphone : ");
        String phone = scanner.nextLine();
        customer = bankService.createAndSaveCustomer(firstName,lastName,phone);
        return customer;
    }


}
