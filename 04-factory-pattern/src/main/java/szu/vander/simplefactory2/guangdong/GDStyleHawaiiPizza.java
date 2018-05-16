package szu.vander.simplefactory2.guangdong;

import szu.vander.simplefactory2.Pizza;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class GDStyleHawaiiPizza extends Pizza {
	
	public GDStyleHawaiiPizza() {
		name = "GuangDong Style Hawaii Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("GuangDong Delicious Cheese");
	}
	
}
