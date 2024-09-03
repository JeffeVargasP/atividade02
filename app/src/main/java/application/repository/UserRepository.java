package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Long> {
    public UserModel findByUsername(String username);
}
