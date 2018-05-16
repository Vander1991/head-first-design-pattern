package szu.vander.factorymethod.guangdong;

import szu.vander.factorymethod.Pizza;

public class GDStyleFruitsPizza extends Pizza {

	public GDStyleFruitsPizza() {
		name = "GuangDong Style Fruits Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("GuangDong Delicious Cheese");
	}
	
}
