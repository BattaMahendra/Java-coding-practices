package com.fedex.springdemo.DesignPatterns.Behavioral.Strategy.Functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Route> routeList=new ArrayList<Route>(Arrays.asList(
				new Route("123", "CT", 5),new Route("891", "TX", 3),
				new Route("934", "LA", 7),new Route("777", "TX", 5),
				new Route("907", "TX", 15),new Route("567", "CT", 17))
				);
//		RouteFilters.byState(routeList, "TX").forEach(System.out::println);
//		 
//		System.out.println("--------------------");
//				
//		RouteFilters.byBoxNumber(routeList, 5).forEach(System.out::println);
		RouteFilters
		.filter(routeList, route->route.getBoxNumber()>5)
		.forEach(System.out::println);
		RouteFilters
		.filter(routeList, route->route.getState().equals("TX"))
		.forEach(System.out::println);
	}

}
