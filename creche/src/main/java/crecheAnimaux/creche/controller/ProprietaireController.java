package crecheAnimaux.creche.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crecheAnimaux.creche.entity.Proprietaire;
import crecheAnimaux.creche.repository.ProprietaireRepository;
import crecheAnimaux.creche.service.ProprietaireService;
@CrossOrigin("*")
@RestController
@RequestMapping("/proprietaire")
public class ProprietaireController {

    @Autowired
    private ProprietaireRepository proprietaireRepository;

   /* @Autowired
    private PasswordEncoder passwordEncoder;*/
    @Autowired
    private ProprietaireService proprietaireService;
    @PostMapping
    public ResponseEntity<String> addProprietaire(@RequestBody Proprietaire proprietaire) {

            proprietaireRepository.save(proprietaire);
            return ResponseEntity.ok("Proprietaire registered successfully");
        
    }
    @GetMapping
    public ResponseEntity<?> getAllProprietaires() {
        return ResponseEntity.ok(proprietaireRepository.findAll());
    }
    @GetMapping("/{email}")
    public String getNomAndPrenomByEmail(@PathVariable String email) {
        return proprietaireService.getNomAndPrenomByEmail(email);
    }
    @PostMapping("/update")
    public ResponseEntity<String> updateProprietaire(@RequestBody Proprietaire updatedProprietaire) {
        String email = updatedProprietaire.getEmail();
        Proprietaire existingProprietaire = proprietaireRepository.findById(email).orElse(null);
        
        if (existingProprietaire != null) {
            existingProprietaire.setNomP(updatedProprietaire.getNomP());
            existingProprietaire.setPrenomP(updatedProprietaire.getPrenomP());
            existingProprietaire.setAdresse(updatedProprietaire.getAdresse());
            existingProprietaire.setPassword(updatedProprietaire.getPassword());
            existingProprietaire.setNum(updatedProprietaire.getNum());
            
            proprietaireRepository.save(existingProprietaire);
            return ResponseEntity.ok("Proprietaire updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{email}")
    public ResponseEntity<String> deleteProprietaire(@PathVariable String email) {
        Optional<Proprietaire> proprietaireOptional = proprietaireRepository.findById(email);
        if (proprietaireOptional.isPresent()) {
            proprietaireRepository.deleteById(email);
            return ResponseEntity.ok("Proprietaire deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}