package com.dao;

import com.domain.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

}
