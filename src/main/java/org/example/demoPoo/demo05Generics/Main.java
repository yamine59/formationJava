package org.example.demoPoo.demo05Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Boite<String> boite = new Boite<>();

        boite.setContenu("coucou");

        System.out.println(boite.getContenu());

        Boite<Chat> boiteAChat = new Boite<>();

        boiteAChat.setContenu(new Chat(9,"chat"));

        System.out.println(boiteAChat.getContenu());

        List<Chat> maListeDeChats = new ArrayList<>();


    }
}
