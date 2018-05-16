package szu.vander.abstractfactory.sichuan;

import szu.vander.abstractfactory.FoodStore;

/**
* @author : Vander Choi
* @date : 2018-04-22
* @description :
*/
public class SCFoodStore extends FoodStore {

	public SCFoodStore() {
		foodFactory = new SCFoodFactory();
	}	
}
