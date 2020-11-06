package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author  Dongsu
 * @create  2020/11/6 16:13
 * @desc 用户controller
 **/
@Controller
public class UserContoller {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World !";
    }
}
