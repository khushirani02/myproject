package com.example.springbootproject.repository;

import com.example.springbootproject.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {


}
