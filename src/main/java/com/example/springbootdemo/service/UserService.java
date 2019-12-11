package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();
    public User getUserbyID(Long id);
    public User getChoicesbyID(Long id);
}
