package com.example.demo.repository.teacher;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentAndTeacher;
import com.example.demo.entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherCustomRepo {
    String insert(Teacher teacher);
    String update(Teacher teacher);
    List<StudentAndTeacher> findAllRelations(Teacher teacher);
}
