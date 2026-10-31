package com.example.project1.mapper;

import com.example.project1.dto.EmployeeDto;
import com.example.project1.model.Employee;

public class EmployeeMpper {
    public static EmployeeDto toDto(Employee employee) {
        return new EmployeeDto(
            employee.getId(), 
            employee.getFirstName(), 
            employee.getLastName(), 
            employee.getEmail()
        );
    }

    public static Employee toEntity(EmployeeDto employeeDto) {
        return new Employee(
            employeeDto.getId(), 
            employeeDto.getFirstName(), 
            employeeDto.getLastName(), 
            employeeDto.getEmail()
        );
    }
}
