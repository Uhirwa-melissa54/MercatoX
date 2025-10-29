package com.chinese.e_commerce_backend.Controllers;

import com.chinese.e_commerce_backend.dto.UserDto;
import com.chinese.e_commerce_backend.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    UserRepository userRepository;
    @GetMapping
    public List<UserDto> findAll(
            @RequestParam(required = false,defaultValue = "") String sort
    ) {
        if(Set.of("name","email").contains(sort)){
            sort="name";
        }
        return userRepository.findAll(Sort.by(sort))
                .stream()
                .map(user-> new UserDto(user.getId(),user.getUsername(),user.getEmail())).toList();
    }
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id) {

        var user=userRepository.findById(id).orElse(null);
        if(user==null){
            return ResponseEntity.notFound().build();
        }
        var userDto=new UserDto(user.getId(),user.getUsername(),user.getEmail());
        return ResponseEntity.ok(userDto);
    }

}
