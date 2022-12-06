package com.example.demo.repository;


import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class StudentCustomRepoImp implements StudentCustomRepo {

//    private final EntityManager em;
//
//    @Autowired
//    private StudentCustomRepoImp (EntityManager e) {
//        this.em = e;
//    }
//    @Override
//    public String insert(Student stu) {
//        em.persist(stu);
//        return stu.getId();
//    }
//
//    @Override
//    public String update(Student stu) {
//        em.merge(stu);
//        return stu.getId();
//    }
}
