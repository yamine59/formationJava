package org.example.film_api.controller;

import org.example.film_api.dto.DirectorReceiveDto;
import org.example.film_api.dto.DirectorResponseDto;
import org.example.film_api.entity.Director;
import org.example.film_api.service.DirectorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/director")
public class DirectorController {

    private final DirectorService service;

    public DirectorController(DirectorService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DirectorResponseDto>> getAll() {
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DirectorResponseDto> get(long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<DirectorResponseDto> create (@RequestBody DirectorReceiveDto director) {
        return ResponseEntity.ok(service.create(director));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DirectorResponseDto> update(@PathVariable long id,@RequestBody DirectorReceiveDto director) {
        return ResponseEntity.ok(service.update(id, director));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        service.delete(id);
        return ResponseEntity.ok("Director deleted");
    }

}
