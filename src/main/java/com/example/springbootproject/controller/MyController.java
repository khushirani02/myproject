package com.example.springbootproject.controller;

import com.example.springbootproject.entities.Music;
import com.example.springbootproject.entities.User;
import com.example.springbootproject.service.MusicService;
import com.example.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/my")
public class MyController {

//    @GetMapping("/name")
//    public String getName(){
//        return "khushi";
//    }
//
//
//    @GetMapping("/json")
//    public Person getJsonName(){
//        return new Person("khushi",23);
//    }
//
//    @GetMapping("/Insane")
//    public Insane getInsane(){ return new Insane("khushi",1,13,23);}

    @Autowired
    private UserService userService;
    @GetMapping("/register")
    public List<User> getUser(){
        return userService.getUser();
    }
    //add user
    @PostMapping("/register")
    public User addUser(@RequestBody User user){

        return this.userService.addUser(user);
    }
    @Autowired
    private MusicService musicService;
    @GetMapping("/music")
    public List<Music> getMusic(){
        return musicService.getMusic();
    }

    @PostMapping("/addMusic")
    public Music addMusic(@RequestBody Music music){
        return this.musicService.addMusic(music);
    }

    @GetMapping("/FindUserFavouriteMusic/{userId}")
    //difference b/w int and integer in argument
    public Music getUserFavouriteMusic(@PathVariable int userId){
        System.out.println("finding by userID: "+userId);
        return this.musicService.getUserFavouriteMusic(userId);
    }

}
