package com.prashanth;

public class CustomPizza extends Pizza{
	
	public CustomPizza(String customerName,String customSauce, Toppings customToppings) {
		name=customerName;
		sauce = customSauce;
		toppings = customToppings;
	}
	
	void cut() {
		System.out.println("cut 4 pieces");
	}

}
