package crecheAnimaux.creche.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import crecheAnimaux.creche.repository.AdoptionRepository;
import crecheAnimaux.creche.service.AdoptionService;

@RestController
@RequestMapping("/adoptions")
public class AdoptionController {

    @Autowired
    private AdoptionService adoptionService;
    @Autowired
    private AdoptionRepository adoptionRepository;

    @PostMapping("/addAnimal")
    public ResponseEntity<String> addAnimalForAdoption(@RequestBody AnimalForAdoptionRequest request) {
        adoptionService.addAnimalForAdoption(
                request.getAnimal(),
                request.getCinEmploye(),
                request.getDateAdoption(),
                request.getMotivation()
        );
        return ResponseEntity.ok("Animal ajouté pour adoption avec succès");
    }
    @PostMapping("/adoptAnimal")
    public ResponseEntity<String> adoptAnimal(@RequestParam String proprietaireEmail,
                                              @RequestParam int cinEmploye,
                                              @RequestParam int idAnimal,
                                              @RequestParam String motivation) {
        adoptionService.adoptAnimal(proprietaireEmail, cinEmploye, idAnimal, motivation);
        return ResponseEntity.ok("Animal adopté avec succès par : " + proprietaireEmail);
    }
    @GetMapping
    public ResponseEntity<?> getAllAdoptions() {
        return ResponseEntity.ok(adoptionRepository.findAll());
    }
}
