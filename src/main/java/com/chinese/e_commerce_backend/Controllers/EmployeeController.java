package com.chinese.e_commerce_backend.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinese.e_commerce_backend.Service.EmployeeService;
import com.chinese.e_commerce_backend.entities.Employee;
import com.chinese.e_commerce_backend.dto.RegisterResponseDto;
import java.util.*;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService employeeService;
    @PostMapping("/signup")
    ResponseEntity<RegisterResponseDto> signup(Employee employee){
    boolean exist= employeeService.checkExistance(employee.getName(),employee.getEmail());
    if(exist){
        return ResponseEntity.status(409).body(new RegisterResponseDto("User already exists","No name"));
    }
    Employee em1=employeeService.saveEmployee(employee);
    if(em1.equals(null)){
        return ResponseEntity.status(500).body(new RegisterResponseDto("Error saving the user","No name"));
    }
    return ResponseEntity.status(201).body(new RegisterResponseDto("User created succesfully",em1.getName()));


    }
    
}
