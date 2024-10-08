package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.model.UserModel;
import application.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public Iterable<UserModel> findAll() {
        return userRepository.findAll();
    }

}
