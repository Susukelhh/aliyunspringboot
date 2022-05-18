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
        //创建三个机器人集合对象
        List<Robot> middleRobots = robotDao.selectMiddleRobots();
        List<Robot> highRobots = robotDao.selectHighRobots();
        List<Robot> lowRobots = robotDao.selectLowRobots();
        //创建三个任务集合对象
        List<Task> nearTasks = taskDao.selectNearTasks();
        List<Task> emergencyTasks = taskDao.selectEmergencyTasks();
        List<Task> farTasks = taskDao.selectFarTasks();
        int emergencySize = emergencyTasks.size();
        Robot robot = highRobots.get(0);
        robot.setTask(emergencyTasks);
        robot.setStatus(1);
//        robotDao.update(robot);
        System.out.println("-----正在优先给高电量机器人安排紧急任务----");
        System.out.println("-----有1个高电量机器人分配到了3个紧急任务----");

        System.out.println("-----紧急任务开始执行----");
        System.out.println("-----正在给中电量机器人分配近点任务----");
        for (int i = 0; i < middleRobots.size(); i++) {
            Robot robot1 = middleRobots.get(i);
            List<Task> collect = nearTasks.stream().skip(3 * i).limit(3).collect(Collectors.toList());
            robot1.setTask(collect);
//            robotDao.update(robot1);
        }
        System.out.println("中电量机器人分配完毕，2个机器人分配到了6个近点任务");
        System.out.println("第一阶段任务分配完毕");

        System.out.println("高电量机器人：" + highRobots);
        System.out.println("中电量机器人：" + middleRobots);
        System.out.println("低电量机器人：" + lowRobots);
        List<Robot> surplusRobots = robotDao.selectSurplusRobots();
        System.out.println("剩余机器人集合" + surplusRobots);
        System.out.println("近点任务" + nearTasks);
        System.out.println("远点任务" + farTasks);

//        Thread.sleep(3000);

        return "正在执行任务。。。";
    }
}
