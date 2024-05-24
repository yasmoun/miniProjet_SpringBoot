package crecheAnimaux.creche.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crecheAnimaux.creche.entity.Animal;
import crecheAnimaux.creche.repository.AnimalRepository;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addAnimal(@RequestBody Animal animal){
        animalRepository.save(animal);
        return ResponseEntity.ok("Animal added successfully");
    }
    
    @GetMapping("/animaux")
    public ResponseEntity<?> getAllAnimaux() {
        return ResponseEntity.ok(animalRepository.findAll());
    }
   
}