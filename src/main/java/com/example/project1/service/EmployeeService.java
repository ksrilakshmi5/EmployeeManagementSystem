package com.example.project1.service;
import java.util.List;

import com.example.project1.dto.EmployeeDto;

public interface EmployeeService {
     List<EmployeeDto> getAllEmployees();
     void saveEmployee(EmployeeDto employee);
}
