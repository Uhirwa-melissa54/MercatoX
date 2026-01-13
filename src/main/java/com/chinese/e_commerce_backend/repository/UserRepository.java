package com.chinese.e_commerce_backend.repository;

import com.chinese.e_commerce_backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Long> {

    Optional<User> findByEmailOrUsername(String email, String username);
}
