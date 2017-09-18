package com.ites.hr.model;


import com.fasterxml.jackson.annotation.JsonView;
import com.ites.hr.jview.HrView;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name= "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="depid")
    private Integer depId;

    @Column (name="depname")
    private String depName;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "department")
    private Set<Employee> employees;


    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
