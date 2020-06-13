package com.edu.szu.csse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * MyController
 *
 * @author CS
 * @date 2020/6/13
 */
@Controller
public class MyController {

    @RequestMapping("test")
    @ResponseBody

    public String test(){

        return "hello world";

    }
}
