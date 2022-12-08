package com.example.demo.repository.teacher;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentAndTeacher;
import com.example.demo.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TeacherCustomRepoImpl implements TeacherCustomRepo{

    private final EntityManager entityManager;

    @Autowired
    public TeacherCustomRepoImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public String insert(Teacher teacher) {
        entityManager.persist(teacher);
        return teacher.getId();
    }

    @Override
    public String update(Teacher teacher) {
        entityManager.merge(teacher);
        return teacher.getId();
    }

    @Override
    public List<StudentAndTeacher> findAllRelations(Teacher tea) {
        return tea.getRelations();
    }

}
