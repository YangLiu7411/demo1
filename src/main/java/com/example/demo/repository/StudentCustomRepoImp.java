package com.example.demo.repository;


import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class StudentCustomRepoImp implements StudentCustomRepo {

    private final EntityManager entityManager;

    @Autowired
    private StudentCustomRepoImp (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

//    @Override
//    public String insert(Student stu) {
//        em.persist(stu);
//        return stu.getId();
//    }
//
    @Override
    public String update(Student student) {
        entityManager.merge(student);
        return student.getId();
    }
}
