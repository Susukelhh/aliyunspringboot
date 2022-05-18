package com.dao;

import com.domain.Robot;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface RobotDao {
    //查询所有机器人
    @Select("select * from robot")
    List<Robot> selectAllRobots();

    //添加机器人
    @Insert("insert into robot (electricity,electricityStatus)values (#{electricity},#{electricityStatus})")
    boolean save(Robot robot);

    //查询高电量机器人
    @Select("select * from robot where electricity>50")
    List<Robot> selectHighRobots();

    //查询中电量机器人
    @Select("select * from robot where electricity>10 and electricity<50")
    List<Robot> selectMiddleRobots();

    //查询低电量机器人
    @Select("select * from robot where electricity<10")
    List<Robot> selectLowRobots();

    //查询未工作的机器人
    @Select("select * from robot where status = 0")
    List<Robot> selectSurplusRobots();

    //修改机器人
    @Update("update robot set status=#{status},task=#{task} where robotID=#{robotID})")
    boolean update(Robot robot);


}
