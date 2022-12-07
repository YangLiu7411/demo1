package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCustomRepo {

    Student insert(Student student);

//    String update(Student student);
}
