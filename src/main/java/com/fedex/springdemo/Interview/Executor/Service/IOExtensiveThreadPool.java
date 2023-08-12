package com.fedex.springdemo.Interview.Executor.Service;

public class IOExtensiveThreadPool {
    //When its IO Extensive task, we can have more threads than number of cores.
    //Since threads will be waiting for IO to complete, we can have more threads
    //which can pick up the next task from the queue and execute it.
    //This will improve the performance.
    //Code for it is same as CPUExtensiveThreadPool.java only difference is
    //number of threads.
}
