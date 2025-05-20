package org.example.exercices.exercice01.classes;

public class Weapon {
    private String name;
    private int durability;
    private int damage;
    private float price;

    // Constructeur par défaut
    public Weapon() {
        name = "Stick";
        durability = 100;
        damage = 100;
        price = 0.0f;
    }

    // Constructeur avec paramètres
    public Weapon(String name, int durability, int damage, float price) {
        this.name = name;
        this.durability = durability;
        this.damage = damage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
