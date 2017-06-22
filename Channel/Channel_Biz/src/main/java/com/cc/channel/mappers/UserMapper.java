package com.cc.channel.mappers;

import com.cc.channel.entities.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    User selectByPrimaryKey(Integer userId);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    int countUserByName(String userName);

    int countUserByEmail(String email);

    int selectUserByPhoneNum(String phoneNum);

    User selectUserByName(String userName);
}