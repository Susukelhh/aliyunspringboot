package com;

import com.dao.RobotDao;
import com.dao.TaskDao;
import com.domain.Robot;
import com.domain.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo4ApplicationTests {

    @Autowired
    private TaskDao taskDao;
    @Autowired
    private RobotDao robotDao;



    //查询所有任务
    @Test
    void selectAllTasks() {
        List<Task> tasks = taskDao.selectAllTasks();
        System.out.println(tasks);
    }
    //查询所有机器人
    @Test
    void selectAllRobots() {
        List<Robot> robotList = robotDao.selectAllRobots();
        System.out.println(robotList);
    }
    //查询高电量机器人
    @Test
    void selectHighRobots() {
        List<Robot> robotList = robotDao.selectHighRobots();
        System.out.println(robotList);
    }
    @Test
    void selectSurplusTasks() {
        List<Task> tasks = taskDao.selectSurplusTasks();
        System.out.println(tasks);
    }

    @Test
    void selectTaskByID() {
        Task task = taskDao.selectTaskByID(3);
        System.out.println(task);
    }

    @Test
    void saveRobot() {
        Robot robot =new Robot();
        robot.setElectricity(68);
        robot.setElectricityStatus(1);
        boolean save = robotDao.save(robot);
        System.out.println(save);
    }




}
