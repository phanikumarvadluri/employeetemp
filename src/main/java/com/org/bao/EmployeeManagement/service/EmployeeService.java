package com.org.bao.EmployeeManagement.service;


import com.org.bao.EmployeeManagement.dao.EmployeeDao;
import com.org.bao.EmployeeManagement.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;


    public List<Employee> getAll()
    {
        return employeeDao.findAll();
    }

    public Employee save(Employee employee)
    {
        return employeeDao.save(employee);
    }


}
