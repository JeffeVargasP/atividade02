package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.MotorcycleModel;

public interface MotorcycleRepository extends CrudRepository<MotorcycleModel, Long> {

}
