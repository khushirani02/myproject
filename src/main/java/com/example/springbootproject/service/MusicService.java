package com.example.springbootproject.service;

import com.example.springbootproject.entities.Music;

import java.util.List;

public interface MusicService {

    public List<Music> getMusic();

    public Music addMusic(Music music);

    public Music getUserFavouriteMusic(int userId);
}
