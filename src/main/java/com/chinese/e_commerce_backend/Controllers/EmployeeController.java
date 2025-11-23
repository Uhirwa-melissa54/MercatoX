package com.chinese.e_commerce_backend.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.chinese.e_commerce_backend.Service.EmployeeService;
import com.chinese.e_commerce_backend.entities.Employee;
import java.util.*;


@RestController("/employee")
public class EmployeeController {
    private EmployeeService employeeService;
    @PostMapping("/signup")
    ResponseEntity<RegisterResponseDto> signup(Employee employee){
        List<Employee> exist= employeeService.checkExistance(employee.getName(),employee.getEmail());
        employeeService.saveEmployee(employee);

    }
    
}
