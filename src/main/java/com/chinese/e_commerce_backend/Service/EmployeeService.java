package com.chinese.e_commerce_backend.Service;

import com.chinese.e_commerce_backend.repository.EmployeeRepository;
import com.chinese.e_commerce_backend.entities.Employee;

import java.util.List;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public boolean checkExistance(String name, String email) {
        List<Employee> existEm = employeeRepository.findByNameAndEmail(name, email);
        return !existEm.isEmpty();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public boolean checkEmail(String email) {
        Employee employee = employeeRepository.findByEmail(email);
        if (employee == null) {
            return false;
        }
        return true;

    }

    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }
    public Employee loginEmployee(String identifier, String password) {
        Employee employee = employeeRepository
                .findByEmailOrUsername(identifier, identifier)
                .orElseThrow(() -> new RuntimeException("User does not exist"));

        if (!employee.getPassword().equals(password)) {
            throw new RuntimeException("Invalid credentials");
        }

        return employee;
    }

   }

