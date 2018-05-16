package szu.vander.abstractfactory.guangdong;

import szu.vander.abstractfactory.Pizza;

public class GDStyleFruitsPizza extends Pizza {

	public GDStyleFruitsPizza() {
		name = "GuangDong Style Fruits Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("GuangDong Delicious Cheese");
		toppings.add("GuangDong Pipeapple");
	}
	
}
