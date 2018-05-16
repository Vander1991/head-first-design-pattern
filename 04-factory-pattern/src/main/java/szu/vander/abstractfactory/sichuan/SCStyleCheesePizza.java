package szu.vander.abstractfactory.sichuan;

import szu.vander.abstractfactory.Pizza;

public class SCStyleCheesePizza extends Pizza {

	public SCStyleCheesePizza() {
		name = "SiChuan Style Cheese Pizza";
		dough = "Thick Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("SiChuan Delicious Cheese");
	}
	
}
