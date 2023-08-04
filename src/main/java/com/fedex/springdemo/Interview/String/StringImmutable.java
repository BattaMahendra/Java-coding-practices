package com.fedex.springdemo.Interview.String;



public class StringImmutable {
	
	public static void main( String[] args )
    {
        final String s="Deepak";
        s.concat("Swain");
        final StringBuilder s1=new StringBuilder("saloni");
        s1.append("Saurav");
        s1.reverse();
        System.out.println(s);
        System.out.println(s1);
    }
}
