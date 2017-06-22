package com.cc.channel.service;

import com.cc.channel.entities.User;

/**
 * @author changcheng
 * @version 2017/6/9
 * @description
 */
public interface UserService {

    void regist(User user);

    User login(User user);

    void findUserByEmail(String email);

    void findUserByPhoneNum(String phoneNum);

    void deleteUserById(int userId);

    void updateUser(User user);
}
