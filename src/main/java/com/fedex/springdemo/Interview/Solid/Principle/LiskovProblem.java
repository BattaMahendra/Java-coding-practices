package com.fedex.springdemo.Interview.Solid.Principle;

import java.util.ArrayList;
import java.util.List;

class Engine{
	String engineName;
	String engineCode;
	public String getEngineName() {
		return engineName;
	}
	public String getEngineCode() {
		return engineCode;
	}
	public Engine(String engineName, String engineCode) {
		super();
		this.engineName = engineName;
		this.engineCode = engineCode;
	}
}

class Vechile{
	private Engine engine;
	Vechile(){
		
	}
	public Vechile(Engine engine) {
		this.engine = engine;
	}
	public Integer getNumberofWheels() {
		return 2;
	}
	public String getEngine() {
		return engine.getEngineName();
	}
}
class MotorCycle extends Vechile{
	public MotorCycle(Engine eng) {
		super(eng);
	}
}
class Car extends Vechile{
	public Car(Engine eng) {
		super(eng);
	}
	@Override
	public Integer getNumberofWheels() {
		return 4;
	}
}
class Bicycle extends Vechile{
	public Bicycle() {
		super();
	}
	@Override
	public String getEngine() {
		return null;
	}
}
public class LiskovProblem {
	public static void main(String[] args) {
	List<Vechile> vechList=new ArrayList<>();
	vechList.add(new MotorCycle(new Engine("CEAT", "100")));
	vechList.add(new Car(new Engine("MRF", "101")));
	vechList.add(new Bicycle());
	for (Vechile vechile : vechList) {
		System.out.println(vechile.getEngine()+ " and Length "+vechile.getEngine().length());
	}
	}
}
