package szu.vander.simplefactory2.guangdong;

import szu.vander.simplefactory2.Pizza;
import szu.vander.simplefactory2.SimplePizzaFactory;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class GDPizzaFactory extends SimplePizzaFactory{

	public Pizza producePizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese")) {
			pizza = new GDStyleCheesePizza();
		} else if(type.equals("fruits")) {
			pizza = new GDStyleFruitsPizza();
		} else if(type.equals("durian")) {
			pizza = new GDStyleDurianPizza();
		} else if(type.equals("Hawaii")) {
			pizza = new GDStyleHawaiiPizza();
		}
		return pizza;
	}
	
}
