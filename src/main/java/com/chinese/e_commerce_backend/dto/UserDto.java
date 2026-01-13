package com.chinese.e_commerce_backend.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Long id;
    private String fullName;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    private String location;
    @Column(nullable = false)
    private String username;



}
