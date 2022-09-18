package com.example.springbootproject.repository;

import com.example.springbootproject.entities.Music;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music,Integer> {


    Music findByUserId(int userId);
}
