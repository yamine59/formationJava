package org.example.exercices.exercice2.decorator;

public abstract class TextDecorator implements Text{
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String transform(String input) {
        return text.transform(input);
    }
}
