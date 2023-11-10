package com.example.springbootproject.service;

import com.example.springbootproject.entities.User;

import java.util.List;

public interface UserService {

    public List<User> getUser();

    public User addUser(User user);

    public List<User> getUserId(int id);
}
