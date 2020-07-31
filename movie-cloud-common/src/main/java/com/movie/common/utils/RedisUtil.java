package com.movie.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @Author xue
 * @Date 2020/7/31 16:27
 * @Version 1.0
 * Buddha bless, never bug!
 */
public class RedisUtil {
    @Autowired
    public static StringRedisTemplate redisTemplate;

    public static void strSet(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public static String strGet(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public static void setExpire(String key) {
        redisTemplate.expire(key, 20, TimeUnit.MINUTES);
    }
}
