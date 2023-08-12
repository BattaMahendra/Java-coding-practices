package com.fedex.springdemo.Interview.Executor.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CPUExtensiveThreadPool {
    public static void main(String[] args) {
    int coreCount=Runtime.getRuntime().availableProcessors();
    //One more consideration is that CPU should be utilizing memory only for the
    //task we are running not for other programs or applications.
    ExecutorService executorService=Executors.newFixedThreadPool(coreCount);
    for(int i=0;i<100;i++){
        executorService.execute(new Task());
    }
    System.out.println("Thread Name:"+Thread.currentThread().getName());
}
}
