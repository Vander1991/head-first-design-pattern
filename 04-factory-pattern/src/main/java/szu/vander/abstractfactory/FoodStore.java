package szu.vander.abstractfactory;
/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class FoodStore {

	protected AbstractFoodFactory foodFactory;
	
	public final Pizza orderPizza(String type) {
		Pizza pizza = foodFactory.producePizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	public final Burger orderBurger(String type) {
		Burger burger = foodFactory.produceBurger(type);
		burger.prepare();

		return burger;
	}
	
	public final Beverage orderBeverage(String type) {
		Beverage beverage = foodFactory.produceBeverage(type);
		beverage.prepare();

		return beverage;
	}
	
	public final FiredChicken orderFiredChicken(String type) {
		FiredChicken firedChicken = foodFactory.produceFiredChicken(type);
		firedChicken.prepare();

		return firedChicken;
	}
	
}
