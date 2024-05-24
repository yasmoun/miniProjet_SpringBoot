package crecheAnimaux.creche.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "animal")
public class Animal {
    
    @Transient
    public static final String SEQUENCE_NAME = "animal_sequence";

    @Id
    private long idAnimal; 

    private String nomA;
    private String race;
    private String espece;
    private String sexeA;
    private int ageA;
    private String allergies;
    private String description;

    @DBRef
    private Proprietaire proprietaire;

    @DBRef
    private Employe employee;
}