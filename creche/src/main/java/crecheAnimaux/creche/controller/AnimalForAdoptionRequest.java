package crecheAnimaux.creche.controller;

import crecheAnimaux.creche.entity.Animal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimalForAdoptionRequest {
    private Animal animal;
    private int cinEmploye;
    private String dateAdoption;
    private String motivation;
}