package com.fedex.springdemo.Interview.Executor.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



public class ScheduledThreadPool {
    //Works on the concept of delay queue.
public static void main(String[] args) {
    ScheduledExecutorService scheduledService = Executors.newScheduledThreadPool(10);
    //task to run after 10 seconds delay
    scheduledService.schedule(new Task(), 10, TimeUnit.SECONDS);

    //task to run after intial delay of 15 seconds and then every 10 seconds it will run
    // continuously . repeat the task every 10 seconds
    scheduledService.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);

    //task to run after intial delay of 15 seconds and then it will run repeatedly
    //but every task will run after 10 seconds of previous task completion.

    scheduledService.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);
    
}
}