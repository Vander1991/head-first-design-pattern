package szu.vander.simplefactory2.sichuan;

import szu.vander.simplefactory2.Pizza;
import szu.vander.simplefactory2.SimplePizzaFactory;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class SCPizzaFactory extends SimplePizzaFactory {

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
