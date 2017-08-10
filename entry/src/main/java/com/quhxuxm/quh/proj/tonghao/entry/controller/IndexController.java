package com.quhxuxm.quh.proj.tonghao.entry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/index")
public class IndexController {
    @ResponseBody
    @RequestMapping(path = "/hello")
    public String hello() {
        return "Hello World";
    }
}
