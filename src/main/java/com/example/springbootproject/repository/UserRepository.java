package com.example.springbootproject.repository;

import com.example.springbootproject.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
