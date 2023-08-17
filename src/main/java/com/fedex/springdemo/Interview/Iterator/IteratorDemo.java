package com.fedex.springdemo.Interview.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class IteratorDemo {
    public static void main(String[] args) {
        Comparator<String> comp=(String c1,String c2)->{
            if(c1.length()>c2.length()){
                return 1;
            }else{
                return -1;}
        };
        List<String> repo=new ArrayList<>();
        repo.add("Cervelo");
        repo.add("Scott");
        repo.add("Fuji");
        Collections.sort(repo,comp);
        Iterator<String> bikeIterator=repo.iterator();
        while(bikeIterator.hasNext()){
            System.out.println(bikeIterator.next());
        }
        //HashMap is not synchronized. But hashtable is synchronized.
        Map<String,Integer> nameMarkMap=new HashMap<>();
        nameMarkMap.put("Raj", 100);
        nameMarkMap.put("Rahul", 90);
        nameMarkMap.put("Ravi", 80);
        nameMarkMap.put("Rajesh", 70);
        nameMarkMap.put("Rajesh", 30);

        for(Map.Entry<String,Integer> entry:nameMarkMap.entrySet()){
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
        for(String key:nameMarkMap.keySet()){
            System.out.println(key+"   "+nameMarkMap.get(key));
        }
    }
}
