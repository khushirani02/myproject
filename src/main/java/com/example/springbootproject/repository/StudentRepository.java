package com.example.springbootproject.repository;

import com.example.springbootproject.entities.Student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {



}

