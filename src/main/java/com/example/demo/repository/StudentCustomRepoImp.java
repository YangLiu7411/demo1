package com.example.demo.repository;


import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class StudentCustomRepoImp implements StudentCustomRepo {
    @Override
    public Student insert(Student student) {
        entityManager.persist(student);
        return student;
    }

    private final EntityManager entityManager;

    @Autowired
    private StudentCustomRepoImp (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

//    @Override
//    public String insert(Student stu) {
//        entityManager.persist(stu);
//        return stu.getId();
//    }
//
//    @Override
//    public String update(Student student) {
//        entityManager.merge(student);
//        return student.getId();
//    }
}
