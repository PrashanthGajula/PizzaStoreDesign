package com.prashanth;

public class ChicagoPizza extends Pizza{
	
	public ChicagoPizza() {
		name="Chicago style pizza";
		dough="Thick";
		sauce="tomato sauce";
		toppings = new Toppings.ToppingsBulder().withSpinach(PizzaToppings.spinach).withOlives(PizzaToppings.olives).build();
	}
	
	void cut() {
		System.out.println("cut into square slices");
	}

}
