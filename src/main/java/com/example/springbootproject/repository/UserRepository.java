package com.example.springbootproject.repository;

import com.example.springbootproject.entities.Music;
import com.example.springbootproject.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findById(int id);
}
