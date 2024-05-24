package crecheAnimaux.creche.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import crecheAnimaux.creche.entity.Animal;

public interface AnimalRepository extends MongoRepository<Animal, Long>{
	@Override
	List<Animal> findAll();
}
