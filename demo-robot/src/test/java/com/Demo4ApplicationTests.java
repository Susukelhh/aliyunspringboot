package com;
import com.dao.RobotDao;
import com.dao.TaskDao;
import com.domain.Robot;
import com.domain.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.stream.Collectors;

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

    //查询所有任务
    @Test
    void selectEmergencyTasks() {
        List<Task> tasks = taskDao.selectEmergencyTasks();
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
    //查询剩余机器人
    @Test
    void selectSurplusTasks() {
        List<Task> tasks = taskDao.selectSurplusTasks();
        System.out.println(tasks);
    }
    //根据id查询任务
    @Test
    void selectTaskByID() {
        Task task = taskDao.selectTaskByID(3);
        System.out.println(task);
    }
    //添加机器人
    @Test
    void saveRobot() {
        Robot robot =new Robot();
        robot.setElectricity(68);
        robot.setElectricityStatus(1);
        boolean save = robotDao.save(robot);
        System.out.println(save);
    }

    @Test
    void save() {
        List<Robot> robotList = robotDao.selectAllRobots();
        List<Robot> collect = robotList.stream().limit(3).collect(Collectors.toList());
        List<Robot> collect1 = robotList.stream().skip(6).limit(3).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
    }


}
