package com.cc.channel.service.impl;

import com.cc.channel.entities.Log;
import com.cc.channel.mappers.LogMapper;
import com.cc.channel.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author changcheng
 * @version 2017/6/8
 * @description
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogMapper logMapper;

    public void save(Log log) {
        logMapper.insert(log);
    }

    public Log select(int logId) {
        return logMapper.selectByPrimaryKey(logId);
    }
}
