package com.service;

import com.domain.Robot;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RobotServiceTest {
    @Autowired
    private RobotService robotService;

    @Test
    void contextLoads() {
        List<Robot> list=robotService.getAll();
        System.out.println(list);
    }

}
