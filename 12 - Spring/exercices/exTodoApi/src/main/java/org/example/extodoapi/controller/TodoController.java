package org.example.extodoapi.controller;

import org.example.extodoapi.dto.TodoReceiveDto;
import org.example.extodoapi.dto.TodoResponseDto;
import org.example.extodoapi.entity.Todo;
import org.example.extodoapi.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/todo")
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TodoResponseDto>> getAll () {
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoResponseDto> get(@PathVariable UUID id){
        return ResponseEntity.ok(service.get(id));
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<TodoResponseDto>> getByStatus (@PathVariable String status){
        return ResponseEntity.ok(service.getByStatus(Boolean.parseBoolean(status)));
    }



    @GetMapping("/validate/{id}")
    public ResponseEntity<TodoResponseDto> toggleValidate(@PathVariable UUID id){
        return ResponseEntity.ok(service.toggleValidate(id));
    }

    @PostMapping
    public ResponseEntity<TodoResponseDto> create(@RequestBody TodoReceiveDto todoReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(todoReceiveDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoResponseDto> update(@PathVariable UUID id,@RequestBody TodoReceiveDto todoReceiveDto){
        return ResponseEntity.ok(service.update(id,todoReceiveDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete (@PathVariable UUID id){
        service.delete(id);
        return ResponseEntity.ok(String.format("User at id: %s is deleted", id));
    }

}
