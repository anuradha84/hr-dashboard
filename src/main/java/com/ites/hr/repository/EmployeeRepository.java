package com.ites.hr.repository;

import com.ites.hr.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee save(Employee employee);

    List<Employee> findAll();
}
