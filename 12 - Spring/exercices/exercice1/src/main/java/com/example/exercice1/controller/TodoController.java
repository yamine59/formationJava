package com.example.exercice1.controller;

import com.example.exercice1.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }


    //@RequestMapping("/todo")
    @GetMapping("/todo")
    public String getOneTodo(Model model){
        System.out.println("cette route dois renvoyer vers une page qui affiche une seul todo");
        model.addAttribute("todo",todoService.getTodos().get(1));
        return "todo";
    }


    //@RequestMapping("/todos")
    @GetMapping("/todos")
    public String getAllTodos(Model model){
        System.out.println("cette route dois renvoyer vers une page qui affiche toutes les todos");
        model.addAttribute("todos",todoService.getTodos());
        return "todos";
    }
}
