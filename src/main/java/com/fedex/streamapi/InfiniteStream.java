package com.fedex.streamapi;

import java.util.Random;
import java.util.stream.Stream;

public class InfiniteStream {

    public static void main(String args[]){
        //Stream.iterate(0,i->i+1).forEach(i->System.out.println("In loop "+i));
        //If you don't put limit to it then it will go for infinite loop.
        Stream.iterate(0,i->i+1)
        .limit(10)
        .forEach(i->System.out.println("In loop "+i));
        Stream.generate(new Random()::nextDouble).limit(10).forEach(i->System.out.println("In loop "+i));
    }
}
