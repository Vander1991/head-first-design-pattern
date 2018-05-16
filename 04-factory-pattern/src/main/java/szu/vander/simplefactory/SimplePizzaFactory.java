package szu.vander.simplefactory;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class SimplePizzaFactory {

	public Pizza producePizza(String type) {
		Pizza pizza = new Pizza();
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if(type.equals("fruits")) {
			pizza = new FruitsPizza();
		} else if(type.equals("durian")) {
			pizza = new DurianPizza();
		} else if(type.equals("Hawaii")) {
			pizza = new HawaiiPizza();
		}
		return pizza;
	}
	
}
