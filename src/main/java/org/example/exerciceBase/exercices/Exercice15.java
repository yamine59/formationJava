package org.example.exerciceBase.exercices;

public class Exercice15 {
    public static void main(String[] args) {
        for (int i = 1; i < 11;i++){
            System.out.println("#### Table de "+i+" ####");
            for (int j = 1; j < 11;j++){
                System.out.println(j+" x "+i+" = "+(j*i));
            }
        }
    }
}
