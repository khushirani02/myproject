package com.example.springbootproject.controller;

import com.example.springbootproject.entities.Music;
import com.example.springbootproject.entities.User;
import com.example.springbootproject.exceptions.BusinessException;
import com.example.springbootproject.exceptions.ControllerException;
import com.example.springbootproject.response.AddMusicResponse;
import com.example.springbootproject.service.MusicService;
import com.example.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/FindUser/{id}")
//    public List<User> getUserId(@PathVariable int id){
//        return this.userService.getUserId(id);
//
//    }
    public ResponseEntity<?> getUserId(@PathVariable int id){

        try{
            List<User> listOfUsers=userService.getUserId(id);
            return new ResponseEntity<List<User>>(listOfUsers, HttpStatus.OK);
        }
        catch(BusinessException e){
            ControllerException ce=new ControllerException(e.getErrorCode(),e.getErrorMessage());
            return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
        }
        catch (Exception e){
            ControllerException ce=new ControllerException("612","Something went wrong in controller");
            return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
        }

    }

    @Autowired
    private MusicService musicService;
    @GetMapping("/music")
    public List<Music> getMusic(){
        return musicService.getMusic();
    }

    @GetMapping("/HelloWorld")
    public String getHelloWorld(){
        return "Hello World";
    }

    public ResponseEntity<String> getHello(){
        return new ResponseEntity<>("Hello World",HttpStatus.OK);

    }
    @PostMapping("/addMusic")
    public AddMusicResponse addMusic(@RequestBody Music music){

        return this.musicService.addMusic(music);
    }

    @GetMapping("/FindUserFavouriteMusic/{userId}")
    //difference b/w int and integer in argument
    public List<Music> getUserFavouriteMusic(@PathVariable int userId){
        System.out.println("finding by userID: "+userId);
        return this.musicService.getUserFavouriteMusic(userId);
    }

}
