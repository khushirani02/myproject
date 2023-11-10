package com.example.springbootproject.service;

import com.example.springbootproject.entities.Student;

import java.util.List;

        import com.example.springbootproject.entities.Course;
        import com.example.springbootproject.entities.Music;
        import com.example.springbootproject.entities.Student;
        import com.example.springbootproject.response.AddMusicResponse;

        import java.util.List;

public interface StudentService {


    public List<Student> getStudent();

    public Student addStudent(Student student);

    public Student updateStudent(Student student, int studentId);




}
