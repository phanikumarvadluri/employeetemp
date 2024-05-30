package com.org.bao.EmployeeManagement.controller;


import com.org.bao.EmployeeManagement.model.Employee;
import com.org.bao.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/findall")
    public List<Employee> findAll() {

        List<Employee> all = employeeService.getAll();
        return all;
    }

    @PostMapping("/add")
    public Employee save(@RequestBody Employee employee) {
        Employee emp = employeeService.save(employee);
        return emp;
    }
}
