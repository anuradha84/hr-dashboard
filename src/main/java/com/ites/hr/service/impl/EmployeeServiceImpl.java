package com.ites.hr.service.impl;

import com.ites.hr.model.Employee;
import com.ites.hr.repository.EmployeeRepository;
import com.ites.hr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployees(){
    return employeeRepository.findAll();
    }
}
