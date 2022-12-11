package com.example.demo.service;

import com.example.demo.entity.EmpTransfer;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Value("${targetURL}")
    private String url;

    private  RestTemplate template = new RestTemplate();




    @Override
    public List<Employee> findAllByRESTApi() {
        EmpTransfer data = template.getForObject(url, EmpTransfer.class);
        return data.getData();
    }

    @Override
    public List<Employee> findSpecificAgeApi(int age) {
        List<Employee> data = template.getForObject(url, EmpTransfer.class).getData().stream()
                .filter(e -> e.getEmployee_age()>age).collect(Collectors.toList());
        return data;
    }
}
