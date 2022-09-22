package com.niteshkumarportfolio.springboot.service;

import com.niteshkumarportfolio.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
}
