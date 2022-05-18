package com.service.impl;

import com.dao.RobotDao;
import com.domain.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RobotServiceImpl {
    @Autowired
    private RobotDao robotDao;

    public List<Robot> getAll(){
        return robotDao.getAll();
    }
}
