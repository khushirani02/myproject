package com.example.springbootproject.repository;

import com.example.springbootproject.entities.Music;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicRepository extends JpaRepository<Music,Integer> {


    List<Music> findByUserId(int userId);
}
