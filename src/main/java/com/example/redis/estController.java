package com.example.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class estController {


    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("t")
    public String t() {
        redisTemplate.opsForSet().add("y", "dd");
        return "成功";
    }
}
