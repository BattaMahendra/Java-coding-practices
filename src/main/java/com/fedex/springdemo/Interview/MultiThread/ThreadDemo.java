package com.fedex.springdemo.Interview.MultiThread;
class Counter{
    int count;
    public void increment(){
        count++;
    }   
}
public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Runnable task1=()->{
            for(int i=0;i<10000;i++){
                c.increment();
            }
        };
        Runnable task2=()->{
            for(int i=0;i<10000;i++){
                c.increment();
            }
        };
        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
    
}
