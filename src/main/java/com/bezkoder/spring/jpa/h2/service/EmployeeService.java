package com.bezkoder.spring.jpa.h2.service;


import com.bezkoder.spring.jpa.h2.model.Employee;
import com.bezkoder.spring.jpa.h2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;
    public Employee getEmployeeById(int id) {
        return repository.findById(id).get();
    }
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<Employee>();
        repository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }
    // Use repository.save() to persist Employee entity in database
    public void saveOrUpdate(Employee employee) {
        repository.save(employee);

    }
    public void deleteEmployeeById(int id) {
        repository.deleteById(id);
    }
}
