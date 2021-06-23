package com.prashanth;

public class KansasPizzaStore extends PizzaStore {
	
	//Singleton pattern.
	private static KansasPizzaStore instance;
	
	private KansasPizzaStore() {
	}
	
	public static KansasPizzaStore getInstance() {
		if(instance == null) {
			instance = new KansasPizzaStore();
		}
		return instance;
	}

	//Factory Pattern.
	@Override
	Pizza createPizza(String style) {
		Pizza pizza = null;
		if(style.equals("NY")) {
			pizza = new NewYorkPizza();
		}else if(style.equals("chicago")) {
			pizza = new ChicagoPizza();
		}else {
			System.out.println("Pizza style not available");
		}
		return pizza; 
	}

	@Override
	Pizza createCustomPizza(String customerName, String sauce, Toppings toppings) {
		return new CustomPizza(customerName, sauce, toppings);
	}
	

}
