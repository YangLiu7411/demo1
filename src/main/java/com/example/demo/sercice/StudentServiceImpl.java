package com.example.demo.sercice;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentAndTeacher;
import com.example.demo.repository.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Optional<Student> findById(String id) {
        Optional<Student> stu = studentRepository.findById(id);
        if (stu.isEmpty()) {
            throw new RuntimeException("...");
        }
        return stu;
    }

    @Override
    public List<Student> findAll() {
        List<Student> list = studentRepository.findAll();
        return list;
    }

    @Override
    public String insert(Student stu) {
//        return studentRepository.insert(stu);
        studentRepository.save(stu);
        return stu.getId();
    }

    @Override
    public void delete(Student stu) {
        studentRepository.delete(stu);
    }

    @Override
    public String update(Student stu) {
        return studentRepository.update(stu);
    }

    @Override
    public List<StudentAndTeacher> findAllRelations(String id) {
        Optional<Student> stu = findById(id);
        return studentRepository.findAllRelations(stu.get());
    }


}
