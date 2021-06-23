package com.prashanth;

public abstract class PizzaStore {
	abstract Pizza createPizza(String item);
	abstract Pizza createCustomPizza(String customerName, String sauce, Toppings toppings);
	
	public Pizza orderPizza(String type)
	{
		Pizza pizza = createPizza(type);
		System.out.println("Making  "+pizza.getName());
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public Pizza orderCustomPizza(String customerName, String sauce, Toppings toppings) {
		Pizza pizza = createCustomPizza(customerName,sauce,toppings);
		System.out.println("Making  "+pizza.getName());
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
