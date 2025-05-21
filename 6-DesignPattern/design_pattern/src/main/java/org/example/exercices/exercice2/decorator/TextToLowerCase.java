package org.example.exercices.exercice2.decorator;

public class TextToLowerCase extends TextDecorator{
    public TextToLowerCase(Text text) {

        super(text);
    }

    @Override
    public String transform(String input) {
        return super.transform(input).toLowerCase();
    }
}
