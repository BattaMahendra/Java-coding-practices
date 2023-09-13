package com.fedex.springdemo.Interview.Serializable;

import java.io.*;

public class SerializeMain {
    public static void main(String args[]){
        Student st=new Student(102,"Saurav","EEE");
        try {
            try (FileOutputStream fos=new FileOutputStream("serialize.txt");
                 ObjectOutputStream obs = new ObjectOutputStream(fos)) {
                obs.writeObject(st);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
