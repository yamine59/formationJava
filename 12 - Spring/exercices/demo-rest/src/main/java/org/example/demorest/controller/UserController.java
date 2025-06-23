package org.example.demorest.controller;

import org.example.demorest.dto.UserReceiveDto;
import org.example.demorest.dto.UserResponseDto;
import org.example.demorest.entity.User;
import org.example.demorest.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAll(){
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> get(@PathVariable Long id){
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> create(@RequestBody UserReceiveDto userReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(userReceiveDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDto> update(@PathVariable Long id, @RequestBody UserReceiveDto userReceiveDto){
        return ResponseEntity.ok(service.update(id,userReceiveDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok(String.format("User at id: %s is deleted", id));
    }

}
