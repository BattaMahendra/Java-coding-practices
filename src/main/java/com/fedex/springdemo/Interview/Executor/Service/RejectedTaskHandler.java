package com.fedex.springdemo.Interview.Executor.Service;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedTaskHandler implements RejectedExecutionHandler
{ 
  @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) 
  { 
    System.out.println("RejectedTaskHandler: The task %s has been rejected"); 
    }
}
