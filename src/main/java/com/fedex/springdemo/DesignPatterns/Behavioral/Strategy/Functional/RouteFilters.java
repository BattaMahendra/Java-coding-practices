package com.fedex.springdemo.DesignPatterns.Behavioral.Strategy.Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RouteFilters {

	public static List<Route> byState(List<Route> list, String state){
		
		List<Route> filteredData = new ArrayList<>();
		
		for (Route route : list) {
			
			if(route.getState().equals(state))
				filteredData.add(route);
			
		}
		
		return filteredData;
		
	}
	
	public static List<Route> byBoxNumber(List<Route> list, int number){
		
		
		List<Route> filteredData = new ArrayList<>();
		
		for (Route route : list) {
			
			if(route.getBoxNumber() > number) {
				filteredData.add(route);
			}
			
		}
		return filteredData;
	}
	
	public static List<Route> filter(List<Route> list, Predicate<Route> p){
		
		
		List<Route> filteredData = new ArrayList<>();
		
		for (Route route : list) {
			
			if(p.test(route))
				filteredData.add(route);
			
		}
		
		return filteredData;
		
	}
	
}
