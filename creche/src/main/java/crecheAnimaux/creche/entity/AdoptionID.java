package crecheAnimaux.creche.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class AdoptionID implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cin;
    private long idAnimal;
}
