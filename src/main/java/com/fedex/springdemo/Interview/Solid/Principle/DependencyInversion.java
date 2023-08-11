package com.fedex.springdemo.Interview.Solid.Principle;


interface Mouse{
	void click();
}
class WiredMouse implements Mouse{
	@Override
	public void click() {
		// TODO Auto-generated method stub
	}
}
class BluetoothMouse implements Mouse{
	@Override
	public void click() {
		// TODO Auto-generated method stub
	}
}
interface Keyboard{
	void type();
}
class WiredKeyboard implements Keyboard{
	@Override
	public void type() {
		// TODO Auto-generated method stub
	}
}
class BluetoothKeyboard implements Keyboard{
	@Override
	public void type() {
		// TODO Auto-generated method stub
	}
}

class MacBook{
	private final WiredKeyboard keyboard;
	private final BluetoothMouse mouse;
	public MacBook() {
		this.keyboard = new WiredKeyboard();
		this.mouse = new BluetoothMouse();
	}
}

// If in future I want to enhance the Macbook to have Bluetooth keyboard
//then I have to change the class and again deploy.
//Client code can't handle this type scenario.
//Solution

class MacBook1{
	private final Keyboard keyboard;
	private final Mouse mouse;
	public MacBook1(Keyboard keyboard, Mouse mouse) {
		this.keyboard = keyboard;
		this.mouse = mouse;
	}
	
}
public class DependencyInversion {

}
