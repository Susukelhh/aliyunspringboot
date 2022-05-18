package com.controller;

import com.domain.Robot;
import com.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/robots")
public class RobotController {
    @Autowired
    private RobotService robotService;

    @GetMapping
    public List<Robot> getALl(){
        List<Robot> robotList=robotService.getAll();
        return robotList;
    }


}
