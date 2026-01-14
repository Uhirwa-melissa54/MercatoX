package com.chinese.e_commerce_backend.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String identifier; // username OR email
    private String password;
}
