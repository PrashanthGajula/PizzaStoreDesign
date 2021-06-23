package com.prashanth;

public class NewYorkPizza extends Pizza {
	
	public NewYorkPizza() {
		name="NY style pizza";
		dough="Thick";
		sauce="tomato sauce";
		toppings = new Toppings.ToppingsBulder().withSpinach(PizzaToppings.spinach).withOlives(PizzaToppings.olives).build();
	}
	
	void cut() {
		System.out.println("cut into rectangular slices");
	}
}
