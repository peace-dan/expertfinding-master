package com.njust.bean.baseBean;

import javax.persistence.*;

public class User {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    private String password;

    /**
     * 2超级管理员1管理员0普通用户
     */
    @Column(name = "priv_level")
    private Integer privLevel;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "is_push")
    private Integer isPush;

    public User(Integer userId, String userName, String password, Integer privLevel, String userEmail, Integer isPush) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.privLevel = privLevel;
        this.userEmail = userEmail;
        this.isPush = isPush;
    }

    public User() {
        super();
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取2超级管理员1管理员0普通用户
     *
     * @return priv_level - 2超级管理员1管理员0普通用户
     */
    public Integer getPrivLevel() {
        return privLevel;
    }

    /**
     * 设置2超级管理员1管理员0普通用户
     *
     * @param privLevel 2超级管理员1管理员0普通用户
     */
    public void setPrivLevel(Integer privLevel) {
        this.privLevel = privLevel;
    }

    /**
     * @return user_email
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * @return is_push
     */
    public Integer getIsPush() {
        return isPush;
    }

    /**
     * @param isPush
     */
    public void setIsPush(Integer isPush) {
        this.isPush = isPush;
    }
}