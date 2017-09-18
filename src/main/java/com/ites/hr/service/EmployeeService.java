package com.ites.hr.service;

import com.ites.hr.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    public Employee save(Employee employee);
    public List<Employee> getEmployees();
}
