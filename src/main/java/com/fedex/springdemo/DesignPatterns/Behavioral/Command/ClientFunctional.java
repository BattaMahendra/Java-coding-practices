package com.fedex.springdemo.DesignPatterns.Behavioral.Command;


interface ICommandACFun{
	public void execute();
}
class ACFun{
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

//Invoker Class Implementation
class ACAutomationRemoteFun{
	ICommandAC icommand;
	public void setCommand(ICommandAC icommand) {
		this.icommand=icommand;
	}
	public void buttonPressed() {
		icommand.execute();
	}
}
public class ClientFunctional {	
	
	public static void main(String[] args) {
		
		AC acRoomOne=new AC();
		AC acRoomTwo=new AC();
		
		ACAutomationRemote automation=new ACAutomationRemote();
//		automation.setCommand(new StratACCommand(acRoomOne));
//		automation.buttonPressed();
//		automation.setCommand(new StratACCommand(acRoomTwo));
//		automation.buttonPressed();
//		automation.setCommand(new IncTempCommand(acRoomOne));
//		automation.buttonPressed();
//		automation.setCommand(new DecTempCommand(acRoomTwo));
//		automation.buttonPressed();
		automation.setCommand(()->acRoomOne.on());
		automation.buttonPressed();
		automation.setCommand(()->acRoomTwo.on());
		automation.buttonPressed();
		automation.setCommand(()->acRoomOne.incTemp());
		automation.buttonPressed();
		automation.setCommand(()->acRoomTwo.decTemp());
		automation.buttonPressed();
	}

}
