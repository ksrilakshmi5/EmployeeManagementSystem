package com.example.project1.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.project1.service.EmployeeService;


@Controller
public class EmployeeController {
    private final EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employee")
    public String viewHomePage(Model model) {
        model.addAttribute("ListEmployees",employeeService.getAllEmployees());
        return "index";
    }
    
}
