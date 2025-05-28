package org.example.Demo1;

import org.example.Demo1.entity.Account;

import javax.persistence.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo_jpa");
        EntityManager em = emf.createEntityManager();

//        Account account = new Account(200,"tony","0000 0000 0000 0001");
//        Account account2 = new Account(8000,"toma","0000 0000 0000 0002");
        Account accountBuilder = Account.builder().balance(500).customerName("azerty").accountNumber("0000 0000 0000 0008").build();
//
//        em.getTransaction().begin();
//        em.persist(account);
//        em.persist(account2);
//        em.getTransaction().commit();


        Account accountfind = em.find(Account.class,2);
        if (accountfind != null){
            System.out.println(accountfind);
        }else {
            System.out.println("No Account found");
        }

        try {
            Account accountfindByReference = em.getReference(Account.class,4);
            System.out.println(accountfindByReference);
        }catch (EntityNotFoundException e){
            System.out.println(e.getMessage());
        }

        TypedQuery<Account> query = em.createQuery("SELECT a FROM Account a where a.balance > 500", Account.class);
        List<Account> accounts = query.getResultList();
        accounts.forEach(System.out::println);

        try {
            Account accountToUpdate = em.getReference(Account.class,2);
            em.getTransaction().begin();
            accountToUpdate.setBalance(450);
            em.getTransaction().commit();
        }catch (EntityNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println(em.find(Account.class,2));

        //delete

        Account accountToDelete = em.find(Account.class,3);
        if (accountToDelete != null){
            em.getTransaction().begin();
            em.remove(accountToDelete);
            em.getTransaction().commit();
        }else {
            System.out.println("Account No found");
        }
    }
}