package com.bezkoder.spring.jpa.h2.controller;

import com.bezkoder.spring.jpa.h2.model.Employee;
import com.bezkoder.spring.jpa.h2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/employee")
    public Employee getEmployeeWithQuery(@RequestParam int id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
        employeeService.deleteEmployeeById(id);
    }
    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdate(employee);
    }
    @PutMapping("/employee")
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdate(employee);
    }
}
