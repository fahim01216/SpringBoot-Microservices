package com.codewithfahim.employeeservice.service;

import com.codewithfahim.employeeservice.dto.ApiResponseDto;
import com.codewithfahim.employeeservice.dto.EmployeeDto;

import java.util.Optional;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    ApiResponseDto getEmployeeById(Long employeeId);
}
