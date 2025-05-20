package org.example.exercices.exercice2.decorator;

public class TextPrefixes extends TextDecorator{
    private String prefixe;
    public TextPrefixes(Text text,String prefixe) {
        super(text);
        this.prefixe = prefixe;
    }

    @Override
    public String getText() {
        return prefixe+ super.getText();
    }
}
