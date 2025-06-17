package com.example.exercice1.service;

import com.example.exercice1.controller.TodoController;
import com.example.exercice1.model.Todo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Getter
@Setter
@Service
public class TodoService {

    private ArrayList<Todo> todos = new ArrayList<>();

    public TodoService(){
        todos.add(new Todo(1,"courses","acheter du pain, du lait, des oeufs, du fromage",false));
        todos.add(new Todo(2,"courses","acheter des oeufs, du fromage",false));
        todos.add(new Todo(3,"courses","acheter du pain, du lait",false));
        todos.add(new Todo(4, "travail", "finir le rapport de projet", false));
        todos.add(new Todo(5, "loisirs", "regarder un film", false));
        todos.add(new Todo(6, "maison", "nettoyer la salle de bain", false));
        todos.add(new Todo(7, "lecture", "lire un chapitre du livre", false));
        todos.add(new Todo(8, "sport", "faire une promenade", false));
    }
}
