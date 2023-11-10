package com.example.springbootproject.repository;

import com.example.springbootproject.entities.Course;
import com.example.springbootproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {



}
