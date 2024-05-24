package crecheAnimaux.creche.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import crecheAnimaux.creche.entity.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, Long>{

}
