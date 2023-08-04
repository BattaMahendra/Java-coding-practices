package com.fedex.springdemo.DesignPatterns.Behavioral.Command;


interface ICommandAC{
	public void execute();
}
class AC{
	public void on() {
		System.out.println("AC is ON");
	}
	public void off() {
		System.out.println("AC is OFF");
	}
	public void incTemp() {
		System.out.println("AC Temperature is increasing");
	}
	public void decTemp() {
		System.out.println("AC Temperature is decreasing");
	}
}
class StratACCommand implements ICommandAC{
	AC ac;
	public StratACCommand(AC ac){
		this.ac=ac;
	}
	@Override
	public void execute() {
		ac.on();
	}
	
}
class ShutDownACCommand implements ICommandAC{
	AC ac;
	public ShutDownACCommand(AC ac){
		this.ac=ac;
	}
	@Override
	public void execute() {
		ac.off();
	}
	
}
class IncTempCommand implements ICommandAC{
	AC ac;
	public IncTempCommand(AC ac){
		this.ac=ac;
	}
	@Override
	public void execute() {
		ac.incTemp();
	}
	
}
class DecTempCommand implements ICommandAC{
	AC ac;
	public DecTempCommand(AC ac){
		this.ac=ac;
	}
	@Override
	public void execute() {
		ac.decTemp();
	}
	
}
//Invoker Class Implementation
class ACAutomationRemote{
	ICommandAC icommand;
	public void setCommand(ICommandAC icommand) {
		this.icommand=icommand;
	}
	public void buttonPressed() {
		icommand.execute();
	}
}
public class Client {	
	
	public static void main(String[] args) {
		
		AC acRoomOne=new AC();
		AC acRoomTwo=new AC();
		
		ACAutomationRemote automation=new ACAutomationRemote();
		automation.setCommand(new StratACCommand(acRoomOne));
		automation.buttonPressed();
		automation.setCommand(new StratACCommand(acRoomTwo));
		automation.buttonPressed();
		automation.setCommand(new IncTempCommand(acRoomOne));
		automation.buttonPressed();
		automation.setCommand(new DecTempCommand(acRoomTwo));
		automation.buttonPressed();
	}

}
