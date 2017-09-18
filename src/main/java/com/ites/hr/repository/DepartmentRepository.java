package com.ites.hr.repository;

import com.ites.hr.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Integer>{

    Department save(Department department);


    //JPQL
//    @Query("from Department d where d.depId= :id")
//    List<Department> findAll(@Param("id") int id);

    //JDBC
//    @Query(value = "select * from department d where d.depid= :id", nativeQuery = true)

    List<Department> findAll();

//    Department getDepartmentByIdAndDepname(int id,String name);
}
