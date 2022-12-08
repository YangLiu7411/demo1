package com.example.demo.repository.teacher;

import com.example.demo.entity.StudentAndTeacher;
import com.example.demo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, String>, TeacherCustomRepo {

}
