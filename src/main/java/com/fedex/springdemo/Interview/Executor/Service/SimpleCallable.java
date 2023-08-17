package com.fedex.springdemo.Interview.Executor.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class SimpleCallable {
   public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(10);
        List<Future<Integer>> futureList=new ArrayList<>();
        for(int i=0;i<100;i++){
            Future<Integer> fut=executorService.submit(new ReturnTask());
            futureList.add(fut);
        }
        System.out.println("Basic example of Future");
        //At this point we have 100 ftuture objects in the list. with 100 placeholders.
        //We can iterate through the list and get the result of the task.
        for(Future<Integer> fut:futureList){
            try {
                System.out.println(fut.get());
            } catch (Exception e) {
               e.getMessage();
            }
        }

        //Perform some opertaion which is not dependent on the result of the task. Which
        //is independent of the future object.
        System.out.println("Thread Name:"+Thread.currentThread().getName());
     }
}
