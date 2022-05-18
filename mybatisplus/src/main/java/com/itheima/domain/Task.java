package com.itheima.domain;

import lombok.Data;

@Data
public class Task {
    private int Taskid;
    private double x;
    private double y;
    private String area;
    private int status;
    private String distance;
    //给任务添加紧急属性，0表示非紧急任务，1表示紧急任务
    private int emergency;
}
