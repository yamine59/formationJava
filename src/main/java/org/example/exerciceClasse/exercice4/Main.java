package org.example.exerciceClasse.exercice4;

public class Main {
    public static void main(String[] args) {
        WaterTank t1 = new WaterTank(10, 100, 0);
        t1.remplir(80);
        System.out.println(t1);
        t1.remplir(20);
        t1.vider(10);
        t1.remplir(20);
        System.out.println(t1);

        WaterTank t2 = new WaterTank(10, 100, 0);
        t2.remplir(80);
        System.out.println(t2);
        t2.remplir(20);
        t2.vider(10);
        t2.remplir(20);
        System.out.println(t2);


        System.out.println("total volume :"+WaterTank.getTotalFillLevel());
    }
}
