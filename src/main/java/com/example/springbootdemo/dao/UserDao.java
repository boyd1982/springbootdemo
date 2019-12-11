package com.example.springbootdemo.dao;

import com.example.springbootdemo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public List<User> getUsers();
    public User getUserbyID(Long id);
    public User getChoicesByID(Long id);
}
