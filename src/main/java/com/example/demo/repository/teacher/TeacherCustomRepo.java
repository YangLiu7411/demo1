package com.example.demo.repository.teacher;

import com.example.demo.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherCustomRepo {
    String insert(Teacher teacher);
    String update(Teacher teacher);
}
