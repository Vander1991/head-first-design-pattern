package szu.vander.simplefactory;
/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class PizzaStore {

	public SimplePizzaFactory simplePizzaFactory;
	
	public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
		this.simplePizzaFactory = simplePizzaFactory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = simplePizzaFactory.producePizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
