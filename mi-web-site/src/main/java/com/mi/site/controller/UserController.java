package com.mi.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping(value = "/user/login")
    public String login(){
        return "/user/login";
    }

    @GetMapping(value = "/user/reg")
    public String reg(){
        return "/user/reg";
    }

}
