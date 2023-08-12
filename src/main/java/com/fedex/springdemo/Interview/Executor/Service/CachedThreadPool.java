package com.fedex.springdemo.Interview.Executor.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
   //Incase of this pool type, we can have as many threads as we want.
   //If there is no thread available in the pool, then a new thread will be created.
    //If a thread is idle for 60 seconds, then it will be removed from the pool.
    //This is useful when we have a lot of short lived tasks.
    //It doesn't have block queue concept. It has synchronous queue concept.
    //Each task comes to synchronous queue and each thread picks up one task from the queue
    //So therotically, we can have as many threads as we want.
    //Second task comes to queue and second thread picks up the task and so on. 
    ExecutorService executorService=Executors.newCachedThreadPool();
}
