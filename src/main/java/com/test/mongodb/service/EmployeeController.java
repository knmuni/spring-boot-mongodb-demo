package com.test.mongodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.mongodb.domain.Employee;
import com.test.mongodb.repository.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
	@Autowired
	private EmployeeRepository employeeRepository;

    @GetMapping("/all")
    public List<Employee> getAll(){
        List<Employee> employees = this.employeeRepository.findAll();
        return employees;
    }
}
