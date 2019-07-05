package com.poer.demo.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@UtilityClass
@Slf4j
public class JedisUtil {

    @Autowired
    private JedisPool jedisPool;

    public void set(String key, String value) {
        Jedis jedis = jedisPool.getResource();
        jedis.set(key, value);
    }

    public String get(String key) {
        Jedis jedis = jedisPool.getResource();
        return jedis.get(key);
    }

}
