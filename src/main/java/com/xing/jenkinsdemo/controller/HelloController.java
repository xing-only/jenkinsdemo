package com.xing.jenkinsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author DXX
 * @Date 2021/1/28
 **/
@Controller
public class HelloController {

    @RequestMapping("/myIndex")
    public String index() {
        System.out.println("hello.springboot的第一个controller");
        return "index1";
    }
}
