package com.wy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//热部署  快捷键 ctrl+f9
@Controller
public class IndexController {
    //映射多个HTML
    @RequestMapping({"/index","/"})
    public String index(){
        return "index";
    }

}
