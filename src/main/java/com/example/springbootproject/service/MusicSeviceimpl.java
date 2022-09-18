package com.example.springbootproject.service;

import com.example.springbootproject.entities.Music;
import com.example.springbootproject.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicSeviceimpl implements MusicService{

    @Autowired
    private MusicRepository musicRepository;
    @Override
    public List<Music> getMusic() {
        return musicRepository.findAll();
    }

    @Override
    public Music addMusic(Music music) {
        musicRepository.save(music);
        return music;
    }

    @Override
    public Music getUserFavouriteMusic(int userId) {
        return  musicRepository.findByUserId(userId);
    }
}
