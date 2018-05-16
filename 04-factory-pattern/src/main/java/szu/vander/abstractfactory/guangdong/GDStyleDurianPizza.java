package szu.vander.abstractfactory.guangdong;

import szu.vander.abstractfactory.Pizza;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class GDStyleDurianPizza extends Pizza {
	
	public GDStyleDurianPizza() {
		name = "GuangDong Style Durian Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("GuangDong Delicious Cheese");
	}
	
}
