package org.example.demoPoo.demo06List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> prenoms = new ArrayList<>();

        prenoms.add("Pierre");
        prenoms.add("Paul");
        prenoms.add("Jacques");

        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));

        prenoms.set(2,"tyty");

        System.out.println(prenoms.get(2));

        prenoms.remove(2);
    }
}
