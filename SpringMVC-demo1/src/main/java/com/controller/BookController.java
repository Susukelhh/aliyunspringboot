package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

    @RequestMapping("/book/save")
    @ResponseBody
    public String save(String name){
        System.out.println("name="+name);
        System.out.println("user save ...");
        return "{'info':'luohonghe'}";
    }

}
