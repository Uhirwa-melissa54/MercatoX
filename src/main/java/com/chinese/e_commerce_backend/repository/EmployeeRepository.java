package com.chinese.e_commerce_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chinese.e_commerce_backend.entities.Employee;

public interface EmployeeRepository  extends JpaRepository <Employee, Long>{
    
}
