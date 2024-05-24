package crecheAnimaux.creche.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection ="adoption")
public class Adoption {
public Adoption(AdoptionID id, String dateAdoption, String motivation) {
		this.id =id;
		this.dateAdoption =dateAdoption;
		this.motivation=motivation ;
	}
public Adoption(AdoptionID id, String dateAdoption) {
	this.id =id;
	this.dateAdoption =dateAdoption;
}
private AdoptionID id;
private String dateAdoption ;
private String motivation ;
private String proprietaireEmail;
}
