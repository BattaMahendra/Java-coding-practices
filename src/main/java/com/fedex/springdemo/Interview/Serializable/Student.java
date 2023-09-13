package com.fedex.springdemo.Interview.Serializable;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUUID = 1234567L;
    Integer id;
    String name;
    String department;

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Dept='" + department + '\'' +
                '}';
    }
}
