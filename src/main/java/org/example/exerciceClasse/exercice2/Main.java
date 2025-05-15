package org.example.exerciceClasse.exercice2;

import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("paris","action", LocalDate.of(2025, 1, 1),"yamine");
        Film film2 = new Film("la lune noir","action",LocalDate.of(2025, 1, 1),"yamine");

        System.out.println(film1);
        System.out.println(film2);

    }
}
