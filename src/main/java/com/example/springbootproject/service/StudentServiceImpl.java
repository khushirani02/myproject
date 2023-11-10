package com.example.springbootproject.service;

import com.example.springbootproject.entities.Course;
import com.example.springbootproject.entities.Student;
import com.example.springbootproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }



    @Override
    public Student updateStudent(Student student, int studentId) {
        Student s=studentRepository.findById(studentId).get();
        s.setName(student.getName());
        studentRepository.save(s);
        return student;
    }

    @Override
    public Student addStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

}
