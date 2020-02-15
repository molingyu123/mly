package com.lingyun.service;

import com.lingyun.bean.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void addUser(User user);

    void deleteUser(String id);

    void updateUser(String id,User user);

    User findOne(String name,String password);

}
