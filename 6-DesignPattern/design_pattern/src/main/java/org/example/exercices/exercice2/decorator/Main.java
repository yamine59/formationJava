package org.example.exercices.exercice2.decorator;

public class Main {
    public static void main(String[] args) {
        Text text = new BaseText();
        System.out.println(text.getText());

        Text textUpperCase = new TextUppercase(text);
        System.out.println(textUpperCase.getText());

        Text textLowerCase = new TextToLowerCase(textUpperCase);
        System.out.println(textLowerCase.getText());

        Text textprefixe = new TextPrefixes(textLowerCase,"des");
        System.out.println(textprefixe.getText());
    }
}
