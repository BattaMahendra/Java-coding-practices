package com.fedex.springdemo.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Analgram {
	public static void main(String args[]) {
		//List<String> ls=Arrays.asList("TAC","CAT","ACT","DOG","GOD");
		String input="TAC CAT ACT DOG GOD";
		String[] lsArr=input.split(" ");
		List<String> ls=Arrays.asList(lsArr);
		List<String> lsMod=ls.stream()
			.map(each->{
				char[] charArr=each.toCharArray();
				Arrays.sort(charArr);
				return new String(charArr);
			})
			.collect(Collectors.toList());
		System.out.println(lsMod);
	}
}
