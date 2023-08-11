package com.fedex.springdemo.Interview.Solid.Principle;

import java.util.ArrayList;
import java.util.List;

class Engine1{
	String engineName;
	String engineCode;
	public String getEngineName() {
		return engineName;
	}
	public String getEngineCode() {
		return engineCode;
	}
	public Engine1(String engineName, String engineCode) {
		super();
		this.engineName = engineName;
		this.engineCode = engineCode;
	}
}
class Vechile1{
	
	public Integer getNumberofWheels() {
		return 2;
	}

}
class EngineVechile extends Vechile1{
	private Engine1 engine;
	EngineVechile(){
	}
	public EngineVechile(Engine1 engine) {
		this.engine = engine;
	}
	public String getEngine() {
		return engine.getEngineName();
	}
}
class MotorCycle1 extends EngineVechile{
	public MotorCycle1(Engine1 eng) {
		super(eng);
	}
}
class Car1 extends EngineVechile{
	public Car1(Engine1 eng) {
		super(eng);
	}
	@Override
	public Integer getNumberofWheels() {
		return 4;
	}
}
class Bicycle1 extends Vechile1{
	
}
public class LiskovSolution {
	public static void main(String[] args) {
	List<Vechile1> vechList=new ArrayList<>();
	vechList.add(new MotorCycle1(new Engine1("CEAT", "100")));
	vechList.add(new Car1(new Engine1("MRF", "101")));
	vechList.add(new Bicycle1());
	for (Vechile1 vechile : vechList) {
		//Now it will show compilation error instead of run time error
		//System.out.println(vechile.getEngine()+ " and Length "+vechile.getEngine().length());
	}
	}
}
