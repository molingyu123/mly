package com.lingyun.dao;


import com.lingyun.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * user 接口
 */
@Repository
public interface UserDao {

    /**
     * 查询所用用户
     * @return
     */
    List<User> findAll();

    /**
     * 验证用户名
     * @param name
     * @param password
     * @return
     */
    User findOne(String name,String password);

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(String id);

    /**
     * 修改用户
     * @param id
     * @param user
     */
    void updateUser(String id,User user);

}
