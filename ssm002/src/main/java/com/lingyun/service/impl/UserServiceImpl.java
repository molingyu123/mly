package com.lingyun.service.impl;

import com.lingyun.bean.User;
import com.lingyun.dao.UserDao;
import com.lingyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void addUser(User user) {
       userDao.addUser(user);
    }

    @Override
    public void deleteUser(String id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(String id, User user) {
       userDao.updateUser(id,user);
    }

    @Override
    public User findOne(String name, String password) {
        return userDao.findOne(name,password);
    }
}
