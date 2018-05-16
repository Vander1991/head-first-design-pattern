package szu.vander.abstractfactory.guangdong;

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
public class GDFoodFactory extends AbstractFoodFactory{

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

	@Override
	public FiredChicken produceFiredChicken(String type) {
		FiredChicken firedChicken = null;
		if(type.equals("salt")) {
			firedChicken = new GDSaltFiredChicken();
		}
		return firedChicken;
	}

	@Override
	public Beverage produceBeverage(String type) {
		Beverage beverage = null;
		if(type.equals("sweet")){
			beverage = new GDSweetCoke();
		}
		return beverage;
	}

	@Override
	public Burger produceBurger(String type) {
		Burger burger = null;
		if(type.equals("salt")) {
			burger = new GDSaltBurger();
		}
		return burger;
	}
	
}
