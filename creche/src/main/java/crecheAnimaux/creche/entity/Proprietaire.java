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
@Document(collection = "proprietaire")
public class Proprietaire {
    @Id
    private String email;
    private String nomP;
    private String prenomP;
    private String adresse;
    private String password;
    private Integer num;

}