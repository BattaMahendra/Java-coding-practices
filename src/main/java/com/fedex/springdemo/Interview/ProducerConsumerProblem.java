package com.fedex.springdemo.Interview;


//There will be some fixed capacity of queue where there will be multiple producer threads who can push the
//element to queue and there will be multiple consumer threads who can take the element from queue
// simultaneously.
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
class Emp{
    private int id;
    private String name;
    private String address;
}
public class ProducerConsumerProblem {
    private int max;
    private Queue<Emp> queue=new LinkedList<Emp>();

    //Lock comes in Java with a condition
    private ReentrantLock lock=new ReentrantLock(true);
    private Condition notEmpty=lock.newCondition();
    private Condition notFull=lock.newCondition();

    public ProducerConsumerProblem(int size){
        queue=new LinkedList<Emp>();
        this.max=size;
    }
    public void publish(Emp e) throws InterruptedException {
        //Protect from simultaneous access for multiple threads
        lock.lock();
        try{
            if(queue.size()==max){
                notFull.await();
            }
            queue.add(e);
            //I have added one item to queue, queue is not empty anymore
            notEmpty.notifyAll();
        }finally {
            lock.unlock();
        }
    }
    public Emp consume() throws InterruptedException {
        lock.lock();
        try{
            //Block the thread until queue has atleast 1 item to take
            if(queue.size()==0){
                notEmpty.await();
            }
            Emp item=queue.remove();
            //I have removed one item from queue. Queue is not full anymore
            notFull.notifyAll();
            return item;
        }finally {
            lock.unlock();
        }
    }
    //One Problem
    //Imagine queue is empty and there are multiple consumer threads are waiting to consume item.
    //Once one item is pushed and notEmpty notifies the consumer.
    //Multiple consumer threads will try to execute but one by one but all the threads will be in runnable state.
    //Thread-1 creates lock and consumes the item and releases lock.
    //Thread-2 when tries to consume the item queue is already empty so it will throw exception
    //Queue.remove() line will throw NullPointerException
}
