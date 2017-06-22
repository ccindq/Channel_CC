package com.cc.channel.service.impl;

import com.cc.channel.service.SecondKillService;
import com.cc.channel.util.redisconnection.RedisUtils;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

/**
 * @author changcheng
 * @version 2017/6/14
 * @description
 */
@Service
public class SecondKillServiceImpl implements SecondKillService {

    RedisUtils redisUtils;

    /**
     * @param userId
     * @param productId
     * @return
     */
    public boolean secondkill(int userId, int productId) {
        Jedis jedis = new Jedis();
        return false;
    }
}
