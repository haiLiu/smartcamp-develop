package com.ex.smartcamp.pojo;

import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    /**
     * 用户Id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户账号
     */
    @Column(name = "user_code")
    private String userCode;

    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    @Column(name = "user_password")
    private String userPassword;

    /**
     * 用户状态（1：正常，0：暂停）
     */
    @Column(name = "user_state")
    private String userState;

    /**
     * 获取用户Id
     *
     * @return user_id - 用户Id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户Id
     *
     * @param userId 用户Id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户账号
     *
     * @return user_code - 用户账号
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置用户账号
     *
     * @param userCode 用户账号
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 获取用户名称
     *
     * @return user_name - 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户密码
     *
     * @return user_password - 用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置用户密码
     *
     * @param userPassword 用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取用户状态（1：正常，0：暂停）
     *
     * @return user_state - 用户状态（1：正常，0：暂停）
     */
    public String getUserState() {
        return userState;
    }

    /**
     * 设置用户状态（1：正常，0：暂停）
     *
     * @param userState 用户状态（1：正常，0：暂停）
     */
    public void setUserState(String userState) {
        this.userState = userState;
    }
}