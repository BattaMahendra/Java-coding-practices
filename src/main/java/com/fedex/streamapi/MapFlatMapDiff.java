package com.fedex.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapDiff {

    //Flat Map-Map+Flattening
    //Map Takes Stream<T> and returns Stream<R> ----One to One mapping
    //Stream.of("a","b","c","d") ----O/P- ["A","B","C","D"] ----Use map here
    //Flat map takes Stream<Stream<T>> and returns Stream<R> ---One to Many mapping
    //[[1,2],[3,4],[5,6]]---Convert it into single stream. [1,2,3,4,5,6]
    public static void main(String args[]){
        List<Customer> customerList=CustomerDatabase.getAllCustomers();
        List<String> addressList=customerList.stream().map(e->e.getAddress()).collect(Collectors.toList());
        System.out.println(addressList);
        //It gives output in stream of stream
        List<List<String>> phoneNumberList=customerList.stream().map(e->e.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(phoneNumberList);
        //But we want output in a single stream.
        List<String> phoneNumberListFlat=customerList.stream().
                flatMap(e->e.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(phoneNumberListFlat);
    }
}
