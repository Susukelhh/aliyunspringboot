package com.dao;

import com.domain.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface TaskDao {
    //查询所有任务
    @Select("select * from task")
    List<Task> selectAllTasks();
    //根据id查询任务
    @Select("select * from task where taskID=#{taskID}")
    Task selectTaskByID(Integer taskID);

    //查询未完成的任务
    @Select("select * from task where status = 0")
    List<Task> selectSurplusTasks();

    //查询紧急任务
    @Select("select * from task where emergency = 1")
    List<Task> selectEmergencyTasks();

    //查询近点任务
    @Select("select * from task where distance = 'near'")
    List<Task> selectNearTasks();

    //查询远点任务
    @Select("select * from task where distance = 'far'")
    List<Task> selectFarTasks();

    //更改任务属性
    @Update("update task set status = #{status} where taskID = #{taskID}")
    boolean updateTasks();

}
