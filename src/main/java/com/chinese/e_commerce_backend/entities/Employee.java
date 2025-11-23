package com.chinese.e_commerce_backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;
    @Column(nullable=false)
    public String name;
    public String email;
    public int roleId;
    public String locationSector;
    public String locationCell;
    public String password;

    
}
