package com.example.springbootproject.service;

import com.example.springbootproject.entities.Course;
import com.example.springbootproject.entities.User;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public  Course getCourse(long courseId);


    public Course addCourse(Course course);


}
