package com.xiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 该控制类是为了查找jsp或者带参数访间jsp或者 跳转的
 I
*/
@Controller
public class PagesController {
    @RequestMapping("/")
    public String adds(){
        return "add";
    }
    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    @RequestMapping("/emps")
    public String emps(){
        return "emps";
    }
}
