package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentAndTeacher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface StudentService {
    Optional<Student> findById(String id);
    List<Student> findAll();
    String insert(Student stu);
    void delete(Student stu);
    String update(Student stu);
    List<StudentAndTeacher> findAllRelations(String id);

}
