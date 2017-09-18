package com.ites.hr.service.impl;

import com.ites.hr.model.Department;
import com.ites.hr.repository.DepartmentRepository;
import com.ites.hr.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department save(Department department){

        return departmentRepository.save(department);
    }
    @Override
    public List<Department> getDepartments(){
       return departmentRepository.findAll();
    }
}
