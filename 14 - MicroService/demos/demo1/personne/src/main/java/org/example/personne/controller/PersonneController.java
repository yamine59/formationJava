package org.example.personne.controller;

import org.example.personne.model.Adresse;
import org.example.personne.model.Personne;
import org.example.personne.util.RestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/personne")
public class PersonneController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{id}")
    public Personne get(@PathVariable int id){
        Adresse adresse = restTemplate.getForObject(
                "http://localhost:8080/adresse/{id}",
                Adresse.class,
                id

        );
        return Personne.builder().id(id).nom("toto").adresse(adresse).build();
    }

    @GetMapping("/detail/{id}")
    public Personne getById(@PathVariable int id){
        RestClient<Adresse> adresseRestClient = new RestClient<>();
        Adresse adresse = adresseRestClient.get("http://localhost:8080/adresse/"+id,Adresse.class);
        return Personne.builder().id(id).nom("toto").adresse(adresse).build();
    }
}
