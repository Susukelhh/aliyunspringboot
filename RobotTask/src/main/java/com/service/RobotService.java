package com.service;

import com.domain.Robot;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface RobotService {

    List<Robot> getAll();
}
