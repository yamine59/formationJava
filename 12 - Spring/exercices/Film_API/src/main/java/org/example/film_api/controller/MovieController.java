package org.example.film_api.controller;

import org.example.film_api.dto.MovieReceiveDto;
import org.example.film_api.dto.MovieResponseDto;
import org.example.film_api.entity.Director;
import org.example.film_api.entity.Movie;
import org.example.film_api.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/movie")
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<MovieResponseDto>> getAll() {
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieResponseDto> get(long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<MovieResponseDto> create(@RequestBody MovieReceiveDto movieReceiveDto) {
        return ResponseEntity.ok(service.create(movieReceiveDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovieResponseDto> update(@PathVariable long id,@RequestBody MovieReceiveDto movieReceiveDto) {
        return ResponseEntity.ok(service.update(id, movieReceiveDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        service.delete(id);
        return ResponseEntity.ok("Movie at id : " + id + " is deleted");
    }
}
