package crecheAnimaux.creche.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import crecheAnimaux.creche.entity.Employe;

public interface EmployeRepository extends MongoRepository<Employe, Integer>{
	@Override
	List<Employe> findAll();
}
