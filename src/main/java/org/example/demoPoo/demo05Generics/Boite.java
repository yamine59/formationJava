package org.example.demoPoo.demo05Generics;

public class Boite<T> {

    private T contenu;

    public T getContenu() {
        return contenu;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }
}
