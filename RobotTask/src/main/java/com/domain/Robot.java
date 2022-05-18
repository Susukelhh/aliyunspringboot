package com.domain;

import java.util.List;
public class Robot {
    private int robotID;
    private double electricity;
    private int status;
    private int electricityStatus;
    private List<Task> task;


    public Robot() {
    }

    public Robot(int robotID, double electricity, int status, int electricityStatus, List<Task> task) {
        this.robotID = robotID;
        this.electricity = electricity;
        this.status = status;
        this.electricityStatus = electricityStatus;
        this.task = task;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "robotID=" + robotID +
                ", electricity=" + electricity +
                ", status=" + status +
                ", electricityStatus=" + electricityStatus +
                ", task=" + task +
                '}';
    }

    public int getRobotID() {
        return robotID;
    }

    public void setRobotID(int robotID) {
        this.robotID = robotID;
    }

    public double getElectricity() {
        return electricity;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getElectricityStatus() {
        return electricityStatus;
    }

    public void setElectricityStatus(int electricityStatus) {
        this.electricityStatus = electricityStatus;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }
}
