package com.fedex.streamapi;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoundedStream {
    public static void main(String args[]){
        List<Integer> list = List.of(1,4,7,9,12);
        Stream<Integer> streamInteger=list.stream();

        Stream<Integer> integerStream=Stream.of(2,4,12,28,36);

        Map<Integer,String> demoMap=Map.of(1,"One", 2,"Two",3,"Three");
        //There is no stream over Map. We can use stream on either key set or values only.

        Stream<Map.Entry<Integer,String>> entries=demoMap.entrySet().stream();
        entries.forEach(eachPair->System.out.println(eachPair.getKey()+"     "+eachPair.getValue()));

        Stream<Integer> keySet=demoMap.keySet().stream();
        Stream<String> valueSet=demoMap.values().stream();

        //Stream and InStream for Objects and primitive type of variables.
        Integer[] intArr={17,19,33,39,97};
        Stream<Integer> stream= Arrays.stream(intArr);
        //InStream will work with only primitive values.
        int[] intPrimitiveArr={17,19,33,39,97};
        IntStream inStream= Arrays.stream(intPrimitiveArr);

        Stream.Builder<Integer> builder=Stream.builder();
        builder.add(1);
        builder.add(45);
        builder.add(71);
        //builder.build();
        builder.build().forEach(e->System.out.println(e));
    }
}
