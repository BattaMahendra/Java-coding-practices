package com.fedex.springdemo.Interview.Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeMain {

    public static void main(String args[]){
        try {
            try (FileInputStream ios = new FileInputStream("serialize.txt");
                 ObjectInputStream ois = new ObjectInputStream(ios)) {
                Student st = (Student) ois.readObject();
                System.out.println(st.department);
                System.out.println(st.id);
                System.out.println(st.name);
                System.out.println(st);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }catch (Exception ex){
                ex.getMessage();
        }
    }
}
