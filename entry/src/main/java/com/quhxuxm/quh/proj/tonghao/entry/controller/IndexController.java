package com.quhxuxm.quh.proj.tonghao.entry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/index")
public class IndexController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
