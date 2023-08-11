package com.fedex.springdemo.Interview.Solid.Principle;

interface RestaurantEmployee{
	void washDish();
	void serveCustomer();
	void cookFood();
}
//class Waiter implements RestaurantEmployee{
//
//	@Override
//	public void washDish() {
//		// TODO Auto-generated method stub
//	}
//	@Override
//	public void serveCustomer() {
//		// TODO Auto-generated method stub
//	}
//	@Override
//	public void cookFood() {
//		// TODO Auto-generated method stub
//		
//	}
//}
//But in the above case Waiter doesn't cook or wash dish. Still he
//is a Restaurant employee.
//Solution
interface WaiterInterface{
	void serveCustomer();
	void takeOrder();
	
}

interface ChefInterface{
	void cookFood();
}
class Waiter implements WaiterInterface{
	@Override
	public void serveCustomer() {
		// TODO Auto-generated method stub
	}
	@Override
	public void takeOrder() {
		// TODO Auto-generated method stub
	}
}

public class InterfaceSegmented {

}
