package com.example.springbootproject;

import com.example.springbootproject.entities.Course;
import com.example.springbootproject.service.CourseService;
import com.example.springbootproject.service.CourseServiceimpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseServiceTester {

    @Test
    public void testGetCourse(){
        CourseService cs= new CourseServiceimpl();
        Course course=cs.getCourse(4343);
        assertEquals(course.getTitle(),"Spring boot course");
    }
}
