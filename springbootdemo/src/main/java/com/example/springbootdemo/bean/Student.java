package com.example.springbootdemo.bean;

import java.util.Date;

public class Student {

    private String id;
    private String name;
    private Date currentDate;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", currentDate=" + currentDate +
                '}';
    }
}
