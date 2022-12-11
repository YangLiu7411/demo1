package com.example.demo.service;

import com.example.demo.entity.StudentAndTeacher;
import com.example.demo.entity.Teacher;
import com.example.demo.repository.teacher.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService{

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public String insert(Teacher teacher) {
        return teacherRepository.insert(teacher);
    }

    @Override
    public String update(Teacher teacher) {
        return teacherRepository.update(teacher);
    }

    @Override
    public Optional<Teacher> findById(String id) {

        return teacherRepository.findById(id);
    }

    @Override
    public List<Teacher> findAll() {

        return teacherRepository.findAll();
    }

    @Override
    public void delete(Teacher teacher) {
        teacherRepository.delete(teacher);
    }

    @Override
    public List<StudentAndTeacher> findAllRelations(String id) {
        Optional<Teacher> tea = findById(id);
        return teacherRepository.findAllRelations(tea.get());
    }

}
