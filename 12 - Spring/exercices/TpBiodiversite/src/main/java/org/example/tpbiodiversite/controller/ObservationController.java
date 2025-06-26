package org.example.tpbiodiversite.controller;

import org.example.tpbiodiversite.dto.ObservationReceiveDto;
import org.example.tpbiodiversite.dto.ObservationResponseDto;
import org.example.tpbiodiversite.service.ObservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/observation")
public class ObservationController {
    private final ObservationService service;

    public ObservationController(ObservationService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ObservationResponseDto>> findAll (){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ObservationResponseDto> findById (@PathVariable long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<ObservationResponseDto> save (@RequestBody ObservationReceiveDto observationReceiveDto){
        observationReceiveDto.setLocation(observationReceiveDto.getLocation().toUpperCase());
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(observationReceiveDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ObservationResponseDto> update (@PathVariable long id, @RequestBody ObservationReceiveDto observationReceiveDto){
        observationReceiveDto.setLocation(observationReceiveDto.getLocation().toUpperCase());
        return ResponseEntity.ok(service.update(id,observationReceiveDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete (@PathVariable long id){
        service.delete(id);
        return ResponseEntity.ok("Observation at id "+id+ "is deleted");
    }

    @GetMapping("/by-location")
    public ResponseEntity<List<ObservationResponseDto>> findByLocation (@RequestParam String location){
        location = location.toUpperCase();
        return ResponseEntity.ok(service.findByLocation(location));
    }

    @GetMapping("/by-species/{specie_id}")
    public ResponseEntity<List<ObservationResponseDto>> findBySpecieId (@PathVariable long specie_id){
        return ResponseEntity.ok(service.findBySpecieId(specie_id));
    }

}
