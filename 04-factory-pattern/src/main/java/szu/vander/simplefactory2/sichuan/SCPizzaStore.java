package szu.vander.simplefactory2.sichuan;

import szu.vander.simplefactory2.PizzaStore;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class SCPizzaStore extends PizzaStore {

	public SCPizzaStore() {
		simplePizzaFactory = new SCPizzaFactory();
	}	
}
