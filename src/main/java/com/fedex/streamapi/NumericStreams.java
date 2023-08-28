package com.fedex.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class NumericStreams {

    public static void main(String args[]){

        List<Book> bookList=new ArrayList<Book>();
        bookList.add(new Book("Dogalapan","Aneesh Grover","Generic",3.4));
        bookList.add(new Book("Sex and City","James Franklin","Romance",4.3));
        bookList.add(new Book("House of Leave","Mark Daniel","Horror",3.2));
        bookList.add(new Book("Life in Paris","Chetan Bhagat","Romance",4.1));

        //We can't calculate the average by this method.
        //Double avg=bookList.stream().map(rating->rating.getRating()).average()
        //Intstream
        //LongStream
        //DoubleStream
        //To avoid cost of boxing and unboxing
        OptionalDouble optionalDouble=bookList.stream().mapToDouble(rating->rating.getRating()).average();
        System.out.println(optionalDouble.getAsDouble());
        bookList.stream().map(rating->rating.getRating()).forEach(e->System.out.println(e+"   "+e.hashCode()));
        //Here element doesn't have hashcode method which proves that mapToDouble deals with primitive
        //type whereas map deals with Objects.
        bookList.stream().mapToDouble(rating->rating.getRating()).forEach(e->System.out.println(e));
    }
}
