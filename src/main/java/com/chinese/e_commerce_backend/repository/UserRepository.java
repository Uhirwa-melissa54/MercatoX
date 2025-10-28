package com.chinese.e_commerce_backend.repository;

import com.chinese.e_commerce_backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {

}
