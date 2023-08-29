package com.fedex.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class SettingParallelism {

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        ForkJoinPool pool=new ForkJoinPool(2);
        List<Book> bookList = new ArrayList<Book>();
        for(int i=0;i<=100;i++) {

            bookList.add(new Book("Dogalapan", "Aneesh Grover", "Generic", 3.4));
            bookList.add(new Book("Sex and City", "James Franklin", "Romance", 4.3));
            bookList.add(new Book("House of Leave", "Mark Daniel", "Horror", 3.2));
            bookList.add(new Book("Life in Paris", "Chetan Bhagat", "Romance", 4.1));
        }

        long count=pool.submit(()->bookList.parallelStream().filter(e->e.getRating()>4).count()).get();
        System.out.println(count);
    }
}
