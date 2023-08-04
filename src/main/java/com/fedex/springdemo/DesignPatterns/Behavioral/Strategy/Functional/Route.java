package com.fedex.springdemo.DesignPatterns.Behavioral.Strategy.Functional;


public class Route {
	
	String routeNbr;
	String state;
	public String getRouteNbr() {
		return routeNbr;
	}
	public void setRouteNbr(String routeNbr) {
		this.routeNbr = routeNbr;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getBoxNumber() {
		return boxNumber;
	}
	public void setBoxNumber(int boxNumber) {
		this.boxNumber = boxNumber;
	}
	int boxNumber;
	public Route(String routeNbr, String state, int boxNumber) {
		super();
		this.routeNbr = routeNbr;
		this.state = state;
		this.boxNumber = boxNumber;
	}
	@Override
	public String toString() {
		return "Route [routeNbr=" + routeNbr + ", state=" + state + ", boxNumber=" + boxNumber + "]";
	}
	
}
