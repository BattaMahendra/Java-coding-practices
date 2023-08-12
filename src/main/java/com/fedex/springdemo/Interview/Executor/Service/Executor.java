package com.fedex.springdemo.Interview.Executor.Service;

import java.util.Random;
import java.util.concurrent.Callable;

//Simple Executor class to execute the task asynchronously
class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Executing Task inside : " + Thread.currentThread().getName());
    }
}

class ReturnTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return new Random().nextInt();
    }
}

public class Executor {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();
    }
}
