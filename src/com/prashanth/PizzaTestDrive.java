package com.prashanth;

public class PizzaTestDrive {

	public static void main(String[] args) {
		Toppings toppings = new Toppings.ToppingsBulder().withSpinach(PizzaToppings.spinach).withChicken(PizzaToppings.chicken).build();
		
		KansasPizzaStore kps = KansasPizzaStore.getInstance();
		Pizza pizza = kps.orderCustomPizza("Prashanths Pizza", "Tomato and Alfredo sauce ", toppings);
		System.out.println("Prashanth ordered a "+ pizza.getName());
		
		pizza = kps.orderPizza("NY");
		

	}

}
