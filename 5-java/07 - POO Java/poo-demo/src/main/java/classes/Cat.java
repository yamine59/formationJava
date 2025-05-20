package classes;

public class Cat {
    private String name;
    private String color;
    private int age;
    private double price;

    public Cat(String name, String color, int age, double price){
        this.name = name;
        this.color = color;
        this.age = age;
        this.price = price;

    }


    public void meow(){
        System.out.println("Miaou");
    }

    @Override
    public String toString(){
        return "le cat s'appelle " + this.name + " il est de couleur " + this.color + " il a " + this.age + " ans et il coûte " + this.price + " euros";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
