package com.cc.channel.service;

import com.cc.channel.entities.Log;

/**
 * @author changcheng
 * @version 2017/6/8
 * @description
 */
public interface LogService {
    Log select(int logId);
    void save(Log log);
}
