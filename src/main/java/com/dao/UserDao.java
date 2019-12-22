package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
  // @Select("select * from user")
    public List<User> findAll();

    public User findById(Integer id);
    public Integer saveUser(User user);
    public Integer deleteUser(Integer id);
}
