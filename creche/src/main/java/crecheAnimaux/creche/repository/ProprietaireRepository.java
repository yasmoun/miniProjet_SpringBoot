package crecheAnimaux.creche.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import crecheAnimaux.creche.entity.Proprietaire;

public interface ProprietaireRepository extends MongoRepository<Proprietaire,String> {
    Optional<Proprietaire> findByEmail(String email);
    @Override
	List<Proprietaire> findAll();
}