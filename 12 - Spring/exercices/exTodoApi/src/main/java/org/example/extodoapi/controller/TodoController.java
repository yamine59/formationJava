package org.example.extodoapi.controller;

import org.example.extodoapi.dto.TodoReceiveDto;
import org.example.extodoapi.entity.Todo;
import org.example.extodoapi.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/todo")
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Todo>> getAll () {
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> get(@PathVariable long id){
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping("/validate")
    public ResponseEntity<List<Todo>> getValidate(){
        return ResponseEntity.ok(service.getValidate());
    }

    @GetMapping("/novalidate")
    public ResponseEntity<List<Todo>> getNoValidate(){
        return ResponseEntity.ok(service.getNoValidate());
    }

    @GetMapping("/validate/{id}")
    public ResponseEntity<Todo> toggleValidate(@PathVariable long id){
        return ResponseEntity.ok(service.toggleValidate(id));
    }

    @PostMapping
    public ResponseEntity<Todo> create(@RequestBody TodoReceiveDto todoReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(todoReceiveDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> update(@PathVariable long id,@RequestBody TodoReceiveDto todoReceiveDto){
        return ResponseEntity.ok(service.update(id,todoReceiveDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete (@PathVariable long id){
        service.delete(id);
        return ResponseEntity.ok(String.format("User at id: %s is deleted", id));
    }

}
