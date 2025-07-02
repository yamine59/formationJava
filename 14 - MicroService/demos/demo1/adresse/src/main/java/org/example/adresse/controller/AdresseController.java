package org.example.adresse.controller;

import org.example.adresse.model.Adresse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adresse")
public class AdresseController {

    @GetMapping("/{id}")
    public Adresse get(@PathVariable int id){
        return Adresse.builder().id(id).rue("rue des pias").cp(59200).build();
    }
}
