package com.lingyun.dao;

import com.lingyun.bean.User;
import org.apache.ibatis.annotations.Select;

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

    /**
     * 新增
     * @param user
     */
    void  saveUser(User user);

    /**
     * 修改
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除
     * @param user
     */
    void deleteUser(User user);

    /**
     *  根据用户的id 查询
     * @param userId
     * @return
     */
    User  findById(Integer userId);

    /**
     *  根据用户的id 删除
     * @param userId
     */
    void deleteById(Integer userId);

    /**
     *  根据用户名称模糊查询
     * @param userName
     * @return
     */
    List<User> findByName(String userName);

    /**
     *  查询总记录数
     * @return
     */
    int findTotal();

}
