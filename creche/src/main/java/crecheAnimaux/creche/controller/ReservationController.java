package crecheAnimaux.creche.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crecheAnimaux.creche.entity.Reservation;
import crecheAnimaux.creche.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
	 @Autowired
	    private ReservationService reservationService;

	    @PostMapping("/add")
	    public ResponseEntity<String> addReservation(@RequestBody ReservationRequest reservationRequest) {
	        reservationService.addReservation(
	                reservationRequest.getReservation(),
	                reservationRequest.getAnimal(),
	                reservationRequest.getProprietaireEmail()
	        );
	        return ResponseEntity.ok("Réservation ajoutée avec succès");
	    }
	    @PutMapping("/update")
	    public ResponseEntity<String> updateReservation(@RequestBody Reservation updatedReservation) {
	        reservationService.updateReservation(updatedReservation);
	        return ResponseEntity.ok("Reservation updated successfully");
	    }

	    @DeleteMapping("/delete/{id}")
	    public ResponseEntity<String> deleteReservation(@PathVariable long id) {
	        reservationService.deleteReservation(id);
	        return ResponseEntity.ok("Reservation deleted successfully");
	    }
}