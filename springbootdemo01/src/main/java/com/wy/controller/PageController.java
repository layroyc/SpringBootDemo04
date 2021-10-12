package com.wy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/loginVue")
    public String loginVue(){
        return "loginVue";
    }

    @RequestMapping("/registerVue")
    public String registerVue(){
        return "registerVue";
    }

    @RequestMapping("/studentList")
    public String studentList(){        //  /page/studentList
        return "studentList";
    }
}
