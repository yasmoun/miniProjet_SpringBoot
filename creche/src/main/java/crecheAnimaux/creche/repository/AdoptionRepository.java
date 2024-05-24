package crecheAnimaux.creche.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import crecheAnimaux.creche.entity.Adoption;
import crecheAnimaux.creche.entity.AdoptionID;

public interface AdoptionRepository extends MongoRepository<Adoption, AdoptionID> {
	@Override
	Optional<Adoption> findById(AdoptionID id);
	 @Override
	 List<Adoption> findAll();
	Adoption findBy(int cinEmploye, int idAnimal);
}
