package szu.vander.factorymethod.guangdong;

import szu.vander.factorymethod.Pizza;
import szu.vander.factorymethod.PizzaStore;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class GDPizzaStore extends PizzaStore {

	@Override
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
