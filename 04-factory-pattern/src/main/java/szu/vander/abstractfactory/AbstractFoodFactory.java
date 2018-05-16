package szu.vander.abstractfactory;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public abstract class AbstractFoodFactory {

	public abstract Pizza producePizza(String type);
	
	public abstract FiredChicken produceFiredChicken(String type);
	
	public abstract Beverage produceBeverage(String type);
	
	public abstract Burger produceBurger(String type);
	
}
