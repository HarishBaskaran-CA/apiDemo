package com.bezkoder.spring.jpa.h2.repository;


import com.bezkoder.spring.jpa.h2.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}