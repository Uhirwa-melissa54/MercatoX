package com.chinese.e_commerce_backend.Service;

import com.chinese.e_commerce_backend.repository.EmployeeRepository;
import com.chinese.e_commerce_backend.entities.Employee;
import java.util.List;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public boolean checkExistance(String email,String name){
        List<Employee> exitEm=employeeRepository.findByNameAndEmail(name,email);
        if(!exitEm.isEmpty()){
            return true;
        }
        return false;

    }


    
}
