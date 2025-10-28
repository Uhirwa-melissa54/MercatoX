package com.chinese.e_commerce_backend.Controllers;

import com.chinese.e_commerce_backend.entities.User;
import com.chinese.e_commerce_backend.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    UserRepository userRepository;
    @GetMapping("/users")
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

}
