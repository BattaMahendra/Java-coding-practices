package com.fedex.springdemo.Interview.EqualsHashCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compartor {
	public static void main(String[] args) {
		Employee e1=new Employee(3,"Saurav");
		Employee e2=new Employee(7,"Shruti");
		Employee e3=new Employee(2 ,"Swat");
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		Comparator<Employee> comp=new Comparator<Employee>() {

			@Override
			public int compare(Employee arg0, Employee arg1) {
				if(arg0.getId()>arg1.getId()) {
					return -1;
				}else{
					return 1;
				}
			};
		};
		List<Employee> ls=new ArrayList<>(Arrays.asList(e1,e2,e3));
		Collections.sort(ls, comp);
		System.out.println(ls);
		Comparator<Employee> comp1=(Employee arg0,Employee arg1)->arg0.getId()>arg1.getId()?1:-1;
		Collections.sort(ls, comp1);
		System.out.println(ls);
	}

}
