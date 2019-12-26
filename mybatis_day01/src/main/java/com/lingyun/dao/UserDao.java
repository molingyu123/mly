package com.lingyun.dao;

import com.lingyun.bean.User;

import java.util.List;

/**
 * 接口
 * @author mly
 */
public interface UserDao {

    /**
     * 查询所有
     * @return
     */
    List<User> findAll();
}
