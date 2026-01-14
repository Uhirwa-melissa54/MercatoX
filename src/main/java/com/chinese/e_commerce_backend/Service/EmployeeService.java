package com.chinese.e_commerce_backend.Service;

import com.chinese.e_commerce_backend.dto.LoginDto;
import com.chinese.e_commerce_backend.entities.Product;
import com.chinese.e_commerce_backend.repository.EmployeeRepository;
import com.chinese.e_commerce_backend.entities.Employee;
import org.springframework.security.authentication.AuthenticationManager;

import java.util.List;

import com.chinese.e_commerce_backend.repository.ProductRepository;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ProductRepository productRepository;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

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


    public String authenticateAndGetToken(LoginDto loginDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
        );
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(authRequest.getUsername());
        } else {
            throw new UsernameNotFoundException("Invalid user request!");
        }
public Product createProduct(Product product) {
        return productRepository.save(product);

}
   }


