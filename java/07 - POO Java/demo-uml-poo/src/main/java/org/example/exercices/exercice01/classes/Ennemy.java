package org.example.exercices.exercice01.classes;

import java.util.ArrayList;

public class Ennemy {

    // Fields / Champs
    private int health;
    private float speed;
    private String name;
    private boolean isEpic;
//    private String weapon;
    private ArrayList<Weapon> weapons;


    // Constructor / Constructeur
    public Ennemy() {
        this.health = 9_999;
        speed = 14.0f;
        name = "MissingNo.";
        isEpic = true;
//        weapon = "Grandma";
        weapons = new ArrayList<>();
    }

    public Ennemy(Weapon weapon) {
        this.health = 9_999;
        speed = 14.0f;
        name = "MissingNo.";
        isEpic = true;
        weapons = new ArrayList<>();
        weapons.add(weapon);
    }


    // Methods / Méthodes
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEpic() {
        return isEpic;
    }

    public void setEpic(boolean epic) {
        isEpic = epic;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void takeDamage(int damages) {
//        health = health - damages;
        health -= damages;

        System.out.println(String.format("Argh! I have %d health remaining!", health));
        System.out.println(String.format("Argh! Il me reste %d points de vie!", health));
    }
}
