package com.lg.springsource.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuguo on 2017/5/2.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/helloWorld/{hello}",headers = "name !=lg")
    @ResponseBody
    public String helloWorld(@PathVariable String hello,@RequestHeader String name) {
        System.out.println("hello = [" + hello + "], name = [" + name + "]");
        return "helloWorld,"+hello;
    }

}
