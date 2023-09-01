package com.fedex.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SpliteratorDemo {

    public static void main(String args[]) throws IOException {
        Path path= Paths.get("C:\\Software Downloads\\Spring\\Java-coding-practices\\src\\main\\java\\com\\fedex\\streamapi\\Employee");
        try (Stream<String> lines = Files.lines(path)) {
			//lines.forEach(e->System.out.println(e));
			Stream<String> words=lines.flatMap(line->Arrays.stream(line.split(",")));
			Spliterator<String> baseSpliterator=words.spliterator();
			Spliterator<EmployeeObject> spliterator=new EmployeeSpliterator(baseSpliterator);
			Stream<EmployeeObject> employeeObjectStream=StreamSupport.stream(spliterator,false);
			List<EmployeeObject> employeeObjectList=employeeObjectStream.collect(Collectors.toList());
			//employeeObjectStream.forEach(System.out::println);
//        Map<String,List<EmployeeObject>> designationSalaryMap=employeeObjectStream.collect(Collectors.groupingBy(
//                e->e.getDesignation(),Collectors.toList()
//        ));

//        Map<String,Integer> designationSumSalary=employeeObjectStream.collect(Collectors.groupingBy(
//                e->e.getDesignation(),Collectors.summingInt(e->e.getSalary())
//        ));
//        Map<String,Double> designationAvgSalary=employeeObjectStream.collect(Collectors.groupingBy(
//                e->e.getDesignation(),Collectors.averagingInt(e->e.getSalary())
//        ));

//        Map<String,Optional<EmployeeObject>> designationAvgSalary=employeeObjectStream.collect(Collectors.groupingBy(
//                e->e.getDesignation(),Collectors.maxBy((e1,e2)->{
//                    if(e1.getSalary()> e2.getSalary()){
//                        return 0;
//                    }else{
//                        return -1;
//                    }
//                })
//        ));
			Map<String, Optional<Integer>> maxSalaries =
			        employeeObjectList.stream()
			                .collect(
			                        Collectors.groupingBy(
			                                e -> e.getDesignation(),
			                                Collectors.mapping(
			                                        e -> e.getSalary(),
			                                        Collectors.maxBy(Comparator.comparing(Function.identity()))
			                                )
			                        )
			                );
			System.out.println(maxSalaries);
		}
    }
}
