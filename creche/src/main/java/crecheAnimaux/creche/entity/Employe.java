package crecheAnimaux.creche.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "employe")
public class Employe {
    @Id
    private int cinEmp;
    private String email;
    private String nomEmp;
    private String prenomEmp;
    private float salaire;

}