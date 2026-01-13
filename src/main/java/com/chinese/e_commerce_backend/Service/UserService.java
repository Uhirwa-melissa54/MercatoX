package com.chinese.e_commerce_backend.Service;

import com.chinese.e_commerce_backend.dto.UserDto;
import com.chinese.e_commerce_backend.entities.User;
import com.chinese.e_commerce_backend.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserService {
    UserRepository userRepository;
    public User register(User user){

User saved=userRepository.save(user);
        return saved;

    }
    
}
