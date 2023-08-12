package com.fedex.springdemo.Interview.Executor.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//It works on block queue concept.
//You have 10 threads and 100 tasks to execute which are there in block queue.
//Each thread will pick up one task from the queue and execute it. Once done then
// fetch next task from queue and execute it.
//Since all these operations of fetching task from queue and executing it are
//synchronous operations, it is called as synchronous queue. and block queue is
//a queue which is thread safe.

public class SimpleThreadPool {
    public static void main(String[] args) {
    ExecutorService executorService=Executors.newFixedThreadPool(10);
    for(int i=0;i<100;i++){
        executorService.execute(new Task());
    }
    System.out.println("Thread Name:"+Thread.currentThread().getName());

    //Shut down intiates the shutdown process. It will not accept any new tasks.
    executorService.shutdown();
    //Will thorw exception if we try to submit new task after shutdown.
    //Will return true since shutdown is already initiated.
    executorService.isShutdown();

    //Will return true if all the tasks are completed and executor service is shut down.
    //Also queued tasks are completed.
    executorService.isTerminated();

}
}

//Idea case for Thread Pool Size
//Number of threads = Number of cores if you have CPU intensive tasks
//Since CPU intensve tasks needs heavy CPU usage, we should not have more threads 
//than number of cores as other threads will be waiting for CPU to be available.

//Number of threads = Number of cores * 2 if you have IO intensive tasks
