package org.example.exercices.exercice3.Observer;

public class FileLogger implements Observer{
    @Override
    public void onNotify(String event) {
        System.out.println("enregistrement dans un fichier log de : "+event);
    }
}
