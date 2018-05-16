package szu.vander.simplefactory2.guangdong;

import szu.vander.simplefactory2.PizzaStore;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class GDPizzaStore extends PizzaStore {
	
	public GDPizzaStore() {
		simplePizzaFactory = new GDPizzaFactory();
	}
	
}
