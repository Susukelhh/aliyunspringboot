package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Robot;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RobotDao extends BaseMapper<Robot> {
}
