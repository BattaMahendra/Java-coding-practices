package com.fedex.springdemo.Interview;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
class Item{
    private int id;
    private String name;
}
public class ProducerConsumerProblemLegacySolution {

    public static void main(String args[]) throws InterruptedException {
        BlockingQueue<Item> queue = new ArrayBlockingQueue<>(10);


        final Runnable producer = () -> {
            while (true) {
                try {
                    queue.put(new Item());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        new Thread(producer).start();
        new Thread(producer).start();


        final Runnable consumer = () -> {
            while (true) {
                try {
                    Item item=queue.take();
                    showItem(item);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        new Thread(consumer).start();
        new Thread(consumer).start();
        Thread.sleep(1000);
    }

    private static void showItem(Item item) {
        System.out.println(item.hashCode());
    }
}
