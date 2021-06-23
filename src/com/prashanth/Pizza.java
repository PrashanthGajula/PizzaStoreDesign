package com.prashanth;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	Toppings toppings;
	
	void prepare() {
		System.out.println("Preparing + " + name);
		System.out.println("Tosing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding Toppings...");
		
		for(PizzaToppings s : toppings.getToppings()) {
			System.out.println(" "+s);
		}
	}
	
	void bake() {
		System.out.println("bake fo 25mins at 350F");
	}
	
	void cut() {
		System.out.println("Cut diagnolly");
	}
	
	void box() {
		System.out.println("Place pizza in pizzabox");
	}
	
	public String getName() {
		return name;
	}

}
