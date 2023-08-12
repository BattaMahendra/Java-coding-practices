package com.fedex.springdemo.Interview.Executor.Service;

import java.util.concurrent.Executors;

import java.util.concurrent.ThreadPoolExecutor;

 
public class RejectedTaskExecution 
{
  public static void main(String[] args) 
  {
    final ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors
        .newFixedThreadPool(Runtime.getRuntime().availableProcessors());
     
    RejectedTaskHandler handler=new RejectedTaskHandler(); 
     
    executor.setRejectedExecutionHandler(handler); 
     
    for (int i=0; i<10; i++)
    { 
          Task task=new Task(); 
          executor.execute(task); 
       }
     
    //shut down the executor so that new tasks will be rejected
    executor.shutdown();
     
    Task taskRej = new Task(); 
    executor.execute(taskRej);
  }
}
