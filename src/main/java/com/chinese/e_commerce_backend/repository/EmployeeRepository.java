package com.chinese.e_commerce_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chinese.e_commerce_backend.entities.Employee;

public interface EmployeeRepository  extends JpaRepository <Employee, Long>{
    List<Employee> findByNameAndEmail(String name,String email);
    List<Employee> findByEmail(String email);
    
}
