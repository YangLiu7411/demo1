package com.example.demo.repository.student;


import com.example.demo.entity.Student;
import com.example.demo.entity.StudentAndTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.management.relation.Relation;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentCustomRepoImpl implements StudentCustomRepo {
//    @Override
//    public String insert(Student student) {
//        entityManager.persist(student);
//        return student.getId();
//    }

    private final EntityManager entityManager;

    @Autowired
    public StudentCustomRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public String insert(Student stu) {
        entityManager.persist(stu);
        return stu.getId();
    }

    @Override
    public String update(Student student) {
        entityManager.merge(student);
        return student.getId();
    }

    @Override
    public List<StudentAndTeacher> findAllRelations(Student stu) {
        return stu.getRelations();
    }
}
