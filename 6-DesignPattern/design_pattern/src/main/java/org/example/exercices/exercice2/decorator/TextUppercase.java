package org.example.exercices.exercice2.decorator;

public class TextUppercase extends TextDecorator{
    public TextUppercase(Text text) {

        super(text);
    }

    @Override
    public String transform(String input) {
        return super.transform(input).toUpperCase();
    }
}
