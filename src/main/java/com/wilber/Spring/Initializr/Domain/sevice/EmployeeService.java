package com.wilber.Spring.Initializr.Domain.sevice;
import java.util.List;
import com.wilber.Spring.Initializr.Domain.DTO.EmployeeDto;

public interface EmployeeService {

    List<EmployeeDto> getAllEmployees();

    EmployeeDto createEmployee(EmployeeDto employee);

    EmployeeDto getEmployeeById(Long employeeId);

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto employeeDto);

    void deleteEmployee(Long employeeId);
}
