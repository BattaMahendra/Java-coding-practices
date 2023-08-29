package com.fedex.streamapi;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String args[]) {

        List<Book> bookList = new ArrayList<Book>();
        for(int i=0;i<=100;i++) {
            bookList.add(new Book("Dogalapan", "Aneesh Grover", "Generic", 3.4));
            bookList.add(new Book("Sex and City", "James Franklin", "Romance", 4.3));
            bookList.add(new Book("House of Leave", "Mark Daniel", "Horror", 3.2));
            bookList.add(new Book("Life in Paris", "Chetan Bhagat", "Romance", 4.1));
            bookList.add(new Book("The Adventures of Finn", "Mark Twain", "Horror", 4.25));
        }
        long startTime;
        long endTime;
        startTime=System.currentTimeMillis();
        System.out.println(bookList.stream().filter(rat->rat.getRating()>3.5).count());
        endTime=System.currentTimeMillis();
        System.out.println("Time Taken for stream "+(endTime-startTime)+" milli seconds");

        startTime=System.currentTimeMillis();
        System.out.println(bookList.parallelStream().filter(rat->rat.getRating()>3.5).count());
        endTime=System.currentTimeMillis();
        System.out.println("Time Taken for parallel stream "+(endTime-startTime)+" milli seconds");
    }
}
