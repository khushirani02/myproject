package com.example.springbootproject.service;

import com.example.springbootproject.entities.Music;
import com.example.springbootproject.repository.MusicRepository;
import com.example.springbootproject.response.AddMusicResponse;
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
    public AddMusicResponse addMusic(Music music) {

        try {
            musicRepository.save(music);
        }catch (Exception e){
            return new AddMusicResponse(e.getMessage(),"MUSIC ADD ERROR",music);
        }
        return new AddMusicResponse("Music saved","NO ERROR",music);
    }

    @Override
    public List<Music> getUserFavouriteMusic(int userId) {
        return  musicRepository.findByUserId(userId);
    }
}
