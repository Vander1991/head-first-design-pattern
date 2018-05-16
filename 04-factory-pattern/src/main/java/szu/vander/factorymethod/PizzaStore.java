package szu.vander.factorymethod;
/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public abstract class PizzaStore {
	
	public final Pizza orderPizza(String type) {
		Pizza pizza = producePizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza producePizza(String type);
	
}
