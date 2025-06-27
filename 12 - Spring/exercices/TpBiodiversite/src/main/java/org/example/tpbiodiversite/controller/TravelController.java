package org.example.tpbiodiversite.controller;

import org.example.tpbiodiversite.dto.travellog.TravelReceiveDto;
import org.example.tpbiodiversite.dto.travellog.TravelResponseDto;
import org.example.tpbiodiversite.dto.travellog.TravelResponseTotalDto;
import org.example.tpbiodiversite.dto.travellog.TravelResponsesStatDto;
import org.example.tpbiodiversite.service.TravelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/travel")
public class TravelController {
    private final TravelService service;

    public TravelController(TravelService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<TravelResponseTotalDto> findAll (){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<TravelResponseDto> save (@RequestBody TravelReceiveDto travelReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(travelReceiveDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TravelResponseDto> findById (@PathVariable long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/stats/{id_observation}")
    public ResponseEntity<TravelResponsesStatDto> stat (@PathVariable long id_observation){
        return ResponseEntity.ok(service.stat(id_observation));
    }

    @GetMapping("/user/{observerName}")
    public ResponseEntity<List<TravelResponseDto>> findByObserverName (@PathVariable String observerName){
        return ResponseEntity.ok(service.findByObserverName(observerName));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete (@PathVariable long id){
        service.delete(id);
        return ResponseEntity.ok("Travel at id "+id+ "is deleted");
    }
    @PutMapping("/{id}")
    public ResponseEntity<TravelResponseDto> update (@PathVariable long id, @RequestBody TravelReceiveDto travelReceiveDto){
        return ResponseEntity.ok(service.update(id,travelReceiveDto));
    }



}
