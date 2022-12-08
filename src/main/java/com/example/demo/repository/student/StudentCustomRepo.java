package com.example.demo.repository.student;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentAndTeacher;
import org.springframework.stereotype.Repository;

import javax.management.relation.Relation;
import java.util.List;

@Repository
public interface StudentCustomRepo {

    String insert(Student student);

    String update(Student student);

    List<StudentAndTeacher> findAllRelations(Student stu);

}
