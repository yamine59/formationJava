package org.example.exercices.exercice2.decorator;

public class Main {
    public static void main(String[] args) {
        Text text = new BaseText();
        System.out.println(text.transform("hello"));

        text = new TextUppercase(text);
        System.out.println(text.transform("hello tous le monde"));

         text = new TextToLowerCase(text);
        System.out.println(text.transform("hello tous le monde"));

        text = new TextPrefixes(text,"des ");
        System.out.println(text.transform("personne"));
    }
}
