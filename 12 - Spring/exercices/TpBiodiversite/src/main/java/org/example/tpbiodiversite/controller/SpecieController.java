package org.example.tpbiodiversite.controller;

import org.example.tpbiodiversite.dto.SpecieReceiveDto;
import org.example.tpbiodiversite.dto.SpecieResponseDto;
import org.example.tpbiodiversite.service.SpecieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/specie")
public class SpecieController {

    private final SpecieService service;

    public SpecieController(SpecieService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<SpecieResponseDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SpecieResponseDto> findById (@PathVariable long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<SpecieResponseDto> save (@RequestBody SpecieReceiveDto specieReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(specieReceiveDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SpecieResponseDto> update (@PathVariable long id, @RequestBody SpecieReceiveDto specieReceiveDto){
        return ResponseEntity.ok(service.update(id,specieReceiveDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete (@PathVariable long id){
        service.delete(id);
        return ResponseEntity.ok("Specie at id "+id+ "is deleted");
    }


}
