package org.example.exercices.exercice2.decorator;

public class TextToLowerCase extends TextDecorator{
    public TextToLowerCase(Text text) {

        super(text);
    }

    @Override
    public String getText() {
        return super.getText().toLowerCase();
    }
}
