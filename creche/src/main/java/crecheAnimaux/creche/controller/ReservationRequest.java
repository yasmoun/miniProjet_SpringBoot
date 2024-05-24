package crecheAnimaux.creche.controller;

import crecheAnimaux.creche.entity.Animal;
import crecheAnimaux.creche.entity.Reservation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationRequest {
    private Reservation reservation;
    private Animal animal;
    private String proprietaireEmail;
}