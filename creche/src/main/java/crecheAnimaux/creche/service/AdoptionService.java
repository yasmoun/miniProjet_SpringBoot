package crecheAnimaux.creche.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crecheAnimaux.creche.entity.Adoption;
import crecheAnimaux.creche.entity.AdoptionID;
import crecheAnimaux.creche.entity.Animal;
import crecheAnimaux.creche.entity.Employe;
import crecheAnimaux.creche.repository.AdoptionRepository;
import crecheAnimaux.creche.repository.AnimalRepository;
import crecheAnimaux.creche.repository.EmployeRepository;

@Service
public class AdoptionService {

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private EmployeRepository employeRepository;

    @Autowired
    private AdoptionRepository adoptionRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    public void addAnimalForAdoption(Animal animal, int cinEmploye, String dateAdoption, String motivation) {
        Employe employe = employeRepository.findById(cinEmploye)
                .orElseThrow(() -> new RuntimeException("Employé non trouvé avec le CIN: " + cinEmploye));

        animal.setIdAnimal(sequenceGeneratorService.generateSequence(Animal.SEQUENCE_NAME));
        animalRepository.save(animal);

        AdoptionID adoptionID = new AdoptionID(cinEmploye, animal.getIdAnimal());
        Adoption adoption = new Adoption(adoptionID, dateAdoption);

        adoptionRepository.save(adoption);
    }
    public void adoptAnimal(String proprietaireEmail, int cinEmploye, int idAnimal, String motivation) {
        AdoptionID adoptionID = new AdoptionID();
        adoptionID.setCin(cinEmploye);
        adoptionID.setIdAnimal(idAnimal);

        Adoption adoption = new Adoption();
        adoption.setId(adoptionID);
        adoption.setProprietaireEmail(proprietaireEmail);
        adoption.setMotivation(motivation);

        adoptionRepository.save(adoption);
    }
}