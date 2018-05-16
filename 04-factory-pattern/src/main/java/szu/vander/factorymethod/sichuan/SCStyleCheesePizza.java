package szu.vander.factorymethod.sichuan;

import szu.vander.factorymethod.Pizza;

public class SCStyleCheesePizza extends Pizza {

	public SCStyleCheesePizza() {
		name = "SiChuan Style Cheese Pizza";
		dough = "Thick Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("SiChuan Delicious Cheese");
	}
	
}
