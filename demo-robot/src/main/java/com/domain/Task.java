package com.domain;

import lombok.Data;

@Data
public class Task {
    private int taskID;
    private double x;
    private double y;
    private String area;
    private int status;
    private String distance;
    //给任务添加紧急属性，0表示非紧急任务，1表示紧急任务
    private int emergency;

    public Task() {
    }

    public Task(int taskID, double x, double y, String area, int status, String distance, int emergency) {
        this.taskID = taskID;
        this.x = x;
        this.y = y;
        this.area = area;
        this.status = status;
        this.distance = distance;
        this.emergency = emergency;
    }
}