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
@Document(collection = "reservation")
public class Reservation {
    
    @Transient
    public static final String SEQUENCE_NAME = "reservation_sequence";

    @Id
    private long id; 

    private String dateDeb;
    private String dateFin;
    private boolean enCours;

    @DBRef
    private Proprietaire proprietaire;

    @DBRef
    private Animal animal;
}