package com.example.springbootproject.response;

import com.example.springbootproject.entities.Music;

public class AddMusicResponse extends BaseResponse{

    private Music music;

    public AddMusicResponse(String message, String errorCode,Music music) {
        super(message, errorCode);
        this.music=music;
    }


}
