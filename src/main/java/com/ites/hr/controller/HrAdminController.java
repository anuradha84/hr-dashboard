package com.ites.hr.controller;


import com.ites.hr.model.*;
import com.ites.hr.service.DepartmentService;
import com.ites.hr.service.EmployeeService;
import com.ites.hr.service.KpiCategoryService;
import com.ites.hr.service.KpiIndiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/hradmin")
public class HrAdminController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    KpiIndiceService kpiIndiceService;

    @Autowired
    KpiCategoryService kpiCategoryService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView login(){
        return new ModelAndView("index", "user", new User());
    }

    @RequestMapping(value = "/login")
    public String getJsp(Model model, @RequestParam String name ){
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("hello", "employee", new Employee());
    }


    @RequestMapping(value = "/department", method = RequestMethod.GET)
    public List<Department> getDepartment(){
        return departmentService.getDepartments();
    }

    @RequestMapping(value="/department", method = RequestMethod.POST)
    public Department createDepartment(@RequestBody Department department){
        return departmentService.save(department);
    }

    @RequestMapping(value="/employee", method = RequestMethod.POST)
    public String createEmployee(@ModelAttribute("employee") Employee employee, ModelMap modelMap){
        System.out.println("Add Employee");
        Employee employee1 = employeeService.save(employee);
        modelMap.addAttribute("empId",employee1.getEmpId());
        modelMap.addAttribute("empName", employee1.getEmpName());
        modelMap.addAttribute("address",employee1.getAddress());
//        return employeeService.save(employee);
        return "ok";
    }

    @RequestMapping(value = "/kpiindices", method = RequestMethod.GET)
    public ModelAndView showKPIIndicesForm() {
        return new ModelAndView("KpiIndex", "kpiIndices", new KpiIndex());
    }

    @RequestMapping(value="/kpiindices", method = RequestMethod.POST)
    public String createKPIIndices(@ModelAttribute("KpiIndex") KpiIndex kpiIndex, ModelMap modelMap){
        KpiIndex kpiIndex1 = kpiIndiceService.save(kpiIndex);

        modelMap.addAttribute("indexId",kpiIndex1.getIndexId());
        modelMap.addAttribute("categoryId",kpiIndex1.getCategory().getCategId());
        modelMap.addAttribute("index",kpiIndex1.getIndex());
        modelMap.addAttribute("value", kpiIndex1.getValue());
        modelMap.addAttribute("status",kpiIndex1.getState());
        return "KpiIndex";
    }

    @RequestMapping(value = "/kpicategory", method = RequestMethod.GET)
    public ModelAndView showCategoryForm() {

        return new ModelAndView("KpiCategory", "kpiCategory", new KpiCategory());
    }

//    @RequestMapping(value="/kpicategory", method = RequestMethod.POST)
//    public ModelAndView createCategory(@ModelAttribute("kpiCategory") KpiCategory kpiCategory, ModelMap modelMap){
//        System.out.println("kpicategory-post");
//        KpiCategory kpiCategory1 = kpiCategoryService.save(kpiCategory);
//         return new ModelAndView("KpiCategory","kpiCategory",kpiCategoryService.findAll());
//    }

    @RequestMapping(value="/kpicategory", method = RequestMethod.POST)
    public String createCategory(@ModelAttribute("kpiCategory") KpiCategory kpiCategory, ModelMap modelMap){
        System.out.println("kpicategory-post");
        KpiCategory kpiCategory1 = kpiCategoryService.save(kpiCategory);
        modelMap.addAttribute("kpiCategory", kpiCategoryService.findAll());
//        return new ModelAndView("KpiCategory","kpiCategory",kpiCategoryService.findAll());
    return "KpiCategory";
    }


}
