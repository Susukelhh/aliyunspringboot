package com.dao;

import com.domain.Robot;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RobotDao {

//    @Insert("insert into robot values (null,#{} )")
//    int save();

    @Select("select * from robot")
    List<Robot> getAll();
}
