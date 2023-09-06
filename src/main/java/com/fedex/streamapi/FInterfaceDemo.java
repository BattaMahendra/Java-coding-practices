package com.fedex.streamapi;

import java.util.Map;

public class FInterfaceDemo {
    public static void main(String args[]){
        FInterface fInterface= map -> map.keySet().stream().toList();
        System.out.println(fInterface.getKeys(Map.of("SKS",1,"Shruti",2,"Swat",3)));
        boolean isExist=FInterface.keyExists(Map.of("Saurav",1,"Shruti",2,"Swat",3));
        System.out.println(isExist);
    }
}
