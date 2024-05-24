package crecheAnimaux.creche.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crecheAnimaux.creche.entity.Employe;
import crecheAnimaux.creche.repository.EmployeRepository;

@RestController
@RequestMapping("/employe")
public class EmployeController {

    @Autowired
    private EmployeRepository employeRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addEmploye(@RequestBody Employe employe) {
        employeRepository.save(employe);
        return ResponseEntity.ok("Employe added successfully");
    }
    @GetMapping("/employes")
    public ResponseEntity<?> getAllEmployes() {
        return ResponseEntity.ok(employeRepository.findAll());
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateEmploye(@RequestBody Employe updatedEmploye) {
        int cinEmp = updatedEmploye.getCinEmp();
        Employe existingEmploye = employeRepository.findById(cinEmp).orElse(null);

        if (existingEmploye != null) {
            existingEmploye.setEmail(updatedEmploye.getEmail());
            existingEmploye.setNomEmp(updatedEmploye.getNomEmp());
            existingEmploye.setPrenomEmp(updatedEmploye.getPrenomEmp());
            existingEmploye.setSalaire(updatedEmploye.getSalaire());

            employeRepository.save(existingEmploye);
            return ResponseEntity.ok("Employe updated successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{cinEmp}")
    public ResponseEntity<String> deleteEmploye(@PathVariable int cinEmp) {
        Optional<Employe> employeOptional = employeRepository.findById(cinEmp);
        if (employeOptional.isPresent()) {
            employeRepository.deleteById(cinEmp);
            return ResponseEntity.ok("Employe deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
   
}