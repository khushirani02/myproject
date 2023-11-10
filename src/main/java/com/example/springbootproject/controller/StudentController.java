package com.example.springbootproject.controller;

import com.example.springbootproject.entities.Course;
import com.example.springbootproject.entities.Student;
import com.example.springbootproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){

        return this.studentService.addStudent(student);
    }

    @PutMapping("/Student/{studentId}")
    public Student updateStudent(@RequestBody Student student, @PathVariable String studentId){
        return this.studentService.updateStudent(student,Integer.parseInt(studentId));
    }

}
