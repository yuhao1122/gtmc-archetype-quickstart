package com.gtmc.archetypes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @Auther：Mr.Yu
 * @Date：2019/3/27 10:17
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        System.out.println(1111);
        System.err.println(2222);
        return "Hello World12345";
    }

}
