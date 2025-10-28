package com.chinese.e_commerce_backend.Controllers;

import com.chinese.e_commerce_backend.entities.User;
import com.chinese.e_commerce_backend.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    UserRepository userRepository;
    @GetMapping
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {

        var user=userRepository.findById(id).orElse(null);
        if(user==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }

}
