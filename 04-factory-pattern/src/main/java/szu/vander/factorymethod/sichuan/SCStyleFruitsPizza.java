package szu.vander.factorymethod.sichuan;

import szu.vander.factorymethod.Pizza;

public class SCStyleFruitsPizza extends Pizza {

	public SCStyleFruitsPizza() {
		name = "SiChuan Style Fruits Pizza";
		dough = "Thick Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("SiChuan Delicious Cheese");
	}
	
}
