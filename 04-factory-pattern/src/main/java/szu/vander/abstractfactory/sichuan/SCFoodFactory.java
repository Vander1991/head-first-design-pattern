package szu.vander.abstractfactory.sichuan;

import szu.vander.abstractfactory.AbstractFoodFactory;
import szu.vander.abstractfactory.Beverage;
import szu.vander.abstractfactory.Burger;
import szu.vander.abstractfactory.FiredChicken;
import szu.vander.abstractfactory.Pizza;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class SCFoodFactory extends AbstractFoodFactory {

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

	@Override
	public FiredChicken produceFiredChicken(String type) {
		FiredChicken firedChicken = null;
		if(type.equals("spicy")) {
			firedChicken = new SCSpicyFiredChicken();
		}
		return firedChicken;
	}

	@Override
	public Beverage produceBeverage(String type) {
		Beverage beverage = null;
		if(type.equals("spicy")){
			beverage = new SCSpicyCoke();
		}
		return beverage;
	}

	@Override
	public Burger produceBurger(String type) {
		Burger burger = null;
		if(type.equals("spicy")) {
			burger = new SCSpicyBurger();
		}
		return burger;
	}
	
}
