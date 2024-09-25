package com.springbootmvcthymeleaf.employeecrud.controller;

import com.springbootmvcthymeleaf.employeecrud.model.Employee;
import com.springbootmvcthymeleaf.employeecrud.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("emp", new Employee());
        return "add-emp";
    }

    @PostMapping("/submitADD")
    public String create(@Valid @ModelAttribute("emp")Employee employee, BindingResult result){
        if (result.hasErrors()) {
            System.out.println(result.toString());
            return "add-emp";
        } else {
            employeeService.createEmployee(employee);
            return "redirect:list";
        }
    }

    @GetMapping("/list")
    public String listEmp(Model model){
        List<Employee> employees = employeeService.findAllEmployees();
        model.addAttribute("employeeList", employees);
        return "list-emp";
    }

    @GetMapping("/update")
    public String updateDisplay(@RequestParam("empId") int id, Model model){
        Employee existingEmp = employeeService.findEmpById(id);
        model.addAttribute("existingEmp", existingEmp);
        return "update-emp";
    }

    @GetMapping("/delete")
    public String deleteEmp(@RequestParam("empId") int id){
        employeeService.deleteEmployee(id);
        return "redirect:list";
    }

    @GetMapping("/search")
    public String searchEmp(@RequestParam("lastName") String lastName, Model model){
        List<Employee> found = employeeService.findEmpByLastName(lastName);
        model.addAttribute("foundEmp", found);
        return "search-result";
    }


}
