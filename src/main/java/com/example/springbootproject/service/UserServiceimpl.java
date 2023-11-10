package com.example.springbootproject.service;

import com.example.springbootproject.entities.Music;
import com.example.springbootproject.entities.User;
import com.example.springbootproject.exceptions.BusinessException;
import com.example.springbootproject.exceptions.NotFoundException;
import com.example.springbootproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
@Service
public class UserServiceimpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUser() {
        if(userRepository.findAll().isEmpty()){
            throw new BusinessException("604","Hey list completely empty , we have nothing to return ");
        }
        try{
            return userRepository.findAll();
        }
        catch(Exception e){
            throw new BusinessException("605","Something went wrong in Service layer while saving the user "+e.getMessage());
        }
        //return userRepository.findAll();

    }

    @Override
    public User addUser(User user) {

        if (user.getName().isEmpty() || user.getName().length() == 0) {
            throw new BusinessException("601", "Please send proper name its blank");
        }
        try {
            userRepository.save(user);
            return user;
        }
        catch(IllegalArgumentException e){
            //for user detail is null
            throw new BusinessException("602","given user is null "+e.getMessage());
        }
        catch(Exception e){
            throw new BusinessException("603","Something went wrong in Service layer while saving the User "+e.getMessage());
        }
    }

    @Override
    public List<User> getUserId(int id) {

        try{
            List<User> userlist=userRepository.findById(id);
            if(userlist==null){
                throw new BusinessException("609","User list is null");
            }
            return userRepository.findById(id);
        }
        catch(IllegalArgumentException e){
            throw new BusinessException("606","given User id is null , please send some id to be searched"+e.getMessage());
        }
        catch(java.util.NoSuchElementException e){
            throw new BusinessException("607","given user id doesn't exists in DB "+e.getMessage());
        }

    }


}
