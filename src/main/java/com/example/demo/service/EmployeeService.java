package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> findAllByRESTApi();

    List<Employee> findSpecificAgeApi(int age);
}
