package com.service;

import com.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(Integer id);
    public Integer saveUser(User user);
    public Integer deleteUser(Integer id);
}
