package szu.vander.wrong1;
/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class PizzaStore {

	public Pizza pizza;
	
	public Pizza orderPizza(String type) {
		Pizza pizza = new Pizza();
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if(type.equals("greek")) {
			pizza = new GreekPizza();
		} else if(type.equals("pepperoni")) {
			pizza = new Pepperoni();
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}
	
}
