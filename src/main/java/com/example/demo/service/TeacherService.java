package com.example.demo.service;

import com.example.demo.entity.StudentAndTeacher;
import com.example.demo.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TeacherService {
    String insert(Teacher teacher);
    String update(Teacher teacher);
    Optional<Teacher> findById(String id);
    List<Teacher> findAll();
    void delete(Teacher teacher);
    List<StudentAndTeacher> findAllRelations(String id);
}
