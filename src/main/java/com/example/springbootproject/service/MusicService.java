package com.example.springbootproject.service;

import com.example.springbootproject.entities.Music;
import com.example.springbootproject.response.AddMusicResponse;

import java.util.List;

public interface MusicService {

    public List<Music> getMusic();

    public AddMusicResponse addMusic(Music music);

    public List<Music> getUserFavouriteMusic(int userId);
}
