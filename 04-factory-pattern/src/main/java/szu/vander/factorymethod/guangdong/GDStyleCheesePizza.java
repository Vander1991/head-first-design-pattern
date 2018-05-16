package szu.vander.factorymethod.guangdong;

import szu.vander.factorymethod.Pizza;

public class GDStyleCheesePizza extends Pizza {

	public GDStyleCheesePizza() {
		name = "GuangDong Style Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("GuangDong Delicious Cheese");
	}
	
}
