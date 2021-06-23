package com.prashanth;

import java.util.ArrayList;
import java.util.List;

public class Toppings {
	List<PizzaToppings> toppings = new ArrayList<PizzaToppings>();

	public Toppings(ToppingsBulder toppingsBulder) {
		this.toppings=toppingsBulder.toppings;
	}

	public List<PizzaToppings> getToppings() {
		return toppings;
	}
	
	public static class ToppingsBulder{
		private List<PizzaToppings> toppings = new ArrayList<PizzaToppings>();
		
		public ToppingsBulder withSpinach(PizzaToppings spinach) {
			this.toppings.add(spinach);
			return this;
		}
		
		public ToppingsBulder withOlives(PizzaToppings olives) {
			this.toppings.add(olives);
			return this;
		}
		
		public ToppingsBulder withChicken(PizzaToppings chicken) {
			this.toppings.add(chicken);
			return this;
		}
		
		public Toppings build() {
			Toppings toppings = new Toppings(this);
			return toppings;
		}
	}
}
