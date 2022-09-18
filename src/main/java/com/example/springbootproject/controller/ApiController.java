package com.example.springbootproject.controller;

import com.example.springbootproject.Person;
import com.example.springbootproject.Insane;
import com.example.springbootproject.entities.Course;
import com.example.springbootproject.entities.User;
import com.example.springbootproject.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    //private String courseId;

    public ApiController() {
    }

    @GetMapping("/name")
    public String getName(){
        return "khushi";
    }


    @GetMapping("/json")
    public Person getJsonName(){
        return new Person("khushi",23);
    }

    @GetMapping("/Insane")
    public Insane getInsane(){ return new Insane("Saurav",1,13,23);}


    @GetMapping("/Home")
    public String home(){
        return "Welcome to Courses Application";
    }
     @Autowired  //to avoid hard coupling && dependency injection && IOC (inversion of control)
    private CourseService courseservice ;
    //get the courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseservice.getCourses();

    }
    //single course get
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseservice.getCourse(Long.parseLong(courseId));
    }

    //course add
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){

        return this.courseservice.addCourse(course);
    }




}
