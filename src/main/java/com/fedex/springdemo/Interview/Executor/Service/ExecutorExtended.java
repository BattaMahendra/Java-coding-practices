package com.fedex.springdemo.Interview.Executor.Service;


//10 threads are created to execute the task asynchronously
//In Java 1 java thread is mapped to 1 OS thread and threads are expensive.
//So, we use thread pool to reuse the threads.
//Imagine the scenario of looping through 1000 records and creating 1000 threads.
//Instead we can use thread pool to reuse the threads and submit 1000 
//tasks to the thread pool.
//Thread pool is a collection of threads that can be reused.
public class ExecutorExtended {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Task());
            thread.start();
        }
    }
}
