package com.fedex.springdemo.Algorithms.StringSearch;

import java.util.ArrayList;
import java.util.List;

public class Interview {

    public static void main(String args[]){
        

        List<Object> ls=new ArrayList<>();
        ls.add("Jan");
        ls.add('C');
        ls.add(1);
        Object[] arr=ls.stream().toArray();
        String str="";
        for (Object object : arr) {
            str+=object;
        }
        System.out.println(str);
        
    }
    
}
