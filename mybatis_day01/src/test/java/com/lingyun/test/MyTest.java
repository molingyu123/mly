package com.lingyun.test;

import com.lingyun.bean.User;
import com.lingyun.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MyTest {

    private InputStream inputStream;
    private SqlSession sqlSession;

    private UserDao mapper;

    @Before
    public void init() throws IOException {
        inputStream =Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        mapper = sqlSession.getMapper(UserDao.class);
    }

    @After
    public void destory() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void test1() throws IOException {
        List<User> all = mapper.findAll();
        for(User user:all){
            System.out.println(user);
        }
    }

    @Test
    public void test2(){
        User user = new User();
        user.setUsername("小强");
        user.setSex("男");
        user.setAddress("中国");
        user.setBirthday(new Date());
        System.out.println("插入之前的对象："+user);
        mapper.saveUser(user);
        System.out.println("插入之后的对象："+user);
    }

    @Test
    public void test3(){
        User user = new User();
        user.setUsername("小Ming");
        user.setSex("女");
        user.setAddress("china");
        user.setBirthday(new Date());
        mapper.updateUser(user);
    }

    @Test
    public void test4(){
        User user = new User();
        user.setUsername("小Ming");
        user.setSex("女");
        user.setAddress("china");
        user.setBirthday(new Date());
        mapper.deleteUser(user);
    }

    @Test
    public void test5(){
        User user=mapper.findById(6);
        System.out.println(user);
    }
    @Test
    public void test6(){
        mapper.deleteById(3);
        List<User> userList = mapper.findAll();
        for(User user:userList){
            System.out.println(user);
        }
    }

    @Test
    public void test7(){
        List<User> userList = mapper.findByName("小");
        for(User user : userList){
            System.out.println(user);
        }
    }
    @Test
    public void test8(){
        int count = mapper.findTotal();
        System.out.println("记录总条数："+count);
    }
}
