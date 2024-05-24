package crecheAnimaux.creche.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crecheAnimaux.creche.entity.Animal;
import crecheAnimaux.creche.entity.Proprietaire;
import crecheAnimaux.creche.entity.Reservation;
import crecheAnimaux.creche.repository.AnimalRepository;
import crecheAnimaux.creche.repository.ProprietaireRepository;
import crecheAnimaux.creche.repository.ReservationRepository;
@Service
public class ReservationService {

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private ProprietaireRepository proprietaireRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    public void addReservation(Reservation reservation, Animal animal, String proprietaireEmail) {
        Proprietaire proprietaire = proprietaireRepository.findById(proprietaireEmail)
                .orElseThrow(() -> new RuntimeException("Propriétaire non trouvé avec l'email: " + proprietaireEmail));

        animal.setIdAnimal(sequenceGeneratorService.generateSequence(Animal.SEQUENCE_NAME));
        animal.setProprietaire(proprietaire);
        animalRepository.save(animal);

        reservation.setId(sequenceGeneratorService.generateSequence(Reservation.SEQUENCE_NAME));
        reservation.setAnimal(animal);
        reservation.setProprietaire(proprietaire);
        reservation.setEnCours(true);

        reservationRepository.save(reservation);
    }
    public void updateReservation(Reservation updatedReservation) {
        Reservation existingReservation = reservationRepository.findById(updatedReservation.getId())
                .orElseThrow(() -> new RuntimeException("Reservation non trouvée avec l'id: " + updatedReservation.getId()));

        existingReservation.setDateDeb(updatedReservation.getDateDeb());
        existingReservation.setDateFin(updatedReservation.getDateFin());
        existingReservation.setEnCours(updatedReservation.isEnCours());

        reservationRepository.save(existingReservation);
    }

    public void deleteReservation(long id) {
        Reservation reservation = reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation non trouvée avec l'id: " + id));
        reservationRepository.delete(reservation);
    }
}