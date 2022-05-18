package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/user/save")
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'info':'luohonghe'}";
    }

    @RequestMapping("/user/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete ...");
        return "{'info':'luohonghe'}";
    }
}
