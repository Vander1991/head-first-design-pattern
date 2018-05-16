package szu.vander.abstractfactory.sichuan;

import szu.vander.abstractfactory.Pizza;

public class SCStyleFruitsPizza extends Pizza {

	public SCStyleFruitsPizza() {
		name = "SiChuan Style Fruits Pizza";
		dough = "Thick Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("SiChuan Delicious Cheese");
		toppings.add("SiChuan Pepper");
	}
	
}
