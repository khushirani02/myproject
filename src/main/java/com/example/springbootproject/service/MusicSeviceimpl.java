package com.example.springbootproject.service;

import com.example.springbootproject.entities.Music;
import com.example.springbootproject.exceptions.MyException;
import com.example.springbootproject.exceptions.NotFoundException;
import com.example.springbootproject.repository.MusicRepository;
import com.example.springbootproject.response.AddMusicResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.ResponseStatus;

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

        List<Music> musicList=musicRepository.findByUserId(userId);

        if(CollectionUtils.isEmpty(musicList)) throw new NotFoundException("No saved music found for user","NO_DATA_ERROR");

      return musicList;
    }
}
