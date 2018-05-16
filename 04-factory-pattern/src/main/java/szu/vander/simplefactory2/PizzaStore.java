package szu.vander.simplefactory2;
/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class PizzaStore {

	protected SimplePizzaFactory simplePizzaFactory;
	
	public final Pizza orderPizza(String type) {
		Pizza pizza = simplePizzaFactory.producePizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
