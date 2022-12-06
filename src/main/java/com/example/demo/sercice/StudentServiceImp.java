package com.example.demo.sercice;

import com.example.demo.repository.StudentRepository;
import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService{

//    private final StudentRepository studentRepository;
//
//    @Autowired
//    public StudentServiceImp(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//    @Override
//    public Optional<Student> findById(String id) {
//        Optional<Student> stu = studentRepository.findById(id);
//        if (stu.isEmpty()) {
//            throw new RuntimeException("...");
//        }
//        return stu;
//    }
//
//    @Override
//    public List<Student> findAll() {
//        List<Student> list = studentRepository.findAll();
//        return list;
//    }
//
////    @Override
////    public String insert(Student stu) {
////
////        return studentRepository.insert(stu);
////    }
//
//    @Override
//    public void delete(Student stu) {
//        studentRepository.delete(stu);
//    }
//
////    @Override
////    public String update(Student stu) {
////        return studentRepository.update(stu);
////    }
}
