package com.example.springbootproject.service;

import com.example.springbootproject.entities.Course;
import com.example.springbootproject.entities.User;
import com.example.springbootproject.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceimpl implements CourseService{

    List<Course> list;


    @Autowired
    CourseRepository courseRepository;
    public CourseServiceimpl(){
        list=new ArrayList<>();
        list.add(new Course(123,"Java Core Course","this course contains basics of Java"));
        list.add(new Course(4343,"Spring boot course","creating rest api using Spring boot"));
    }

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(long courseId) {

       return courseRepository.findById(courseId).get();
    }

    @Override
    public Course addCourse(Course course) {
       courseRepository.save(course);
        return course;
    }




}
