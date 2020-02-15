package com.lingyun.bean;

import java.util.Date;

/**
 * 用户表
 * @author mly
 */
public class User {

    private Integer id;
    private String user;
    private Date createTime;
    private Date updateTIme;
    private String level;
    private String role;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTIme() {
        return updateTIme;
    }

    public void setUpdateTIme(Date updateTIme) {
        this.updateTIme = updateTIme;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", user='" + user + '\'' + ", createTime=" + createTime + ", updateTIme=" + updateTIme + ", level='" + level + '\'' + ", role='" + role + '\'' + ", password='" + password + '\'' + '}';
    }
}
