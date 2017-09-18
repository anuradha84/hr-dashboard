package com.ites.hr.service;

import com.ites.hr.model.Department;

import java.util.List;

public interface DepartmentService {
    public Department save(Department department);
    public List<Department> getDepartments();
}
