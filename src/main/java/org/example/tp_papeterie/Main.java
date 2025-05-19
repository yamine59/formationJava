package org.example.tp_papeterie;

import org.example.tp_papeterie.model.Facture;
import org.example.tp_papeterie.model.Lot;
import org.example.tp_papeterie.model.Ramette;
import org.example.tp_papeterie.model.Stylo;

public class Main {
    public static void main(String[] args) {
        Stylo s1 = new Stylo("SY01","stylo bic",1,"noir");
        Stylo s2 = new Stylo("SY02","stylo bic",3,"blanc");

        Ramette r1 = new Ramette("R01","ramette base",5,50);
        Ramette r2 = new Ramette("R02","ramette 2",10,50);


        FakeDB.database.put("SY01",s1);
        FakeDB.database.put("SY02",s2);
        FakeDB.database.put("R01",r1);
        FakeDB.database.put("R02",r2);

        System.out.println();
        System.out.println(FakeDB.database);
        System.out.println();

        System.out.println("Liste des articles au prix max de 1 : ");
        System.out.println(FakeDB.getAllArticlePriceMaX(1));

        System.out.println();
        Facture facture1 = new Facture("client1","date1",1,2) ;
        facture1.ajouterLigne("R01",1);
        facture1.ajouterLigne("SY02",10);
        System.out.println(facture1);

    }
}
