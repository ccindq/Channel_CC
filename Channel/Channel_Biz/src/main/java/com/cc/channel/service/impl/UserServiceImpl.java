package com.cc.channel.service.impl;

import com.cc.channel.e.UserLoginException;
import com.cc.channel.e.UserRegistException;
import com.cc.channel.entities.User;
import com.cc.channel.mappers.UserMapper;
import com.cc.channel.service.UserService;
import com.cc.channel.util.GlobalMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author changcheng
 * @version 2017/6/9
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public void regist(User user) {
        String userName = user.getUserName();
        String email = user.getEmail();
        String phoneNum = user.getPhoneNum();
        int count = userMapper.countUserByName(userName);
        if (count > 0) {
            //构建异常体系
            throw new UserRegistException(GlobalMessage.USER_NAME_ALREADY_EXIST);
        }
        count = userMapper.countUserByEmail(email);
        if (count > 0) {
            throw new UserRegistException(GlobalMessage.USER_EMAIL_ALREADY_EXIST);
        }
        count = userMapper.selectUserByPhoneNum(phoneNum);
        if (count > 0) {
            throw new UserRegistException(GlobalMessage.USER_PHONE_ALREADY_EXIST);
        }
        //执行用户密码加密
        userMapper.insert(user);
    }

    public User login(User user) {
        User tmpUser=userMapper.selectUserByName(user.getUserName());
        if (tmpUser == null) {
            throw new UserLoginException(GlobalMessage.User_NOT_EXIST);
        }
        if (user.getUserPwd() == null && user.getUserPwd() != tmpUser.getUserPwd()) {
            throw new UserLoginException(GlobalMessage.User_PWD_WRONG);
        }
        return tmpUser;
    }

    public void findUserByEmail(String email) {

    }

    public void findUserByPhoneNum(String phoneNum) {

    }

    public void deleteUserById(int userId) {

    }

    public void updateUser(User user) {

    }
}

