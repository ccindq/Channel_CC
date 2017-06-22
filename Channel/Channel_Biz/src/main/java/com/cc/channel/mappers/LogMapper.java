package com.cc.channel.mappers;

import com.cc.channel.entities.Log;

import java.util.List;

public interface LogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(Log record);

    Log selectByPrimaryKey(Integer logId);

    List<Log> selectAll();

    int updateByPrimaryKey(Log record);
}