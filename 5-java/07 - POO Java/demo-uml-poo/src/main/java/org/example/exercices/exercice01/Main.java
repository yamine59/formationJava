package org.example.exercices.exercice01;

import org.example.exercices.exercice01.classes.Ennemy;

public class Main {
    public static void main(String[] args) {
        Ennemy albert = new Ennemy();
        albert.setName("Albert");

        albert.takeDamage(1_000);

        Ennemy miska = new Ennemy();
        miska.setName("Miska");

        miska.takeDamage(8_000);
    }
}
