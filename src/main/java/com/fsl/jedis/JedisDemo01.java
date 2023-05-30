package com.fsl.jedis;

import redis.clients.jedis.Jedis;

public class JedisDemo01 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.111.128",6379);
        String value = jedis.ping();
        System.out.println(value);
    }
}
