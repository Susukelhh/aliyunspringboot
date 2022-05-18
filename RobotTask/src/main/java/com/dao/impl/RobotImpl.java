package com.dao.impl;

import com.dao.RobotDao;
import com.domain.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class RobotImpl implements RobotDao {
    @Autowired
    private RobotDao robotDao;

    @Override
    public List<Robot> getAll() {
        List<Robot> list = robotDao.getAll();
        return list;
    }
}
