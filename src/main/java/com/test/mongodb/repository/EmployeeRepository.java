package com.test.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.test.mongodb.domain.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String>{
}
