package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wyb
 * @Date: 2019/4/22 20:53
 * @Description:
 */
@RestController
public class TestController {
    @RequestMapping("/test1")
    public String test1(){
        return "hello world!!!!!!";
    }

}
