package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.sercice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController (StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Student>> findStuById(@PathVariable String id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(studentService.findAll());
    }

//    @PostMapping
//    public ResponseEntity<String> insert(@RequestBody Student student) {
//        return ResponseEntity.ok(studentService.insert(student));
//    }

//    @PutMapping(value = "/{id}") //, consumes = {"multipart/mixed"}
//    public ResponseEntity<String> update(@PathVariable String id, @RequestParam("name") String name){
//        Student stu = new Student();
//        stu.setId(id);
//        stu.setName(name);
//        return ResponseEntity.ok(studentService.update(stu));
//    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        //应该返回一个boolean?
        Optional<Student> stu = studentService.findById(id);
        studentService.delete(stu.get());
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleNotFound() {
        return new ResponseEntity<>(
                new String("resource not found"),
                HttpStatus.NOT_FOUND
        );
    }
}
