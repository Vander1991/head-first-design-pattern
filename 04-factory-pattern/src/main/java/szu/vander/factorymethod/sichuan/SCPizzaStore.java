package szu.vander.factorymethod.sichuan;

import szu.vander.factorymethod.Pizza;
import szu.vander.factorymethod.PizzaStore;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class SCPizzaStore extends PizzaStore {

	@Override
	public Pizza producePizza(String type) {
		Pizza pizza = null;

		if(type.equals("cheese")) {
			pizza = new SCStyleCheesePizza();
		} else if(type.equals("fruits")) {
			pizza = new SCStyleFruitsPizza();
		} else if(type.equals("durian")) {
			pizza = new SCStyleDurianPizza();
		} else if(type.equals("Hawaii")) {
			pizza = new SCStyleHawaiiPizza();
		}
		return pizza;
	}
	
}
