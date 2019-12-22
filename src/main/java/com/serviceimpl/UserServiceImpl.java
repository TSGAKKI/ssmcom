package com.serviceimpl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        System.out.println("创建BEAN");
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public Integer saveUser(User user) {
        return null;
    }

    @Override
    public Integer deleteUser(Integer id) {
        return null;
    }
}
