package com.controller;

import com.dao.RobotDao;
import com.dao.TaskDao;
import com.domain.Robot;
import com.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HelloController {
    @Autowired
    private RobotDao robotDao;
    @Autowired
    private TaskDao taskDao;

    @ResponseBody
    @RequestMapping("/robots")
    public List<Robot> selectAllRobots(){
        return robotDao.selectAllRobots();
    }

    @ResponseBody
    @RequestMapping("/tasks")
    public List<Task> selectAllTasks(){
        System.out.println(taskDao.selectAllTasks());
        return taskDao.selectAllTasks();
    }

    @ResponseBody
    @RequestMapping("/start")
    public String start() throws InterruptedException {

        List<Robot> lowRobotArray = new ArrayList<>();
        List<Robot> surplusRobotArray = new ArrayList<>();

        //创建三个任务集合对象
        List<Task> nearTaskArray = new ArrayList<>();
        List<Task> farTaskArray = new ArrayList<>();
        List<Task> surplusTaskArray = new ArrayList<>();

        List<Robot> middleRobots = robotDao.selectMiddleRobots();
        List<Robot> highRobots = robotDao.selectHighRobots();
        List<Robot> lowRobots = robotDao.selectLowRobots();

        List<Task> allTasks = taskDao.selectAllTasks();
        List<Task> collect = allTasks.stream().limit(3).collect(Collectors.toList());

//        Thread.sleep(3000);

        return "正在执行任务。。。";
    }
}
