package com.test.mongodb.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.test.mongodb.repository.EmployeeRepository;

import java.util.Arrays;
import java.util.List;

@Component
public class EmployeeData implements CommandLineRunner {
    
	@Autowired
	private EmployeeRepository employeeRepository;

    @Override
    public void run(String... strings) throws Exception {
        
    	Employee emp1 = new Employee("Muni",2000);
        Employee emp2 = new Employee("Neeru",3000);
        Employee emp3 = new Employee("Markus",1000);
        
        // Drop all employees
        this.employeeRepository.deleteAll();
        
        //Add employees to the database
        List<Employee> employees = Arrays.asList(emp1, emp2, emp3);
        this.employeeRepository.save(employees);
    }
}
