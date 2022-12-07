package com.example.demo.sercice;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    Optional<Student> findById(String id);
    List<Student> findAll();
//    String insert(Student stu);
    void delete(Student stu);
    String update(Student stu);
}
