package com.example.postgresqlspringbootdemo.controller;

import com.example.postgresqlspringbootdemo.model.Employee;
import com.example.postgresqlspringbootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("employees")
    public List<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }

    @PostMapping("employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return this.employeeRepository.save(employee);
    }
}
