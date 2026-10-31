package com.example.project1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.project1.dto.EmployeeDto;
import com.example.project1.mapper.EmployeeMpper;
import com.example.project1.model.Employee;
import com.example.project1.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> l=employeeRepository.findAll();
        List<EmployeeDto> dtos = new ArrayList<>();
        for(Employee e:l){
             EmployeeMpper.toDto(e);
             dtos.add(EmployeeMpper.toDto(e));
        }
        return dtos;
    }
    @Override
    public void saveEmployee(EmployeeDto employee){
        Employee emp=EmployeeMpper.toEntity(employee);
        employeeRepository.save(emp);
    }     
}
